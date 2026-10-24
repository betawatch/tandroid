package androidx.fragment.app;

import android.os.Handler;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class u extends v7.x implements androidx.lifecycle.u0, androidx.lifecycle.t, t4.e, n0 {
    public final v a;
    public final v b;
    public final Handler c;
    public final k0 d;
    public final /* synthetic */ v e;

    public u(v vVar) {
        this.e = vVar;
        Handler handler = new Handler();
        this.a = vVar;
        this.b = vVar;
        this.c = handler;
        this.d = new k0();
    }

    @Override // v7.x
    public final View b(int i10) {
        return this.e.findViewById(i10);
    }

    @Override // v7.x
    public final boolean c() {
        Window window = this.e.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // androidx.lifecycle.u0
    public final androidx.lifecycle.t0 f() {
        return this.e.f();
    }

    @Override // t4.e
    public final m.q g() {
        return (m.q) this.e.e.c;
    }

    @Override // androidx.lifecycle.t
    public final androidx.lifecycle.o m() {
        return this.e.K;
    }

    @Override // androidx.fragment.app.n0
    public final void a() {
    }
}
