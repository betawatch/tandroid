// default package

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class nr7 extends y39 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nr7(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // y39
    public final void a() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((or7) obj).f();
                break;
            case 1:
                o39 o39Var = (o39) obj;
                o39Var.L0(true);
                if (o39Var.r2) {
                    o39Var.r1 = -1;
                    if (o39Var.U1 == null) {
                        o39Var.F1.setEmpty();
                    }
                }
                o39Var.invalidate();
                break;
            default:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.l(null);
                recyclerView.v0.f = true;
                boolean z = w01.a;
                recyclerView.d.h("notifyDataSetChanged()");
                recyclerView.o0(true);
                if (!recyclerView.d.g()) {
                    recyclerView.requestLayout();
                    break;
                }
                break;
        }
    }

    @Override // y39
    public final void b(int i, int i2) {
        switch (this.a) {
            case 0:
                ((or7) this.b).l(i + 1, i2);
                break;
        }
    }

    @Override // y39
    public final void c(int i, int i2, Object obj) {
        switch (this.a) {
            case 2:
                RecyclerView recyclerView = (RecyclerView) this.b;
                recyclerView.l(null);
                ha haVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) haVar.d;
                if (i2 >= 1) {
                    boolean z = w01.a;
                    StringBuilder p = ir2.p("onItemRangeChanged(", i, ", ", i2, ", ");
                    p.append(obj);
                    p.append(")");
                    haVar.h(p.toString());
                    arrayList.add(haVar.i(obj, 4, i, i2));
                    haVar.b |= 4;
                    if (arrayList.size() == 1) {
                        g();
                        break;
                    }
                }
                break;
            default:
                super.c(i, i2, obj);
                break;
        }
    }

    @Override // y39
    public final void d(int i, int i2) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((or7) obj).p(i + 1, i2);
                break;
            case 1:
                o39 o39Var = (o39) obj;
                o39Var.L0(true);
                View view = o39Var.q1;
                if (view != null && view.getAlpha() == 0.0f) {
                    o39Var.r1 = -1;
                    o39Var.h1();
                    break;
                }
                break;
            default:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.l(null);
                ha haVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) haVar.d;
                if (i2 >= 1) {
                    boolean z = w01.a;
                    haVar.h("onItemRangeInserted(" + i + ", " + i2 + ")");
                    arrayList.add(haVar.i(null, 1, i, i2));
                    haVar.b = haVar.b | 1;
                    if (arrayList.size() == 1) {
                        g();
                        break;
                    }
                }
                break;
        }
    }

    @Override // y39
    public final void e(int i, int i2) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((or7) obj).l(i + 1, i2 + 2);
                break;
            case 2:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.l(null);
                ha haVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) haVar.d;
                if (i != i2) {
                    boolean z = w01.a;
                    haVar.h("onItemRangeMoved(" + i + ", " + i2 + ", 1)");
                    arrayList.add(haVar.i(null, 8, i, i2));
                    haVar.b = haVar.b | 8;
                    if (arrayList.size() == 1) {
                        g();
                        break;
                    }
                }
                break;
        }
    }

    @Override // y39
    public final void f(int i, int i2) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((or7) obj).q(i + 1, i2);
                break;
            case 1:
                ((o39) obj).L0(true);
                break;
            default:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.l(null);
                ha haVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) haVar.d;
                if (i2 >= 1) {
                    boolean z = w01.a;
                    haVar.h("onItemRangeRemoved(" + i + ", " + i2 + ")");
                    arrayList.add(haVar.i(null, 2, i, i2));
                    haVar.b = haVar.b | 2;
                    if (arrayList.size() == 1) {
                        g();
                        break;
                    }
                }
                break;
        }
    }

    public final void g() {
        int[] iArr = RecyclerView.R0;
        RecyclerView recyclerView = (RecyclerView) this.b;
        if (!recyclerView.I || !recyclerView.H) {
            recyclerView.requestLayout();
            return;
        }
        t39 t39Var = recyclerView.n;
        WeakHashMap weakHashMap = jdc.a;
        recyclerView.postOnAnimation(t39Var);
    }
}
