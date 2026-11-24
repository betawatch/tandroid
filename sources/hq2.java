// default package

import j$.util.Objects;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class hq2 implements vx6, wq3 {
    public final Integer a;
    public kp b;
    public vq3 c;
    public final /* synthetic */ jq2 d;

    public hq2(jq2 jq2Var, Integer num) {
        this.d = jq2Var;
        this.b = jq2Var.b(null);
        this.c = new vq3(jq2Var.d.c, 0, null);
        this.a = num;
    }

    @Override // wq3
    public final void I(int i, rx6 rx6Var) {
        if (a(i, rx6Var)) {
            this.c.e();
        }
    }

    @Override // wq3
    public final void N(int i, rx6 rx6Var, vi2 vi2Var) {
        if (a(i, rx6Var)) {
            this.c.a(vi2Var);
        }
    }

    @Override // vx6
    public final void O(int i, rx6 rx6Var, f86 f86Var, fr6 fr6Var, int i2) {
        if (a(i, rx6Var)) {
            kp kpVar = this.b;
            kpVar.h(new zm((Object) kpVar, (Object) f86Var, (Object) b(fr6Var, rx6Var), i2, (byte) 5));
        }
    }

    public final boolean a(int i, rx6 rx6Var) {
        rx6 rx6Var2;
        Integer num = this.a;
        jq2 jq2Var = this.d;
        if (rx6Var != null) {
            rx6Var2 = jq2Var.u(num, rx6Var);
            if (rx6Var2 == null) {
                return false;
            }
        } else {
            rx6Var2 = null;
        }
        int w = jq2Var.w(i, num);
        kp kpVar = this.b;
        if (kpVar.b != w || !Objects.equals((rx6) kpVar.c, rx6Var2)) {
            this.b = new kp((CopyOnWriteArrayList) jq2Var.c.d, w, rx6Var2);
        }
        vq3 vq3Var = this.c;
        if (vq3Var.a == w && Objects.equals(vq3Var.b, rx6Var2)) {
            return true;
        }
        this.c = new vq3(jq2Var.d.c, w, rx6Var2);
        return true;
    }

    public final fr6 b(fr6 fr6Var, rx6 rx6Var) {
        long j = fr6Var.f;
        jq2 jq2Var = this.d;
        Integer num = this.a;
        long v = jq2Var.v(j, num);
        long j2 = fr6Var.g;
        long v2 = jq2Var.v(j2, num);
        return (v == j && v2 == j2) ? fr6Var : new fr6(fr6Var.a, fr6Var.b, fr6Var.c, fr6Var.d, fr6Var.e, v, v2);
    }

    @Override // wq3
    public final void i(int i, rx6 rx6Var, Exception exc) {
        if (a(i, rx6Var)) {
            this.c.d(exc);
        }
    }

    @Override // vx6
    public final void j(int i, rx6 rx6Var, fr6 fr6Var) {
        if (a(i, rx6Var)) {
            kp kpVar = this.b;
            kpVar.h(new dx6((Object) kpVar, (Object) b(fr6Var, rx6Var), (byte) 2));
        }
    }

    @Override // vx6
    public final void k(int i, rx6 rx6Var, fr6 fr6Var) {
        if (a(i, rx6Var)) {
            kp kpVar = this.b;
            fr6 b = b(fr6Var, rx6Var);
            rx6 rx6Var2 = (rx6) kpVar.c;
            rx6Var2.getClass();
            kpVar.h(new lt2((Object) kpVar, (Object) rx6Var2, (Object) b, (byte) 18));
        }
    }

    @Override // wq3
    public final void n(int i, rx6 rx6Var, int i2) {
        if (a(i, rx6Var)) {
            this.c.c(i2);
        }
    }

    @Override // vx6
    public final void s(int i, rx6 rx6Var, f86 f86Var, fr6 fr6Var) {
        if (a(i, rx6Var)) {
            kp kpVar = this.b;
            kpVar.h(new tx6(kpVar, f86Var, b(fr6Var, rx6Var), (byte) 1));
        }
    }

    @Override // vx6
    public final void u(int i, rx6 rx6Var, f86 f86Var, fr6 fr6Var) {
        if (a(i, rx6Var)) {
            kp kpVar = this.b;
            kpVar.h(new tx6(kpVar, f86Var, b(fr6Var, rx6Var), (byte) 0));
        }
    }

    @Override // vx6
    public final void w(int i, rx6 rx6Var, f86 f86Var, fr6 fr6Var, IOException iOException, boolean z) {
        if (a(i, rx6Var)) {
            kp kpVar = this.b;
            kpVar.h(new pf(kpVar, f86Var, b(fr6Var, rx6Var), iOException, z));
        }
    }

    @Override // wq3
    public final void y(int i, rx6 rx6Var) {
        if (a(i, rx6Var)) {
            this.c.b();
        }
    }
}
