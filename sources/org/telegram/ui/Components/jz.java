package org.telegram.ui.Components;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class jz extends f2.w {
    public final SparseArray Q;
    public int R;
    public int S;
    public int T;
    public final int U;
    public final jl0 V;
    public boolean W;
    public boolean X;

    public jz(int i10, int i11, jl0 jl0Var) {
        super(i10);
        this.Q = new SparseArray();
        this.R = -1;
        this.W = true;
        this.X = true;
        this.V = jl0Var;
        this.U = i11;
    }

    public final void B1() {
        jl0 jl0Var;
        f2.p0 adapter;
        int i10;
        jl0 jl0Var2;
        if (this.S <= 0 || !D1() || (adapter = (jl0Var = this.V).getAdapter()) == null) {
            return;
        }
        int i11 = this.J;
        int h = adapter.h() - 1;
        f2.v vVar = this.O;
        int i12 = 0;
        int i13 = 0;
        boolean z10 = true;
        int i14 = 0;
        while (true) {
            i10 = this.U;
            if (i12 >= h) {
                jl0Var2 = jl0Var;
                break;
            }
            int i15 = vVar.i(i12);
            i13 += i15;
            if (i15 == i11 || i13 > i11) {
                i13 = i15;
                z10 = true;
            }
            if (z10) {
                int j10 = adapter.j(i12);
                SparseArray sparseArray = this.Q;
                f2.n1 n1Var = (f2.n1) sparseArray.get(j10, null);
                if (n1Var == null) {
                    n1Var = adapter.g(jl0Var, j10);
                    View view = n1Var.a;
                    sparseArray.put(j10, n1Var);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(n());
                    }
                }
                View view2 = n1Var.a;
                if (this.W) {
                    adapter.v(n1Var, i12);
                }
                f2.x0 x0Var = (f2.x0) view2.getLayoutParams();
                jl0Var2 = jl0Var;
                view2.measure(f2.w0.s(d(), this.T, this.k, E() + D() + ((ViewGroup.MarginLayoutParams) x0Var).leftMargin + ((ViewGroup.MarginLayoutParams) x0Var).rightMargin, ((ViewGroup.MarginLayoutParams) x0Var).width), f2.w0.s(this.X, this.S, this.l, C() + F() + ((ViewGroup.MarginLayoutParams) x0Var).topMargin + ((ViewGroup.MarginLayoutParams) x0Var).bottomMargin, ((ViewGroup.MarginLayoutParams) x0Var).height));
                i14 += view2.getMeasuredHeight();
                if (i14 >= (this.S - i10) - jl0Var2.getPaddingBottom()) {
                    break;
                } else {
                    z10 = false;
                }
            } else {
                jl0Var2 = jl0Var;
            }
            i12++;
            jl0Var = jl0Var2;
        }
        this.R = Math.max(0, ((this.S - i14) - i10) - jl0Var2.getPaddingBottom());
    }

    public final void C1() {
        this.W = false;
    }

    public boolean D1() {
        return true;
    }

    @Override // f2.w0
    public final void Q() {
        this.Q.clear();
        B1();
    }

    @Override // f2.w, f2.w0
    public final void V(RecyclerView recyclerView, int i10, int i11) {
        super.V(recyclerView, i10, i11);
        B1();
    }

    @Override // f2.w, f2.w0
    public final void W(RecyclerView recyclerView) {
        this.Q.clear();
        B1();
        super.W(recyclerView);
    }

    @Override // f2.w, f2.w0
    public final void X(RecyclerView recyclerView, int i10, int i11) {
        super.X(recyclerView, i10, i11);
        B1();
    }

    @Override // f2.w, f2.w0
    public final void Y(RecyclerView recyclerView, int i10, int i11) {
        super.Y(recyclerView, i10, i11);
        B1();
    }

    @Override // f2.w0
    public final void Z() {
        B1();
    }

    @Override // f2.w, f2.w0
    public final void a0(RecyclerView recyclerView, int i10, int i11, Object obj) {
        super.a0(recyclerView, i10, i11, obj);
        B1();
    }

    @Override // f2.w0
    public final void d0(f2.d1 d1Var, f2.k1 k1Var, int i10, int i11) {
        int i12 = this.S;
        this.T = View.MeasureSpec.getSize(i10);
        int size = View.MeasureSpec.getSize(i11);
        this.S = size;
        if (i12 != size) {
            B1();
        }
        super.d0(d1Var, k1Var, i10, i11);
    }

    @Override // f2.j0, f2.w0
    public final boolean e() {
        return this.X;
    }

    @Override // f2.w
    public final void w1(View view, int i10, boolean z10) {
        if (this.V.G(view).b() == B() - 1) {
            ((ViewGroup.MarginLayoutParams) ((f2.x0) view.getLayoutParams())).height = Math.max(this.R, 0);
        }
        super.w1(view, i10, z10);
    }

    public jz(int i10, org.telegram.ui.x40 x40Var) {
        super(i10, false);
        this.Q = new SparseArray();
        this.R = -1;
        this.W = true;
        this.X = true;
        this.V = x40Var;
        this.U = 0;
    }
}
