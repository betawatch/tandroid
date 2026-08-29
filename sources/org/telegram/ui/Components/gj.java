package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class gj extends kz {
    public final /* synthetic */ int U;
    public final /* synthetic */ fi V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gj(fi fiVar, int i10, jl0 jl0Var, int i11) {
        super(i10, 0, jl0Var);
        this.U = i11;
        this.V = fiVar;
    }

    @Override // f2.w0
    public int[] t(View view, Rect rect) {
        switch (this.U) {
            case 3:
                int C = this.n - C();
                int top = (view.getTop() + rect.top) - view.getScrollY();
                int height = rect.height() + top;
                int min = Math.min(0, top);
                int max = Math.max(0, height - C);
                if (min == 0) {
                    min = Math.min(top, max);
                }
                return new int[]{0, min};
            default:
                return super.t(view, rect);
        }
    }

    @Override // f2.j0, f2.w0
    public final void v0(RecyclerView recyclerView, f2.k1 k1Var, int i10) {
        switch (this.U) {
            case 0:
                fj fjVar = new fj(this, recyclerView.getContext());
                fjVar.a = i10;
                w0(fjVar);
                break;
            case 1:
                yj yjVar = new yj(this, recyclerView.getContext());
                yjVar.a = i10;
                w0(yjVar);
                break;
            case 2:
                tk tkVar = new tk(this, recyclerView.getContext());
                tkVar.a = i10;
                w0(tkVar);
                break;
            case 3:
                dn dnVar = new dn(this, recyclerView.getContext());
                dnVar.a = i10;
                w0(dnVar);
                break;
            default:
                sf.z zVar = new sf.z(this, recyclerView.getContext());
                zVar.a = i10;
                w0(zVar);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj(bl blVar, jh.e1 e1Var) {
        super(0, 0, e1Var);
        this.U = 2;
        this.V = blVar;
    }
}
