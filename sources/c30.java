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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class c30 {
    public boolean a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;

    public c30(Context context, byte b) {
        switch (b) {
            case 2:
                this.b = context;
                this.c = rz.f;
                break;
            default:
                this.d = e30.a;
                this.a = true;
                this.g = h30.H;
                this.b = context;
                break;
        }
    }

    public static void n(h45 h45Var) {
        c30 c30Var = new c30();
        c30Var.b = new su2(c30Var, (byte) 0);
        c30Var.d = h45Var;
        int i = y6c.t0;
        c30Var.g = new mk2(c30Var, (byte) 9);
        c30Var.f = qu2.r(i);
        c30Var.e = kk7.f(i);
        c30Var.c = new Handler(Looper.myLooper());
        if (c30Var.o(false)) {
            return;
        }
        ((kk7) c30Var.e).a((su2) c30Var.b, kk7.N);
        ((Handler) c30Var.c).postDelayed((mk2) c30Var.g, 1000L);
    }

    public final c30 a(w4a w4aVar) {
        c30 c30Var;
        c30[] c30VarArr = (c30[]) this.e;
        w4aVar.getClass();
        lu5 lu5Var = (lu5) this.c;
        uyc b = lye.b(lu5Var, w4aVar);
        char c = b.a;
        e31 e31Var = (e31) this.b;
        e31Var.l(c);
        e31Var.b = true;
        String str = (String) this.f;
        if (str != null) {
            String str2 = (String) this.g;
            if (str2 == null) {
                str2 = w4aVar.a();
            }
            e31Var.k();
            e31Var.m(str);
            e31Var.l(':');
            k(str2);
            this.f = null;
            this.g = null;
        }
        return ((uyc) this.d) == b ? this : (c30VarArr == null || (c30Var = c30VarArr[b.ordinal()]) == null) ? new c30(e31Var, lu5Var, b, c30VarArr) : c30Var;
    }

    public final q93 b() {
        Context context = (Context) this.b;
        gre.p(!this.a);
        this.a = true;
        if (((mv6) this.d) == null) {
            this.d = new mv6(new p20[0]);
        }
        l40 l40Var = (l40) this.f;
        m93 m93Var = (m93) this.g;
        if (l40Var == null) {
            if (m93Var == null) {
                this.g = new m93(context);
            }
            if (((ie7) this.e) == null) {
                this.e = ie7.b;
            }
            wtc wtcVar = new wtc();
            wtcVar.a = context != null ? context.getApplicationContext() : null;
            wtcVar.c = ie7.b;
            if (context == null) {
                wtcVar.d = rz.f;
            }
            rz rzVar = context == null ? (rz) this.c : null;
            Context context2 = (Context) wtcVar.a;
            if (context2 == null) {
                wtcVar.d = rzVar;
            }
            m93 m93Var2 = (m93) this.g;
            wtcVar.b = m93Var2;
            wtcVar.c = (ie7) this.e;
            if (m93Var2 == null) {
                wtcVar.b = new m93(context2);
            }
            this.f = new l40(wtcVar);
        } else {
            gre.p(m93Var == null);
            gre.p(((ie7) this.e) == null);
        }
        return new q93(this);
    }

    public final void c(w4a w4aVar, int i) {
        e31 e31Var = (e31) this.b;
        w4aVar.getClass();
        int ordinal = ((uyc) this.d).ordinal();
        boolean z = true;
        if (ordinal == 1) {
            if (!e31Var.b) {
                e31Var.l(',');
            }
            e31Var.k();
            return;
        }
        if (ordinal == 2) {
            if (e31Var.b) {
                this.a = true;
                e31Var.k();
                return;
            }
            if (i % 2 == 0) {
                e31Var.l(',');
                e31Var.k();
            } else {
                e31Var.l(':');
                e31Var.n();
                z = false;
            }
            this.a = z;
            return;
        }
        if (ordinal != 3) {
            if (!e31Var.b) {
                e31Var.l(',');
            }
            e31Var.k();
            kad.a((lu5) this.c, w4aVar);
            k(w4aVar.g(i));
            e31Var.l(':');
            e31Var.n();
            return;
        }
        if (i == 0) {
            this.a = true;
        }
        if (i == 1) {
            e31Var.l(',');
            e31Var.n();
            this.a = false;
        }
    }

    public final void d(int i) {
        if (this.a) {
            k(String.valueOf(i));
        } else {
            ((nj1) ((e31) this.b).c).c(String.valueOf(i));
        }
    }

    public final void e(long j) {
        if (this.a) {
            k(String.valueOf(j));
        } else {
            ((nj1) ((e31) this.b).c).c(String.valueOf(j));
        }
    }

    public final void f(w4a w4aVar, int i, long j) {
        w4aVar.getClass();
        c(w4aVar, i);
        e(j);
    }

    public final void g() {
        ((nj1) ((e31) this.b).c).c("null");
    }

    public final void h(w4a w4aVar, int i, cv5 cv5Var, Object obj) {
        w4aVar.getClass();
        cv5Var.getClass();
        w4aVar.getClass();
        cv5Var.getClass();
        c(w4aVar, i);
        if (cv5Var.d().c()) {
            j(cv5Var, obj);
        } else if (obj == null) {
            g();
        } else {
            j(cv5Var, obj);
        }
    }

    public final void i(w4a w4aVar, int i, cv5 cv5Var, Object obj) {
        w4aVar.getClass();
        cv5Var.getClass();
        c(w4aVar, i);
        j(cv5Var, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(cv5 cv5Var, Object obj) {
        String str;
        cv5Var.getClass();
        xl3 xl3Var = ((lu5) this.c).a;
        int ordinal = ((nh2) xl3Var.d).ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                vte e = cv5Var.d().e();
                if (rp5.a(e, v9b.b) || rp5.a(e, v9b.e)) {
                    w4a d = cv5Var.d();
                    d.getClass();
                    Iterator it = d.getAnnotations().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            str = (String) xl3Var.b;
                            break;
                        }
                        Annotation annotation = (Annotation) it.next();
                        if (annotation instanceof mu5) {
                            str = ((mu5) annotation).discriminator();
                            break;
                        }
                    }
                    if (str != null) {
                        String a = cv5Var.d().a();
                        this.f = str;
                        this.g = a;
                    }
                    cv5Var.b(this, obj);
                }
            } else if (ordinal != 2) {
                throw new gp2();
            }
        }
        str = null;
        if (str != null) {
        }
        cv5Var.b(this, obj);
    }

    public final void k(String str) {
        str.getClass();
        ((e31) this.b).m(str);
    }

    public final void l(w4a w4aVar) {
        w4aVar.getClass();
        uyc uycVar = (uyc) this.d;
        e31 e31Var = (e31) this.b;
        e31Var.b = false;
        e31Var.l(uycVar.b);
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
        if (!((qu2) this.f).h && !z) {
            return false;
        }
        kk7 kk7Var = (kk7) this.e;
        if (kk7Var != null) {
            kk7Var.n((su2) this.b, kk7.N);
        }
        Handler handler = (Handler) this.c;
        if (handler != null) {
            handler.removeCallbacks((mk2) this.g);
        }
        this.a = true;
        h45 h45Var = (h45) this.d;
        LaunchActivity launchActivity = (LaunchActivity) h45Var.b;
        Intent intent = (Intent) h45Var.c;
        String str = LaunchActivity.C1;
        launchActivity.V(intent, true, false, false, null, true, false);
        return true;
    }

    public final boolean p(w4a w4aVar) {
        return false;
    }

    public c30(e31 e31Var, lu5 lu5Var, uyc uycVar, c30[] c30VarArr) {
        this.b = e31Var;
        this.c = lu5Var;
        this.d = uycVar;
        this.e = c30VarArr;
        int ordinal = uycVar.ordinal();
        if (c30VarArr != null) {
            c30 c30Var = c30VarArr[ordinal];
            if (c30Var == null && c30Var == this) {
                return;
            }
            c30VarArr[ordinal] = this;
        }
    }
}
