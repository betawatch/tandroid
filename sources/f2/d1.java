package f2;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.BuildVars;
import org.telegram.ui.Components.rl0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class d1 extends q0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // f2.q0
    public final void a() {
        switch (this.a) {
            case 0:
                RecyclerView recyclerView = (RecyclerView) this.b;
                recyclerView.l(null);
                recyclerView.q0.f = true;
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
                rl0 rl0Var = (rl0) this.b;
                rl0Var.J0(true);
                if (rl0Var.p2) {
                    rl0Var.p1 = -1;
                    if (rl0Var.S1 == null) {
                        rl0Var.D1.setEmpty();
                    }
                }
                rl0Var.invalidate();
                break;
            default:
                ((tf.z0) this.b).l();
                break;
        }
    }

    @Override // f2.q0
    public void b(int i10, int i11) {
        switch (this.a) {
            case 2:
                ((tf.z0) this.b).q(i10 + 1, i11);
                break;
        }
    }

    @Override // f2.q0
    public void c(int i10, int i11, Object obj) {
        switch (this.a) {
            case 0:
                RecyclerView recyclerView = (RecyclerView) this.b;
                recyclerView.l(null);
                da.a aVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) aVar.d;
                if (i11 >= 1) {
                    if (BuildVars.DEBUG_VERSION) {
                        StringBuilder m9 = e2.c.m("onItemRangeChanged(", i10, ", ", i11, ", ");
                        m9.append(obj);
                        m9.append(")");
                        aVar.i(m9.toString());
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

    @Override // f2.q0
    public final void d(int i10, int i11) {
        switch (this.a) {
            case 0:
                RecyclerView recyclerView = (RecyclerView) this.b;
                recyclerView.l(null);
                da.a aVar = recyclerView.d;
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
                rl0 rl0Var = (rl0) this.b;
                rl0Var.J0(true);
                View view = rl0Var.o1;
                if (view != null && view.getAlpha() == 0.0f) {
                    rl0Var.p1 = -1;
                    rl0Var.e1();
                    break;
                }
                break;
            default:
                ((tf.z0) this.b).s(i10 + 1, i11);
                break;
        }
    }

    @Override // f2.q0
    public void e(int i10, int i11) {
        switch (this.a) {
            case 0:
                RecyclerView recyclerView = (RecyclerView) this.b;
                recyclerView.l(null);
                da.a aVar = recyclerView.d;
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
                ((tf.z0) this.b).q(i10 + 1, i11 + 2);
                break;
        }
    }

    @Override // f2.q0
    public final void f(int i10, int i11) {
        switch (this.a) {
            case 0:
                RecyclerView recyclerView = (RecyclerView) this.b;
                recyclerView.l(null);
                da.a aVar = recyclerView.d;
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
                ((rl0) this.b).J0(true);
                break;
            default:
                ((tf.z0) this.b).t(i10 + 1, i11);
                break;
        }
    }

    public void g() {
        RecyclerView recyclerView = (RecyclerView) this.b;
        if (!RecyclerView.O0 || !recyclerView.E || !recyclerView.D) {
            recyclerView.requestLayout();
            return;
        }
        m0 m0Var = recyclerView.n;
        WeakHashMap weakHashMap = r0.j0.a;
        recyclerView.postOnAnimation(m0Var);
    }
}
