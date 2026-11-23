package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class qd implements ki.i0, org.telegram.ui.ActionBar.q1, kt, org.telegram.ui.ActionBar.e1 {
    public final /* synthetic */ ChatActivityEnterView a;

    public /* synthetic */ qd(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        int i10 = ChatActivityEnterView.s7;
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.T();
        hf hfVar = chatActivityEnterView.F0;
        if (hfVar != null) {
            hfVar.setText("");
        }
    }

    @Override // org.telegram.ui.ActionBar.e1
    public void m(KeyEvent keyEvent) {
        ChatActivityEnterView chatActivityEnterView;
        df dfVar;
        int i7 = ChatActivityEnterView.s7;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (dfVar = (chatActivityEnterView = this.a).O0) != null && dfVar.isShowing()) {
            chatActivityEnterView.O0.dismiss();
        }
    }

    @Override // org.telegram.ui.Components.kt
    public void u() {
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.F0.f();
        mg mgVar = chatActivityEnterView.P3;
        if (mgVar != null) {
            mgVar.u1(chatActivityEnterView.F0.getTextToUse());
        }
    }
}
