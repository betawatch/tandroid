package org.telegram.ui.Components;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ro0 extends f2.d1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rp0 b;

    public /* synthetic */ ro0(rp0 rp0Var, int i9) {
        this.a = i9;
        this.b = rp0Var;
    }

    @Override // f2.d1
    public final void b(RecyclerView recyclerView, int i9, int i10) {
        ig.e eVar;
        lb lbVar;
        switch (this.a) {
            case 0:
                if (i10 != 0) {
                    rp0 rp0Var = this.b;
                    rp0.r0(rp0Var);
                    rp0Var.m0 = rp0Var.l0;
                    break;
                }
                break;
            case 1:
                rp0 rp0Var2 = this.b;
                if (i10 != 0) {
                    rp0.r0(rp0Var2);
                    rp0Var2.m0 = rp0Var2.l0;
                }
                gc gcVar = gc.w;
                if (gcVar != null && (lbVar = gcVar.e) != null && (lbVar.getParent() instanceof View) && ((View) gc.w.e.getParent()).getParent() == rp0Var2.w) {
                    gc.e();
                }
                if (Build.VERSION.SDK_INT >= 31 && (eVar = rp0Var2.K0) != null) {
                    eVar.f(i9, i10);
                    rp0.z0(rp0Var2);
                    break;
                }
                break;
            default:
                if (i10 != 0) {
                    rp0 rp0Var3 = this.b;
                    rp0.r0(rp0Var3);
                    rp0Var3.m0 = rp0Var3.l0;
                    break;
                }
                break;
        }
    }
}
