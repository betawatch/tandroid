package org.telegram.ui.Components;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class ag implements Runnable {
    public final /* synthetic */ MessageObject a;
    public final /* synthetic */ long b;
    public final /* synthetic */ TL_keyboard.KeyboardButtonProto c;
    public final /* synthetic */ MessageObject d;
    public final /* synthetic */ TLRPC.User e;
    public final /* synthetic */ ChatActivityEnterView f;

    public ag(ChatActivityEnterView chatActivityEnterView, MessageObject messageObject, long j3, TL_keyboard.KeyboardButtonProto keyboardButtonProto, MessageObject messageObject2, TLRPC.User user) {
        this.f = chatActivityEnterView;
        this.a = messageObject;
        this.b = j3;
        this.c = keyboardButtonProto;
        this.d = messageObject2;
        this.e = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ChatActivityEnterView chatActivityEnterView = this.f;
        org.telegram.ui.bo boVar = chatActivityEnterView.O2;
        if (chatActivityEnterView.l1.R() > AndroidUtilities.dp(20.0f) || chatActivityEnterView.u0()) {
            chatActivityEnterView.n0(false);
            AndroidUtilities.hideKeyboard(chatActivityEnterView);
            AndroidUtilities.runOnUIThread(this, 150L);
            return;
        }
        if (boVar == null) {
            return;
        }
        int i10 = chatActivityEnterView.Q;
        long j3 = this.a.messageOwner.dialog_id;
        TL_keyboard.KeyboardButtonProto keyboardButtonProto = this.c;
        String text = keyboardButtonProto.getText();
        String url = keyboardButtonProto.getUrl();
        boolean c10 = zf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeSimpleWebView.class);
        MessageObject messageObject = this.d;
        ei.f5 b10 = ei.f5.b(i10, j3, this.b, text, url, c10 ? 1 : 0, messageObject != null ? messageObject.messageOwner.id : 0, boVar == null ? 0L : boVar.N8(), null, false, null, null, 0, false, false);
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null && launchActivity.P() != null && LaunchActivity.G1.P().k(b10) != null) {
            ei.c0 c0Var = chatActivityEnterView.l0;
            if (c0Var != null) {
                c0Var.setOpened(false);
                return;
            }
            return;
        }
        TLRPC.User user = this.e;
        String restrictionReason = user == null ? null : MessagesController.getInstance(chatActivityEnterView.Q).getRestrictionReason(user.restriction_reason);
        if (!TextUtils.isEmpty(restrictionReason)) {
            MessagesController.getInstance(chatActivityEnterView.Q);
            MessagesController.showCantOpenAlert(boVar, restrictionReason);
        } else {
            ei.k3 k3Var = new ei.k3(chatActivityEnterView.getContext(), chatActivityEnterView.V3);
            k3Var.k0 = chatActivityEnterView.N2;
            k3Var.s(boVar, b10);
            k3Var.show();
        }
    }
}
