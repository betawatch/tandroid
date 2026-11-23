package l2;

import android.graphics.SurfaceTexture;
import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class j implements u0 {
    public static j h;
    public boolean a;
    public boolean b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;

    public j() {
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new wi.p(this);
    }

    public static j d() {
        if (h == null) {
            h = new j();
        }
        return h;
    }

    public static void g(String str) {
        Log.d("PIP_DEBUG", "[utils.pip] " + str);
    }

    @Override // l2.u0
    public long a() {
        if (this.a) {
            return ((r1) this.c).a();
        }
        u0 u0Var = (u0) this.f;
        u0Var.getClass();
        return u0Var.a();
    }

    @Override // l2.u0
    public boolean b() {
        if (this.a) {
            ((r1) this.c).getClass();
            return false;
        }
        u0 u0Var = (u0) this.f;
        u0Var.getClass();
        return u0Var.b();
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

    @Override // l2.u0
    public void e(e2.w0 w0Var) {
        u0 u0Var = (u0) this.f;
        if (u0Var != null) {
            u0Var.e(w0Var);
            w0Var = ((u0) this.f).l();
        }
        ((r1) this.c).e(w0Var);
    }

    public void f() {
        ((wi.p) this.e).j();
    }

    public void h(b bVar) {
        u0 u0Var;
        u0 h7 = bVar.h();
        if (h7 == null || h7 == (u0Var = (u0) this.f)) {
            return;
        }
        if (u0Var != null) {
            throw new m(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.f = h7;
        this.e = bVar;
        h7.e((e2.w0) ((r1) this.c).e);
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
                nVar.a.z0(view);
            }
            LaunchActivity launchActivity = pVar.b;
            if (launchActivity != null && pVar.i && org.telegram.messenger.g0.H1(launchActivity)) {
                pVar.b.moveTaskToBack(false);
            }
            pVar.i = false;
            bg.v0 v0Var = pVar.d;
            if (v0Var != null) {
                v0Var.b(false);
            }
        }
        f();
    }

    public wi.n j(wi.l lVar) {
        wi.n nVar = new wi.n(this, lVar);
        ((ArrayList) this.c).add(nVar);
        g("register " + lVar);
        f();
        return nVar;
    }

    @Override // l2.u0
    public e2.w0 l() {
        u0 u0Var = (u0) this.f;
        return u0Var != null ? u0Var.l() : (e2.w0) ((r1) this.c).e;
    }

    public j(p0 p0Var, h2.g0 g0Var) {
        this.d = p0Var;
        r1 r1Var = new r1();
        r1Var.d = g0Var;
        r1Var.e = e2.w0.d;
        this.c = r1Var;
        this.a = true;
    }
}
