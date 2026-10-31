package org.telegram.ui.Components;

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ef implements Runnable {
    public final /* synthetic */ org.telegram.messenger.jj a;
    public final /* synthetic */ long b;
    public final /* synthetic */ TL_keyboard.KeyboardButtonProto c;
    public final /* synthetic */ org.telegram.messenger.jj d;
    public final /* synthetic */ TLRPC.User e;
    public final /* synthetic */ ChatActivityEnterView f;

    public ef(ChatActivityEnterView chatActivityEnterView, org.telegram.messenger.jj jjVar, long j10, TL_keyboard.KeyboardButtonProto keyboardButtonProto, org.telegram.messenger.jj jjVar2, TLRPC.User user) {
        this.f = chatActivityEnterView;
        this.a = jjVar;
        this.b = j10;
        this.c = keyboardButtonProto;
        this.d = jjVar2;
        this.e = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ChatActivityEnterView chatActivityEnterView = this.f;
        org.telegram.ui.un unVar = chatActivityEnterView.P2;
        if (chatActivityEnterView.m1.Q() > org.telegram.messenger.i0.L(20.0f) || chatActivityEnterView.q0()) {
            chatActivityEnterView.i0(false);
            org.telegram.messenger.i0.v1(chatActivityEnterView);
            org.telegram.messenger.i0.h3(this, 150L);
            return;
        }
        if (unVar == null) {
            return;
        }
        int i10 = chatActivityEnterView.Q;
        long j10 = this.a.k.dialog_id;
        TL_keyboard.KeyboardButtonProto keyboardButtonProto = this.c;
        String text = keyboardButtonProto.getText();
        String url = keyboardButtonProto.getUrl();
        boolean c10 = sf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeSimpleWebView.class);
        org.telegram.messenger.jj jjVar = this.d;
        xh.s3 b10 = xh.s3.b(i10, j10, this.b, text, url, c10 ? 1 : 0, jjVar != null ? jjVar.k.id : 0, unVar == null ? 0L : unVar.a9(), null, false, null, null, 0, false, false);
        LaunchActivity launchActivity = LaunchActivity.I1;
        if (launchActivity != null && launchActivity.O() != null && LaunchActivity.I1.O().m(b10) != null) {
            xh.w wVar = chatActivityEnterView.l0;
            if (wVar != null) {
                wVar.setOpened(false);
                return;
            }
            return;
        }
        TLRPC.User user = this.e;
        String E1 = user == null ? null : org.telegram.messenger.vp.r1(chatActivityEnterView.Q).E1(user.restriction_reason);
        if (!TextUtils.isEmpty(E1)) {
            org.telegram.messenger.vp.r1(chatActivityEnterView.Q);
            org.telegram.messenger.vp.O4(E1, unVar);
        } else {
            xh.m2 m2Var = new xh.m2(chatActivityEnterView.getContext(), chatActivityEnterView.W3);
            m2Var.l0 = chatActivityEnterView.O2;
            m2Var.x(unVar, b10);
            m2Var.show();
        }
    }
}
