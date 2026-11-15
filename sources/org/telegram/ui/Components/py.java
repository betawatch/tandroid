package org.telegram.ui.Components;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public class py extends v4.s {
    public final SparseArray Q;
    public int R;
    public int S;
    public int T;
    public final int U;
    public final uj0 V;
    public boolean W;
    public boolean X;

    public py(int i7, int i10, uj0 uj0Var) {
        super(i7);
        this.Q = new SparseArray();
        this.R = -1;
        this.W = true;
        this.X = true;
        this.V = uj0Var;
        this.U = i10;
    }

    public final void B1() {
        uj0 uj0Var;
        v4.h0 adapter;
        int i7;
        uj0 uj0Var2;
        if (this.S <= 0 || !D1() || (adapter = (uj0Var = this.V).getAdapter()) == null) {
            return;
        }
        int i10 = this.J;
        boolean z10 = true;
        int b10 = adapter.b() - 1;
        g.p pVar = this.O;
        boolean z11 = true;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            i7 = this.U;
            if (i11 >= b10) {
                uj0Var2 = uj0Var;
                break;
            }
            int i14 = pVar.i(i11);
            i12 += i14;
            if (i14 == i10 || i12 > i10) {
                z11 = z10;
                i12 = i14;
            }
            if (z11) {
                int d = adapter.d(i11);
                SparseArray sparseArray = this.Q;
                v4.e1 e1Var = (v4.e1) sparseArray.get(d, null);
                if (e1Var == null) {
                    e1Var = adapter.a(uj0Var, d);
                    View view = e1Var.a;
                    sparseArray.put(d, e1Var);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(n());
                    }
                }
                View view2 = e1Var.a;
                if (this.W) {
                    adapter.t(e1Var, i11);
                }
                v4.p0 p0Var = (v4.p0) view2.getLayoutParams();
                uj0Var2 = uj0Var;
                view2.measure(v4.o0.s(d(), this.T, this.k, E() + D() + ((ViewGroup.MarginLayoutParams) p0Var).leftMargin + ((ViewGroup.MarginLayoutParams) p0Var).rightMargin, ((ViewGroup.MarginLayoutParams) p0Var).width), v4.o0.s(this.X, this.S, this.l, C() + F() + ((ViewGroup.MarginLayoutParams) p0Var).topMargin + ((ViewGroup.MarginLayoutParams) p0Var).bottomMargin, ((ViewGroup.MarginLayoutParams) p0Var).height));
                i13 += view2.getMeasuredHeight();
                if (i13 >= (this.S - i7) - uj0Var2.getPaddingBottom()) {
                    break;
                } else {
                    z11 = false;
                }
            } else {
                uj0Var2 = uj0Var;
            }
            i11++;
            uj0Var = uj0Var2;
            z10 = true;
        }
        this.R = Math.max(0, ((this.S - i13) - i7) - uj0Var2.getPaddingBottom());
    }

    public final void C1() {
        this.W = false;
    }

    public boolean D1() {
        return true;
    }

    @Override // v4.o0
    public final void Q() {
        this.Q.clear();
        B1();
    }

    @Override // v4.s, v4.o0
    public final void V(RecyclerView recyclerView, int i7, int i10) {
        super.V(recyclerView, i7, i10);
        B1();
    }

    @Override // v4.s, v4.o0
    public final void W(RecyclerView recyclerView) {
        this.Q.clear();
        B1();
        super.W(recyclerView);
    }

    @Override // v4.s, v4.o0
    public final void X(RecyclerView recyclerView, int i7, int i10) {
        super.X(recyclerView, i7, i10);
        B1();
    }

    @Override // v4.s, v4.o0
    public final void Y(RecyclerView recyclerView, int i7, int i10) {
        super.Y(recyclerView, i7, i10);
        B1();
    }

    @Override // v4.o0
    public final void Z() {
        B1();
    }

    @Override // v4.s, v4.o0
    public final void a0(RecyclerView recyclerView, int i7, int i10, Object obj) {
        super.a0(recyclerView, i7, i10, obj);
        B1();
    }

    @Override // v4.o0
    public final void d0(v4.w0 w0Var, v4.b1 b1Var, int i7, int i10) {
        int i11 = this.S;
        this.T = View.MeasureSpec.getSize(i7);
        int size = View.MeasureSpec.getSize(i10);
        this.S = size;
        if (i11 != size) {
            B1();
        }
        super.d0(w0Var, b1Var, i7, i10);
    }

    @Override // v4.b0, v4.o0
    public final boolean e() {
        return this.X;
    }

    @Override // v4.s
    public final void w1(int i7, View view, boolean z10) {
        if (this.V.G(view).b() == B() - 1) {
            ((ViewGroup.MarginLayoutParams) ((v4.p0) view.getLayoutParams())).height = Math.max(this.R, 0);
        }
        super.w1(i7, view, z10);
    }

    public py(int i7, org.telegram.ui.k30 k30Var) {
        super(i7, false);
        this.Q = new SparseArray();
        this.R = -1;
        this.W = true;
        this.X = true;
        this.V = k30Var;
        this.U = 0;
    }
}
