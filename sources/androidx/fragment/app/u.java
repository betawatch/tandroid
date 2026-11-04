package androidx.fragment.app;

import android.os.Handler;
import android.view.View;
import android.view.Window;
import b8.a1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class u extends a1 implements androidx.lifecycle.u0, androidx.lifecycle.t, v4.e, n0 {
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

    @Override // b8.a1
    public final View b(int i3) {
        return this.e.findViewById(i3);
    }

    @Override // b8.a1
    public final boolean c() {
        Window window = this.e.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // androidx.lifecycle.u0
    public final androidx.lifecycle.t0 f() {
        return this.e.f();
    }

    @Override // v4.e
    public final m.p g() {
        return (m.p) this.e.e.d;
    }

    @Override // androidx.lifecycle.t
    public final androidx.lifecycle.o m() {
        return this.e.L;
    }

    @Override // androidx.fragment.app.n0
    public final void a() {
    }
}
