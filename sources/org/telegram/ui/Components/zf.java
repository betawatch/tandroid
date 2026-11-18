package org.telegram.ui.Components;

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class zf implements Runnable {
    public final /* synthetic */ org.telegram.messenger.fj a;
    public final /* synthetic */ long b;
    public final /* synthetic */ TL_keyboard.KeyboardButtonProto c;
    public final /* synthetic */ org.telegram.messenger.fj d;
    public final /* synthetic */ TLRPC.User e;
    public final /* synthetic */ ChatActivityEnterView f;

    public zf(ChatActivityEnterView chatActivityEnterView, org.telegram.messenger.fj fjVar, long j3, TL_keyboard.KeyboardButtonProto keyboardButtonProto, org.telegram.messenger.fj fjVar2, TLRPC.User user) {
        this.f = chatActivityEnterView;
        this.a = fjVar;
        this.b = j3;
        this.c = keyboardButtonProto;
        this.d = fjVar2;
        this.e = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ChatActivityEnterView chatActivityEnterView = this.f;
        org.telegram.ui.bn bnVar = chatActivityEnterView.D3;
        if (chatActivityEnterView.a2.Q() > org.telegram.messenger.g0.L(20.0f) || chatActivityEnterView.O0()) {
            chatActivityEnterView.G0(false);
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
        org.telegram.messenger.fj fjVar = this.d;
        ki.f4 b10 = ki.f4.b(i7, j3, this.b, text, url, c10 ? 1 : 0, fjVar != null ? fjVar.k.id : 0, bnVar == null ? 0L : bnVar.j9(), null, false, null, null, 0, false, false);
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null && launchActivity.N() != null && LaunchActivity.H1.N().k(b10) != null) {
            ki.z zVar = chatActivityEnterView.m0;
            if (zVar != null) {
                zVar.setOpened(false);
                return;
            }
            return;
        }
        TLRPC.User user = this.e;
        String H1 = user == null ? null : org.telegram.messenger.mp.u1(chatActivityEnterView.R).H1(user.restriction_reason);
        if (!TextUtils.isEmpty(H1)) {
            org.telegram.messenger.mp.u1(chatActivityEnterView.R);
            org.telegram.messenger.mp.d5(H1, bnVar);
        } else {
            ki.t2 t2Var = new ki.t2(chatActivityEnterView.getContext(), chatActivityEnterView.K4);
            t2Var.m0 = chatActivityEnterView.C3;
            t2Var.x(bnVar, b10);
            t2Var.show();
        }
    }
}
