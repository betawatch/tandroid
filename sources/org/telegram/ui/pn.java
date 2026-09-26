package org.telegram.ui;

import android.util.SparseIntArray;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ un b;

    public /* synthetic */ pn(un unVar, int i10) {
        this.a = i10;
        this.b = unVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        switch (this.a) {
            case 0:
                SparseIntArray sparseIntArray = new SparseIntArray();
                un unVar = this.b;
                unVar.e = sparseIntArray;
                wn wnVar = unVar.V;
                org.telegram.ui.ActionBar.d5 d5Var = (org.telegram.ui.ActionBar.d5) wnVar.getThemedDrawable("drawableMsgOut");
                unVar.I = d5Var;
                b5Var = ((org.telegram.ui.ActionBar.m2) wnVar).parentLayout;
                d5Var.H = b5Var.getMessageDrawableOutStart();
                org.telegram.ui.ActionBar.d5 d5Var2 = (org.telegram.ui.ActionBar.d5) wnVar.getThemedDrawable("drawableMsgOutMedia");
                unVar.J = d5Var2;
                b5Var2 = ((org.telegram.ui.ActionBar.m2) wnVar).parentLayout;
                d5Var2.H = b5Var2.getMessageDrawableOutMediaStart();
                unVar.I.I = 0.0f;
                unVar.J.I = 0.0f;
                wnVar.uc();
                unVar.k(0.0f);
                break;
            default:
                un unVar2 = this.b;
                unVar2.I.H = null;
                unVar2.J.H = null;
                unVar2.e = null;
                unVar2.k(1.0f);
                break;
        }
    }
}
