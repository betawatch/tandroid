package org.telegram.ui.Components;

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class qf implements Runnable {
    public final /* synthetic */ org.telegram.messenger.gj a;
    public final /* synthetic */ long b;
    public final /* synthetic */ TL_keyboard.KeyboardButtonProto c;
    public final /* synthetic */ org.telegram.messenger.gj d;
    public final /* synthetic */ TLRPC.User e;
    public final /* synthetic */ ChatActivityEnterView f;

    public qf(ChatActivityEnterView chatActivityEnterView, org.telegram.messenger.gj gjVar, long j3, TL_keyboard.KeyboardButtonProto keyboardButtonProto, org.telegram.messenger.gj gjVar2, TLRPC.User user) {
        this.f = chatActivityEnterView;
        this.a = gjVar;
        this.b = j3;
        this.c = keyboardButtonProto;
        this.d = gjVar2;
        this.e = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ChatActivityEnterView chatActivityEnterView = this.f;
        org.telegram.ui.an anVar = chatActivityEnterView.x3;
        if (chatActivityEnterView.U1.Q() > org.telegram.messenger.g0.L(20.0f) || chatActivityEnterView.G0()) {
            chatActivityEnterView.y0(false);
            org.telegram.messenger.g0.v1(chatActivityEnterView);
            org.telegram.messenger.g0.i3(this, 150L);
            return;
        }
        if (anVar == null) {
            return;
        }
        int i7 = chatActivityEnterView.R;
        long j3 = this.a.k.dialog_id;
        TL_keyboard.KeyboardButtonProto keyboardButtonProto = this.c;
        String text = keyboardButtonProto.getText();
        String url = keyboardButtonProto.getUrl();
        boolean c10 = cg.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeSimpleWebView.class);
        org.telegram.messenger.gj gjVar = this.d;
        ki.k4 b10 = ki.k4.b(i7, j3, this.b, text, url, c10 ? 1 : 0, gjVar != null ? gjVar.k.id : 0, anVar == null ? 0L : anVar.j9(), null, false, null, null, 0, false, false);
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null && launchActivity.N() != null && LaunchActivity.H1.N().k(b10) != null) {
            ki.a0 a0Var = chatActivityEnterView.m0;
            if (a0Var != null) {
                a0Var.setOpened(false);
                return;
            }
            return;
        }
        TLRPC.User user = this.e;
        String F1 = user == null ? null : org.telegram.messenger.np.s1(chatActivityEnterView.R).F1(user.restriction_reason);
        if (!TextUtils.isEmpty(F1)) {
            org.telegram.messenger.np.s1(chatActivityEnterView.R);
            org.telegram.messenger.np.S4(F1, anVar);
        } else {
            ki.x2 x2Var = new ki.x2(chatActivityEnterView.getContext(), chatActivityEnterView.E4);
            x2Var.m0 = chatActivityEnterView.w3;
            x2Var.x(anVar, b10);
            x2Var.show();
        }
    }
}
