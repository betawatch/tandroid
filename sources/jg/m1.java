package jg;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.s2;
import org.telegram.ui.Components.ck0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class m1 extends v4.k0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m1(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // v4.k0
    public final void a() {
        int i7 = this.a;
        Object obj = this.b;
        switch (i7) {
            case 0:
                ((n1) obj).f();
                break;
            case 1:
                ck0 ck0Var = (ck0) obj;
                ck0Var.K0(true);
                if (ck0Var.r2) {
                    ck0Var.r1 = -1;
                    if (ck0Var.U1 == null) {
                        ck0Var.F1.setEmpty();
                    }
                }
                ck0Var.invalidate();
                break;
            default:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.l(null);
                recyclerView.v0.f = true;
                boolean z10 = s2.a;
                recyclerView.d.h("notifyDataSetChanged()");
                recyclerView.n0(true);
                if (!recyclerView.d.g()) {
                    recyclerView.requestLayout();
                    break;
                }
                break;
        }
    }

    @Override // v4.k0
    public void b(int i7, int i10) {
        switch (this.a) {
            case 0:
                ((n1) this.b).k(i7 + 1, i10);
                break;
        }
    }

    @Override // v4.k0
    public void c(int i7, int i10, Object obj) {
        switch (this.a) {
            case 2:
                RecyclerView recyclerView = (RecyclerView) this.b;
                recyclerView.l(null);
                ug.n0 n0Var = recyclerView.d;
                ArrayList arrayList = (ArrayList) n0Var.d;
                if (i10 >= 1) {
                    boolean z10 = s2.a;
                    StringBuilder n10 = i5.c.n("onItemRangeChanged(", i7, ", ", i10, ", ");
                    n10.append(obj);
                    n10.append(")");
                    n0Var.h(n10.toString());
                    arrayList.add(n0Var.i(4, i7, obj, i10));
                    n0Var.b |= 4;
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

    @Override // v4.k0
    public final void d(int i7, int i10) {
        int i11 = this.a;
        Object obj = this.b;
        switch (i11) {
            case 0:
                ((n1) obj).o(i7 + 1, i10);
                break;
            case 1:
                ck0 ck0Var = (ck0) obj;
                ck0Var.K0(true);
                View view = ck0Var.q1;
                if (view != null && view.getAlpha() == 0.0f) {
                    ck0Var.r1 = -1;
                    ck0Var.g1();
                    break;
                }
                break;
            default:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.l(null);
                ug.n0 n0Var = recyclerView.d;
                ArrayList arrayList = (ArrayList) n0Var.d;
                if (i10 >= 1) {
                    boolean z10 = s2.a;
                    n0Var.h("onItemRangeInserted(" + i7 + ", " + i10 + ")");
                    arrayList.add(n0Var.i(1, i7, null, i10));
                    n0Var.b = n0Var.b | 1;
                    if (arrayList.size() == 1) {
                        g();
                        break;
                    }
                }
                break;
        }
    }

    @Override // v4.k0
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
                ug.n0 n0Var = recyclerView.d;
                ArrayList arrayList = (ArrayList) n0Var.d;
                if (i7 != i10) {
                    boolean z10 = s2.a;
                    n0Var.h("onItemRangeMoved(" + i7 + ", " + i10 + ", 1)");
                    arrayList.add(n0Var.i(8, i7, null, i10));
                    n0Var.b = n0Var.b | 8;
                    if (arrayList.size() == 1) {
                        g();
                        break;
                    }
                }
                break;
        }
    }

    @Override // v4.k0
    public final void f(int i7, int i10) {
        int i11 = this.a;
        Object obj = this.b;
        switch (i11) {
            case 0:
                ((n1) obj).p(i7 + 1, i10);
                break;
            case 1:
                ((ck0) obj).K0(true);
                break;
            default:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.l(null);
                ug.n0 n0Var = recyclerView.d;
                ArrayList arrayList = (ArrayList) n0Var.d;
                if (i10 >= 1) {
                    boolean z10 = s2.a;
                    n0Var.h("onItemRangeRemoved(" + i7 + ", " + i10 + ")");
                    arrayList.add(n0Var.i(2, i7, null, i10));
                    n0Var.b = n0Var.b | 2;
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
        v4.h0 h0Var = recyclerView.n;
        WeakHashMap weakHashMap = r0.i0.a;
        recyclerView.postOnAnimation(h0Var);
    }
}
