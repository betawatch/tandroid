// default package

import android.graphics.SurfaceTexture;
import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class fc3 implements hm6 {
    public static fc3 h;
    public boolean a;
    public boolean b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;

    public fc3() {
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new ygb(this);
    }

    public static fc3 b() {
        fc3 fc3Var = h;
        if (fc3Var != null) {
            return fc3Var;
        }
        fc3 fc3Var2 = new fc3();
        h = fc3Var2;
        return fc3Var2;
    }

    public static void e(String str) {
        Log.d("PIP_DEBUG", "[utils.pip] ".concat(str));
    }

    public final me8 a() {
        ArrayList arrayList = (ArrayList) this.c;
        for (int i = 0; i < arrayList.size(); i++) {
            me8 me8Var = (me8) arrayList.get(i);
            if (me8Var.g()) {
                return me8Var;
            }
        }
        return null;
    }

    @Override // hm6
    public final void c(of8 of8Var) {
        hm6 hm6Var = (hm6) this.f;
        if (hm6Var != null) {
            hm6Var.c(of8Var);
            of8Var = ((hm6) this.f).f();
        }
        ((ze2) this.c).c(of8Var);
    }

    public final void d() {
        ((ygb) this.e).j();
    }

    @Override // hm6
    public final of8 f() {
        hm6 hm6Var = (hm6) this.f;
        return hm6Var != null ? hm6Var.f() : (of8) ((ze2) this.c).e;
    }

    @Override // hm6
    public final long g() {
        if (this.a) {
            return ((ze2) this.c).g();
        }
        hm6 hm6Var = (hm6) this.f;
        hm6Var.getClass();
        return hm6Var.g();
    }

    @Override // hm6
    public final boolean h() {
        if (this.a) {
            return false;
        }
        hm6 hm6Var = (hm6) this.f;
        hm6Var.getClass();
        return hm6Var.h();
    }

    public final void i(vg0 vg0Var) {
        hm6 hm6Var;
        hm6 k = vg0Var.k();
        if (k == null || k == (hm6Var = (hm6) this.f)) {
            return;
        }
        if (hm6Var != null) {
            throw new e64(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.f = k;
        this.e = vg0Var;
        k.c((of8) ((ze2) this.c).e);
    }

    public final void j(me8 me8Var, int i) {
        e("dismissed, prevState=" + i);
        ((ArrayList) this.c).remove(me8Var);
        ygb ygbVar = (ygb) this.e;
        if (me8Var == ygbVar.e) {
            ygbVar.e = null;
        }
        if (me8Var == ygbVar.f) {
            ne8 ne8Var = ygbVar.g;
            View view = ygbVar.h;
            ygbVar.f = null;
            ygbVar.g = null;
            ygbVar.h = null;
            bhb bhbVar = ygbVar.c;
            if (bhbVar != null) {
                bhbVar.a(null, null);
            }
            if (ne8Var != null) {
                SurfaceTexture surfaceTexture = ne8Var.a;
                ne8Var.a = null;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
            }
            if (view != null) {
                me8Var.a.L(view);
            }
            LaunchActivity launchActivity = ygbVar.b;
            if (launchActivity != null && ygbVar.i && hl.F1(launchActivity)) {
                ygbVar.b.moveTaskToBack(false);
            }
            ygbVar.i = false;
            e26 e26Var = ygbVar.d;
            if (e26Var != null) {
                e26Var.b(false);
            }
        }
        d();
    }

    public final me8 k(je8 je8Var) {
        me8 me8Var = new me8(this, je8Var);
        ((ArrayList) this.c).add(me8Var);
        e("register " + je8Var);
        d();
        return me8Var;
    }

    public fc3(c74 c74Var, vgb vgbVar) {
        this.d = c74Var;
        ze2 ze2Var = new ze2();
        ze2Var.d = vgbVar;
        ze2Var.e = of8.d;
        this.c = ze2Var;
        this.a = true;
    }
}
