package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dd implements xh.g0, org.telegram.ui.ActionBar.u1, kt, org.telegram.ui.ActionBar.i1 {
    public final /* synthetic */ ChatActivityEnterView a;

    public /* synthetic */ dd(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        int i11 = ChatActivityEnterView.s5;
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.J();
        se seVar = chatActivityEnterView.E0;
        if (seVar != null) {
            seVar.setText("");
        }
    }

    @Override // org.telegram.ui.Components.kt
    public void m() {
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.E0.f();
        sf sfVar = chatActivityEnterView.Z2;
        if (sfVar != null) {
            sfVar.g1(chatActivityEnterView.E0.getTextToUse());
        }
    }

    @Override // org.telegram.ui.ActionBar.i1
    public void p(KeyEvent keyEvent) {
        ChatActivityEnterView chatActivityEnterView;
        oe oeVar;
        int i10 = ChatActivityEnterView.s5;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (oeVar = (chatActivityEnterView = this.a).N0) != null && oeVar.isShowing()) {
            chatActivityEnterView.N0.dismiss();
        }
    }
}
