package f2;

import android.animation.TimeInterpolator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Components.tk0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class t0 {
    public o5.i a;
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

    public static int b(l1 l1Var) {
        int i10 = l1Var.l;
        int i11 = i10 & 14;
        if (l1Var.h()) {
            return 4;
        }
        if ((i10 & 4) == 0) {
            int i12 = l1Var.d;
            int b10 = l1Var.b();
            if (i12 != -1 && b10 != -1 && i12 != b10) {
                return i11 | 2048;
            }
        }
        return i11;
    }

    public abstract boolean a(l1 l1Var, c5.e eVar, c5.e eVar2);

    public abstract boolean c(l1 l1Var, List list);

    public final void d(l1 l1Var) {
        o5.i iVar = this.a;
        if (iVar != null) {
            RecyclerView recyclerView = (RecyclerView) iVar.b;
            boolean z4 = true;
            l1Var.q(true);
            View view = l1Var.a;
            if (l1Var.j != null && l1Var.k == null) {
                l1Var.j = null;
            }
            l1Var.k = null;
            if ((l1Var.l & 16) != 0) {
                return;
            }
            af.h hVar = recyclerView.b;
            recyclerView.y0();
            af.d dVar = recyclerView.e;
            c cVar = (c) dVar.c;
            bb.b bVar = (bb.b) dVar.b;
            int indexOfChild = ((RecyclerView) bVar.b).indexOfChild(view);
            if (indexOfChild == -1) {
                dVar.C(view);
            } else if (cVar.x(indexOfChild)) {
                cVar.z(indexOfChild);
                dVar.C(view);
                bVar.Q(indexOfChild);
            } else {
                z4 = false;
            }
            if (z4) {
                l1 U = RecyclerView.U(view);
                hVar.k(U);
                hVar.h(U);
            }
            recyclerView.z0(!z4);
            if (z4 || !l1Var.l()) {
                return;
            }
            recyclerView.removeDetachedView(view, false);
        }
    }

    public final void e() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            tk0 tk0Var = (tk0) arrayList.get(i10);
            tk0Var.a.c(tk0Var.b, tk0Var.c, tk0Var.d, false);
        }
        arrayList.clear();
    }

    public abstract void f(l1 l1Var);

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

    public c5.e l(i1 i1Var, l1 l1Var, int i10, List list) {
        c5.e eVar = new c5.e();
        View view = l1Var.a;
        eVar.a = view.getLeft();
        eVar.b = view.getTop();
        view.getRight();
        view.getBottom();
        return eVar;
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
