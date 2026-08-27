package f2;

import android.animation.TimeInterpolator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Components.ak0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class v0 {
    public ga.c a;
    public ArrayList b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public TimeInterpolator h;
    public TimeInterpolator i;
    public TimeInterpolator j;
    public TimeInterpolator k;
    public long l;

    public static int b(o1 o1Var) {
        int i10 = o1Var.l;
        int i11 = i10 & 14;
        if (o1Var.h()) {
            return 4;
        }
        if ((i10 & 4) == 0) {
            int i12 = o1Var.d;
            int b10 = o1Var.b();
            if (i12 != -1 && b10 != -1 && i12 != b10) {
                return i11 | 2048;
            }
        }
        return i11;
    }

    public abstract boolean a(o1 o1Var, d5.p pVar, d5.p pVar2);

    public abstract boolean c(o1 o1Var, List list);

    public final void d(o1 o1Var) {
        ga.c cVar = this.a;
        if (cVar != null) {
            RecyclerView recyclerView = (RecyclerView) cVar.b;
            boolean z10 = true;
            o1Var.q(true);
            View view = o1Var.a;
            if (o1Var.j != null && o1Var.k == null) {
                o1Var.j = null;
            }
            o1Var.k = null;
            if ((o1Var.l & 16) != 0) {
                return;
            }
            e1 e1Var = recyclerView.b;
            recyclerView.y0();
            a5.n nVar = recyclerView.e;
            c cVar2 = (c) nVar.c;
            a9.i iVar = (a9.i) nVar.b;
            int indexOfChild = ((RecyclerView) iVar.b).indexOfChild(view);
            if (indexOfChild == -1) {
                nVar.z(view);
            } else if (cVar2.I(indexOfChild)) {
                cVar2.K(indexOfChild);
                nVar.z(view);
                iVar.P(indexOfChild);
            } else {
                z10 = false;
            }
            if (z10) {
                o1 U = RecyclerView.U(view);
                e1Var.k(U);
                e1Var.h(U);
            }
            recyclerView.z0(!z10);
            if (z10 || !o1Var.l()) {
                return;
            }
            recyclerView.removeDetachedView(view, false);
        }
    }

    public final void e() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ak0 ak0Var = (ak0) arrayList.get(i10);
            ak0Var.a.d(ak0Var.b, ak0Var.c, ak0Var.d, false);
        }
        arrayList.clear();
    }

    public abstract void f(o1 o1Var);

    public abstract void g();

    public long h() {
        return this.c;
    }

    public long i() {
        return Math.max(this.f, this.g);
    }

    public long j() {
        return this.e;
    }

    public abstract boolean k();

    public d5.p l(l1 l1Var, o1 o1Var, int i10, List list) {
        d5.p pVar = new d5.p();
        View view = o1Var.a;
        pVar.a = view.getLeft();
        pVar.b = view.getTop();
        view.getRight();
        view.getBottom();
        return pVar;
    }

    public abstract void m();

    public final void n(long j10) {
        this.c = j10;
        this.e = j10;
        this.d = j10;
        this.f = j10;
        this.g = j10;
    }

    public final void o(TimeInterpolator timeInterpolator) {
        this.h = timeInterpolator;
        this.i = timeInterpolator;
        this.j = timeInterpolator;
        this.k = timeInterpolator;
    }
}
