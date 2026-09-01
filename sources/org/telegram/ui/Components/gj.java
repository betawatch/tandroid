package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class gj extends rz {
    public final /* synthetic */ int U;
    public final /* synthetic */ ei V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gj(ei eiVar, int i10, tl0 tl0Var, int i11) {
        super(i10, 0, tl0Var);
        this.U = i11;
        this.V = eiVar;
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
    public final void v0(RecyclerView recyclerView, f2.j1 j1Var, int i10) {
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
                hn hnVar = new hn(this, recyclerView.getContext());
                hnVar.a = i10;
                w0(hnVar);
                break;
            default:
                vf.y yVar = new vf.y(this, recyclerView.getContext());
                yVar.a = i10;
                w0(yVar);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj(cl clVar, mh.d1 d1Var) {
        super(0, 0, d1Var);
        this.U = 2;
        this.V = clVar;
    }
}
