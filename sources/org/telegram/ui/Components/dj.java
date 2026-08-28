package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class dj extends bz {
    public final /* synthetic */ int U;
    public final /* synthetic */ ci V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dj(ci ciVar, int i9, wk0 wk0Var, int i10) {
        super(i9, 0, wk0Var);
        this.U = i10;
        this.V = ciVar;
    }

    @Override // f2.z0
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

    @Override // f2.m0, f2.z0
    public final void v0(RecyclerView recyclerView, f2.n1 n1Var, int i9) {
        switch (this.U) {
            case 0:
                cj cjVar = new cj(this, recyclerView.getContext());
                cjVar.a = i9;
                w0(cjVar);
                break;
            case 1:
                vj vjVar = new vj(this, recyclerView.getContext());
                vjVar.a = i9;
                w0(vjVar);
                break;
            case 2:
                pk pkVar = new pk(this, recyclerView.getContext());
                pkVar.a = i9;
                w0(pkVar);
                break;
            case 3:
                ym ymVar = new ym(this, recyclerView.getContext());
                ymVar.a = i9;
                w0(ymVar);
                break;
            default:
                pf.a0 a0Var = new pf.a0(this, recyclerView.getContext());
                a0Var.a = i9;
                w0(a0Var);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dj(xk xkVar, gh.f1 f1Var) {
        super(0, 0, f1Var);
        this.U = 2;
        this.V = xkVar;
    }
}
