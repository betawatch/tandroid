package f2;

import android.animation.TimeInterpolator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Components.jk0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class u0 {
    public ha.c a;
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

    public static int b(n1 n1Var) {
        int i10 = n1Var.l;
        int i11 = i10 & 14;
        if (n1Var.h()) {
            return 4;
        }
        if ((i10 & 4) == 0) {
            int i12 = n1Var.d;
            int b10 = n1Var.b();
            if (i12 != -1 && b10 != -1 && i12 != b10) {
                return i11 | 2048;
            }
        }
        return i11;
    }

    public abstract boolean a(n1 n1Var, a5.e eVar, a5.e eVar2);

    public abstract boolean c(n1 n1Var, List list);

    public final void d(n1 n1Var) {
        ha.c cVar = this.a;
        if (cVar != null) {
            RecyclerView recyclerView = (RecyclerView) cVar.b;
            boolean z10 = true;
            n1Var.q(true);
            View view = n1Var.a;
            if (n1Var.j != null && n1Var.k == null) {
                n1Var.j = null;
            }
            n1Var.k = null;
            if ((n1Var.l & 16) != 0) {
                return;
            }
            d1 d1Var = recyclerView.b;
            recyclerView.y0();
            androidx.biometric.e eVar = recyclerView.e;
            c cVar2 = (c) eVar.c;
            ag.o1 o1Var = (ag.o1) eVar.b;
            int indexOfChild = ((RecyclerView) o1Var.b).indexOfChild(view);
            if (indexOfChild == -1) {
                eVar.B(view);
            } else if (cVar2.D(indexOfChild)) {
                cVar2.G(indexOfChild);
                eVar.B(view);
                o1Var.k(indexOfChild);
            } else {
                z10 = false;
            }
            if (z10) {
                n1 U = RecyclerView.U(view);
                d1Var.k(U);
                d1Var.h(U);
            }
            recyclerView.z0(!z10);
            if (z10 || !n1Var.l()) {
                return;
            }
            recyclerView.removeDetachedView(view, false);
        }
    }

    public final void e() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            jk0 jk0Var = (jk0) arrayList.get(i10);
            jk0Var.a.c(jk0Var.b, jk0Var.c, jk0Var.d, false);
        }
        arrayList.clear();
    }

    public abstract void f(n1 n1Var);

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

    public a5.e l(k1 k1Var, n1 n1Var, int i10, List list) {
        a5.e eVar = new a5.e();
        View view = n1Var.a;
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
