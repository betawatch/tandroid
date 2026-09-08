package androidx.fragment.app;

import android.os.Handler;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class t extends v7.a0 implements androidx.lifecycle.u0, androidx.lifecycle.t, t4.e, m0 {
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

    @Override // androidx.fragment.app.m0
    public final void a() {
    }
}
