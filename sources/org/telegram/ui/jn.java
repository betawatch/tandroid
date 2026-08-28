package org.telegram.ui;

import android.util.SparseIntArray;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ on b;

    public /* synthetic */ jn(on onVar, int i9) {
        this.a = i9;
        this.b = onVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        switch (this.a) {
            case 0:
                SparseIntArray sparseIntArray = new SparseIntArray();
                on onVar = this.b;
                onVar.e = sparseIntArray;
                qn qnVar = onVar.R;
                org.telegram.ui.ActionBar.d5 d5Var = (org.telegram.ui.ActionBar.d5) qnVar.getThemedDrawable("drawableMsgOut");
                onVar.E = d5Var;
                b5Var = ((org.telegram.ui.ActionBar.o2) qnVar).parentLayout;
                d5Var.H = b5Var.getMessageDrawableOutStart();
                org.telegram.ui.ActionBar.d5 d5Var2 = (org.telegram.ui.ActionBar.d5) qnVar.getThemedDrawable("drawableMsgOutMedia");
                onVar.F = d5Var2;
                b5Var2 = ((org.telegram.ui.ActionBar.o2) qnVar).parentLayout;
                d5Var2.H = b5Var2.getMessageDrawableOutMediaStart();
                onVar.E.I = 0.0f;
                onVar.F.I = 0.0f;
                qnVar.uc();
                onVar.k(0.0f);
                break;
            default:
                on onVar2 = this.b;
                onVar2.E.H = null;
                onVar2.F.H = null;
                onVar2.e = null;
                onVar2.k(1.0f);
                break;
        }
    }
}
