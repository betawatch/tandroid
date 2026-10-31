package org.telegram.ui;

import android.util.SparseIntArray;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class nn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sn b;

    public /* synthetic */ nn(sn snVar, int i10) {
        this.a = i10;
        this.b = snVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.z4 z4Var;
        org.telegram.ui.ActionBar.z4 z4Var2;
        switch (this.a) {
            case 0:
                SparseIntArray sparseIntArray = new SparseIntArray();
                sn snVar = this.b;
                snVar.e = sparseIntArray;
                un unVar = snVar.G;
                org.telegram.ui.ActionBar.c5 c5Var = (org.telegram.ui.ActionBar.c5) unVar.getThemedDrawable("drawableMsgOut");
                snVar.t = c5Var;
                z4Var = ((org.telegram.ui.ActionBar.k2) unVar).parentLayout;
                c5Var.J = z4Var.getMessageDrawableOutStart();
                org.telegram.ui.ActionBar.c5 c5Var2 = (org.telegram.ui.ActionBar.c5) unVar.getThemedDrawable("drawableMsgOutMedia");
                snVar.u = c5Var2;
                z4Var2 = ((org.telegram.ui.ActionBar.k2) unVar).parentLayout;
                c5Var2.J = z4Var2.getMessageDrawableOutMediaStart();
                snVar.t.K = 0.0f;
                snVar.u.K = 0.0f;
                unVar.Oc();
                snVar.u(0.0f);
                break;
            default:
                sn snVar2 = this.b;
                snVar2.t.J = null;
                snVar2.u.J = null;
                snVar2.e = null;
                snVar2.u(1.0f);
                break;
        }
    }
}
