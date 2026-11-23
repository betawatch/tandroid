package org.telegram.ui;

import android.view.KeyEvent;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class mm0 implements org.telegram.ui.Components.a5, org.telegram.ui.ActionBar.e1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qm0 b;

    public /* synthetic */ mm0(qm0 qm0Var, int i7) {
        this.a = i7;
        this.b = qm0Var;
    }

    @Override // org.telegram.ui.Components.a5
    public void O(int i7, int i10, boolean z10) {
        switch (this.a) {
            case 0:
                qm0 qm0Var = this.b;
                qm0Var.a0(qm0Var.b, qm0Var.c, z10, i7);
                qm0Var.finishFragment();
                break;
            default:
                qm0 qm0Var2 = this.b;
                qm0Var2.a0(qm0Var2.b, qm0Var2.c, z10, i7);
                qm0Var2.finishFragment();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.e1
    public void j(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.g1 g1Var;
        qm0 qm0Var = this.b;
        qm0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g1Var = qm0Var.J) != null && g1Var.isShowing()) {
            qm0Var.J.d(true);
        }
    }
}
