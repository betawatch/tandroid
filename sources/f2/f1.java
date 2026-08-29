package f2;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.BuildVars;
import org.telegram.ui.Components.jl0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class f1 extends r0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // f2.r0
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
                jl0 jl0Var = (jl0) this.b;
                jl0Var.J0(true);
                if (jl0Var.o2) {
                    jl0Var.o1 = -1;
                    if (jl0Var.R1 == null) {
                        jl0Var.C1.setEmpty();
                    }
                }
                jl0Var.invalidate();
                break;
            default:
                ((rf.a1) this.b).l();
                break;
        }
    }

    @Override // f2.r0
    public void b(int i10, int i11) {
        switch (this.a) {
            case 2:
                ((rf.a1) this.b).q(i10 + 1, i11);
                break;
        }
    }

    @Override // f2.r0
    public void c(int i10, int i11, Object obj) {
        switch (this.a) {
            case 0:
                RecyclerView recyclerView = (RecyclerView) this.b;
                recyclerView.l(null);
                ba.a aVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) aVar.d;
                if (i11 >= 1) {
                    if (BuildVars.DEBUG_VERSION) {
                        StringBuilder o10 = com.google.android.recaptcha.internal.a.o("onItemRangeChanged(", i10, ", ", i11, ", ");
                        o10.append(obj);
                        o10.append(")");
                        aVar.i(o10.toString());
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

    @Override // f2.r0
    public final void d(int i10, int i11) {
        switch (this.a) {
            case 0:
                RecyclerView recyclerView = (RecyclerView) this.b;
                recyclerView.l(null);
                ba.a aVar = recyclerView.d;
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
                jl0 jl0Var = (jl0) this.b;
                jl0Var.J0(true);
                View view = jl0Var.n1;
                if (view != null && view.getAlpha() == 0.0f) {
                    jl0Var.o1 = -1;
                    jl0Var.f1();
                    break;
                }
                break;
            default:
                ((rf.a1) this.b).s(i10 + 1, i11);
                break;
        }
    }

    @Override // f2.r0
    public void e(int i10, int i11) {
        switch (this.a) {
            case 0:
                RecyclerView recyclerView = (RecyclerView) this.b;
                recyclerView.l(null);
                ba.a aVar = recyclerView.d;
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
                ((rf.a1) this.b).q(i10 + 1, i11 + 2);
                break;
        }
    }

    @Override // f2.r0
    public final void f(int i10, int i11) {
        switch (this.a) {
            case 0:
                RecyclerView recyclerView = (RecyclerView) this.b;
                recyclerView.l(null);
                ba.a aVar = recyclerView.d;
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
                ((jl0) this.b).J0(true);
                break;
            default:
                ((rf.a1) this.b).t(i10 + 1, i11);
                break;
        }
    }

    public void g() {
        RecyclerView recyclerView = (RecyclerView) this.b;
        if (!RecyclerView.N0 || !recyclerView.D || !recyclerView.C) {
            recyclerView.requestLayout();
            return;
        }
        n0 n0Var = recyclerView.n;
        WeakHashMap weakHashMap = r0.j0.a;
        recyclerView.postOnAnimation(n0Var);
    }
}
