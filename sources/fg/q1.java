package fg;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.BuildVars;
import org.telegram.ui.Components.vl0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class q1 extends s4.j0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // s4.j0
    public final void a() {
        switch (this.a) {
            case 0:
                ((r1) this.b).l();
                break;
            case 1:
                vl0 vl0Var = (vl0) this.b;
                vl0Var.J0(true);
                if (vl0Var.s2) {
                    vl0Var.s1 = -1;
                    if (vl0Var.V1 == null) {
                        vl0Var.G1.setEmpty();
                    }
                }
                vl0Var.invalidate();
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
                ((r1) this.b).q(i10 + 1, i11);
                break;
        }
    }

    @Override // s4.j0
    public void c(int i10, int i11, Object obj) {
        switch (this.a) {
            case 2:
                RecyclerView recyclerView = (RecyclerView) this.b;
                recyclerView.l(null);
                qg.m0 m0Var = recyclerView.d;
                ArrayList arrayList = (ArrayList) m0Var.d;
                if (i11 >= 1) {
                    if (BuildVars.DEBUG_VERSION) {
                        StringBuilder n10 = hc.b.n("onItemRangeChanged(", i10, ", ", i11, ", ");
                        n10.append(obj);
                        n10.append(")");
                        m0Var.i(n10.toString());
                    }
                    arrayList.add(m0Var.j(4, i10, obj, i11));
                    m0Var.b |= 4;
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
                ((r1) this.b).s(i10 + 1, i11);
                break;
            case 1:
                vl0 vl0Var = (vl0) this.b;
                vl0Var.J0(true);
                View view = vl0Var.r1;
                if (view != null && view.getAlpha() == 0.0f) {
                    vl0Var.s1 = -1;
                    vl0Var.e1();
                    break;
                }
                break;
            default:
                RecyclerView recyclerView = (RecyclerView) this.b;
                recyclerView.l(null);
                qg.m0 m0Var = recyclerView.d;
                ArrayList arrayList = (ArrayList) m0Var.d;
                if (i11 >= 1) {
                    if (BuildVars.DEBUG_VERSION) {
                        m0Var.i("onItemRangeInserted(" + i10 + ", " + i11 + ")");
                    }
                    arrayList.add(m0Var.j(1, i10, null, i11));
                    m0Var.b |= 1;
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
                ((r1) this.b).q(i10 + 1, i11 + 2);
                break;
            case 2:
                RecyclerView recyclerView = (RecyclerView) this.b;
                recyclerView.l(null);
                qg.m0 m0Var = recyclerView.d;
                ArrayList arrayList = (ArrayList) m0Var.d;
                if (i10 != i11) {
                    if (BuildVars.DEBUG_VERSION) {
                        m0Var.i("onItemRangeMoved(" + i10 + ", " + i11 + ", 1)");
                    }
                    arrayList.add(m0Var.j(8, i10, null, i11));
                    m0Var.b |= 8;
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
                ((r1) this.b).t(i10 + 1, i11);
                break;
            case 1:
                ((vl0) this.b).J0(true);
                break;
            default:
                RecyclerView recyclerView = (RecyclerView) this.b;
                recyclerView.l(null);
                qg.m0 m0Var = recyclerView.d;
                ArrayList arrayList = (ArrayList) m0Var.d;
                if (i11 >= 1) {
                    if (BuildVars.DEBUG_VERSION) {
                        m0Var.i("onItemRangeRemoved(" + i10 + ", " + i11 + ")");
                    }
                    arrayList.add(m0Var.j(2, i10, null, i11));
                    m0Var.b |= 2;
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
