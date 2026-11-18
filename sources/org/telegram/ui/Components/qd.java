package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class qd implements ki.j0, org.telegram.ui.ActionBar.r1, kt, org.telegram.ui.ActionBar.f1 {
    public final /* synthetic */ ChatActivityEnterView a;

    public /* synthetic */ qd(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.kt
    public void g() {
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.F0.f();
        kg kgVar = chatActivityEnterView.N3;
        if (kgVar != null) {
            kgVar.u1(chatActivityEnterView.F0.getTextToUse());
        }
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        int i10 = ChatActivityEnterView.n7;
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.T();
        gf gfVar = chatActivityEnterView.F0;
        if (gfVar != null) {
            gfVar.setText("");
        }
    }

    @Override // org.telegram.ui.ActionBar.f1
    public void j(KeyEvent keyEvent) {
        ChatActivityEnterView chatActivityEnterView;
        cf cfVar;
        int i7 = ChatActivityEnterView.n7;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (cfVar = (chatActivityEnterView = this.a).O0) != null && cfVar.isShowing()) {
            chatActivityEnterView.O0.dismiss();
        }
    }
}
