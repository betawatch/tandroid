package hg;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.BuildVars;
import org.telegram.ui.Components.ll0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class p1 extends s4.j0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // s4.j0
    public final void a() {
        switch (this.a) {
            case 0:
                ((q1) this.b).l();
                break;
            case 1:
                ll0 ll0Var = (ll0) this.b;
                ll0Var.J0(true);
                if (ll0Var.s2) {
                    ll0Var.s1 = -1;
                    if (ll0Var.V1 == null) {
                        ll0Var.G1.setEmpty();
                    }
                }
                ll0Var.invalidate();
                break;
            default:
                RecyclerView recyclerView = (RecyclerView) this.b;
                recyclerView.l(null);
                recyclerView.t0.f = true;
                if (BuildVars.DEBUG_VERSION) {
                    recyclerView.d.i("notifyDataSetChanged()");
                }
                recyclerView.m0(true);
                if (!recyclerView.d.h()) {
                    recyclerView.requestLayout();
                    break;
                }
                break;
        }
    }

    @Override // s4.j0
    public void b(int i10, int i11) {
        switch (this.a) {
            case 0:
                ((q1) this.b).q(i10 + 1, i11);
                break;
        }
    }

    @Override // s4.j0
    public void c(int i10, int i11, Object obj) {
        switch (this.a) {
            case 2:
                RecyclerView recyclerView = (RecyclerView) this.b;
                recyclerView.l(null);
                ra.a aVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) aVar.d;
                if (i11 >= 1) {
                    if (BuildVars.DEBUG_VERSION) {
                        StringBuilder k10 = com.google.android.gms.internal.vision.e2.k("onItemRangeChanged(", i10, ", ", i11, ", ");
                        k10.append(obj);
                        k10.append(")");
                        aVar.i(k10.toString());
                    }
                    arrayList.add(aVar.j(4, i10, obj, i11));
                    aVar.b |= 4;
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

    @Override // s4.j0
    public final void d(int i10, int i11) {
        switch (this.a) {
            case 0:
                ((q1) this.b).s(i10 + 1, i11);
                break;
            case 1:
                ll0 ll0Var = (ll0) this.b;
                ll0Var.J0(true);
                View view = ll0Var.r1;
                if (view != null && view.getAlpha() == 0.0f) {
                    ll0Var.s1 = -1;
                    ll0Var.e1();
                    break;
                }
                break;
            default:
                RecyclerView recyclerView = (RecyclerView) this.b;
                recyclerView.l(null);
                ra.a aVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) aVar.d;
                if (i11 >= 1) {
                    if (BuildVars.DEBUG_VERSION) {
                        aVar.i("onItemRangeInserted(" + i10 + ", " + i11 + ")");
                    }
                    arrayList.add(aVar.j(1, i10, null, i11));
                    aVar.b |= 1;
                    if (arrayList.size() == 1) {
                        g();
                        break;
                    }
                }
                break;
        }
    }

    @Override // s4.j0
    public void e(int i10, int i11) {
        switch (this.a) {
            case 0:
                ((q1) this.b).q(i10 + 1, i11 + 2);
                break;
            case 2:
                RecyclerView recyclerView = (RecyclerView) this.b;
                recyclerView.l(null);
                ra.a aVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) aVar.d;
                if (i10 != i11) {
                    if (BuildVars.DEBUG_VERSION) {
                        aVar.i("onItemRangeMoved(" + i10 + ", " + i11 + ", 1)");
                    }
                    arrayList.add(aVar.j(8, i10, null, i11));
                    aVar.b |= 8;
                    if (arrayList.size() == 1) {
                        g();
                        break;
                    }
                }
                break;
        }
    }

    @Override // s4.j0
    public final void f(int i10, int i11) {
        switch (this.a) {
            case 0:
                ((q1) this.b).t(i10 + 1, i11);
                break;
            case 1:
                ((ll0) this.b).J0(true);
                break;
            default:
                RecyclerView recyclerView = (RecyclerView) this.b;
                recyclerView.l(null);
                ra.a aVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) aVar.d;
                if (i11 >= 1) {
                    if (BuildVars.DEBUG_VERSION) {
                        aVar.i("onItemRangeRemoved(" + i10 + ", " + i11 + ")");
                    }
                    arrayList.add(aVar.j(2, i10, null, i11));
                    aVar.b |= 2;
                    if (arrayList.size() == 1) {
                        g();
                        break;
                    }
                }
                break;
        }
    }

    public void g() {
        RecyclerView recyclerView = (RecyclerView) this.b;
        if (!RecyclerView.R0 || !recyclerView.H || !recyclerView.G) {
            recyclerView.requestLayout();
            return;
        }
        s4.g0 g0Var = recyclerView.n;
        WeakHashMap weakHashMap = r0.i0.a;
        recyclerView.postOnAnimation(g0Var);
    }
}
