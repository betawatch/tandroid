package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class cq0 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zq0 b;

    public /* synthetic */ cq0(zq0 zq0Var, int i10) {
        this.a = i10;
        this.b = zq0Var;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        vb vbVar;
        switch (this.a) {
            case 0:
                zq0 zq0Var = this.b;
                if (i11 != 0) {
                    zq0.k0(zq0Var);
                    zq0Var.q0 = zq0Var.p0;
                }
                rc rcVar = rc.w;
                if (rcVar != null && (vbVar = rcVar.e) != null && (vbVar.getParent() instanceof View) && ((View) rc.w.e.getParent()).getParent() == zq0Var.w) {
                    rc.e();
                    break;
                }
                break;
            case 1:
                if (i11 != 0) {
                    zq0 zq0Var2 = this.b;
                    zq0.k0(zq0Var2);
                    zq0Var2.q0 = zq0Var2.p0;
                    break;
                }
                break;
            default:
                if (i11 != 0) {
                    zq0 zq0Var3 = this.b;
                    zq0.k0(zq0Var3);
                    zq0Var3.q0 = zq0Var3.p0;
                    break;
                }
                break;
        }
    }
}
