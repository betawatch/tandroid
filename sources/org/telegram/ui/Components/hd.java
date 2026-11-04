package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hd implements ii.j0, org.telegram.ui.ActionBar.p1, vs, org.telegram.ui.ActionBar.d1 {
    public final /* synthetic */ ChatActivityEnterView a;

    public /* synthetic */ hd(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        int i10 = ChatActivityEnterView.t5;
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.J();
        ve veVar = chatActivityEnterView.F0;
        if (veVar != null) {
            veVar.setText("");
        }
    }

    @Override // org.telegram.ui.ActionBar.d1
    public void k(KeyEvent keyEvent) {
        ChatActivityEnterView chatActivityEnterView;
        re reVar;
        int i3 = ChatActivityEnterView.t5;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (reVar = (chatActivityEnterView = this.a).O0) != null && reVar.isShowing()) {
            chatActivityEnterView.O0.dismiss();
        }
    }

    @Override // org.telegram.ui.Components.vs
    public void m() {
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.F0.f();
        uf ufVar = chatActivityEnterView.a3;
        if (ufVar != null) {
            ufVar.j1(chatActivityEnterView.F0.getTextToUse());
        }
    }
}
