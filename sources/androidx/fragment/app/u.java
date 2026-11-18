package androidx.fragment.app;

import a8.z6;
import android.os.Handler;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class u extends z6 implements androidx.lifecycle.u0, androidx.lifecycle.t, w4.e, n0 {
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

    @Override // a8.z6
    public final View b(int i7) {
        return this.e.findViewById(i7);
    }

    @Override // a8.z6
    public final boolean c() {
        Window window = this.e.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // androidx.lifecycle.u0
    public final androidx.lifecycle.t0 g() {
        return this.e.g();
    }

    @Override // w4.e
    public final m.p h() {
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
