package jg;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.r2;
import org.telegram.ui.Components.uj0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class m1 extends v4.j0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m1(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // v4.j0
    public final void a() {
        int i7 = this.a;
        Object obj = this.b;
        switch (i7) {
            case 0:
                ((n1) obj).f();
                break;
            case 1:
                uj0 uj0Var = (uj0) obj;
                uj0Var.K0(true);
                if (uj0Var.r2) {
                    uj0Var.r1 = -1;
                    if (uj0Var.U1 == null) {
                        uj0Var.F1.setEmpty();
                    }
                }
                uj0Var.invalidate();
                break;
            default:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.l(null);
                recyclerView.v0.f = true;
                boolean z10 = r2.a;
                recyclerView.d.h("notifyDataSetChanged()");
                recyclerView.n0(true);
                if (!recyclerView.d.g()) {
                    recyclerView.requestLayout();
                    break;
                }
                break;
        }
    }

    @Override // v4.j0
    public void b(int i7, int i10) {
        switch (this.a) {
            case 0:
                ((n1) this.b).k(i7 + 1, i10);
                break;
        }
    }

    @Override // v4.j0
    public void c(int i7, int i10, Object obj) {
        switch (this.a) {
            case 2:
                RecyclerView recyclerView = (RecyclerView) this.b;
                recyclerView.l(null);
                ug.l0 l0Var = recyclerView.d;
                ArrayList arrayList = (ArrayList) l0Var.d;
                if (i10 >= 1) {
                    boolean z10 = r2.a;
                    StringBuilder n10 = i5.c.n("onItemRangeChanged(", i7, ", ", i10, ", ");
                    n10.append(obj);
                    n10.append(")");
                    l0Var.h(n10.toString());
                    arrayList.add(l0Var.i(4, i7, obj, i10));
                    l0Var.b |= 4;
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

    @Override // v4.j0
    public final void d(int i7, int i10) {
        int i11 = this.a;
        Object obj = this.b;
        switch (i11) {
            case 0:
                ((n1) obj).o(i7 + 1, i10);
                break;
            case 1:
                uj0 uj0Var = (uj0) obj;
                uj0Var.K0(true);
                View view = uj0Var.q1;
                if (view != null && view.getAlpha() == 0.0f) {
                    uj0Var.r1 = -1;
                    uj0Var.g1();
                    break;
                }
                break;
            default:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.l(null);
                ug.l0 l0Var = recyclerView.d;
                ArrayList arrayList = (ArrayList) l0Var.d;
                if (i10 >= 1) {
                    boolean z10 = r2.a;
                    l0Var.h("onItemRangeInserted(" + i7 + ", " + i10 + ")");
                    arrayList.add(l0Var.i(1, i7, null, i10));
                    l0Var.b = l0Var.b | 1;
                    if (arrayList.size() == 1) {
                        g();
                        break;
                    }
                }
                break;
        }
    }

    @Override // v4.j0
    public void e(int i7, int i10) {
        int i11 = this.a;
        Object obj = this.b;
        switch (i11) {
            case 0:
                ((n1) obj).k(i7 + 1, i10 + 2);
                break;
            case 2:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.l(null);
                ug.l0 l0Var = recyclerView.d;
                ArrayList arrayList = (ArrayList) l0Var.d;
                if (i7 != i10) {
                    boolean z10 = r2.a;
                    l0Var.h("onItemRangeMoved(" + i7 + ", " + i10 + ", 1)");
                    arrayList.add(l0Var.i(8, i7, null, i10));
                    l0Var.b = l0Var.b | 8;
                    if (arrayList.size() == 1) {
                        g();
                        break;
                    }
                }
                break;
        }
    }

    @Override // v4.j0
    public final void f(int i7, int i10) {
        int i11 = this.a;
        Object obj = this.b;
        switch (i11) {
            case 0:
                ((n1) obj).p(i7 + 1, i10);
                break;
            case 1:
                ((uj0) obj).K0(true);
                break;
            default:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.l(null);
                ug.l0 l0Var = recyclerView.d;
                ArrayList arrayList = (ArrayList) l0Var.d;
                if (i10 >= 1) {
                    boolean z10 = r2.a;
                    l0Var.h("onItemRangeRemoved(" + i7 + ", " + i10 + ")");
                    arrayList.add(l0Var.i(2, i7, null, i10));
                    l0Var.b = l0Var.b | 2;
                    if (arrayList.size() == 1) {
                        g();
                        break;
                    }
                }
                break;
        }
    }

    public void g() {
        int[] iArr = RecyclerView.R0;
        RecyclerView recyclerView = (RecyclerView) this.b;
        if (!recyclerView.I || !recyclerView.H) {
            recyclerView.requestLayout();
            return;
        }
        v4.f0 f0Var = recyclerView.n;
        WeakHashMap weakHashMap = r0.i0.a;
        recyclerView.postOnAnimation(f0Var);
    }
}
