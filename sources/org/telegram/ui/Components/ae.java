package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class ae implements ei.m0, org.telegram.ui.ActionBar.a2, zt, org.telegram.ui.ActionBar.l1 {
    public final /* synthetic */ ChatActivityEnterView a;

    public /* synthetic */ ae(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.zt
    public void i() {
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.E0.invalidateEffects();
        ng ngVar = chatActivityEnterView.Z2;
        if (ngVar != null) {
            ngVar.w1(chatActivityEnterView.E0.getTextToUse());
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11 = ChatActivityEnterView.n5;
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.O();
        pf pfVar = chatActivityEnterView.E0;
        if (pfVar != null) {
            pfVar.setText("");
        }
    }

    @Override // org.telegram.ui.ActionBar.l1
    public void o(KeyEvent keyEvent) {
        ChatActivityEnterView chatActivityEnterView;
        lf lfVar;
        int i10 = ChatActivityEnterView.n5;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (lfVar = (chatActivityEnterView = this.a).N0) != null && lfVar.isShowing()) {
            chatActivityEnterView.N0.dismiss();
        }
    }
}
