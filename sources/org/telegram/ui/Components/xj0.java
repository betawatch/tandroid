package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class xj0 extends s4.i0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xj0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // s4.i0
    public final void a() {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                tk0 tk0Var = (tk0) obj;
                tk0Var.K0(true);
                if (tk0Var.q2) {
                    tk0Var.q1 = -1;
                    if (tk0Var.T1 == null) {
                        tk0Var.E1.setEmpty();
                    }
                }
                tk0Var.invalidate();
                break;
            case 1:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.l(null);
                recyclerView.u0.f = true;
                boolean z10 = org.telegram.messenger.v2.a;
                recyclerView.d.i("notifyDataSetChanged()");
                recyclerView.n0(true);
                if (!recyclerView.d.h()) {
                    recyclerView.requestLayout();
                    break;
                }
                break;
            default:
                ((zf.c1) obj).f();
                break;
        }
    }

    @Override // s4.i0
    public void b(int i10, int i11) {
        switch (this.a) {
            case 2:
                ((zf.c1) this.b).k(i10 + 1, i11);
                break;
        }
    }

    @Override // s4.i0
    public void c(int i10, int i11, Object obj) {
        switch (this.a) {
            case 1:
                RecyclerView recyclerView = (RecyclerView) this.b;
                recyclerView.l(null);
                kg.s0 s0Var = recyclerView.d;
                ArrayList arrayList = (ArrayList) s0Var.d;
                if (i11 >= 1) {
                    boolean z10 = org.telegram.messenger.v2.a;
                    StringBuilder m10 = i0.a.m("onItemRangeChanged(", i10, ", ", i11, ", ");
                    m10.append(obj);
                    m10.append(")");
                    s0Var.i(m10.toString());
                    arrayList.add(s0Var.j(4, i10, obj, i11));
                    s0Var.b |= 4;
                    if (arrayList.size() == 1) {
                        g();
                        break;
                    }
                }
                break;
            default:
                super.c(i10, i11, obj);
                break;
        }
    }

    @Override // s4.i0
    public final void d(int i10, int i11) {
        int i12 = this.a;
        Object obj = this.b;
        switch (i12) {
            case 0:
                tk0 tk0Var = (tk0) obj;
                tk0Var.K0(true);
                View view = tk0Var.p1;
                if (view != null && view.getAlpha() == 0.0f) {
                    tk0Var.q1 = -1;
                    tk0Var.g1();
                    break;
                }
                break;
            case 1:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.l(null);
                kg.s0 s0Var = recyclerView.d;
                ArrayList arrayList = (ArrayList) s0Var.d;
                if (i11 >= 1) {
                    boolean z10 = org.telegram.messenger.v2.a;
                    s0Var.i("onItemRangeInserted(" + i10 + ", " + i11 + ")");
                    arrayList.add(s0Var.j(1, i10, null, i11));
                    s0Var.b = s0Var.b | 1;
                    if (arrayList.size() == 1) {
                        g();
                        break;
                    }
                }
                break;
            default:
                ((zf.c1) obj).o(i10 + 1, i11);
                break;
        }
    }

    @Override // s4.i0
    public void e(int i10, int i11) {
        int i12 = this.a;
        Object obj = this.b;
        switch (i12) {
            case 1:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.l(null);
                kg.s0 s0Var = recyclerView.d;
                ArrayList arrayList = (ArrayList) s0Var.d;
                if (i10 != i11) {
                    boolean z10 = org.telegram.messenger.v2.a;
                    s0Var.i("onItemRangeMoved(" + i10 + ", " + i11 + ", 1)");
                    arrayList.add(s0Var.j(8, i10, null, i11));
                    s0Var.b = s0Var.b | 8;
                    if (arrayList.size() == 1) {
                        g();
                        break;
                    }
                }
                break;
            case 2:
                ((zf.c1) obj).k(i10 + 1, i11 + 2);
                break;
        }
    }

    @Override // s4.i0
    public final void f(int i10, int i11) {
        int i12 = this.a;
        Object obj = this.b;
        switch (i12) {
            case 0:
                ((tk0) obj).K0(true);
                break;
            case 1:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.l(null);
                kg.s0 s0Var = recyclerView.d;
                ArrayList arrayList = (ArrayList) s0Var.d;
                if (i11 >= 1) {
                    boolean z10 = org.telegram.messenger.v2.a;
                    s0Var.i("onItemRangeRemoved(" + i10 + ", " + i11 + ")");
                    arrayList.add(s0Var.j(2, i10, null, i11));
                    s0Var.b = s0Var.b | 2;
                    if (arrayList.size() == 1) {
                        g();
                        break;
                    }
                }
                break;
            default:
                ((zf.c1) obj).p(i10 + 1, i11);
                break;
        }
    }

    public void g() {
        int[] iArr = RecyclerView.Q0;
        RecyclerView recyclerView = (RecyclerView) this.b;
        if (!recyclerView.H || !recyclerView.G) {
            recyclerView.requestLayout();
            return;
        }
        s4.e0 e0Var = recyclerView.n;
        WeakHashMap weakHashMap = r0.h0.a;
        recyclerView.postOnAnimation(e0Var);
    }
}
