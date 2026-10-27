package org.telegram.ui;

import android.util.SparseIntArray;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
        org.telegram.ui.ActionBar.j5 j5Var;
        org.telegram.ui.ActionBar.j5 j5Var2;
        switch (this.a) {
            case 0:
                SparseIntArray sparseIntArray = new SparseIntArray();
                un unVar = this.b;
                unVar.e = sparseIntArray;
                wn wnVar = unVar.F;
                org.telegram.ui.ActionBar.l5 l5Var = (org.telegram.ui.ActionBar.l5) wnVar.getThemedDrawable("drawableMsgOut");
                unVar.s = l5Var;
                j5Var = ((org.telegram.ui.ActionBar.r2) wnVar).parentLayout;
                l5Var.J = j5Var.getMessageDrawableOutStart();
                org.telegram.ui.ActionBar.l5 l5Var2 = (org.telegram.ui.ActionBar.l5) wnVar.getThemedDrawable("drawableMsgOutMedia");
                unVar.t = l5Var2;
                j5Var2 = ((org.telegram.ui.ActionBar.r2) wnVar).parentLayout;
                l5Var2.J = j5Var2.getMessageDrawableOutMediaStart();
                unVar.s.K = 0.0f;
                unVar.t.K = 0.0f;
                wnVar.Lc();
                unVar.s(0.0f);
                break;
            default:
                un unVar2 = this.b;
                unVar2.s.J = null;
                unVar2.t.J = null;
                unVar2.e = null;
                unVar2.s(1.0f);
                break;
        }
    }
}
