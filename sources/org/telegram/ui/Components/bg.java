package org.telegram.ui.Components;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class bg implements Runnable {
    public final /* synthetic */ MessageObject a;
    public final /* synthetic */ long b;
    public final /* synthetic */ TL_keyboard.KeyboardButtonProto c;
    public final /* synthetic */ MessageObject d;
    public final /* synthetic */ TLRPC.User e;
    public final /* synthetic */ ChatActivityEnterView f;

    public bg(ChatActivityEnterView chatActivityEnterView, MessageObject messageObject, long j10, TL_keyboard.KeyboardButtonProto keyboardButtonProto, MessageObject messageObject2, TLRPC.User user) {
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
        org.telegram.ui.wn wnVar = chatActivityEnterView.P2;
        if (chatActivityEnterView.m1.Q() > AndroidUtilities.dp(20.0f) || chatActivityEnterView.p0()) {
            chatActivityEnterView.i0(false);
            AndroidUtilities.hideKeyboard(chatActivityEnterView);
            AndroidUtilities.runOnUIThread(this, 150L);
            return;
        }
        if (wnVar == null) {
            return;
        }
        int i10 = chatActivityEnterView.Q;
        long j10 = this.a.messageOwner.dialog_id;
        TL_keyboard.KeyboardButtonProto keyboardButtonProto = this.c;
        String text = keyboardButtonProto.getText();
        String url = keyboardButtonProto.getUrl();
        boolean c10 = bg.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeSimpleWebView.class);
        MessageObject messageObject = this.d;
        hi.c5 b10 = hi.c5.b(i10, j10, this.b, text, url, c10 ? 1 : 0, messageObject != null ? messageObject.messageOwner.id : 0, wnVar == null ? 0L : wnVar.a9(), null, false, null, null, 0, false, false);
        LaunchActivity launchActivity = LaunchActivity.I1;
        if (launchActivity != null && launchActivity.P() != null && LaunchActivity.I1.P().k(b10) != null) {
            hi.i0 i0Var = chatActivityEnterView.l0;
            if (i0Var != null) {
                i0Var.setOpened(false);
                return;
            }
            return;
        }
        TLRPC.User user = this.e;
        String restrictionReason = user == null ? null : MessagesController.getInstance(chatActivityEnterView.Q).getRestrictionReason(user.restriction_reason);
        if (!TextUtils.isEmpty(restrictionReason)) {
            MessagesController.getInstance(chatActivityEnterView.Q);
            MessagesController.showCantOpenAlert(wnVar, restrictionReason);
        } else {
            hi.m3 m3Var = new hi.m3(chatActivityEnterView.getContext(), chatActivityEnterView.W3);
            m3Var.l0 = chatActivityEnterView.O2;
            m3Var.t(wnVar, b10);
            m3Var.show();
        }
    }
}
