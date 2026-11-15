package l2;

import android.graphics.SurfaceTexture;
import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class i implements t0 {
    public static i h;
    public boolean a;
    public boolean b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;

    public i() {
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new wi.p(this);
    }

    public static i d() {
        if (h == null) {
            h = new i();
        }
        return h;
    }

    public static void g(String str) {
        Log.d("PIP_DEBUG", "[utils.pip] " + str);
    }

    @Override // l2.t0
    public long a() {
        if (this.a) {
            return ((q1) this.c).a();
        }
        t0 t0Var = (t0) this.f;
        t0Var.getClass();
        return t0Var.a();
    }

    @Override // l2.t0
    public boolean b() {
        if (this.a) {
            ((q1) this.c).getClass();
            return false;
        }
        t0 t0Var = (t0) this.f;
        t0Var.getClass();
        return t0Var.b();
    }

    public wi.n c() {
        ArrayList arrayList = (ArrayList) this.c;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            wi.n nVar = (wi.n) arrayList.get(i7);
            if (nVar.e()) {
                return nVar;
            }
        }
        return null;
    }

    @Override // l2.t0
    public void e(e2.w0 w0Var) {
        t0 t0Var = (t0) this.f;
        if (t0Var != null) {
            t0Var.e(w0Var);
            w0Var = ((t0) this.f).j();
        }
        ((q1) this.c).e(w0Var);
    }

    public void f() {
        ((wi.p) this.e).j();
    }

    public void h(b bVar) {
        t0 t0Var;
        t0 h7 = bVar.h();
        if (h7 == null || h7 == (t0Var = (t0) this.f)) {
            return;
        }
        if (t0Var != null) {
            throw new l(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.f = h7;
        this.e = bVar;
        h7.e((e2.w0) ((q1) this.c).e);
    }

    public void i(wi.n nVar, int i7) {
        g("dismissed, prevState=" + i7);
        ((ArrayList) this.c).remove(nVar);
        wi.p pVar = (wi.p) this.e;
        if (nVar == pVar.e) {
            pVar.e = null;
        }
        if (nVar == pVar.f) {
            wi.o oVar = pVar.g;
            View view = pVar.h;
            pVar.f = null;
            pVar.g = null;
            pVar.h = null;
            wi.q qVar = pVar.c;
            if (qVar != null) {
                qVar.a(null, null);
            }
            if (oVar != null) {
                SurfaceTexture surfaceTexture = oVar.a;
                oVar.a = null;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
            }
            if (view != null) {
                nVar.a.x(view);
            }
            LaunchActivity launchActivity = pVar.b;
            if (launchActivity != null && pVar.i && org.telegram.messenger.g0.H1(launchActivity)) {
                pVar.b.moveTaskToBack(false);
            }
            pVar.i = false;
            bg.u0 u0Var = pVar.d;
            if (u0Var != null) {
                u0Var.c(false);
            }
        }
        f();
    }

    @Override // l2.t0
    public e2.w0 j() {
        t0 t0Var = (t0) this.f;
        return t0Var != null ? t0Var.j() : (e2.w0) ((q1) this.c).e;
    }

    public wi.n k(wi.l lVar) {
        wi.n nVar = new wi.n(this, lVar);
        ((ArrayList) this.c).add(nVar);
        g("register " + lVar);
        f();
        return nVar;
    }

    public i(o0 o0Var, h2.g0 g0Var) {
        this.d = o0Var;
        q1 q1Var = new q1();
        q1Var.d = g0Var;
        q1Var.e = e2.w0.d;
        this.c = q1Var;
        this.a = true;
    }
}
