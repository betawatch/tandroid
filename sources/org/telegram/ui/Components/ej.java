package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ej extends pz {
    public final /* synthetic */ int U;
    public final /* synthetic */ di V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ej(di diVar, int i10, sl0 sl0Var, int i11) {
        super(i10, 0, sl0Var);
        this.U = i11;
        this.V = diVar;
    }

    @Override // f2.v0
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

    @Override // f2.i0, f2.v0
    public final void v0(RecyclerView recyclerView, f2.i1 i1Var, int i10) {
        switch (this.U) {
            case 0:
                dj djVar = new dj(this, recyclerView.getContext());
                djVar.a = i10;
                w0(djVar);
                break;
            case 1:
                wj wjVar = new wj(this, recyclerView.getContext());
                wjVar.a = i10;
                w0(wjVar);
                break;
            case 2:
                rk rkVar = new rk(this, recyclerView.getContext());
                rkVar.a = i10;
                w0(rkVar);
                break;
            case 3:
                fn fnVar = new fn(this, recyclerView.getContext());
                fnVar.a = i10;
                w0(fnVar);
                break;
            default:
                uf.y yVar = new uf.y(this, recyclerView.getContext());
                yVar.a = i10;
                w0(yVar);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ej(al alVar, lh.e1 e1Var) {
        super(0, 0, e1Var);
        this.U = 2;
        this.V = alVar;
    }
}
