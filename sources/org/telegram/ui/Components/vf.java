package org.telegram.ui.Components;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class vf implements Runnable {
    public final /* synthetic */ MessageObject a;
    public final /* synthetic */ long b;
    public final /* synthetic */ TL_keyboard.KeyboardButtonProto c;
    public final /* synthetic */ MessageObject d;
    public final /* synthetic */ TLRPC.User e;
    public final /* synthetic */ ChatActivityEnterView f;

    public vf(ChatActivityEnterView chatActivityEnterView, MessageObject messageObject, long j10, TL_keyboard.KeyboardButtonProto keyboardButtonProto, MessageObject messageObject2, TLRPC.User user) {
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
        org.telegram.ui.tn tnVar = chatActivityEnterView.K2;
        if (chatActivityEnterView.h1.R() > AndroidUtilities.dp(20.0f) || chatActivityEnterView.t0()) {
            chatActivityEnterView.m0(false);
            AndroidUtilities.hideKeyboard(chatActivityEnterView);
            AndroidUtilities.runOnUIThread(this, 150L);
            return;
        }
        if (tnVar == null) {
            return;
        }
        int i10 = chatActivityEnterView.M;
        long j10 = this.a.messageOwner.dialog_id;
        TL_keyboard.KeyboardButtonProto keyboardButtonProto = this.c;
        String text = keyboardButtonProto.getText();
        String url = keyboardButtonProto.getUrl();
        boolean c3 = kf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeSimpleWebView.class);
        MessageObject messageObject = this.d;
        ph.y3 b10 = ph.y3.b(i10, j10, this.b, text, url, c3 ? 1 : 0, messageObject != null ? messageObject.messageOwner.id : 0, tnVar == null ? 0L : tnVar.N8(), null, false, null, null, 0, false, false);
        LaunchActivity launchActivity = LaunchActivity.C1;
        if (launchActivity != null && launchActivity.P() != null && LaunchActivity.C1.P().m(b10) != null) {
            ph.z zVar = chatActivityEnterView.h0;
            if (zVar != null) {
                zVar.setOpened(false);
                return;
            }
            return;
        }
        TLRPC.User user = this.e;
        String restrictionReason = user == null ? null : MessagesController.getInstance(chatActivityEnterView.M).getRestrictionReason(user.restriction_reason);
        if (!TextUtils.isEmpty(restrictionReason)) {
            MessagesController.getInstance(chatActivityEnterView.M);
            MessagesController.showCantOpenAlert(tnVar, restrictionReason);
        } else {
            ph.p2 p2Var = new ph.p2(chatActivityEnterView.getContext(), chatActivityEnterView.R3);
            p2Var.g0 = chatActivityEnterView.J2;
            p2Var.s(tnVar, b10);
            p2Var.show();
        }
    }
}
