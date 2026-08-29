package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class td implements ph.i0, org.telegram.ui.ActionBar.b2, qt, org.telegram.ui.ActionBar.m1 {
    public final /* synthetic */ ChatActivityEnterView a;

    public /* synthetic */ td(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.qt
    public void e1() {
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.A0.invalidateEffects();
        hg hgVar = chatActivityEnterView.U2;
        if (hgVar != null) {
            hgVar.v1(chatActivityEnterView.A0.getTextToUse());
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        int i11 = ChatActivityEnterView.i5;
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.O();
        jf jfVar = chatActivityEnterView.A0;
        if (jfVar != null) {
            jfVar.setText("");
        }
    }

    @Override // org.telegram.ui.ActionBar.m1
    public void o(KeyEvent keyEvent) {
        ChatActivityEnterView chatActivityEnterView;
        ef efVar;
        int i10 = ChatActivityEnterView.i5;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (efVar = (chatActivityEnterView = this.a).J0) != null && efVar.isShowing()) {
            chatActivityEnterView.J0.dismiss();
        }
    }
}
