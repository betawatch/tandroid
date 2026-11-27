// default package

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class d30 {
    public boolean a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;

    public d30(Context context, byte b) {
        switch (b) {
            case 2:
                this.b = context;
                this.c = sz.f;
                break;
            default:
                this.d = f30.a;
                this.a = true;
                this.g = i30.H;
                this.b = context;
                break;
        }
    }

    public static void n(u34 u34Var) {
        d30 d30Var = new d30();
        d30Var.b = new nv2(d30Var, (byte) 0);
        d30Var.d = u34Var;
        int i = yac.t0;
        d30Var.g = new vd2(d30Var, (byte) 15);
        d30Var.f = lv2.r(i);
        d30Var.e = jn7.f(i);
        d30Var.c = new Handler(Looper.myLooper());
        if (d30Var.o(false)) {
            return;
        }
        ((jn7) d30Var.e).a((nv2) d30Var.b, jn7.N);
        ((Handler) d30Var.c).postDelayed((vd2) d30Var.g, 1000L);
    }

    public final d30 a(o8a o8aVar) {
        d30 d30Var;
        d30[] d30VarArr = (d30[]) this.e;
        o8aVar.getClass();
        qw5 qw5Var = (qw5) this.c;
        k3d b = e3f.b(qw5Var, o8aVar);
        char c = b.a;
        n31 n31Var = (n31) this.b;
        n31Var.k(c);
        n31Var.b = true;
        String str = (String) this.f;
        if (str != null) {
            String str2 = (String) this.g;
            if (str2 == null) {
                str2 = o8aVar.a();
            }
            n31Var.j();
            n31Var.l(str);
            n31Var.k(':');
            k(str2);
            this.f = null;
            this.g = null;
        }
        return ((k3d) this.d) == b ? this : (d30VarArr == null || (d30Var = d30VarArr[b.ordinal()]) == null) ? new d30(n31Var, qw5Var, b, d30VarArr) : d30Var;
    }

    public final ja3 b() {
        Context context = (Context) this.b;
        yve.p(!this.a);
        this.a = true;
        if (((rx6) this.d) == null) {
            this.d = new rx6(new q20[0]);
        }
        n40 n40Var = (n40) this.f;
        fa3 fa3Var = (fa3) this.g;
        if (n40Var == null) {
            if (fa3Var == null) {
                this.g = new fa3(context);
            }
            if (((sg7) this.e) == null) {
                this.e = sg7.b;
            }
            lyc lycVar = new lyc(context);
            sz szVar = context != null ? null : (sz) this.c;
            Context context2 = (Context) lycVar.b;
            if (context2 == null) {
                lycVar.e = szVar;
            }
            fa3 fa3Var2 = (fa3) this.g;
            lycVar.c = fa3Var2;
            lycVar.d = (sg7) this.e;
            if (fa3Var2 == null) {
                lycVar.c = new fa3(context2);
            }
            this.f = new n40(lycVar);
        } else {
            yve.p(fa3Var == null);
            yve.p(((sg7) this.e) == null);
        }
        return new ja3(this);
    }

    public final void c(o8a o8aVar, int i) {
        n31 n31Var = (n31) this.b;
        o8aVar.getClass();
        int ordinal = ((k3d) this.d).ordinal();
        boolean z = true;
        if (ordinal == 1) {
            if (!n31Var.b) {
                n31Var.k(',');
            }
            n31Var.j();
            return;
        }
        if (ordinal == 2) {
            if (n31Var.b) {
                this.a = true;
                n31Var.j();
                return;
            }
            if (i % 2 == 0) {
                n31Var.k(',');
                n31Var.j();
            } else {
                n31Var.k(':');
                n31Var.m();
                z = false;
            }
            this.a = z;
            return;
        }
        if (ordinal != 3) {
            if (!n31Var.b) {
                n31Var.k(',');
            }
            n31Var.j();
            dfd.a((qw5) this.c, o8aVar);
            k(o8aVar.g(i));
            n31Var.k(':');
            n31Var.m();
            return;
        }
        if (i == 0) {
            this.a = true;
        }
        if (i == 1) {
            n31Var.k(',');
            n31Var.m();
            this.a = false;
        }
    }

    public final void d(int i) {
        if (this.a) {
            k(String.valueOf(i));
        } else {
            ((wj1) ((n31) this.b).c).c(String.valueOf(i));
        }
    }

    public final void e(long j) {
        if (this.a) {
            k(String.valueOf(j));
        } else {
            ((wj1) ((n31) this.b).c).c(String.valueOf(j));
        }
    }

    public final void f(o8a o8aVar, int i, long j) {
        o8aVar.getClass();
        c(o8aVar, i);
        e(j);
    }

    public final void g() {
        ((wj1) ((n31) this.b).c).c("null");
    }

    public final void h(o8a o8aVar, int i, hx5 hx5Var, Object obj) {
        o8aVar.getClass();
        hx5Var.getClass();
        o8aVar.getClass();
        hx5Var.getClass();
        c(o8aVar, i);
        if (hx5Var.d().c()) {
            j(hx5Var, obj);
        } else if (obj == null) {
            g();
        } else {
            j(hx5Var, obj);
        }
    }

    public final void i(o8a o8aVar, int i, hx5 hx5Var, Object obj) {
        o8aVar.getClass();
        hx5Var.getClass();
        c(o8aVar, i);
        j(hx5Var, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(hx5 hx5Var, Object obj) {
        String str;
        hx5Var.getClass();
        pm3 pm3Var = ((qw5) this.c).a;
        int ordinal = ((ji2) pm3Var.d).ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                nye e = hx5Var.d().e();
                if (ur5.a(e, tdb.b) || ur5.a(e, tdb.e)) {
                    o8a d = hx5Var.d();
                    d.getClass();
                    Iterator it = d.getAnnotations().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            str = (String) pm3Var.b;
                            break;
                        }
                        Annotation annotation = (Annotation) it.next();
                        if (annotation instanceof rw5) {
                            str = ((rw5) annotation).discriminator();
                            break;
                        }
                    }
                    if (str != null) {
                        String a = hx5Var.d().a();
                        this.f = str;
                        this.g = a;
                    }
                    hx5Var.b(this, obj);
                }
            } else if (ordinal != 2) {
                throw new zp2();
            }
        }
        str = null;
        if (str != null) {
        }
        hx5Var.b(this, obj);
    }

    public final void k(String str) {
        str.getClass();
        ((n31) this.b).l(str);
    }

    public final void l(o8a o8aVar) {
        o8aVar.getClass();
        k3d k3dVar = (k3d) this.d;
        n31 n31Var = (n31) this.b;
        n31Var.b = false;
        n31Var.k(k3dVar.b);
    }

    public final void m() {
        ArrayList arrayList = (ArrayList) this.g;
        for (int i = 0; i < arrayList.size(); i++) {
            ((View) arrayList.get(i)).invalidate();
        }
    }

    public final boolean o(boolean z) {
        if (this.a) {
            return false;
        }
        if (!((lv2) this.f).h && !z) {
            return false;
        }
        jn7 jn7Var = (jn7) this.e;
        if (jn7Var != null) {
            jn7Var.n((nv2) this.b, jn7.N);
        }
        Handler handler = (Handler) this.c;
        if (handler != null) {
            handler.removeCallbacks((vd2) this.g);
        }
        this.a = true;
        u34 u34Var = (u34) this.d;
        LaunchActivity launchActivity = (LaunchActivity) u34Var.b;
        Intent intent = (Intent) u34Var.c;
        String str = LaunchActivity.C1;
        launchActivity.V(intent, true, false, false, null, true, false);
        return true;
    }

    public final boolean p(o8a o8aVar) {
        return false;
    }

    public d30(n31 n31Var, qw5 qw5Var, k3d k3dVar, d30[] d30VarArr) {
        this.b = n31Var;
        this.c = qw5Var;
        this.d = k3dVar;
        this.e = d30VarArr;
        int ordinal = k3dVar.ordinal();
        if (d30VarArr != null) {
            d30 d30Var = d30VarArr[ordinal];
            if (d30Var == null && d30Var == this) {
                return;
            }
            d30VarArr[ordinal] = this;
        }
    }
}
