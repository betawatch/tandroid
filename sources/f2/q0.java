package f2;

import android.os.Trace;
import android.view.ViewGroup;
import java.util.List;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class q0 {
    public final r0 a = new r0();
    public boolean b = false;

    public void B(s0 s0Var) {
        this.a.registerObserver(s0Var);
    }

    public final void C(boolean z10) {
        if (this.a.a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.b = z10;
    }

    public final o1 g(ViewGroup viewGroup, int i10) {
        try {
            int i11 = n0.g.a;
            Trace.beginSection("RV CreateView");
            o1 x8 = x(viewGroup, i10);
            if (x8.a.getParent() != null) {
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            }
            x8.f = i10;
            Trace.endSection();
            return x8;
        } catch (Throwable th) {
            int i12 = n0.g.a;
            Trace.endSection();
            throw th;
        }
    }

    public abstract int h();

    public long i(int i10) {
        return -1L;
    }

    public int j(int i10) {
        return 0;
    }

    public int k() {
        return h();
    }

    public void l() {
        this.a.b();
    }

    public void m(int i10) {
        this.a.d(i10, 1, null);
    }

    public final void n(int i10, Object obj) {
        this.a.d(i10, 1, obj);
    }

    public void o(int i10) {
        this.a.e(i10, 1);
    }

    public void p(int i10, int i11) {
        this.a.c(i10, i11);
    }

    public void q(int i10, int i11) {
        this.a.d(i10, i11, null);
    }

    public void r(int i10, int i11, Object obj) {
        this.a.d(i10, i11, obj);
    }

    public void s(int i10, int i11) {
        this.a.e(i10, i11);
    }

    public void t(int i10, int i11) {
        this.a.f(i10, i11);
    }

    public void u(int i10) {
        this.a.f(i10, 1);
    }

    public abstract void v(o1 o1Var, int i10);

    public void w(o1 o1Var, int i10, List list) {
        v(o1Var, i10);
    }

    public abstract o1 x(ViewGroup viewGroup, int i10);

    public void A(o1 o1Var) {
    }

    public void y(o1 o1Var) {
    }

    public void z(o1 o1Var) {
    }
}
