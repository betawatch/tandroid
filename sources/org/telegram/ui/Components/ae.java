package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ae implements fi.m0, org.telegram.ui.ActionBar.a2, xt, org.telegram.ui.ActionBar.l1 {
    public final /* synthetic */ ChatActivityEnterView a;

    public /* synthetic */ ae(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11 = ChatActivityEnterView.m5;
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.O();
        qf qfVar = chatActivityEnterView.E0;
        if (qfVar != null) {
            qfVar.setText("");
        }
    }

    @Override // org.telegram.ui.Components.xt
    public void j() {
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.E0.invalidateEffects();
        og ogVar = chatActivityEnterView.Y2;
        if (ogVar != null) {
            ogVar.p1(chatActivityEnterView.E0.getTextToUse());
        }
    }

    @Override // org.telegram.ui.ActionBar.l1
    public void n(KeyEvent keyEvent) {
        ChatActivityEnterView chatActivityEnterView;
        mf mfVar;
        int i10 = ChatActivityEnterView.m5;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (mfVar = (chatActivityEnterView = this.a).N0) != null && mfVar.isShowing()) {
            chatActivityEnterView.N0.dismiss();
        }
    }
}
