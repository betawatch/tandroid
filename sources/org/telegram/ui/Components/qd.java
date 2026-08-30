package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qd implements rh.j0, org.telegram.ui.ActionBar.c2, tt, org.telegram.ui.ActionBar.n1 {
    public final /* synthetic */ ChatActivityEnterView a;

    public /* synthetic */ qd(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        int i11 = ChatActivityEnterView.j5;
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.O();
        ff ffVar = chatActivityEnterView.B0;
        if (ffVar != null) {
            ffVar.setText("");
        }
    }

    @Override // org.telegram.ui.Components.tt
    public void j0() {
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.B0.invalidateEffects();
        eg egVar = chatActivityEnterView.V2;
        if (egVar != null) {
            egVar.y1(chatActivityEnterView.B0.getTextToUse());
        }
    }

    @Override // org.telegram.ui.ActionBar.n1
    public void n(KeyEvent keyEvent) {
        ChatActivityEnterView chatActivityEnterView;
        bf bfVar;
        int i10 = ChatActivityEnterView.j5;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (bfVar = (chatActivityEnterView = this.a).K0) != null && bfVar.isShowing()) {
            chatActivityEnterView.K0.dismiss();
        }
    }
}
