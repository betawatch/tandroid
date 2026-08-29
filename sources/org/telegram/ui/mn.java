package org.telegram.ui;

import android.util.SparseIntArray;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rn b;

    public /* synthetic */ mn(rn rnVar, int i10) {
        this.a = i10;
        this.b = rnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        switch (this.a) {
            case 0:
                SparseIntArray sparseIntArray = new SparseIntArray();
                rn rnVar = this.b;
                rnVar.e = sparseIntArray;
                tn tnVar = rnVar.R;
                org.telegram.ui.ActionBar.d5 d5Var = (org.telegram.ui.ActionBar.d5) tnVar.getThemedDrawable("drawableMsgOut");
                rnVar.E = d5Var;
                b5Var = ((org.telegram.ui.ActionBar.o2) tnVar).parentLayout;
                d5Var.H = b5Var.getMessageDrawableOutStart();
                org.telegram.ui.ActionBar.d5 d5Var2 = (org.telegram.ui.ActionBar.d5) tnVar.getThemedDrawable("drawableMsgOutMedia");
                rnVar.F = d5Var2;
                b5Var2 = ((org.telegram.ui.ActionBar.o2) tnVar).parentLayout;
                d5Var2.H = b5Var2.getMessageDrawableOutMediaStart();
                rnVar.E.I = 0.0f;
                rnVar.F.I = 0.0f;
                tnVar.uc();
                rnVar.k(0.0f);
                break;
            default:
                rn rnVar2 = this.b;
                rnVar2.E.H = null;
                rnVar2.F.H = null;
                rnVar2.e = null;
                rnVar2.k(1.0f);
                break;
        }
    }
}
