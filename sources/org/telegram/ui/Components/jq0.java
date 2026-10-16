package org.telegram.ui.Components;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class jq0 extends s4.r0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ir0 b;

    public /* synthetic */ jq0(ir0 ir0Var, int i10) {
        this.a = i10;
        this.b = ir0Var;
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        bh.f fVar;
        wb wbVar;
        switch (this.a) {
            case 0:
                if (i11 != 0) {
                    ir0 ir0Var = this.b;
                    ir0.t0(ir0Var);
                    ir0Var.q0 = ir0Var.p0;
                    break;
                }
                break;
            case 1:
                ir0 ir0Var2 = this.b;
                if (i11 != 0) {
                    ir0.t0(ir0Var2);
                    ir0Var2.q0 = ir0Var2.p0;
                }
                sc scVar = sc.w;
                if (scVar != null && (wbVar = scVar.e) != null && (wbVar.getParent() instanceof View) && ((View) sc.w.e.getParent()).getParent() == ir0Var2.w) {
                    sc.e();
                }
                if (Build.VERSION.SDK_INT >= 31 && (fVar = ir0Var2.O0) != null) {
                    fVar.f(i10, i11);
                    ir0.B0(ir0Var2);
                    break;
                }
                break;
            default:
                if (i11 != 0) {
                    ir0 ir0Var3 = this.b;
                    ir0.t0(ir0Var3);
                    ir0Var3.q0 = ir0Var3.p0;
                    break;
                }
                break;
        }
    }
}
