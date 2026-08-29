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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class vd0 extends org.telegram.ui.ActionBar.f3 {
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final aj0 e;
    public final xi0 f;
    public final r80 h;
    public final long n;
    public boolean r;
    public TLRPC.TL_chatInviteExported s;

    public vd0(Context context, org.telegram.ui.m60 m60Var, TLRPC.ChatFull chatFull, long j10, boolean z10) {
        super(context, false);
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        this.n = j10;
        setAllowNestedScroll(true);
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.g6.d6));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(linearLayout);
        ImageView imageView = new ImageView(context);
        imageView.setBackground(org.telegram.ui.ActionBar.g6.f0(getThemedColor(org.telegram.ui.ActionBar.g6.i6), 1, -1));
        imageView.setColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.Ji));
        imageView.setImageResource(R.drawable.ic_layer_close);
        imageView.setOnClickListener(new u70(this, 5));
        int dp = AndroidUtilities.dp(8.0f);
        imageView.setPadding(dp, dp, dp, dp);
        frameLayout.addView(imageView, i7.f6.d(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
        r80 r80Var = new r80(context, m60Var, this, true, z10);
        this.h = r80Var;
        r80Var.setPermanent(true);
        aj0 aj0Var = new aj0(context);
        this.e = aj0Var;
        xi0 xi0Var = new xi0(R.raw.shared_link_enter, "" + R.raw.shared_link_enter, AndroidUtilities.dp(90.0f), AndroidUtilities.dp(90.0f), false, null);
        this.f = xi0Var;
        xi0Var.N(42);
        aj0Var.setAnimation(xi0Var);
        r80Var.d(0, null, false);
        r80Var.b(true);
        r80Var.setDelegate(new cv(this, 9));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setText(LocaleController.getString(R.string.InviteLink));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
        TextView textView2 = new TextView(context);
        this.c = textView2;
        textView2.setText(LocaleController.getString(z10 ? R.string.LinkInfoChannel : R.string.LinkInfo));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.j5, false));
        textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
        TextView textView3 = new TextView(context);
        this.d = textView3;
        org.telegram.ui.b.i(R.string.ManageInviteLinks, textView3, 17);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setSingleLine(true);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextSize(1, 14.0f);
        int i10 = org.telegram.ui.ActionBar.g6.Oh;
        textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        int dp2 = AndroidUtilities.dp(8.0f);
        int k9 = i0.a.k(org.telegram.ui.ActionBar.g6.w0(null, i10, false), 120);
        textView3.setBackground(org.telegram.ui.ActionBar.g6.i0(dp2, dp2, dp2, dp2, 0, k9, k9));
        textView3.setLetterSpacing(0.025f);
        textView3.setOnClickListener(new ya0(this, chatFull, m60Var, 1));
        linearLayout.addView(aj0Var, i7.f6.t(90, 90, 1, 0, 33, 0, 0));
        linearLayout.addView(textView, i7.f6.t(-1, -2, 1, 60, 10, 60, 0));
        linearLayout.addView(textView2, i7.f6.t(-1, -2, 1, 28, 7, 28, 2));
        linearLayout.addView(r80Var, i7.f6.n(-1, -2));
        linearLayout.addView(textView3, i7.f6.t(-1, 48, 1, 14, -2, 14, 6));
        NestedScrollView nestedScrollView = new NestedScrollView(context);
        nestedScrollView.setVerticalScrollBarEnabled(false);
        nestedScrollView.addView(frameLayout);
        setCustomView(nestedScrollView);
        TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(j10));
        if (chat != null && ChatObject.isPublic(chat)) {
            r80Var.setLink("https://t.me/" + ChatObject.getPublicUsername(chat));
            textView3.setVisibility(8);
        } else if (chatFull == null || (tL_chatInviteExported = chatFull.exported_invite) == null) {
            p(false);
        } else {
            r80Var.setLink(tL_chatInviteExported.link);
        }
        q();
    }

    public static void m(vd0 vd0Var) {
        super.dismiss();
    }

    public static void n(vd0 vd0Var, TLRPC.ChatFull chatFull, org.telegram.ui.m60 m60Var) {
        org.telegram.ui.hh0 hh0Var = new org.telegram.ui.hh0(chatFull.id, 0L, 0);
        hh0Var.g0(chatFull, chatFull.exported_invite);
        m60Var.presentFragment(hh0Var);
        super.dismiss();
    }

    public static /* synthetic */ void o(vd0 vd0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            vd0Var.s = (TLRPC.TL_chatInviteExported) tLObject;
            TLRPC.ChatFull chatFull = MessagesController.getInstance(vd0Var.currentAccount).getChatFull(vd0Var.n);
            if (chatFull != null) {
                chatFull.exported_invite = vd0Var.s;
            }
            vd0Var.h.setLink(vd0Var.s.link);
        }
        vd0Var.r = false;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        x6 x6Var = new x6(this, 5);
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.j5));
        int i10 = org.telegram.ui.ActionBar.g6.Oh;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, x6Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.g6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.g6.n6));
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
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_exportChatInvite, new nh.l3(7, this, z10));
    }

    public final void q() {
        int dp = AndroidUtilities.dp(90.0f);
        int i10 = org.telegram.ui.ActionBar.g6.Oh;
        this.e.setBackground(org.telegram.ui.ActionBar.g6.K(dp, org.telegram.ui.ActionBar.g6.w0(null, i10, false)));
        int dp2 = AndroidUtilities.dp(8.0f);
        int k9 = i0.a.k(org.telegram.ui.ActionBar.g6.w0(null, i10, false), 120);
        this.d.setBackground(org.telegram.ui.ActionBar.g6.i0(dp2, dp2, dp2, dp2, 0, k9, k9));
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false);
        xi0 xi0Var = this.f;
        xi0Var.O(w02, "Top");
        xi0Var.O(w02, "Bottom");
        xi0Var.O(w02, "Center");
        this.h.f();
        setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.h5, false));
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new xb0(this, 5), 50L);
    }
}
