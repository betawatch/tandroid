package androidx.fragment.app;

import a8.m1;
import android.os.Handler;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class t extends m1 implements androidx.lifecycle.u0, androidx.lifecycle.t, t4.e, m0 {
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

    @Override // a8.m1
    public final View b(int i10) {
        return this.e.findViewById(i10);
    }

    @Override // a8.m1
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
