package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class id implements hi.h0, org.telegram.ui.ActionBar.r1, ws, org.telegram.ui.ActionBar.e1 {
    public final /* synthetic */ ChatActivityEnterView a;

    public /* synthetic */ id(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        int i10 = ChatActivityEnterView.s5;
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.J();
        we weVar = chatActivityEnterView.E0;
        if (weVar != null) {
            weVar.setText("");
        }
    }

    @Override // org.telegram.ui.ActionBar.e1
    public void j(KeyEvent keyEvent) {
        ChatActivityEnterView chatActivityEnterView;
        se seVar;
        int i7 = ChatActivityEnterView.s5;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (seVar = (chatActivityEnterView = this.a).N0) != null && seVar.isShowing()) {
            chatActivityEnterView.N0.dismiss();
        }
    }

    @Override // org.telegram.ui.Components.ws
    public void m() {
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.E0.f();
        vf vfVar = chatActivityEnterView.Z2;
        if (vfVar != null) {
            vfVar.k1(chatActivityEnterView.E0.getTextToUse());
        }
    }
}
