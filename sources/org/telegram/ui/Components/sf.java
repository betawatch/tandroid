package org.telegram.ui.Components;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class sf implements Runnable {
    public final /* synthetic */ MessageObject a;
    public final /* synthetic */ long b;
    public final /* synthetic */ TL_keyboard.KeyboardButtonProto c;
    public final /* synthetic */ MessageObject d;
    public final /* synthetic */ TLRPC.User e;
    public final /* synthetic */ ChatActivityEnterView f;

    public sf(ChatActivityEnterView chatActivityEnterView, MessageObject messageObject, long j10, TL_keyboard.KeyboardButtonProto keyboardButtonProto, MessageObject messageObject2, TLRPC.User user) {
        this.f = chatActivityEnterView;
        this.a = messageObject;
        this.b = j10;
        this.c = keyboardButtonProto;
        this.d = messageObject2;
        this.e = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ChatActivityEnterView chatActivityEnterView = this.f;
        org.telegram.ui.qn qnVar = chatActivityEnterView.K2;
        if (chatActivityEnterView.h1.R() > AndroidUtilities.dp(20.0f) || chatActivityEnterView.s0()) {
            chatActivityEnterView.l0(false);
            AndroidUtilities.hideKeyboard(chatActivityEnterView);
            AndroidUtilities.runOnUIThread(this, 150L);
            return;
        }
        if (qnVar == null) {
            return;
        }
        int i9 = chatActivityEnterView.M;
        long j10 = this.a.messageOwner.dialog_id;
        TL_keyboard.KeyboardButtonProto keyboardButtonProto = this.c;
        String text = keyboardButtonProto.getText();
        String url = keyboardButtonProto.getUrl();
        boolean c10 = gf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeSimpleWebView.class);
        MessageObject messageObject = this.d;
        mh.s4 b10 = mh.s4.b(i9, j10, this.b, text, url, c10 ? 1 : 0, messageObject != null ? messageObject.messageOwner.id : 0, qnVar == null ? 0L : qnVar.N8(), null, false, null, null, 0, false, false);
        LaunchActivity launchActivity = LaunchActivity.C1;
        if (launchActivity != null && launchActivity.P() != null && LaunchActivity.C1.P().k(b10) != null) {
            mh.c0 c0Var = chatActivityEnterView.h0;
            if (c0Var != null) {
                c0Var.setOpened(false);
                return;
            }
            return;
        }
        TLRPC.User user = this.e;
        String restrictionReason = user == null ? null : MessagesController.getInstance(chatActivityEnterView.M).getRestrictionReason(user.restriction_reason);
        if (!TextUtils.isEmpty(restrictionReason)) {
            MessagesController.getInstance(chatActivityEnterView.M);
            MessagesController.showCantOpenAlert(qnVar, restrictionReason);
        } else {
            mh.c3 c3Var = new mh.c3(chatActivityEnterView.getContext(), chatActivityEnterView.R3);
            c3Var.g0 = chatActivityEnterView.J2;
            c3Var.s(qnVar, b10);
            c3Var.show();
        }
    }
}
