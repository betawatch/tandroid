package androidx.fragment.app;

import android.os.Handler;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class t extends v7.x implements androidx.lifecycle.u0, androidx.lifecycle.t, t4.e, m0 {
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
    public final m.p g() {
        return (m.p) this.e.e.c;
    }

    @Override // androidx.lifecycle.t
    public final androidx.lifecycle.o m() {
        return this.e.K;
    }

    @Override // androidx.fragment.app.m0
    public final void a() {
    }
}
