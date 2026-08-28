package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pd implements mh.l0, org.telegram.ui.ActionBar.b2, kt, org.telegram.ui.ActionBar.m1 {
    public final /* synthetic */ ChatActivityEnterView a;

    public /* synthetic */ pd(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        int i10 = ChatActivityEnterView.i5;
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.N();
        ff ffVar = chatActivityEnterView.A0;
        if (ffVar != null) {
            ffVar.setText("");
        }
    }

    @Override // org.telegram.ui.ActionBar.m1
    public void k(KeyEvent keyEvent) {
        ChatActivityEnterView chatActivityEnterView;
        bf bfVar;
        int i9 = ChatActivityEnterView.i5;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (bfVar = (chatActivityEnterView = this.a).J0) != null && bfVar.isShowing()) {
            chatActivityEnterView.J0.dismiss();
        }
    }

    @Override // org.telegram.ui.Components.kt
    public void m1() {
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.A0.invalidateEffects();
        eg egVar = chatActivityEnterView.U2;
        if (egVar != null) {
            egVar.m1(chatActivityEnterView.A0.getTextToUse());
        }
    }
}
