package org.telegram.ui;

import android.util.SparseIntArray;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        switch (this.a) {
            case 0:
                SparseIntArray sparseIntArray = new SparseIntArray();
                qn qnVar = this.b;
                qnVar.e = sparseIntArray;
                sn snVar = qnVar.V;
                org.telegram.ui.ActionBar.f5 f5Var = (org.telegram.ui.ActionBar.f5) snVar.getThemedDrawable("drawableMsgOut");
                qnVar.I = f5Var;
                d5Var = ((org.telegram.ui.ActionBar.n2) snVar).parentLayout;
                f5Var.J = d5Var.getMessageDrawableOutStart();
                org.telegram.ui.ActionBar.f5 f5Var2 = (org.telegram.ui.ActionBar.f5) snVar.getThemedDrawable("drawableMsgOutMedia");
                qnVar.J = f5Var2;
                d5Var2 = ((org.telegram.ui.ActionBar.n2) snVar).parentLayout;
                f5Var2.J = d5Var2.getMessageDrawableOutMediaStart();
                qnVar.I.K = 0.0f;
                qnVar.J.K = 0.0f;
                snVar.yc();
                qnVar.m(0.0f);
                break;
            default:
                qn qnVar2 = this.b;
                qnVar2.I.J = null;
                qnVar2.J.J = null;
                qnVar2.e = null;
                qnVar2.m(1.0f);
                break;
        }
    }
}
