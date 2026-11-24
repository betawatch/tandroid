// default package

import android.graphics.SurfaceTexture;
import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class mb3 implements ck6 {
    public static mb3 h;
    public boolean a;
    public boolean b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;

    public mb3() {
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new ddb(this);
    }

    public static mb3 c() {
        mb3 mb3Var = h;
        if (mb3Var != null) {
            return mb3Var;
        }
        mb3 mb3Var2 = new mb3();
        h = mb3Var2;
        return mb3Var2;
    }

    public static void e(String str) {
        Log.d("PIP_DEBUG", "[utils.pip] ".concat(str));
    }

    public final xa8 a() {
        ArrayList arrayList = (ArrayList) this.c;
        for (int i = 0; i < arrayList.size(); i++) {
            xa8 xa8Var = (xa8) arrayList.get(i);
            if (xa8Var.f()) {
                return xa8Var;
            }
        }
        return null;
    }

    @Override // ck6
    public final void b(zb8 zb8Var) {
        ck6 ck6Var = (ck6) this.f;
        if (ck6Var != null) {
            ck6Var.b(zb8Var);
            zb8Var = ((ck6) this.f).g();
        }
        ((ie2) this.c).b(zb8Var);
    }

    public final void d() {
        ((ddb) this.e).j();
    }

    public final void f(ug0 ug0Var) {
        ck6 ck6Var;
        ck6 k = ug0Var.k();
        if (k == null || k == (ck6Var = (ck6) this.f)) {
            return;
        }
        if (ck6Var != null) {
            throw new j54(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.f = k;
        this.e = ug0Var;
        k.b((zb8) ((ie2) this.c).e);
    }

    @Override // ck6
    public final zb8 g() {
        ck6 ck6Var = (ck6) this.f;
        return ck6Var != null ? ck6Var.g() : (zb8) ((ie2) this.c).e;
    }

    @Override // ck6
    public final long h() {
        if (this.a) {
            return ((ie2) this.c).h();
        }
        ck6 ck6Var = (ck6) this.f;
        ck6Var.getClass();
        return ck6Var.h();
    }

    @Override // ck6
    public final boolean i() {
        if (this.a) {
            return false;
        }
        ck6 ck6Var = (ck6) this.f;
        ck6Var.getClass();
        return ck6Var.i();
    }

    public final void j(xa8 xa8Var, int i) {
        e("dismissed, prevState=" + i);
        ((ArrayList) this.c).remove(xa8Var);
        ddb ddbVar = (ddb) this.e;
        if (xa8Var == ddbVar.e) {
            ddbVar.e = null;
        }
        if (xa8Var == ddbVar.f) {
            ya8 ya8Var = ddbVar.g;
            View view = ddbVar.h;
            ddbVar.f = null;
            ddbVar.g = null;
            ddbVar.h = null;
            gdb gdbVar = ddbVar.c;
            if (gdbVar != null) {
                gdbVar.a(null, null);
            }
            if (ya8Var != null) {
                SurfaceTexture surfaceTexture = ya8Var.a;
                ya8Var.a = null;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
            }
            if (view != null) {
                xa8Var.a.q0(view);
            }
            LaunchActivity launchActivity = ddbVar.b;
            if (launchActivity != null && ddbVar.i && gl.F1(launchActivity)) {
                ddbVar.b.moveTaskToBack(false);
            }
            ddbVar.i = false;
            a06 a06Var = ddbVar.d;
            if (a06Var != null) {
                a06Var.b(false);
            }
        }
        d();
    }

    public final xa8 k(sa8 sa8Var) {
        xa8 xa8Var = new xa8(this, sa8Var);
        ((ArrayList) this.c).add(xa8Var);
        e("register " + sa8Var);
        d();
        return xa8Var;
    }

    public mb3(i64 i64Var, adb adbVar) {
        this.d = i64Var;
        ie2 ie2Var = new ie2();
        ie2Var.d = adbVar;
        ie2Var.e = zb8.d;
        this.c = ie2Var;
        this.a = true;
    }
}
