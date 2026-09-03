package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qd implements rh.i0, org.telegram.ui.ActionBar.c2, st, org.telegram.ui.ActionBar.n1 {
    public final /* synthetic */ ChatActivityEnterView a;

    public /* synthetic */ qd(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.st
    public void J() {
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.B0.invalidateEffects();
        eg egVar = chatActivityEnterView.V2;
        if (egVar != null) {
            egVar.A1(chatActivityEnterView.B0.getTextToUse());
        }
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        int i11 = ChatActivityEnterView.j5;
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.O();
        ff ffVar = chatActivityEnterView.B0;
        if (ffVar != null) {
            ffVar.setText("");
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
