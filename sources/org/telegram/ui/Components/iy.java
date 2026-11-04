package org.telegram.ui.Components;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class iy extends u4.s {
    public final SparseArray Q;
    public int R;
    public int S;
    public int T;
    public final int U;
    public final tj0 V;
    public boolean W;
    public boolean X;

    public iy(int i3, int i10, tj0 tj0Var) {
        super(i3);
        this.Q = new SparseArray();
        this.R = -1;
        this.W = true;
        this.X = true;
        this.V = tj0Var;
        this.U = i10;
    }

    public final void B1() {
        tj0 tj0Var;
        u4.h0 adapter;
        int i3;
        tj0 tj0Var2;
        if (this.S <= 0 || !D1() || (adapter = (tj0Var = this.V).getAdapter()) == null) {
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
            i3 = this.U;
            if (i11 >= b10) {
                tj0Var2 = tj0Var;
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
                u4.d1 d1Var = (u4.d1) sparseArray.get(d, null);
                if (d1Var == null) {
                    d1Var = adapter.a(tj0Var, d);
                    View view = d1Var.a;
                    sparseArray.put(d, d1Var);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(n());
                    }
                }
                View view2 = d1Var.a;
                if (this.W) {
                    adapter.t(d1Var, i11);
                }
                u4.p0 p0Var = (u4.p0) view2.getLayoutParams();
                tj0Var2 = tj0Var;
                view2.measure(u4.o0.s(d(), this.T, this.k, E() + D() + ((ViewGroup.MarginLayoutParams) p0Var).leftMargin + ((ViewGroup.MarginLayoutParams) p0Var).rightMargin, ((ViewGroup.MarginLayoutParams) p0Var).width), u4.o0.s(this.X, this.S, this.l, C() + F() + ((ViewGroup.MarginLayoutParams) p0Var).topMargin + ((ViewGroup.MarginLayoutParams) p0Var).bottomMargin, ((ViewGroup.MarginLayoutParams) p0Var).height));
                i13 += view2.getMeasuredHeight();
                if (i13 >= (this.S - i3) - tj0Var2.getPaddingBottom()) {
                    break;
                } else {
                    z11 = false;
                }
            } else {
                tj0Var2 = tj0Var;
            }
            i11++;
            tj0Var = tj0Var2;
            z10 = true;
        }
        this.R = Math.max(0, ((this.S - i13) - i3) - tj0Var2.getPaddingBottom());
    }

    public final void C1() {
        this.W = false;
    }

    public boolean D1() {
        return true;
    }

    @Override // u4.o0
    public final void Q() {
        this.Q.clear();
        B1();
    }

    @Override // u4.s, u4.o0
    public final void V(RecyclerView recyclerView, int i3, int i10) {
        super.V(recyclerView, i3, i10);
        B1();
    }

    @Override // u4.s, u4.o0
    public final void W(RecyclerView recyclerView) {
        this.Q.clear();
        B1();
        super.W(recyclerView);
    }

    @Override // u4.s, u4.o0
    public final void X(RecyclerView recyclerView, int i3, int i10) {
        super.X(recyclerView, i3, i10);
        B1();
    }

    @Override // u4.s, u4.o0
    public final void Y(RecyclerView recyclerView, int i3, int i10) {
        super.Y(recyclerView, i3, i10);
        B1();
    }

    @Override // u4.o0
    public final void Z() {
        B1();
    }

    @Override // u4.s, u4.o0
    public final void a0(RecyclerView recyclerView, int i3, int i10, Object obj) {
        super.a0(recyclerView, i3, i10, obj);
        B1();
    }

    @Override // u4.o0
    public final void d0(tf.e eVar, u4.a1 a1Var, int i3, int i10) {
        int i11 = this.S;
        this.T = View.MeasureSpec.getSize(i3);
        int size = View.MeasureSpec.getSize(i10);
        this.S = size;
        if (i11 != size) {
            B1();
        }
        super.d0(eVar, a1Var, i3, i10);
    }

    @Override // u4.b0, u4.o0
    public final boolean e() {
        return this.X;
    }

    @Override // u4.s
    public final void w1(int i3, View view, boolean z10) {
        if (this.V.G(view).b() == B() - 1) {
            ((ViewGroup.MarginLayoutParams) ((u4.p0) view.getLayoutParams())).height = Math.max(this.R, 0);
        }
        super.w1(i3, view, z10);
    }

    public iy(int i3, org.telegram.ui.f30 f30Var) {
        super(i3, false);
        this.Q = new SparseArray();
        this.R = -1;
        this.W = true;
        this.X = true;
        this.V = f30Var;
        this.U = 0;
    }
}
