package org.telegram.ui.Components;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
        org.telegram.ui.xn xnVar = chatActivityEnterView.L2;
        if (chatActivityEnterView.i1.R() > AndroidUtilities.dp(20.0f) || chatActivityEnterView.t0()) {
            chatActivityEnterView.m0(false);
            AndroidUtilities.hideKeyboard(chatActivityEnterView);
            AndroidUtilities.runOnUIThread(this, 150L);
            return;
        }
        if (xnVar == null) {
            return;
        }
        int i10 = chatActivityEnterView.N;
        long j10 = this.a.messageOwner.dialog_id;
        TL_keyboard.KeyboardButtonProto keyboardButtonProto = this.c;
        String text = keyboardButtonProto.getText();
        String url = keyboardButtonProto.getUrl();
        boolean c3 = mf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeSimpleWebView.class);
        MessageObject messageObject = this.d;
        sh.y3 b10 = sh.y3.b(i10, j10, this.b, text, url, c3 ? 1 : 0, messageObject != null ? messageObject.messageOwner.id : 0, xnVar == null ? 0L : xnVar.N8(), null, false, null, null, 0, false, false);
        LaunchActivity launchActivity = LaunchActivity.D1;
        if (launchActivity != null && launchActivity.P() != null && LaunchActivity.D1.P().m(b10) != null) {
            sh.z zVar = chatActivityEnterView.i0;
            if (zVar != null) {
                zVar.setOpened(false);
                return;
            }
            return;
        }
        TLRPC.User user = this.e;
        String restrictionReason = user == null ? null : MessagesController.getInstance(chatActivityEnterView.N).getRestrictionReason(user.restriction_reason);
        if (!TextUtils.isEmpty(restrictionReason)) {
            MessagesController.getInstance(chatActivityEnterView.N);
            MessagesController.showCantOpenAlert(xnVar, restrictionReason);
        } else {
            sh.p2 p2Var = new sh.p2(chatActivityEnterView.getContext(), chatActivityEnterView.S3);
            p2Var.h0 = chatActivityEnterView.K2;
            p2Var.s(xnVar, b10);
            p2Var.show();
        }
    }
}
