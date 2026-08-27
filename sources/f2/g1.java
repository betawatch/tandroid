package f2;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.BuildVars;
import org.telegram.ui.Components.zk0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class g1 extends s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // f2.s0
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
                zk0 zk0Var = (zk0) this.b;
                zk0Var.J0(true);
                if (zk0Var.o2) {
                    zk0Var.o1 = -1;
                    if (zk0Var.R1 == null) {
                        zk0Var.C1.setEmpty();
                    }
                }
                zk0Var.invalidate();
                break;
            default:
                ((pf.z0) this.b).l();
                break;
        }
    }

    @Override // f2.s0
    public void b(int i10, int i11) {
        switch (this.a) {
            case 2:
                ((pf.z0) this.b).q(i10 + 1, i11);
                break;
        }
    }

    @Override // f2.s0
    public void c(int i10, int i11, Object obj) {
        switch (this.a) {
            case 0:
                RecyclerView recyclerView = (RecyclerView) this.b;
                recyclerView.l(null);
                aa.a aVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) aVar.d;
                if (i11 >= 1) {
                    if (BuildVars.DEBUG_VERSION) {
                        StringBuilder p6 = com.google.android.recaptcha.internal.a.p("onItemRangeChanged(", i10, ", ", i11, ", ");
                        p6.append(obj);
                        p6.append(")");
                        aVar.i(p6.toString());
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

    @Override // f2.s0
    public final void d(int i10, int i11) {
        switch (this.a) {
            case 0:
                RecyclerView recyclerView = (RecyclerView) this.b;
                recyclerView.l(null);
                aa.a aVar = recyclerView.d;
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
            case 1:
                zk0 zk0Var = (zk0) this.b;
                zk0Var.J0(true);
                View view = zk0Var.n1;
                if (view != null && view.getAlpha() == 0.0f) {
                    zk0Var.o1 = -1;
                    zk0Var.f1();
                    break;
                }
                break;
            default:
                ((pf.z0) this.b).s(i10 + 1, i11);
                break;
        }
    }

    @Override // f2.s0
    public void e(int i10, int i11) {
        switch (this.a) {
            case 0:
                RecyclerView recyclerView = (RecyclerView) this.b;
                recyclerView.l(null);
                aa.a aVar = recyclerView.d;
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
            case 2:
                ((pf.z0) this.b).q(i10 + 1, i11 + 2);
                break;
        }
    }

    @Override // f2.s0
    public final void f(int i10, int i11) {
        switch (this.a) {
            case 0:
                RecyclerView recyclerView = (RecyclerView) this.b;
                recyclerView.l(null);
                aa.a aVar = recyclerView.d;
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
            case 1:
                ((zk0) this.b).J0(true);
                break;
            default:
                ((pf.z0) this.b).t(i10 + 1, i11);
                break;
        }
    }

    public void g() {
        RecyclerView recyclerView = (RecyclerView) this.b;
        if (!RecyclerView.N0 || !recyclerView.D || !recyclerView.C) {
            recyclerView.requestLayout();
            return;
        }
        o0 o0Var = recyclerView.n;
        WeakHashMap weakHashMap = r0.j0.a;
        recyclerView.postOnAnimation(o0Var);
    }
}
