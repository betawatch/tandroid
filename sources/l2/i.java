package l2;

import android.graphics.SurfaceTexture;
import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class i implements w0 {
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
        this.e = new ti.q(this);
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

    @Override // l2.w0
    public long a() {
        if (this.a) {
            return ((u1) this.c).a();
        }
        w0 w0Var = (w0) this.f;
        w0Var.getClass();
        return w0Var.a();
    }

    @Override // l2.w0
    public boolean b() {
        if (this.a) {
            ((u1) this.c).getClass();
            return false;
        }
        w0 w0Var = (w0) this.f;
        w0Var.getClass();
        return w0Var.b();
    }

    public ti.o c() {
        ArrayList arrayList = (ArrayList) this.c;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ti.o oVar = (ti.o) arrayList.get(i7);
            if (oVar.e()) {
                return oVar;
            }
        }
        return null;
    }

    @Override // l2.w0
    public void e(e2.w0 w0Var) {
        w0 w0Var2 = (w0) this.f;
        if (w0Var2 != null) {
            w0Var2.e(w0Var);
            w0Var = ((w0) this.f).j();
        }
        ((u1) this.c).e(w0Var);
    }

    public void f() {
        ((ti.q) this.e).j();
    }

    public void h(b bVar) {
        w0 w0Var;
        w0 h7 = bVar.h();
        if (h7 == null || h7 == (w0Var = (w0) this.f)) {
            return;
        }
        if (w0Var != null) {
            throw new l(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.f = h7;
        this.e = bVar;
        h7.e((e2.w0) ((u1) this.c).e);
    }

    public void i(ti.o oVar, int i7) {
        g("dismissed, prevState=" + i7);
        ((ArrayList) this.c).remove(oVar);
        ti.q qVar = (ti.q) this.e;
        if (oVar == qVar.e) {
            qVar.e = null;
        }
        if (oVar == qVar.f) {
            ti.p pVar = qVar.g;
            View view = qVar.h;
            qVar.f = null;
            qVar.g = null;
            qVar.h = null;
            ti.r rVar = qVar.c;
            if (rVar != null) {
                rVar.a(null, null);
            }
            if (pVar != null) {
                SurfaceTexture surfaceTexture = pVar.a;
                pVar.a = null;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
            }
            if (view != null) {
                oVar.a.y(view);
            }
            LaunchActivity launchActivity = qVar.b;
            if (launchActivity != null && qVar.i && org.telegram.messenger.g0.H1(launchActivity)) {
                qVar.b.moveTaskToBack(false);
            }
            qVar.i = false;
            bg.v0 v0Var = qVar.d;
            if (v0Var != null) {
                v0Var.c(false);
            }
        }
        f();
    }

    @Override // l2.w0
    public e2.w0 j() {
        w0 w0Var = (w0) this.f;
        return w0Var != null ? w0Var.j() : (e2.w0) ((u1) this.c).e;
    }

    public ti.o k(ti.m mVar) {
        ti.o oVar = new ti.o(this, mVar);
        ((ArrayList) this.c).add(oVar);
        g("register " + mVar);
        f();
        return oVar;
    }

    public i(r0 r0Var, h2.g0 g0Var) {
        this.d = r0Var;
        u1 u1Var = new u1();
        u1Var.d = g0Var;
        u1Var.e = e2.w0.d;
        this.c = u1Var;
        this.a = true;
    }
}
