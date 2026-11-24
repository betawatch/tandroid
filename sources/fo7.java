// default package

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class fo7 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final int g;
    public final boolean h;

    public fo7(eo7 eo7Var) {
        boolean z;
        boolean e;
        byte b;
        byte b2;
        byte b3;
        byte b4 = eo7Var.a;
        ByteBuffer byteBuffer = eo7Var.b;
        boolean z2 = true;
        gre.f(b4 == 1);
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        qd1 qd1Var = new qd1(remaining, bArr);
        this.g = qd1Var.f(3);
        qd1Var.m();
        boolean e2 = qd1Var.e();
        this.a = e2;
        if (e2) {
            qd1Var.f(5);
            this.b = false;
            this.h = false;
        } else {
            if (qd1Var.e()) {
                qd1Var.n(64);
                if (qd1Var.e()) {
                    int i = 0;
                    while (!qd1Var.e()) {
                        i++;
                    }
                    if (i < 32) {
                        qd1Var.n(i);
                    }
                }
                boolean e3 = qd1Var.e();
                this.b = e3;
                if (e3) {
                    qd1Var.n(47);
                }
            } else {
                this.b = false;
            }
            this.h = qd1Var.e();
            int f = qd1Var.f(5);
            for (int i2 = 0; i2 <= f; i2++) {
                qd1Var.n(12);
                if (i2 == 0) {
                    if (qd1Var.f(5) > 7) {
                        qd1Var.e();
                    }
                } else if (qd1Var.f(5) > 7) {
                    qd1Var.m();
                }
                if (this.b) {
                    qd1Var.m();
                }
                if (this.h && qd1Var.e()) {
                    if (i2 == 0) {
                        qd1Var.f(4);
                    } else {
                        qd1Var.n(4);
                    }
                }
            }
        }
        int f2 = qd1Var.f(4);
        int f3 = qd1Var.f(4);
        qd1Var.n(f2 + 1);
        qd1Var.n(f3 + 1);
        if (this.a) {
            this.c = false;
            z = false;
        } else {
            z = qd1Var.e();
            this.c = z;
        }
        if (z) {
            qd1Var.n(4);
            qd1Var.n(3);
        }
        qd1Var.n(3);
        if (this.a) {
            this.e = true;
            this.d = true;
            this.f = 0;
        } else {
            qd1Var.n(4);
            boolean e4 = qd1Var.e();
            if (e4) {
                qd1Var.n(2);
            }
            if (qd1Var.e()) {
                this.d = true;
                e = true;
            } else {
                e = qd1Var.e();
                this.d = e;
            }
            if (!e) {
                this.e = true;
            } else if (qd1Var.e()) {
                this.e = true;
            } else {
                this.e = qd1Var.e();
            }
            if (e4) {
                this.f = qd1Var.f(3) + 1;
            } else {
                this.f = 0;
            }
        }
        qd1Var.n(3);
        boolean e5 = (this.g == 2 && qd1Var.e()) ? qd1Var.e() : false;
        boolean e6 = this.g != 1 ? qd1Var.e() : false;
        if (qd1Var.e()) {
            b2 = (byte) qd1Var.f(8);
            b3 = (byte) qd1Var.f(8);
            b = (byte) qd1Var.f(8);
        } else {
            b = 0;
            b2 = 0;
            b3 = 0;
        }
        if (e6) {
            qd1Var.m();
        } else if (b2 != 1 || b3 != 13 || b != 0) {
            qd1Var.m();
            int i3 = this.g;
            if (i3 == 0) {
                r1 = true;
            } else if (i3 == 1) {
                z2 = false;
            } else if (e5) {
                boolean e7 = qd1Var.e();
                z2 = e7 ? qd1Var.e() : false;
                r1 = e7;
            } else {
                z2 = false;
                r1 = true;
            }
            if (r1 && z2) {
                qd1Var.f(2);
            }
        }
        qd1Var.m();
    }
}
