package androidx.fragment.app;

import android.os.Handler;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class u extends f7.a0 implements androidx.lifecycle.u0, androidx.lifecycle.t, g2.f, n0 {
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

    @Override // f7.a0
    public final View b(int i9) {
        return this.e.findViewById(i9);
    }

    @Override // f7.a0
    public final boolean c() {
        Window window = this.e.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // androidx.lifecycle.u0
    public final androidx.lifecycle.t0 f() {
        return this.e.f();
    }

    @Override // g2.f
    public final g2.e g() {
        return (g2.e) this.e.e.c;
    }

    @Override // androidx.lifecycle.t
    public final androidx.lifecycle.o m() {
        return this.e.G;
    }

    @Override // androidx.fragment.app.n0
    public final void a() {
    }
}
