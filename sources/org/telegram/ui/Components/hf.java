package org.telegram.ui.Components;

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class hf implements Runnable {
    public final /* synthetic */ org.telegram.messenger.zi a;
    public final /* synthetic */ long b;
    public final /* synthetic */ TL_keyboard.KeyboardButtonProto c;
    public final /* synthetic */ org.telegram.messenger.zi d;
    public final /* synthetic */ TLRPC.User e;
    public final /* synthetic */ ChatActivityEnterView f;

    public hf(ChatActivityEnterView chatActivityEnterView, org.telegram.messenger.zi ziVar, long j10, TL_keyboard.KeyboardButtonProto keyboardButtonProto, org.telegram.messenger.zi ziVar2, TLRPC.User user) {
        this.f = chatActivityEnterView;
        this.a = ziVar;
        this.b = j10;
        this.c = keyboardButtonProto;
        this.d = ziVar2;
        this.e = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ChatActivityEnterView chatActivityEnterView = this.f;
        org.telegram.ui.wm wmVar = chatActivityEnterView.Q2;
        if (chatActivityEnterView.n1.Q() > org.telegram.messenger.g0.L(20.0f) || chatActivityEnterView.r0()) {
            chatActivityEnterView.j0(false);
            org.telegram.messenger.g0.v1(chatActivityEnterView);
            org.telegram.messenger.g0.i3(this, 150L);
            return;
        }
        if (wmVar == null) {
            return;
        }
        int i3 = chatActivityEnterView.R;
        long j10 = this.a.k.dialog_id;
        TL_keyboard.KeyboardButtonProto keyboardButtonProto = this.c;
        String text = keyboardButtonProto.getText();
        String url = keyboardButtonProto.getUrl();
        boolean c2 = dg.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeSimpleWebView.class);
        org.telegram.messenger.zi ziVar = this.d;
        ii.q4 b10 = ii.q4.b(i3, j10, this.b, text, url, c2 ? 1 : 0, ziVar != null ? ziVar.k.id : 0, wmVar == null ? 0L : wmVar.h9(), null, false, null, null, 0, false, false);
        LaunchActivity launchActivity = LaunchActivity.K1;
        if (launchActivity != null && launchActivity.O() != null && LaunchActivity.K1.O().k(b10) != null) {
            ii.a0 a0Var = chatActivityEnterView.m0;
            if (a0Var != null) {
                a0Var.setOpened(false);
                return;
            }
            return;
        }
        TLRPC.User user = this.e;
        String F1 = user == null ? null : org.telegram.messenger.hp.s1(chatActivityEnterView.R).F1(user.restriction_reason);
        if (!TextUtils.isEmpty(F1)) {
            org.telegram.messenger.hp.s1(chatActivityEnterView.R);
            org.telegram.messenger.hp.R4(F1, wmVar);
        } else {
            ii.a3 a3Var = new ii.a3(chatActivityEnterView.getContext(), chatActivityEnterView.X3);
            a3Var.m0 = chatActivityEnterView.P2;
            a3Var.x(wmVar, b10);
            a3Var.show();
        }
    }
}
