package f2;

import android.animation.TimeInterpolator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Components.yj0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class w0 {
    public x0 a;
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

    public static int b(q1 q1Var) {
        int i9 = q1Var.l;
        int i10 = i9 & 14;
        if (q1Var.h()) {
            return 4;
        }
        if ((i9 & 4) == 0) {
            int i11 = q1Var.d;
            int b10 = q1Var.b();
            if (i11 != -1 && b10 != -1 && i11 != b10) {
                return i10 | 2048;
            }
        }
        return i10;
    }

    public abstract boolean a(q1 q1Var, d5.p pVar, d5.p pVar2);

    public abstract boolean c(q1 q1Var, List list);

    public final void d(q1 q1Var) {
        x0 x0Var = this.a;
        if (x0Var != null) {
            RecyclerView recyclerView = x0Var.a;
            boolean z10 = true;
            q1Var.q(true);
            View view = q1Var.a;
            if (q1Var.j != null && q1Var.k == null) {
                q1Var.j = null;
            }
            q1Var.k = null;
            if ((q1Var.l & 16) != 0) {
                return;
            }
            g1 g1Var = recyclerView.b;
            recyclerView.y0();
            a5.m mVar = recyclerView.e;
            d dVar = (d) mVar.c;
            k5.i iVar = (k5.i) mVar.b;
            int indexOfChild = ((RecyclerView) iVar.b).indexOfChild(view);
            if (indexOfChild == -1) {
                mVar.B(view);
            } else if (dVar.H(indexOfChild)) {
                dVar.K(indexOfChild);
                mVar.B(view);
                iVar.O(indexOfChild);
            } else {
                z10 = false;
            }
            if (z10) {
                q1 U = RecyclerView.U(view);
                g1Var.k(U);
                g1Var.h(U);
            }
            recyclerView.z0(!z10);
            if (z10 || !q1Var.l()) {
                return;
            }
            recyclerView.removeDetachedView(view, false);
        }
    }

    public final void e() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            yj0 yj0Var = (yj0) arrayList.get(i9);
            yj0Var.a.c(yj0Var.b, yj0Var.c, yj0Var.d, false);
        }
        arrayList.clear();
    }

    public abstract void f(q1 q1Var);

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

    public d5.p l(n1 n1Var, q1 q1Var, int i9, List list) {
        d5.p pVar = new d5.p();
        View view = q1Var.a;
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
