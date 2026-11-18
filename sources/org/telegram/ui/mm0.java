package org.telegram.ui;

import android.view.KeyEvent;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class mm0 implements org.telegram.ui.Components.z4, org.telegram.ui.ActionBar.f1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qm0 b;

    public /* synthetic */ mm0(qm0 qm0Var, int i7) {
        this.a = i7;
        this.b = qm0Var;
    }

    @Override // org.telegram.ui.Components.z4
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

    @Override // org.telegram.ui.ActionBar.f1
    public void j(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.h1 h1Var;
        qm0 qm0Var = this.b;
        qm0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (h1Var = qm0Var.J) != null && h1Var.isShowing()) {
            qm0Var.J.d(true);
        }
    }
}
