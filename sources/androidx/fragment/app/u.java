package androidx.fragment.app;

import android.os.Handler;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class u extends h7.i0 implements androidx.lifecycle.u0, androidx.lifecycle.t, g2.f, n0 {
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

    @Override // h7.i0
    public final View b(int i10) {
        return this.e.findViewById(i10);
    }

    @Override // h7.i0
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
