package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class hd implements ki.j0, org.telegram.ui.ActionBar.q1, dt, org.telegram.ui.ActionBar.e1 {
    public final /* synthetic */ ChatActivityEnterView a;

    public /* synthetic */ hd(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.dt
    public void E() {
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.F0.f();
        cg cgVar = chatActivityEnterView.H3;
        if (cgVar != null) {
            cgVar.u1(chatActivityEnterView.F0.getTextToUse());
        }
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        int i10 = ChatActivityEnterView.N6;
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.R();
        xe xeVar = chatActivityEnterView.F0;
        if (xeVar != null) {
            xeVar.setText("");
        }
    }

    @Override // org.telegram.ui.ActionBar.e1
    public void j(KeyEvent keyEvent) {
        ChatActivityEnterView chatActivityEnterView;
        te teVar;
        int i7 = ChatActivityEnterView.N6;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (teVar = (chatActivityEnterView = this.a).O0) != null && teVar.isShowing()) {
            chatActivityEnterView.O0.dismiss();
        }
    }
}
