package org.telegram.ui.Components;

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class kf implements Runnable {
    public final /* synthetic */ org.telegram.messenger.ij a;
    public final /* synthetic */ long b;
    public final /* synthetic */ TL_keyboard.KeyboardButtonProto c;
    public final /* synthetic */ org.telegram.messenger.ij d;
    public final /* synthetic */ TLRPC.User e;
    public final /* synthetic */ ChatActivityEnterView f;

    public kf(ChatActivityEnterView chatActivityEnterView, org.telegram.messenger.ij ijVar, long j3, TL_keyboard.KeyboardButtonProto keyboardButtonProto, org.telegram.messenger.ij ijVar2, TLRPC.User user) {
        this.f = chatActivityEnterView;
        this.a = ijVar;
        this.b = j3;
        this.c = keyboardButtonProto;
        this.d = ijVar2;
        this.e = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ChatActivityEnterView chatActivityEnterView = this.f;
        org.telegram.ui.cn cnVar = chatActivityEnterView.P2;
        if (chatActivityEnterView.m1.Q() > org.telegram.messenger.g0.L(20.0f) || chatActivityEnterView.s0()) {
            chatActivityEnterView.k0(false);
            org.telegram.messenger.g0.v1(chatActivityEnterView);
            org.telegram.messenger.g0.i3(this, 150L);
            return;
        }
        if (cnVar == null) {
            return;
        }
        int i7 = chatActivityEnterView.Q;
        long j3 = this.a.k.dialog_id;
        TL_keyboard.KeyboardButtonProto keyboardButtonProto = this.c;
        String text = keyboardButtonProto.getText();
        String url = keyboardButtonProto.getUrl();
        boolean c10 = cg.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeSimpleWebView.class);
        org.telegram.messenger.ij ijVar = this.d;
        hi.q4 b10 = hi.q4.b(i7, j3, this.b, text, url, c10 ? 1 : 0, ijVar != null ? ijVar.k.id : 0, cnVar == null ? 0L : cnVar.i9(), null, false, null, null, 0, false, false);
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null && launchActivity.O() != null && LaunchActivity.G1.O().k(b10) != null) {
            hi.y yVar = chatActivityEnterView.l0;
            if (yVar != null) {
                yVar.setOpened(false);
                return;
            }
            return;
        }
        TLRPC.User user = this.e;
        String F1 = user == null ? null : org.telegram.messenger.qp.s1(chatActivityEnterView.Q).F1(user.restriction_reason);
        if (!TextUtils.isEmpty(F1)) {
            org.telegram.messenger.qp.s1(chatActivityEnterView.Q);
            org.telegram.messenger.qp.R4(F1, cnVar);
        } else {
            hi.a3 a3Var = new hi.a3(chatActivityEnterView.getContext(), chatActivityEnterView.W3);
            a3Var.l0 = chatActivityEnterView.O2;
            a3Var.x(cnVar, b10);
            a3Var.show();
        }
    }
}
