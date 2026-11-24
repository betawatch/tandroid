// default package

import android.widget.SeekBar;
import j$.util.DesugarCollections;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class hu6 extends zv6 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dq b;

    public /* synthetic */ hu6(dq dqVar, byte b) {
        this.a = b;
        this.b = dqVar;
    }

    @Override // zv6
    public final void d(ew6 ew6Var) {
        byte b = this.a;
        dq dqVar = this.b;
        switch (b) {
            case 0:
                ((ku6) dqVar).f();
                break;
            case 2:
                ((gv6) dqVar).e();
                break;
            case 3:
                ((rv6) dqVar).n();
                break;
        }
    }

    @Override // zv6
    public final void e(ew6 ew6Var) {
        k44 b;
        tv6 tv6Var;
        byte b2 = this.a;
        dq dqVar = this.b;
        switch (b2) {
            case 0:
                ((ku6) dqVar).f();
                break;
            case 1:
                ((wu6) dqVar).q(true);
                break;
            case 2:
                ((gv6) dqVar).e();
                break;
            default:
                rv6 rv6Var = (rv6) dqVar;
                if (ew6Var == rv6Var.r && ew6.a() != null) {
                    dw6 dw6Var = ew6Var.a;
                    gw6.b();
                    for (ew6 ew6Var2 : DesugarCollections.unmodifiableList(dw6Var.b)) {
                        if (!DesugarCollections.unmodifiableList(rv6Var.r.v).contains(ew6Var2) && (b = rv6Var.r.b(ew6Var2)) != null && (tv6Var = (tv6) b.b) != null && tv6Var.d && !rv6Var.w.contains(ew6Var2)) {
                            rv6Var.o();
                            rv6Var.l();
                            break;
                        }
                    }
                }
                rv6Var.n();
                break;
        }
    }

    @Override // zv6
    public final void f(ew6 ew6Var) {
        byte b = this.a;
        dq dqVar = this.b;
        switch (b) {
            case 0:
                ((ku6) dqVar).f();
                break;
            case 2:
                ((gv6) dqVar).e();
                break;
            case 3:
                ((rv6) dqVar).n();
                break;
        }
    }

    @Override // zv6
    public final void g(ew6 ew6Var) {
        byte b = this.a;
        dq dqVar = this.b;
        switch (b) {
            case 0:
                ((ku6) dqVar).dismiss();
                break;
            case 2:
                ((gv6) dqVar).dismiss();
                break;
            case 3:
                rv6 rv6Var = (rv6) dqVar;
                rv6Var.r = ew6Var;
                rv6Var.o();
                rv6Var.l();
                break;
        }
    }

    @Override // zv6
    public final void i() {
        byte b = this.a;
        dq dqVar = this.b;
        switch (b) {
            case 1:
                ((wu6) dqVar).q(false);
                break;
            case 3:
                ((rv6) dqVar).n();
                break;
        }
    }

    @Override // zv6
    public final void k(ew6 ew6Var) {
        jv6 jv6Var;
        byte b = this.a;
        dq dqVar = this.b;
        switch (b) {
            case 1:
                wu6 wu6Var = (wu6) dqVar;
                SeekBar seekBar = (SeekBar) wu6Var.i0.get(ew6Var);
                int i = ew6Var.p;
                short s = wu6.G0;
                if (seekBar != null && wu6Var.d0 != ew6Var) {
                    seekBar.setProgress(i);
                    break;
                }
                break;
            case 3:
                int i2 = rv6.k0;
                rv6 rv6Var = (rv6) dqVar;
                if (rv6Var.N != ew6Var && (jv6Var = (jv6) rv6Var.M.get(ew6Var.c)) != null) {
                    int i3 = jv6Var.v.p;
                    jv6Var.u(i3 == 0);
                    jv6Var.x.setProgress(i3);
                    break;
                }
                break;
        }
    }
}
