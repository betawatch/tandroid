package f2;

import android.animation.TimeInterpolator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Components.uk0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class u0 {
    public y5.h a;
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

    public static int b(m1 m1Var) {
        int i10 = m1Var.l;
        int i11 = i10 & 14;
        if (m1Var.h()) {
            return 4;
        }
        if ((i10 & 4) == 0) {
            int i12 = m1Var.d;
            int b10 = m1Var.b();
            if (i12 != -1 && b10 != -1 && i12 != b10) {
                return i11 | 2048;
            }
        }
        return i11;
    }

    public abstract boolean a(m1 m1Var, c5.e eVar, c5.e eVar2);

    public abstract boolean c(m1 m1Var, List list);

    public final void d(m1 m1Var) {
        y5.h hVar = this.a;
        if (hVar != null) {
            RecyclerView recyclerView = (RecyclerView) hVar.b;
            boolean z4 = true;
            m1Var.q(true);
            View view = m1Var.a;
            if (m1Var.j != null && m1Var.k == null) {
                m1Var.j = null;
            }
            m1Var.k = null;
            if ((m1Var.l & 16) != 0) {
                return;
            }
            bf.f fVar = recyclerView.b;
            recyclerView.y0();
            androidx.biometric.e eVar = recyclerView.e;
            c cVar = (c) eVar.c;
            ja.c cVar2 = (ja.c) eVar.b;
            int indexOfChild = ((RecyclerView) cVar2.a).indexOfChild(view);
            if (indexOfChild == -1) {
                eVar.C(view);
            } else if (cVar.D(indexOfChild)) {
                cVar.G(indexOfChild);
                eVar.C(view);
                cVar2.D(indexOfChild);
            } else {
                z4 = false;
            }
            if (z4) {
                m1 U = RecyclerView.U(view);
                fVar.k(U);
                fVar.h(U);
            }
            recyclerView.z0(!z4);
            if (z4 || !m1Var.l()) {
                return;
            }
            recyclerView.removeDetachedView(view, false);
        }
    }

    public final void e() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            uk0 uk0Var = (uk0) arrayList.get(i10);
            uk0Var.a.c(uk0Var.b, uk0Var.c, uk0Var.d, false);
        }
        arrayList.clear();
    }

    public abstract void f(m1 m1Var);

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

    public c5.e l(j1 j1Var, m1 m1Var, int i10, List list) {
        c5.e eVar = new c5.e();
        View view = m1Var.a;
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
