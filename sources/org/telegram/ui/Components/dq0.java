package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class dq0 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ br0 b;

    public /* synthetic */ dq0(br0 br0Var, int i10) {
        this.a = i10;
        this.b = br0Var;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        vb vbVar;
        switch (this.a) {
            case 0:
                br0 br0Var = this.b;
                if (i11 != 0) {
                    br0.k0(br0Var);
                    br0Var.q0 = br0Var.p0;
                }
                rc rcVar = rc.w;
                if (rcVar != null && (vbVar = rcVar.e) != null && (vbVar.getParent() instanceof View) && ((View) rc.w.e.getParent()).getParent() == br0Var.w) {
                    rc.e();
                    break;
                }
                break;
            case 1:
                if (i11 != 0) {
                    br0 br0Var2 = this.b;
                    br0.k0(br0Var2);
                    br0Var2.q0 = br0Var2.p0;
                    break;
                }
                break;
            default:
                if (i11 != 0) {
                    br0 br0Var3 = this.b;
                    br0.k0(br0Var3);
                    br0Var3.q0 = br0Var3.p0;
                    break;
                }
                break;
        }
    }
}
