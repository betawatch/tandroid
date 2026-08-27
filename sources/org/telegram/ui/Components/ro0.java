package org.telegram.ui.Components;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ro0 extends f2.b1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sp0 b;

    public /* synthetic */ ro0(sp0 sp0Var, int i10) {
        this.a = i10;
        this.b = sp0Var;
    }

    @Override // f2.b1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        jg.e eVar;
        jb jbVar;
        switch (this.a) {
            case 0:
                if (i11 != 0) {
                    sp0 sp0Var = this.b;
                    sp0.s0(sp0Var);
                    sp0Var.m0 = sp0Var.l0;
                    break;
                }
                break;
            case 1:
                sp0 sp0Var2 = this.b;
                if (i11 != 0) {
                    sp0.s0(sp0Var2);
                    sp0Var2.m0 = sp0Var2.l0;
                }
                ec ecVar = ec.w;
                if (ecVar != null && (jbVar = ecVar.e) != null && (jbVar.getParent() instanceof View) && ((View) ec.w.e.getParent()).getParent() == sp0Var2.w) {
                    ec.e();
                }
                if (Build.VERSION.SDK_INT >= 31 && (eVar = sp0Var2.K0) != null) {
                    eVar.f(i10, i11);
                    sp0.A0(sp0Var2);
                    break;
                }
                break;
            default:
                if (i11 != 0) {
                    sp0 sp0Var3 = this.b;
                    sp0.s0(sp0Var3);
                    sp0Var3.m0 = sp0Var3.l0;
                    break;
                }
                break;
        }
    }
}
