package hg;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.BuildVars;
import org.telegram.ui.Components.jm0;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class o1 extends s4.i0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // s4.i0
    public final void a() {
        switch (this.a) {
            case 0:
                ((p1) this.b).l();
                break;
            case 1:
                jm0 jm0Var = (jm0) this.b;
                jm0Var.K0(true);
                if (jm0Var.q2) {
                    jm0Var.q1 = -1;
                    if (jm0Var.T1 == null) {
                        jm0Var.E1.setEmpty();
                    }
                }
                jm0Var.invalidate();
                break;
            default:
                RecyclerView recyclerView = (RecyclerView) this.b;
                recyclerView.l(null);
                recyclerView.u0.f = true;
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

    @Override // s4.i0
    public void b(int i10, int i11) {
        switch (this.a) {
            case 0:
                ((p1) this.b).q(i10 + 1, i11);
                break;
        }
    }

    @Override // s4.i0
    public void c(int i10, int i11, Object obj) {
        switch (this.a) {
            case 2:
                RecyclerView recyclerView = (RecyclerView) this.b;
                recyclerView.l(null);
                s4.b bVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) bVar.d;
                if (i11 >= 1) {
                    if (BuildVars.DEBUG_VERSION) {
                        StringBuilder m10 = i2.e.m("onItemRangeChanged(", i10, ", ", i11, ", ");
                        m10.append(obj);
                        m10.append(")");
                        bVar.i(m10.toString());
                    }
                    arrayList.add(bVar.j(4, i10, obj, i11));
                    bVar.b |= 4;
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
        switch (this.a) {
            case 0:
                ((p1) this.b).s(i10 + 1, i11);
                break;
            case 1:
                jm0 jm0Var = (jm0) this.b;
                jm0Var.K0(true);
                View view = jm0Var.p1;
                if (view != null && view.getAlpha() == 0.0f) {
                    jm0Var.q1 = -1;
                    jm0Var.f1();
                    break;
                }
                break;
            default:
                RecyclerView recyclerView = (RecyclerView) this.b;
                recyclerView.l(null);
                s4.b bVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) bVar.d;
                if (i11 >= 1) {
                    if (BuildVars.DEBUG_VERSION) {
                        bVar.i("onItemRangeInserted(" + i10 + ", " + i11 + ")");
                    }
                    arrayList.add(bVar.j(1, i10, null, i11));
                    bVar.b |= 1;
                    if (arrayList.size() == 1) {
                        g();
                        break;
                    }
                }
                break;
        }
    }

    @Override // s4.i0
    public void e(int i10, int i11) {
        switch (this.a) {
            case 0:
                ((p1) this.b).q(i10 + 1, i11 + 2);
                break;
            case 2:
                RecyclerView recyclerView = (RecyclerView) this.b;
                recyclerView.l(null);
                s4.b bVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) bVar.d;
                if (i10 != i11) {
                    if (BuildVars.DEBUG_VERSION) {
                        bVar.i("onItemRangeMoved(" + i10 + ", " + i11 + ", 1)");
                    }
                    arrayList.add(bVar.j(8, i10, null, i11));
                    bVar.b |= 8;
                    if (arrayList.size() == 1) {
                        g();
                        break;
                    }
                }
                break;
        }
    }

    @Override // s4.i0
    public final void f(int i10, int i11) {
        switch (this.a) {
            case 0:
                ((p1) this.b).t(i10 + 1, i11);
                break;
            case 1:
                ((jm0) this.b).K0(true);
                break;
            default:
                RecyclerView recyclerView = (RecyclerView) this.b;
                recyclerView.l(null);
                s4.b bVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) bVar.d;
                if (i11 >= 1) {
                    if (BuildVars.DEBUG_VERSION) {
                        bVar.i("onItemRangeRemoved(" + i10 + ", " + i11 + ")");
                    }
                    arrayList.add(bVar.j(2, i10, null, i11));
                    bVar.b |= 2;
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
        s4.f0 f0Var = recyclerView.n;
        WeakHashMap weakHashMap = r0.i0.a;
        recyclerView.postOnAnimation(f0Var);
    }
}
