package androidx.fragment.app;

import android.os.Handler;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final class u extends v7.c0 implements androidx.lifecycle.u0, androidx.lifecycle.t, t4.e, o0 {
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

    @Override // v7.c0
    public final View b(int i10) {
        return this.e.findViewById(i10);
    }

    @Override // v7.c0
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
