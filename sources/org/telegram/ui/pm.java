package org.telegram.ui;

import android.util.SparseIntArray;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ um b;

    public /* synthetic */ pm(um umVar, int i3) {
        this.a = i3;
        this.b = umVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.q4 q4Var;
        org.telegram.ui.ActionBar.q4 q4Var2;
        switch (this.a) {
            case 0:
                SparseIntArray sparseIntArray = new SparseIntArray();
                um umVar = this.b;
                umVar.e = sparseIntArray;
                wm wmVar = umVar.G;
                org.telegram.ui.ActionBar.t4 t4Var = (org.telegram.ui.ActionBar.t4) wmVar.getThemedDrawable("drawableMsgOut");
                umVar.t = t4Var;
                q4Var = ((org.telegram.ui.ActionBar.d2) wmVar).parentLayout;
                t4Var.J = q4Var.getMessageDrawableOutStart();
                org.telegram.ui.ActionBar.t4 t4Var2 = (org.telegram.ui.ActionBar.t4) wmVar.getThemedDrawable("drawableMsgOutMedia");
                umVar.u = t4Var2;
                q4Var2 = ((org.telegram.ui.ActionBar.d2) wmVar).parentLayout;
                t4Var2.J = q4Var2.getMessageDrawableOutMediaStart();
                umVar.t.K = 0.0f;
                umVar.u.K = 0.0f;
                wmVar.Yc();
                umVar.u(0.0f);
                break;
            default:
                um umVar2 = this.b;
                umVar2.t.J = null;
                umVar2.u.J = null;
                umVar2.e = null;
                umVar2.u(1.0f);
                break;
        }
    }
}
