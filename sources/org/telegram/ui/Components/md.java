package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class md implements nh.k0, org.telegram.ui.ActionBar.a2, jt, org.telegram.ui.ActionBar.l1 {
    public final /* synthetic */ ChatActivityEnterView a;

    public /* synthetic */ md(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11 = ChatActivityEnterView.i5;
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.O();
        bf bfVar = chatActivityEnterView.A0;
        if (bfVar != null) {
            bfVar.setText("");
        }
    }

    @Override // org.telegram.ui.ActionBar.l1
    public void k(KeyEvent keyEvent) {
        ChatActivityEnterView chatActivityEnterView;
        xe xeVar;
        int i10 = ChatActivityEnterView.i5;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (xeVar = (chatActivityEnterView = this.a).J0) != null && xeVar.isShowing()) {
            chatActivityEnterView.J0.dismiss();
        }
    }

    @Override // org.telegram.ui.Components.jt
    public void k1() {
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.A0.invalidateEffects();
        ag agVar = chatActivityEnterView.U2;
        if (agVar != null) {
            agVar.n1(chatActivityEnterView.A0.getTextToUse());
        }
    }
}
