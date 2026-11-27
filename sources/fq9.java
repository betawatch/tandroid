// default package

import j$.util.Objects;
import org.telegram.messenger.a;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final /* synthetic */ class fq9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kq9 b;

    public /* synthetic */ fq9(kq9 kq9Var, byte b) {
        this.a = b;
        this.b = kq9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        kq9 kq9Var = this.b;
        switch (b) {
            case 0:
                kq9Var.Q = null;
                kq9Var.J();
                break;
            default:
                boolean z = kq9Var.w;
                if (!z) {
                    rr9 rr9Var = kq9Var.O;
                    if (rr9Var == null) {
                        kq9Var.P = false;
                        if (!z && rr9Var == null) {
                            byte b2 = 3;
                            if (!kq9Var.G) {
                                kq9Var.G = true;
                                hl.c3(new u96(kq9Var, b2));
                            }
                            rr9 rr9Var2 = new rr9(kq9Var.e, kq9Var.f, kq9Var.k(), new iq9(kq9Var));
                            kq9Var.O = rr9Var2;
                            qr9 qr9Var = kq9Var.U;
                            jq9 jq9Var = qr9Var != null ? new jq9(kq9Var, qr9Var) : null;
                            kq9Var.V = jq9Var;
                            rr9Var2.l(jq9Var, null);
                            rr9 rr9Var3 = kq9Var.O;
                            float f = kq9Var.H;
                            rr9Var3.getClass();
                            rr9Var3.b.post(new jt(rr9Var3, f, (byte) 5));
                            kq9Var.O.k(a.o());
                            rr9 rr9Var4 = kq9Var.O;
                            rr9Var4.getClass();
                            rr9Var4.b.post(new hq9(rr9Var4, b2));
                            break;
                        }
                    } else if (kq9Var.P) {
                        kq9Var.P = false;
                        xz0 xz0Var = rr9Var.e;
                        Objects.requireNonNull(xz0Var);
                        rr9Var.b.post(new gz0(xz0Var, (byte) 7));
                        break;
                    }
                }
                break;
        }
    }
}
