package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class eo0 extends v4.u0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ap0 b;

    public /* synthetic */ eo0(ap0 ap0Var, int i7) {
        this.a = i7;
        this.b = ap0Var;
    }

    @Override // v4.u0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        lb lbVar;
        switch (this.a) {
            case 0:
                ap0 ap0Var = this.b;
                if (i10 != 0) {
                    ap0.J0(ap0Var);
                    ap0Var.m2 = ap0Var.l2;
                }
                gc gcVar = gc.w;
                if (gcVar != null && (lbVar = gcVar.e) != null && (lbVar.getParent() instanceof View) && ((View) gc.w.e.getParent()).getParent() == ap0Var.x1) {
                    gc.e();
                    break;
                }
                break;
            case 1:
                if (i10 != 0) {
                    ap0 ap0Var2 = this.b;
                    ap0.J0(ap0Var2);
                    ap0Var2.m2 = ap0Var2.l2;
                    break;
                }
                break;
            default:
                if (i10 != 0) {
                    ap0 ap0Var3 = this.b;
                    ap0.J0(ap0Var3);
                    ap0Var3.m2 = ap0Var3.l2;
                    break;
                }
                break;
        }
    }
}
