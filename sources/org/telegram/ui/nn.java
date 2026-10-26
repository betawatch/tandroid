package org.telegram.ui;

import android.util.SparseIntArray;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
        org.telegram.ui.ActionBar.j5 j5Var;
        org.telegram.ui.ActionBar.j5 j5Var2;
        switch (this.a) {
            case 0:
                SparseIntArray sparseIntArray = new SparseIntArray();
                sn snVar = this.b;
                snVar.e = sparseIntArray;
                un unVar = snVar.F;
                org.telegram.ui.ActionBar.l5 l5Var = (org.telegram.ui.ActionBar.l5) unVar.getThemedDrawable("drawableMsgOut");
                snVar.s = l5Var;
                j5Var = ((org.telegram.ui.ActionBar.r2) unVar).parentLayout;
                l5Var.J = j5Var.getMessageDrawableOutStart();
                org.telegram.ui.ActionBar.l5 l5Var2 = (org.telegram.ui.ActionBar.l5) unVar.getThemedDrawable("drawableMsgOutMedia");
                snVar.t = l5Var2;
                j5Var2 = ((org.telegram.ui.ActionBar.r2) unVar).parentLayout;
                l5Var2.J = j5Var2.getMessageDrawableOutMediaStart();
                snVar.s.K = 0.0f;
                snVar.t.K = 0.0f;
                unVar.Hc();
                snVar.s(0.0f);
                break;
            default:
                sn snVar2 = this.b;
                snVar2.s.J = null;
                snVar2.t.J = null;
                snVar2.e = null;
                snVar2.s(1.0f);
                break;
        }
    }
}
