// default package

import android.widget.SeekBar;
import j$.util.DesugarCollections;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class gs6 extends zt6 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dp b;

    public /* synthetic */ gs6(dp dpVar, byte b) {
        this.a = b;
        this.b = dpVar;
    }

    @Override // zt6
    public final void d(eu6 eu6Var) {
        byte b = this.a;
        dp dpVar = this.b;
        switch (b) {
            case 0:
                ((js6) dpVar).f();
                break;
            case 2:
                ((gt6) dpVar).e();
                break;
            case 3:
                ((rt6) dpVar).n();
                break;
        }
    }

    @Override // zt6
    public final void e(eu6 eu6Var) {
        pj4 b;
        tt6 tt6Var;
        byte b2 = this.a;
        dp dpVar = this.b;
        switch (b2) {
            case 0:
                ((js6) dpVar).f();
                break;
            case 1:
                ((ws6) dpVar).q(true);
                break;
            case 2:
                ((gt6) dpVar).e();
                break;
            default:
                rt6 rt6Var = (rt6) dpVar;
                if (eu6Var == rt6Var.r && eu6.a() != null) {
                    du6 du6Var = eu6Var.a;
                    gu6.b();
                    for (eu6 eu6Var2 : DesugarCollections.unmodifiableList(du6Var.b)) {
                        if (!DesugarCollections.unmodifiableList(rt6Var.r.v).contains(eu6Var2) && (b = rt6Var.r.b(eu6Var2)) != null && (tt6Var = (tt6) b.b) != null && tt6Var.d && !rt6Var.w.contains(eu6Var2)) {
                            rt6Var.o();
                            rt6Var.l();
                            break;
                        }
                    }
                }
                rt6Var.n();
                break;
        }
    }

    @Override // zt6
    public final void f(eu6 eu6Var) {
        byte b = this.a;
        dp dpVar = this.b;
        switch (b) {
            case 0:
                ((js6) dpVar).f();
                break;
            case 2:
                ((gt6) dpVar).e();
                break;
            case 3:
                ((rt6) dpVar).n();
                break;
        }
    }

    @Override // zt6
    public final void g(eu6 eu6Var) {
        byte b = this.a;
        dp dpVar = this.b;
        switch (b) {
            case 0:
                ((js6) dpVar).dismiss();
                break;
            case 2:
                ((gt6) dpVar).dismiss();
                break;
            case 3:
                rt6 rt6Var = (rt6) dpVar;
                rt6Var.r = eu6Var;
                rt6Var.o();
                rt6Var.l();
                break;
        }
    }

    @Override // zt6
    public final void i() {
        byte b = this.a;
        dp dpVar = this.b;
        switch (b) {
            case 1:
                ((ws6) dpVar).q(false);
                break;
            case 3:
                ((rt6) dpVar).n();
                break;
        }
    }

    @Override // zt6
    public final void k(eu6 eu6Var) {
        jt6 jt6Var;
        byte b = this.a;
        dp dpVar = this.b;
        switch (b) {
            case 1:
                ws6 ws6Var = (ws6) dpVar;
                SeekBar seekBar = (SeekBar) ws6Var.i0.get(eu6Var);
                int i = eu6Var.p;
                short s = ws6.G0;
                if (seekBar != null && ws6Var.d0 != eu6Var) {
                    seekBar.setProgress(i);
                    break;
                }
                break;
            case 3:
                int i2 = rt6.k0;
                rt6 rt6Var = (rt6) dpVar;
                if (rt6Var.N != eu6Var && (jt6Var = (jt6) rt6Var.M.get(eu6Var.c)) != null) {
                    int i3 = jt6Var.v.p;
                    jt6Var.u(i3 == 0);
                    jt6Var.x.setProgress(i3);
                    break;
                }
                break;
        }
    }
}
