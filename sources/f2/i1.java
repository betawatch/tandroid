package f2;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.BuildVars;
import org.telegram.ui.Components.wk0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class i1 extends t0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i1(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // f2.t0
    public final void a() {
        switch (this.a) {
            case 0:
                RecyclerView recyclerView = (RecyclerView) this.b;
                recyclerView.l(null);
                recyclerView.p0.f = true;
                if (BuildVars.DEBUG_VERSION) {
                    recyclerView.d.i("notifyDataSetChanged()");
                }
                recyclerView.m0(true);
                if (!recyclerView.d.h()) {
                    recyclerView.requestLayout();
                    break;
                }
                break;
            case 1:
                ((of.k1) this.b).l();
                break;
            default:
                wk0 wk0Var = (wk0) this.b;
                wk0Var.J0(true);
                if (wk0Var.o2) {
                    wk0Var.o1 = -1;
                    if (wk0Var.R1 == null) {
                        wk0Var.C1.setEmpty();
                    }
                }
                wk0Var.invalidate();
                break;
        }
    }

    @Override // f2.t0
    public void b(int i9, int i10) {
        switch (this.a) {
            case 1:
                ((of.k1) this.b).q(i9 + 1, i10);
                break;
        }
    }

    @Override // f2.t0
    public void c(int i9, int i10, Object obj) {
        switch (this.a) {
            case 0:
                RecyclerView recyclerView = (RecyclerView) this.b;
                recyclerView.l(null);
                b bVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) bVar.d;
                if (i10 >= 1) {
                    if (BuildVars.DEBUG_VERSION) {
                        StringBuilder o6 = e2.c.o("onItemRangeChanged(", i9, ", ", i10, ", ");
                        o6.append(obj);
                        o6.append(")");
                        bVar.i(o6.toString());
                    }
                    arrayList.add(bVar.j(4, i9, obj, i10));
                    bVar.b |= 4;
                    if (arrayList.size() == 1) {
                        g();
                        break;
                    }
                }
                break;
            default:
                super.c(i9, i10, obj);
                break;
        }
    }

    @Override // f2.t0
    public final void d(int i9, int i10) {
        switch (this.a) {
            case 0:
                RecyclerView recyclerView = (RecyclerView) this.b;
                recyclerView.l(null);
                b bVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) bVar.d;
                if (i10 >= 1) {
                    if (BuildVars.DEBUG_VERSION) {
                        bVar.i("onItemRangeInserted(" + i9 + ", " + i10 + ")");
                    }
                    arrayList.add(bVar.j(1, i9, null, i10));
                    bVar.b |= 1;
                    if (arrayList.size() == 1) {
                        g();
                        break;
                    }
                }
                break;
            case 1:
                ((of.k1) this.b).s(i9 + 1, i10);
                break;
            default:
                wk0 wk0Var = (wk0) this.b;
                wk0Var.J0(true);
                View view = wk0Var.n1;
                if (view != null && view.getAlpha() == 0.0f) {
                    wk0Var.o1 = -1;
                    wk0Var.f1();
                    break;
                }
                break;
        }
    }

    @Override // f2.t0
    public void e(int i9, int i10) {
        switch (this.a) {
            case 0:
                RecyclerView recyclerView = (RecyclerView) this.b;
                recyclerView.l(null);
                b bVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) bVar.d;
                if (i9 != i10) {
                    if (BuildVars.DEBUG_VERSION) {
                        bVar.i("onItemRangeMoved(" + i9 + ", " + i10 + ", 1)");
                    }
                    arrayList.add(bVar.j(8, i9, null, i10));
                    bVar.b |= 8;
                    if (arrayList.size() == 1) {
                        g();
                        break;
                    }
                }
                break;
            case 1:
                ((of.k1) this.b).q(i9 + 1, i10 + 2);
                break;
        }
    }

    @Override // f2.t0
    public final void f(int i9, int i10) {
        switch (this.a) {
            case 0:
                RecyclerView recyclerView = (RecyclerView) this.b;
                recyclerView.l(null);
                b bVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) bVar.d;
                if (i10 >= 1) {
                    if (BuildVars.DEBUG_VERSION) {
                        bVar.i("onItemRangeRemoved(" + i9 + ", " + i10 + ")");
                    }
                    arrayList.add(bVar.j(2, i9, null, i10));
                    bVar.b |= 2;
                    if (arrayList.size() == 1) {
                        g();
                        break;
                    }
                }
                break;
            case 1:
                ((of.k1) this.b).t(i9 + 1, i10);
                break;
            default:
                ((wk0) this.b).J0(true);
                break;
        }
    }

    public void g() {
        RecyclerView recyclerView = (RecyclerView) this.b;
        if (!RecyclerView.N0 || !recyclerView.D || !recyclerView.C) {
            recyclerView.requestLayout();
            return;
        }
        q0 q0Var = recyclerView.n;
        WeakHashMap weakHashMap = r0.j0.a;
        recyclerView.postOnAnimation(q0Var);
    }
}
