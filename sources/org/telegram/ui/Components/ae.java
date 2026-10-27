package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ae implements hi.r0, org.telegram.ui.ActionBar.b2, hu, org.telegram.ui.ActionBar.m1 {
    public final /* synthetic */ ChatActivityEnterView a;

    public /* synthetic */ ae(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.hu
    public void g() {
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.E0.invalidateEffects();
        og ogVar = chatActivityEnterView.Z2;
        if (ogVar != null) {
            ogVar.g1(chatActivityEnterView.E0.getTextToUse());
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        int i11 = ChatActivityEnterView.r5;
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.K();
        pf pfVar = chatActivityEnterView.E0;
        if (pfVar != null) {
            pfVar.setText("");
        }
    }

    @Override // org.telegram.ui.ActionBar.m1
    public void n(KeyEvent keyEvent) {
        ChatActivityEnterView chatActivityEnterView;
        lf lfVar;
        int i10 = ChatActivityEnterView.r5;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (lfVar = (chatActivityEnterView = this.a).N0) != null && lfVar.isShowing()) {
            chatActivityEnterView.N0.dismiss();
        }
    }
}
