package org.telegram.ui;

import android.util.SparseIntArray;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ on b;

    public /* synthetic */ jn(on onVar, int i10) {
        this.a = i10;
        this.b = onVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        switch (this.a) {
            case 0:
                SparseIntArray sparseIntArray = new SparseIntArray();
                on onVar = this.b;
                onVar.e = sparseIntArray;
                qn qnVar = onVar.V;
                org.telegram.ui.ActionBar.f5 f5Var = (org.telegram.ui.ActionBar.f5) qnVar.getThemedDrawable("drawableMsgOut");
                onVar.I = f5Var;
                d5Var = ((org.telegram.ui.ActionBar.n2) qnVar).parentLayout;
                f5Var.J = d5Var.getMessageDrawableOutStart();
                org.telegram.ui.ActionBar.f5 f5Var2 = (org.telegram.ui.ActionBar.f5) qnVar.getThemedDrawable("drawableMsgOutMedia");
                onVar.J = f5Var2;
                d5Var2 = ((org.telegram.ui.ActionBar.n2) qnVar).parentLayout;
                f5Var2.J = d5Var2.getMessageDrawableOutMediaStart();
                onVar.I.K = 0.0f;
                onVar.J.K = 0.0f;
                qnVar.zc();
                onVar.m(0.0f);
                break;
            default:
                on onVar2 = this.b;
                onVar2.I.J = null;
                onVar2.J.J = null;
                onVar2.e = null;
                onVar2.m(1.0f);
                break;
        }
    }
}
