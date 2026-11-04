package kg;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.r2;
import org.telegram.ui.Components.tj0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class j1 extends u4.j0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j1(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // u4.j0
    public final void a() {
        int i3 = this.a;
        Object obj = this.b;
        switch (i3) {
            case 0:
                ((k1) obj).f();
                break;
            case 1:
                tj0 tj0Var = (tj0) obj;
                tj0Var.K0(true);
                if (tj0Var.r2) {
                    tj0Var.r1 = -1;
                    if (tj0Var.U1 == null) {
                        tj0Var.F1.setEmpty();
                    }
                }
                tj0Var.invalidate();
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

    @Override // u4.j0
    public void b(int i3, int i10) {
        switch (this.a) {
            case 0:
                ((k1) this.b).k(i3 + 1, i10);
                break;
        }
    }

    @Override // u4.j0
    public void c(int i3, int i10, Object obj) {
        switch (this.a) {
            case 2:
                RecyclerView recyclerView = (RecyclerView) this.b;
                recyclerView.l(null);
                u4.b bVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) bVar.d;
                if (i10 >= 1) {
                    boolean z10 = r2.a;
                    StringBuilder m10 = com.google.android.recaptcha.internal.a.m("onItemRangeChanged(", i3, ", ", i10, ", ");
                    m10.append(obj);
                    m10.append(")");
                    bVar.h(m10.toString());
                    arrayList.add(bVar.i(4, i3, obj, i10));
                    bVar.b |= 4;
                    if (arrayList.size() == 1) {
                        g();
                        break;
                    }
                }
                break;
            default:
                super.c(i3, i10, obj);
                break;
        }
    }

    @Override // u4.j0
    public final void d(int i3, int i10) {
        int i11 = this.a;
        Object obj = this.b;
        switch (i11) {
            case 0:
                ((k1) obj).o(i3 + 1, i10);
                break;
            case 1:
                tj0 tj0Var = (tj0) obj;
                tj0Var.K0(true);
                View view = tj0Var.q1;
                if (view != null && view.getAlpha() == 0.0f) {
                    tj0Var.r1 = -1;
                    tj0Var.g1();
                    break;
                }
                break;
            default:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.l(null);
                u4.b bVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) bVar.d;
                if (i10 >= 1) {
                    boolean z10 = r2.a;
                    bVar.h("onItemRangeInserted(" + i3 + ", " + i10 + ")");
                    arrayList.add(bVar.i(1, i3, null, i10));
                    bVar.b = bVar.b | 1;
                    if (arrayList.size() == 1) {
                        g();
                        break;
                    }
                }
                break;
        }
    }

    @Override // u4.j0
    public void e(int i3, int i10) {
        int i11 = this.a;
        Object obj = this.b;
        switch (i11) {
            case 0:
                ((k1) obj).k(i3 + 1, i10 + 2);
                break;
            case 2:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.l(null);
                u4.b bVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) bVar.d;
                if (i3 != i10) {
                    boolean z10 = r2.a;
                    bVar.h("onItemRangeMoved(" + i3 + ", " + i10 + ", 1)");
                    arrayList.add(bVar.i(8, i3, null, i10));
                    bVar.b = bVar.b | 8;
                    if (arrayList.size() == 1) {
                        g();
                        break;
                    }
                }
                break;
        }
    }

    @Override // u4.j0
    public final void f(int i3, int i10) {
        int i11 = this.a;
        Object obj = this.b;
        switch (i11) {
            case 0:
                ((k1) obj).p(i3 + 1, i10);
                break;
            case 1:
                ((tj0) obj).K0(true);
                break;
            default:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.l(null);
                u4.b bVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) bVar.d;
                if (i10 >= 1) {
                    boolean z10 = r2.a;
                    bVar.h("onItemRangeRemoved(" + i3 + ", " + i10 + ")");
                    arrayList.add(bVar.i(2, i3, null, i10));
                    bVar.b = bVar.b | 2;
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
        u4.f0 f0Var = recyclerView.n;
        WeakHashMap weakHashMap = r0.i0.a;
        recyclerView.postOnAnimation(f0Var);
    }
}
