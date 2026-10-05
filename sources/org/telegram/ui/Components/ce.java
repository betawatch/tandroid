package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ce implements ei.n0, org.telegram.ui.ActionBar.a2, cu, org.telegram.ui.ActionBar.l1 {
    public final /* synthetic */ ChatActivityEnterView a;

    public /* synthetic */ ce(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11 = ChatActivityEnterView.n5;
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.M();
        rf rfVar = chatActivityEnterView.E0;
        if (rfVar != null) {
            rfVar.setText("");
        }
    }

    @Override // org.telegram.ui.Components.cu
    public void j() {
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.E0.invalidateEffects();
        pg pgVar = chatActivityEnterView.Z2;
        if (pgVar != null) {
            pgVar.v1(chatActivityEnterView.E0.getTextToUse());
        }
    }

    @Override // org.telegram.ui.ActionBar.l1
    public void o(KeyEvent keyEvent) {
        ChatActivityEnterView chatActivityEnterView;
        nf nfVar;
        int i10 = ChatActivityEnterView.n5;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (nfVar = (chatActivityEnterView = this.a).N0) != null && nfVar.isShowing()) {
            chatActivityEnterView.N0.dismiss();
        }
    }
}
