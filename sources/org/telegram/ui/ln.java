package org.telegram.ui;

import android.util.SparseIntArray;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ln implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qn b;

    public /* synthetic */ ln(qn qnVar, int i10) {
        this.a = i10;
        this.b = qnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.h5 h5Var;
        org.telegram.ui.ActionBar.h5 h5Var2;
        switch (this.a) {
            case 0:
                SparseIntArray sparseIntArray = new SparseIntArray();
                qn qnVar = this.b;
                qnVar.e = sparseIntArray;
                sn snVar = qnVar.F;
                org.telegram.ui.ActionBar.j5 j5Var = (org.telegram.ui.ActionBar.j5) snVar.getThemedDrawable("drawableMsgOut");
                qnVar.s = j5Var;
                h5Var = ((org.telegram.ui.ActionBar.o2) snVar).parentLayout;
                j5Var.J = h5Var.getMessageDrawableOutStart();
                org.telegram.ui.ActionBar.j5 j5Var2 = (org.telegram.ui.ActionBar.j5) snVar.getThemedDrawable("drawableMsgOutMedia");
                qnVar.t = j5Var2;
                h5Var2 = ((org.telegram.ui.ActionBar.o2) snVar).parentLayout;
                j5Var2.J = h5Var2.getMessageDrawableOutMediaStart();
                qnVar.s.K = 0.0f;
                qnVar.t.K = 0.0f;
                snVar.Bc();
                qnVar.s(0.0f);
                break;
            default:
                qn qnVar2 = this.b;
                qnVar2.s.J = null;
                qnVar2.t.J = null;
                qnVar2.e = null;
                qnVar2.s(1.0f);
                break;
        }
    }
}
