package org.telegram.ui.Components;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class jy extends u4.b0 {
    public final SparseArray I;
    public int J;
    public int K;
    public int L;
    public int M;
    public final RecyclerView N;
    public boolean O;
    public boolean P;
    public final boolean Q;
    public boolean R;
    public int S;
    public final boolean T;

    public jy(int i3, tj0 tj0Var) {
        this.I = new SparseArray();
        this.J = -1;
        this.P = true;
        this.Q = true;
        this.T = true;
        this.N = tj0Var;
        this.M = i3;
    }

    @Override // u4.o0
    public final void P(View view) {
        if (this.T) {
            RecyclerView recyclerView = this.N;
            View F = recyclerView.F(view);
            if ((F == null ? null : recyclerView.T(F)).b() == B() - 1) {
                ((ViewGroup.MarginLayoutParams) ((u4.p0) view.getLayoutParams())).height = Math.max(this.J, 0);
            }
        }
        super.P(view);
    }

    @Override // u4.o0
    public final void Q() {
        this.I.clear();
        p1();
    }

    @Override // u4.o0
    public final void V(RecyclerView recyclerView, int i3, int i10) {
        p1();
    }

    @Override // u4.o0
    public final void W(RecyclerView recyclerView) {
        this.I.clear();
        p1();
    }

    @Override // u4.o0
    public final void X(RecyclerView recyclerView, int i3, int i10) {
        p1();
    }

    @Override // u4.o0
    public final void Y(RecyclerView recyclerView, int i3, int i10) {
        p1();
    }

    @Override // u4.o0
    public final void Z() {
        p1();
    }

    @Override // u4.o0
    public final void a0(RecyclerView recyclerView, int i3, int i10, Object obj) {
        p1();
        p1();
    }

    @Override // u4.o0
    public final void d0(tf.e eVar, u4.a1 a1Var, int i3, int i10) {
        int i11 = this.K;
        this.L = View.MeasureSpec.getSize(i3);
        int size = View.MeasureSpec.getSize(i10);
        this.K = size;
        if (i11 != size) {
            p1();
        }
        super.d0(eVar, a1Var, i3, i10);
    }

    @Override // u4.b0, u4.o0
    public final boolean e() {
        return this.Q;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p1() {
        RecyclerView recyclerView;
        u4.h0 adapter;
        if (this.K > 0 && (adapter = (recyclerView = this.N).getAdapter()) != null) {
            int b10 = adapter.b() - 1;
            int i3 = 0;
            int i10 = 0;
            for (int i11 = this.O; i11 < b10; i11++) {
                int d = adapter.d(i11);
                SparseArray sparseArray = this.I;
                u4.d1 d1Var = (u4.d1) sparseArray.get(d, null);
                if (d1Var == null) {
                    d1Var = adapter.a(recyclerView, d);
                    View view = d1Var.a;
                    sparseArray.put(d, d1Var);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(n());
                    }
                }
                View view2 = d1Var.a;
                if (this.P) {
                    adapter.t(d1Var, i11);
                }
                u4.p0 p0Var = (u4.p0) view2.getLayoutParams();
                view2.measure(u4.o0.s(d(), this.L, this.k, E() + D() + ((ViewGroup.MarginLayoutParams) p0Var).leftMargin + ((ViewGroup.MarginLayoutParams) p0Var).rightMargin, ((ViewGroup.MarginLayoutParams) p0Var).width), u4.o0.s(this.Q, this.K, this.l, C() + F() + ((ViewGroup.MarginLayoutParams) p0Var).topMargin + ((ViewGroup.MarginLayoutParams) p0Var).bottomMargin, ((ViewGroup.MarginLayoutParams) p0Var).height));
                i3 += view2.getMeasuredHeight();
                if (i11 == 0) {
                    i10 = view2.getMeasuredHeight();
                }
                if (this.R) {
                    if (i3 >= this.K + i10) {
                        break;
                    }
                } else {
                    if (i3 >= this.K) {
                        break;
                    }
                }
            }
            if (this.R) {
                this.J = Math.max(this.S, (((this.K - i3) - this.M) - recyclerView.getPaddingBottom()) + i10);
            } else {
                this.J = Math.max(this.S, ((this.K - i3) - this.M) - recyclerView.getPaddingBottom());
            }
        }
    }

    public jy(int i3, int i10, tj0 tj0Var) {
        super(1, false);
        this.I = new SparseArray();
        this.J = -1;
        this.P = true;
        this.Q = true;
        this.T = true;
        this.N = tj0Var;
        this.M = i3;
    }
}
