// default package

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class iq7 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final int g;
    public final boolean h;

    public iq7(hq7 hq7Var) {
        boolean z;
        boolean e;
        byte b;
        byte b2;
        byte b3;
        byte b4 = hq7Var.a;
        ByteBuffer byteBuffer = hq7Var.b;
        boolean z2 = true;
        jte.f(b4 == 1);
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        ye1 ye1Var = new ye1(remaining, bArr);
        this.g = ye1Var.f(3);
        ye1Var.m();
        boolean e2 = ye1Var.e();
        this.a = e2;
        if (e2) {
            ye1Var.f(5);
            this.b = false;
            this.h = false;
        } else {
            if (ye1Var.e()) {
                ye1Var.n(64);
                if (ye1Var.e()) {
                    int i = 0;
                    while (!ye1Var.e()) {
                        i++;
                    }
                    if (i < 32) {
                        ye1Var.n(i);
                    }
                }
                boolean e3 = ye1Var.e();
                this.b = e3;
                if (e3) {
                    ye1Var.n(47);
                }
            } else {
                this.b = false;
            }
            this.h = ye1Var.e();
            int f = ye1Var.f(5);
            for (int i2 = 0; i2 <= f; i2++) {
                ye1Var.n(12);
                if (i2 == 0) {
                    if (ye1Var.f(5) > 7) {
                        ye1Var.e();
                    }
                } else if (ye1Var.f(5) > 7) {
                    ye1Var.m();
                }
                if (this.b) {
                    ye1Var.m();
                }
                if (this.h && ye1Var.e()) {
                    if (i2 == 0) {
                        ye1Var.f(4);
                    } else {
                        ye1Var.n(4);
                    }
                }
            }
        }
        int f2 = ye1Var.f(4);
        int f3 = ye1Var.f(4);
        ye1Var.n(f2 + 1);
        ye1Var.n(f3 + 1);
        if (this.a) {
            this.c = false;
            z = false;
        } else {
            z = ye1Var.e();
            this.c = z;
        }
        if (z) {
            ye1Var.n(4);
            ye1Var.n(3);
        }
        ye1Var.n(3);
        if (this.a) {
            this.e = true;
            this.d = true;
            this.f = 0;
        } else {
            ye1Var.n(4);
            boolean e4 = ye1Var.e();
            if (e4) {
                ye1Var.n(2);
            }
            if (ye1Var.e()) {
                this.d = true;
                e = true;
            } else {
                e = ye1Var.e();
                this.d = e;
            }
            if (!e) {
                this.e = true;
            } else if (ye1Var.e()) {
                this.e = true;
            } else {
                this.e = ye1Var.e();
            }
            if (e4) {
                this.f = ye1Var.f(3) + 1;
            } else {
                this.f = 0;
            }
        }
        ye1Var.n(3);
        boolean e5 = (this.g == 2 && ye1Var.e()) ? ye1Var.e() : false;
        boolean e6 = this.g != 1 ? ye1Var.e() : false;
        if (ye1Var.e()) {
            b2 = (byte) ye1Var.f(8);
            b3 = (byte) ye1Var.f(8);
            b = (byte) ye1Var.f(8);
        } else {
            b = 0;
            b2 = 0;
            b3 = 0;
        }
        if (e6) {
            ye1Var.m();
        } else if (b2 != 1 || b3 != 13 || b != 0) {
            ye1Var.m();
            int i3 = this.g;
            if (i3 == 0) {
                r1 = true;
            } else if (i3 == 1) {
                z2 = false;
            } else if (e5) {
                boolean e7 = ye1Var.e();
                z2 = e7 ? ye1Var.e() : false;
                r1 = e7;
            } else {
                z2 = false;
                r1 = true;
            }
            if (r1 && z2) {
                ye1Var.f(2);
            }
        }
        ye1Var.m();
    }
}
