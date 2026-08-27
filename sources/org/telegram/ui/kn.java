package org.telegram.ui;

import android.util.SparseIntArray;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pn b;

    public /* synthetic */ kn(pn pnVar, int i10) {
        this.a = i10;
        this.b = pnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        switch (this.a) {
            case 0:
                SparseIntArray sparseIntArray = new SparseIntArray();
                pn pnVar = this.b;
                pnVar.e = sparseIntArray;
                rn rnVar = pnVar.R;
                org.telegram.ui.ActionBar.d5 d5Var = (org.telegram.ui.ActionBar.d5) rnVar.getThemedDrawable("drawableMsgOut");
                pnVar.E = d5Var;
                b5Var = ((org.telegram.ui.ActionBar.n2) rnVar).parentLayout;
                d5Var.H = b5Var.getMessageDrawableOutStart();
                org.telegram.ui.ActionBar.d5 d5Var2 = (org.telegram.ui.ActionBar.d5) rnVar.getThemedDrawable("drawableMsgOutMedia");
                pnVar.F = d5Var2;
                b5Var2 = ((org.telegram.ui.ActionBar.n2) rnVar).parentLayout;
                d5Var2.H = b5Var2.getMessageDrawableOutMediaStart();
                pnVar.E.I = 0.0f;
                pnVar.F.I = 0.0f;
                rnVar.uc();
                pnVar.k(0.0f);
                break;
            default:
                pn pnVar2 = this.b;
                pnVar2.E.H = null;
                pnVar2.F.H = null;
                pnVar2.e = null;
                pnVar2.k(1.0f);
                break;
        }
    }
}
