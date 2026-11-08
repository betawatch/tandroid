package jg;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.r2;
import org.telegram.ui.Components.pj0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class n1 extends v4.i0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n1(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // v4.i0
    public final void a() {
        int i7 = this.a;
        Object obj = this.b;
        switch (i7) {
            case 0:
                ((o1) obj).f();
                break;
            case 1:
                pj0 pj0Var = (pj0) obj;
                pj0Var.K0(true);
                if (pj0Var.q2) {
                    pj0Var.q1 = -1;
                    if (pj0Var.T1 == null) {
                        pj0Var.E1.setEmpty();
                    }
                }
                pj0Var.invalidate();
                break;
            default:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.l(null);
                recyclerView.u0.f = true;
                boolean z9 = r2.a;
                recyclerView.d.h("notifyDataSetChanged()");
                recyclerView.n0(true);
                if (!recyclerView.d.g()) {
                    recyclerView.requestLayout();
                    break;
                }
                break;
        }
    }

    @Override // v4.i0
    public void b(int i7, int i10) {
        switch (this.a) {
            case 0:
                ((o1) this.b).k(i7 + 1, i10);
                break;
        }
    }

    @Override // v4.i0
    public void c(int i7, int i10, Object obj) {
        switch (this.a) {
            case 2:
                RecyclerView recyclerView = (RecyclerView) this.b;
                recyclerView.l(null);
                ug.k0 k0Var = recyclerView.d;
                ArrayList arrayList = (ArrayList) k0Var.d;
                if (i10 >= 1) {
                    boolean z9 = r2.a;
                    StringBuilder o4 = g.o("onItemRangeChanged(", i7, ", ", i10, ", ");
                    o4.append(obj);
                    o4.append(")");
                    k0Var.h(o4.toString());
                    arrayList.add(k0Var.i(4, i7, obj, i10));
                    k0Var.b |= 4;
                    if (arrayList.size() == 1) {
                        g();
                        break;
                    }
                }
                break;
            default:
                super.c(i7, i10, obj);
                break;
        }
    }

    @Override // v4.i0
    public final void d(int i7, int i10) {
        int i11 = this.a;
        Object obj = this.b;
        switch (i11) {
            case 0:
                ((o1) obj).o(i7 + 1, i10);
                break;
            case 1:
                pj0 pj0Var = (pj0) obj;
                pj0Var.K0(true);
                View view = pj0Var.p1;
                if (view != null && view.getAlpha() == 0.0f) {
                    pj0Var.q1 = -1;
                    pj0Var.g1();
                    break;
                }
                break;
            default:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.l(null);
                ug.k0 k0Var = recyclerView.d;
                ArrayList arrayList = (ArrayList) k0Var.d;
                if (i10 >= 1) {
                    boolean z9 = r2.a;
                    k0Var.h("onItemRangeInserted(" + i7 + ", " + i10 + ")");
                    arrayList.add(k0Var.i(1, i7, null, i10));
                    k0Var.b = k0Var.b | 1;
                    if (arrayList.size() == 1) {
                        g();
                        break;
                    }
                }
                break;
        }
    }

    @Override // v4.i0
    public void e(int i7, int i10) {
        int i11 = this.a;
        Object obj = this.b;
        switch (i11) {
            case 0:
                ((o1) obj).k(i7 + 1, i10 + 2);
                break;
            case 2:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.l(null);
                ug.k0 k0Var = recyclerView.d;
                ArrayList arrayList = (ArrayList) k0Var.d;
                if (i7 != i10) {
                    boolean z9 = r2.a;
                    k0Var.h("onItemRangeMoved(" + i7 + ", " + i10 + ", 1)");
                    arrayList.add(k0Var.i(8, i7, null, i10));
                    k0Var.b = k0Var.b | 8;
                    if (arrayList.size() == 1) {
                        g();
                        break;
                    }
                }
                break;
        }
    }

    @Override // v4.i0
    public final void f(int i7, int i10) {
        int i11 = this.a;
        Object obj = this.b;
        switch (i11) {
            case 0:
                ((o1) obj).p(i7 + 1, i10);
                break;
            case 1:
                ((pj0) obj).K0(true);
                break;
            default:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.l(null);
                ug.k0 k0Var = recyclerView.d;
                ArrayList arrayList = (ArrayList) k0Var.d;
                if (i10 >= 1) {
                    boolean z9 = r2.a;
                    k0Var.h("onItemRangeRemoved(" + i7 + ", " + i10 + ")");
                    arrayList.add(k0Var.i(2, i7, null, i10));
                    k0Var.b = k0Var.b | 2;
                    if (arrayList.size() == 1) {
                        g();
                        break;
                    }
                }
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
        v4.f0 f0Var = recyclerView.n;
        WeakHashMap weakHashMap = r0.i0.a;
        recyclerView.postOnAnimation(f0Var);
    }
}
