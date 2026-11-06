package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jd implements hi.h0, org.telegram.ui.ActionBar.r1, ws, org.telegram.ui.ActionBar.e1 {
    public final /* synthetic */ ChatActivityEnterView a;

    public /* synthetic */ jd(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        int i10 = ChatActivityEnterView.s5;
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.J();
        xe xeVar = chatActivityEnterView.E0;
        if (xeVar != null) {
            xeVar.setText("");
        }
    }

    @Override // org.telegram.ui.ActionBar.e1
    public void j(KeyEvent keyEvent) {
        ChatActivityEnterView chatActivityEnterView;
        te teVar;
        int i7 = ChatActivityEnterView.s5;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (teVar = (chatActivityEnterView = this.a).N0) != null && teVar.isShowing()) {
            chatActivityEnterView.N0.dismiss();
        }
    }

    @Override // org.telegram.ui.Components.ws
    public void m() {
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.E0.f();
        wf wfVar = chatActivityEnterView.Z2;
        if (wfVar != null) {
            wfVar.k1(chatActivityEnterView.E0.getTextToUse());
        }
    }
}
