package org.telegram.ui.Components;

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class dg implements Runnable {
    public final /* synthetic */ org.telegram.messenger.gj a;
    public final /* synthetic */ long b;
    public final /* synthetic */ TL_keyboard.KeyboardButtonProto c;
    public final /* synthetic */ org.telegram.messenger.gj d;
    public final /* synthetic */ TLRPC.User e;
    public final /* synthetic */ ChatActivityEnterView f;

    public dg(ChatActivityEnterView chatActivityEnterView, org.telegram.messenger.gj gjVar, long j3, TL_keyboard.KeyboardButtonProto keyboardButtonProto, org.telegram.messenger.gj gjVar2, TLRPC.User user) {
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
        org.telegram.ui.bn bnVar = chatActivityEnterView.F3;
        if (chatActivityEnterView.c2.Q() > org.telegram.messenger.g0.L(20.0f) || chatActivityEnterView.S0()) {
            chatActivityEnterView.K0(false);
            org.telegram.messenger.g0.v1(chatActivityEnterView);
            org.telegram.messenger.g0.h3(this, 150L);
            return;
        }
        if (bnVar == null) {
            return;
        }
        int i7 = chatActivityEnterView.R;
        long j3 = this.a.k.dialog_id;
        TL_keyboard.KeyboardButtonProto keyboardButtonProto = this.c;
        String text = keyboardButtonProto.getText();
        String url = keyboardButtonProto.getUrl();
        boolean c10 = cg.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeSimpleWebView.class);
        org.telegram.messenger.gj gjVar = this.d;
        ki.e4 b10 = ki.e4.b(i7, j3, this.b, text, url, c10 ? 1 : 0, gjVar != null ? gjVar.k.id : 0, bnVar == null ? 0L : bnVar.j9(), null, false, null, null, 0, false, false);
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null && launchActivity.N() != null && LaunchActivity.H1.N().k(b10) != null) {
            ki.y yVar = chatActivityEnterView.m0;
            if (yVar != null) {
                yVar.setOpened(false);
                return;
            }
            return;
        }
        TLRPC.User user = this.e;
        String H1 = user == null ? null : org.telegram.messenger.np.u1(chatActivityEnterView.R).H1(user.restriction_reason);
        if (!TextUtils.isEmpty(H1)) {
            org.telegram.messenger.np.u1(chatActivityEnterView.R);
            org.telegram.messenger.np.d5(H1, bnVar);
        } else {
            ki.s2 s2Var = new ki.s2(chatActivityEnterView.getContext(), chatActivityEnterView.M4);
            s2Var.m0 = chatActivityEnterView.E3;
            s2Var.x(bnVar, b10);
            s2Var.show();
        }
    }
}
