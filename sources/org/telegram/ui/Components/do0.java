package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class do0 extends v4.u0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zo0 b;

    public /* synthetic */ do0(zo0 zo0Var, int i7) {
        this.a = i7;
        this.b = zo0Var;
    }

    @Override // v4.u0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        kb kbVar;
        switch (this.a) {
            case 0:
                zo0 zo0Var = this.b;
                if (i10 != 0) {
                    zo0.J0(zo0Var);
                    zo0Var.m2 = zo0Var.l2;
                }
                fc fcVar = fc.w;
                if (fcVar != null && (kbVar = fcVar.e) != null && (kbVar.getParent() instanceof View) && ((View) fc.w.e.getParent()).getParent() == zo0Var.x1) {
                    fc.e();
                    break;
                }
                break;
            case 1:
                if (i10 != 0) {
                    zo0 zo0Var2 = this.b;
                    zo0.J0(zo0Var2);
                    zo0Var2.m2 = zo0Var2.l2;
                    break;
                }
                break;
            default:
                if (i10 != 0) {
                    zo0 zo0Var3 = this.b;
                    zo0.J0(zo0Var3);
                    zo0Var3.m2 = zo0Var3.l2;
                    break;
                }
                break;
        }
    }
}
