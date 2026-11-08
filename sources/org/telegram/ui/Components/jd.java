package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jd implements hi.h0, org.telegram.ui.ActionBar.r1, xs, org.telegram.ui.ActionBar.e1 {
    public final /* synthetic */ ChatActivityEnterView a;

    public /* synthetic */ jd(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        int i10 = ChatActivityEnterView.s5;
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.J();
        xe xeVar = chatActivityEnterView.E0;
        if (xeVar != null) {
            xeVar.setText("");
        }
    }

    @Override // org.telegram.ui.ActionBar.e1
    public void j(KeyEvent keyEvent) {
        ChatActivityEnterView chatActivityEnterView;
        te teVar;
        int i7 = ChatActivityEnterView.s5;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (teVar = (chatActivityEnterView = this.a).N0) != null && teVar.isShowing()) {
            chatActivityEnterView.N0.dismiss();
        }
    }

    @Override // org.telegram.ui.Components.xs
    public void m() {
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.E0.f();
        wf wfVar = chatActivityEnterView.Z2;
        if (wfVar != null) {
            wfVar.k1(chatActivityEnterView.E0.getTextToUse());
        }
    }
}
