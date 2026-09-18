package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yd implements ei.m0, org.telegram.ui.ActionBar.b2, zt, org.telegram.ui.ActionBar.m1 {
    public final /* synthetic */ ChatActivityEnterView a;

    public /* synthetic */ yd(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        int i11 = ChatActivityEnterView.n5;
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.P();
        of ofVar = chatActivityEnterView.E0;
        if (ofVar != null) {
            ofVar.setText("");
        }
    }

    @Override // org.telegram.ui.Components.zt
    public void i() {
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.E0.invalidateEffects();
        mg mgVar = chatActivityEnterView.Y2;
        if (mgVar != null) {
            mgVar.v1(chatActivityEnterView.E0.getTextToUse());
        }
    }

    @Override // org.telegram.ui.ActionBar.m1
    public void o(KeyEvent keyEvent) {
        ChatActivityEnterView chatActivityEnterView;
        jf jfVar;
        int i10 = ChatActivityEnterView.n5;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (jfVar = (chatActivityEnterView = this.a).N0) != null && jfVar.isShowing()) {
            chatActivityEnterView.N0.dismiss();
        }
    }
}
