package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class me0 extends org.telegram.ui.ActionBar.f3 {
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final nj0 e;
    public final kj0 f;
    public final j90 h;
    public final long n;
    public boolean r;
    public TLRPC.TL_chatInviteExported s;

    public me0(Context context, org.telegram.ui.d70 d70Var, TLRPC.ChatFull chatFull, long j3, boolean z10) {
        super(context, false);
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        this.n = j3;
        setAllowNestedScroll(true);
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.i6.d6));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(linearLayout);
        ImageView imageView = new ImageView(context);
        imageView.setBackground(org.telegram.ui.ActionBar.i6.f0(getThemedColor(org.telegram.ui.ActionBar.i6.i6), 1, -1));
        imageView.setColorFilter(getThemedColor(org.telegram.ui.ActionBar.i6.Ji));
        imageView.setImageResource(R.drawable.ic_layer_close);
        imageView.setOnClickListener(new l80(this, 5));
        int dp = AndroidUtilities.dp(8.0f);
        imageView.setPadding(dp, dp, dp, dp);
        frameLayout.addView(imageView, w7.z5.d(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
        j90 j90Var = new j90(context, d70Var, this, true, z10);
        this.h = j90Var;
        j90Var.setPermanent(true);
        nj0 nj0Var = new nj0(context);
        this.e = nj0Var;
        kj0 kj0Var = new kj0(R.raw.shared_link_enter, AndroidUtilities.dp(90.0f), AndroidUtilities.dp(90.0f), false, null);
        this.f = kj0Var;
        kj0Var.P(42);
        nj0Var.setAnimation(kj0Var);
        j90Var.d(0, null, false);
        j90Var.b(true);
        j90Var.setDelegate(new pv(this, 10));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setText(LocaleController.getString(R.string.InviteLink));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.G6, false));
        TextView textView2 = new TextView(context);
        this.c = textView2;
        textView2.setText(LocaleController.getString(z10 ? R.string.LinkInfoChannel : R.string.LinkInfo));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.j5, false));
        textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
        TextView textView3 = new TextView(context);
        this.d = textView3;
        org.telegram.messenger.bi.k(R.string.ManageInviteLinks, textView3, 17);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setSingleLine(true);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextSize(1, 14.0f);
        int i10 = org.telegram.ui.ActionBar.i6.Oh;
        textView3.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
        int dp2 = AndroidUtilities.dp(8.0f);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.i6.w0(null, i10, false), 120);
        textView3.setBackground(org.telegram.ui.ActionBar.i6.i0(dp2, dp2, dp2, dp2, 0, k10, k10));
        textView3.setLetterSpacing(0.025f);
        textView3.setOnClickListener(new ai.d0(this, chatFull, d70Var, 25));
        linearLayout.addView(nj0Var, w7.z5.t(90, 90, 1, 0, 33, 0, 0));
        linearLayout.addView(textView, w7.z5.t(-1, -2, 1, 60, 10, 60, 0));
        linearLayout.addView(textView2, w7.z5.t(-1, -2, 1, 28, 7, 28, 2));
        linearLayout.addView(j90Var, w7.z5.n(-1, -2));
        linearLayout.addView(textView3, w7.z5.t(-1, 48, 1, 14, -2, 14, 6));
        NestedScrollView nestedScrollView = new NestedScrollView(context);
        nestedScrollView.setVerticalScrollBarEnabled(false);
        nestedScrollView.addView(frameLayout);
        setCustomView(nestedScrollView);
        TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(j3));
        if (chat != null && ChatObject.isPublic(chat)) {
            j90Var.setLink("https://t.me/" + ChatObject.getPublicUsername(chat));
            textView3.setVisibility(8);
        } else if (chatFull == null || (tL_chatInviteExported = chatFull.exported_invite) == null) {
            p(false);
        } else {
            j90Var.setLink(tL_chatInviteExported.link);
        }
        q();
    }

    public static void m(me0 me0Var) {
        super.dismiss();
    }

    public static void n(me0 me0Var, TLRPC.ChatFull chatFull, org.telegram.ui.d70 d70Var) {
        org.telegram.ui.wh0 wh0Var = new org.telegram.ui.wh0(chatFull.id, 0L, 0);
        wh0Var.g0(chatFull, chatFull.exported_invite);
        d70Var.presentFragment(wh0Var);
        super.dismiss();
    }

    public static /* synthetic */ void o(me0 me0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            me0Var.s = (TLRPC.TL_chatInviteExported) tLObject;
            TLRPC.ChatFull chatFull = MessagesController.getInstance(me0Var.currentAccount).getChatFull(me0Var.n);
            if (chatFull != null) {
                chatFull.exported_invite = me0Var.s;
            }
            me0Var.h.setLink(me0Var.s.link);
        }
        me0Var.r = false;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        y6 y6Var = new y6(this, 5);
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.b, 4, null, null, null, null, org.telegram.ui.ActionBar.i6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.c, 4, null, null, null, null, org.telegram.ui.ActionBar.i6.j5));
        int i10 = org.telegram.ui.ActionBar.i6.Oh;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.d, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, y6Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, y6Var, org.telegram.ui.ActionBar.i6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, y6Var, org.telegram.ui.ActionBar.i6.n6));
        return arrayList;
    }

    public final void p(boolean z10) {
        if (this.r) {
            return;
        }
        this.r = true;
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        tL_messages_exportChatInvite.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(-this.n);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_exportChatInvite, new ci.t3(7, this, z10));
    }

    public final void q() {
        int dp = AndroidUtilities.dp(90.0f);
        int i10 = org.telegram.ui.ActionBar.i6.Oh;
        this.e.setBackground(org.telegram.ui.ActionBar.i6.K(dp, org.telegram.ui.ActionBar.i6.w0(null, i10, false)));
        int dp2 = AndroidUtilities.dp(8.0f);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.i6.w0(null, i10, false), 120);
        this.d.setBackground(org.telegram.ui.ActionBar.i6.i0(dp2, dp2, dp2, dp2, 0, k10, k10));
        int w02 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Sh, false);
        kj0 kj0Var = this.f;
        kj0Var.Q(w02, "Top");
        kj0Var.Q(w02, "Bottom");
        kj0Var.Q(w02, "Center");
        this.h.f();
        setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.h5, false));
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new lc0(this, 6), 50L);
    }
}
