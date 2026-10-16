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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class af0 extends org.telegram.ui.ActionBar.e3 {
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final bk0 e;
    public final yj0 f;
    public final w90 h;
    public final long n;
    public boolean r;
    public TLRPC.TL_chatInviteExported s;

    public af0(Context context, org.telegram.ui.j70 j70Var, TLRPC.ChatFull chatFull, long j10, boolean z10) {
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
        imageView.setBackground(org.telegram.ui.ActionBar.g6.g0(getThemedColor(org.telegram.ui.ActionBar.g6.i6), 1, -1));
        imageView.setColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.Ji));
        imageView.setImageResource(R.drawable.ic_layer_close);
        imageView.setOnClickListener(new y80(this, 4));
        int dp = AndroidUtilities.dp(8.0f);
        imageView.setPadding(dp, dp, dp, dp);
        frameLayout.addView(imageView, w7.z5.a(36.0f, 6.0f, 8.0f, 8.0f, 0.0f, 36, 8388661));
        w90 w90Var = new w90(context, j70Var, this, true, z10);
        this.h = w90Var;
        w90Var.setPermanent(true);
        bk0 bk0Var = new bk0(context);
        this.e = bk0Var;
        yj0 yj0Var = new yj0(R.raw.shared_link_enter, AndroidUtilities.dp(90.0f), AndroidUtilities.dp(90.0f), false, null);
        this.f = yj0Var;
        yj0Var.P(42);
        bk0Var.setAnimation(yj0Var);
        w90Var.d(0, null, false);
        w90Var.b(true);
        w90Var.setDelegate(new xv(this, 10));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setText(LocaleController.getString(R.string.InviteLink));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.G6, false));
        TextView textView2 = new TextView(context);
        this.c = textView2;
        textView2.setText(LocaleController.getString(z10 ? R.string.LinkInfoChannel : R.string.LinkInfo));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.j5, false));
        textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
        TextView textView3 = new TextView(context);
        this.d = textView3;
        org.telegram.messenger.sk.m(R.string.ManageInviteLinks, textView3, 17);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setSingleLine(true);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextSize(1, 14.0f);
        int i10 = org.telegram.ui.ActionBar.g6.Oh;
        textView3.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i10, false));
        int dp2 = AndroidUtilities.dp(8.0f);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.g6.x0(null, i10, false), 120);
        textView3.setBackground(org.telegram.ui.ActionBar.g6.j0(dp2, dp2, dp2, dp2, 0, k10, k10));
        textView3.setLetterSpacing(0.025f);
        textView3.setOnClickListener(new bi.x(this, chatFull, j70Var, 25));
        linearLayout.addView(bk0Var, w7.z5.t(90, 90, 1, 0, 33, 0, 0));
        linearLayout.addView(textView, w7.z5.t(-1, -2, 1, 60, 10, 60, 0));
        linearLayout.addView(textView2, w7.z5.t(-1, -2, 1, 28, 7, 28, 2));
        linearLayout.addView(w90Var, w7.z5.n(-1, -2));
        linearLayout.addView(textView3, w7.z5.t(-1, 48, 1, 14, -2, 14, 6));
        NestedScrollView nestedScrollView = new NestedScrollView(context);
        nestedScrollView.setVerticalScrollBarEnabled(false);
        nestedScrollView.addView(frameLayout);
        setCustomView(nestedScrollView);
        TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(j10));
        if (chat != null && ChatObject.isPublic(chat)) {
            w90Var.setLink("https://t.me/" + ChatObject.getPublicUsername(chat));
            textView3.setVisibility(8);
        } else if (chatFull == null || (tL_chatInviteExported = chatFull.exported_invite) == null) {
            r(false);
        } else {
            w90Var.setLink(tL_chatInviteExported.link);
        }
        s();
    }

    public static void n(af0 af0Var) {
        super.dismiss();
    }

    public static void o(af0 af0Var, TLRPC.ChatFull chatFull, org.telegram.ui.j70 j70Var) {
        org.telegram.ui.di0 di0Var = new org.telegram.ui.di0(chatFull.id, 0L, 0);
        di0Var.g0(chatFull, chatFull.exported_invite);
        j70Var.presentFragment(di0Var);
        super.dismiss();
    }

    public static /* synthetic */ void q(af0 af0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            af0Var.s = (TLRPC.TL_chatInviteExported) tLObject;
            TLRPC.ChatFull chatFull = MessagesController.getInstance(af0Var.currentAccount).getChatFull(af0Var.n);
            if (chatFull != null) {
                chatFull.exported_invite = af0Var.s;
            }
            af0Var.h.setLink(af0Var.s.link);
        }
        af0Var.r = false;
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        b7 b7Var = new b7(this, 5);
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.j5));
        int i10 = org.telegram.ui.ActionBar.g6.Oh;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, b7Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, b7Var, org.telegram.ui.ActionBar.g6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, b7Var, org.telegram.ui.ActionBar.g6.n6));
        return arrayList;
    }

    public final void r(boolean z10) {
        if (this.r) {
            return;
        }
        this.r = true;
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        tL_messages_exportChatInvite.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(-this.n);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_exportChatInvite, new di.s3(7, this, z10));
    }

    public final void s() {
        int dp = AndroidUtilities.dp(90.0f);
        int i10 = org.telegram.ui.ActionBar.g6.Oh;
        this.e.setBackground(org.telegram.ui.ActionBar.g6.K(dp, org.telegram.ui.ActionBar.g6.x0(null, i10, false)));
        int dp2 = AndroidUtilities.dp(8.0f);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.g6.x0(null, i10, false), 120);
        this.d.setBackground(org.telegram.ui.ActionBar.g6.j0(dp2, dp2, dp2, dp2, 0, k10, k10));
        int x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Sh, false);
        yj0 yj0Var = this.f;
        yj0Var.Q(x02, "Top");
        yj0Var.Q(x02, "Bottom");
        yj0Var.Q(x02, "Center");
        this.h.f();
        setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.h5, false));
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new yc0(this, 6), 50L);
    }
}
