package org.telegram.ui.Components;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public class oz extends f2.w {
    public final SparseArray Q;
    public int R;
    public int S;
    public int T;
    public final int U;
    public final rl0 V;
    public boolean W;
    public boolean X;

    public oz(int i10, int i11, rl0 rl0Var) {
        super(i10);
        this.Q = new SparseArray();
        this.R = -1;
        this.W = true;
        this.X = true;
        this.V = rl0Var;
        this.U = i11;
    }

    public final void B1() {
        rl0 rl0Var;
        f2.o0 adapter;
        int i10;
        rl0 rl0Var2;
        if (this.S <= 0 || !D1() || (adapter = (rl0Var = this.V).getAdapter()) == null) {
            return;
        }
        int i11 = this.J;
        int h = adapter.h() - 1;
        f2.v vVar = this.O;
        int i12 = 0;
        int i13 = 0;
        boolean z4 = true;
        int i14 = 0;
        while (true) {
            i10 = this.U;
            if (i12 >= h) {
                rl0Var2 = rl0Var;
                break;
            }
            int i15 = vVar.i(i12);
            i13 += i15;
            if (i15 == i11 || i13 > i11) {
                i13 = i15;
                z4 = true;
            }
            if (z4) {
                int j10 = adapter.j(i12);
                SparseArray sparseArray = this.Q;
                f2.l1 l1Var = (f2.l1) sparseArray.get(j10, null);
                if (l1Var == null) {
                    l1Var = adapter.g(rl0Var, j10);
                    View view = l1Var.a;
                    sparseArray.put(j10, l1Var);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(n());
                    }
                }
                View view2 = l1Var.a;
                if (this.W) {
                    adapter.v(l1Var, i12);
                }
                f2.w0 w0Var = (f2.w0) view2.getLayoutParams();
                rl0Var2 = rl0Var;
                view2.measure(f2.v0.s(d(), this.T, this.k, E() + D() + ((ViewGroup.MarginLayoutParams) w0Var).leftMargin + ((ViewGroup.MarginLayoutParams) w0Var).rightMargin, ((ViewGroup.MarginLayoutParams) w0Var).width), f2.v0.s(this.X, this.S, this.l, C() + F() + ((ViewGroup.MarginLayoutParams) w0Var).topMargin + ((ViewGroup.MarginLayoutParams) w0Var).bottomMargin, ((ViewGroup.MarginLayoutParams) w0Var).height));
                i14 += view2.getMeasuredHeight();
                if (i14 >= (this.S - i10) - rl0Var2.getPaddingBottom()) {
                    break;
                } else {
                    z4 = false;
                }
            } else {
                rl0Var2 = rl0Var;
            }
            i12++;
            rl0Var = rl0Var2;
        }
        this.R = Math.max(0, ((this.S - i14) - i10) - rl0Var2.getPaddingBottom());
    }

    public final void C1() {
        this.W = false;
    }

    public boolean D1() {
        return true;
    }

    @Override // f2.v0
    public final void Q() {
        this.Q.clear();
        B1();
    }

    @Override // f2.w, f2.v0
    public final void V(RecyclerView recyclerView, int i10, int i11) {
        super.V(recyclerView, i10, i11);
        B1();
    }

    @Override // f2.w, f2.v0
    public final void W(RecyclerView recyclerView) {
        this.Q.clear();
        B1();
        super.W(recyclerView);
    }

    @Override // f2.w, f2.v0
    public final void X(RecyclerView recyclerView, int i10, int i11) {
        super.X(recyclerView, i10, i11);
        B1();
    }

    @Override // f2.w, f2.v0
    public final void Y(RecyclerView recyclerView, int i10, int i11) {
        super.Y(recyclerView, i10, i11);
        B1();
    }

    @Override // f2.v0
    public final void Z() {
        B1();
    }

    @Override // f2.w, f2.v0
    public final void a0(RecyclerView recyclerView, int i10, int i11, Object obj) {
        super.a0(recyclerView, i10, i11, obj);
        B1();
    }

    @Override // f2.v0
    public final void d0(af.h hVar, f2.i1 i1Var, int i10, int i11) {
        int i12 = this.S;
        this.T = View.MeasureSpec.getSize(i10);
        int size = View.MeasureSpec.getSize(i11);
        this.S = size;
        if (i12 != size) {
            B1();
        }
        super.d0(hVar, i1Var, i10, i11);
    }

    @Override // f2.i0, f2.v0
    public final boolean e() {
        return this.X;
    }

    @Override // f2.w
    public final void w1(View view, int i10, boolean z4) {
        if (this.V.G(view).b() == B() - 1) {
            ((ViewGroup.MarginLayoutParams) ((f2.w0) view.getLayoutParams())).height = Math.max(this.R, 0);
        }
        super.w1(view, i10, z4);
    }

    public oz(int i10, org.telegram.ui.l50 l50Var) {
        super(i10, false);
        this.Q = new SparseArray();
        this.R = -1;
        this.W = true;
        this.X = true;
        this.V = l50Var;
        this.U = 0;
    }
}
