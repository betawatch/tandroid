package androidx.fragment.app;

import a8.x6;
import android.os.Handler;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class t extends x6 implements androidx.lifecycle.u0, androidx.lifecycle.t, w4.e, m0 {
    public final u a;
    public final u b;
    public final Handler c;
    public final j0 d;
    public final /* synthetic */ u e;

    public t(u uVar) {
        this.e = uVar;
        Handler handler = new Handler();
        this.a = uVar;
        this.b = uVar;
        this.c = handler;
        this.d = new j0();
    }

    @Override // a8.x6
    public final View b(int i7) {
        return this.e.findViewById(i7);
    }

    @Override // a8.x6
    public final boolean c() {
        Window window = this.e.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // androidx.lifecycle.u0
    public final androidx.lifecycle.t0 f() {
        return this.e.f();
    }

    @Override // w4.e
    public final m.q g() {
        return (m.q) this.e.e.d;
    }

    @Override // androidx.lifecycle.t
    public final androidx.lifecycle.o m() {
        return this.e.K;
    }

    @Override // androidx.fragment.app.m0
    public final void a() {
    }
}
