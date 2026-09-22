package androidx.fragment.app;

import android.os.Handler;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class u extends v7.a0 implements androidx.lifecycle.u0, androidx.lifecycle.t, t4.e, o0 {
    public final v a;
    public final v b;
    public final Handler c;
    public final l0 d;
    public final /* synthetic */ v e;

    public u(v vVar) {
        this.e = vVar;
        Handler handler = new Handler();
        this.a = vVar;
        this.b = vVar;
        this.c = handler;
        this.d = new l0();
    }

    @Override // v7.a0
    public final View b(int i10) {
        return this.e.findViewById(i10);
    }

    @Override // v7.a0
    public final boolean c() {
        Window window = this.e.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // androidx.lifecycle.u0
    public final androidx.lifecycle.t0 f() {
        return this.e.f();
    }

    @Override // t4.e
    public final m.p g() {
        return (m.p) this.e.e.d;
    }

    @Override // androidx.lifecycle.t
    public final androidx.lifecycle.o m() {
        return this.e.K;
    }

    @Override // androidx.fragment.app.o0
    public final void a() {
    }
}
