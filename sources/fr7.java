// default package

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class fr7 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final int g;
    public final boolean h;

    public fr7(er7 er7Var) {
        boolean z;
        boolean e;
        byte b;
        byte b2;
        byte b3;
        byte b4 = er7Var.a;
        ByteBuffer byteBuffer = er7Var.b;
        boolean z2 = true;
        yve.f(b4 == 1);
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        zd1 zd1Var = new zd1(remaining, bArr);
        this.g = zd1Var.f(3);
        zd1Var.m();
        boolean e2 = zd1Var.e();
        this.a = e2;
        if (e2) {
            zd1Var.f(5);
            this.b = false;
            this.h = false;
        } else {
            if (zd1Var.e()) {
                zd1Var.n(64);
                if (zd1Var.e()) {
                    int i = 0;
                    while (!zd1Var.e()) {
                        i++;
                    }
                    if (i < 32) {
                        zd1Var.n(i);
                    }
                }
                boolean e3 = zd1Var.e();
                this.b = e3;
                if (e3) {
                    zd1Var.n(47);
                }
            } else {
                this.b = false;
            }
            this.h = zd1Var.e();
            int f = zd1Var.f(5);
            for (int i2 = 0; i2 <= f; i2++) {
                zd1Var.n(12);
                if (i2 == 0) {
                    if (zd1Var.f(5) > 7) {
                        zd1Var.e();
                    }
                } else if (zd1Var.f(5) > 7) {
                    zd1Var.m();
                }
                if (this.b) {
                    zd1Var.m();
                }
                if (this.h && zd1Var.e()) {
                    if (i2 == 0) {
                        zd1Var.f(4);
                    } else {
                        zd1Var.n(4);
                    }
                }
            }
        }
        int f2 = zd1Var.f(4);
        int f3 = zd1Var.f(4);
        zd1Var.n(f2 + 1);
        zd1Var.n(f3 + 1);
        if (this.a) {
            this.c = false;
            z = false;
        } else {
            z = zd1Var.e();
            this.c = z;
        }
        if (z) {
            zd1Var.n(4);
            zd1Var.n(3);
        }
        zd1Var.n(3);
        if (this.a) {
            this.e = true;
            this.d = true;
            this.f = 0;
        } else {
            zd1Var.n(4);
            boolean e4 = zd1Var.e();
            if (e4) {
                zd1Var.n(2);
            }
            if (zd1Var.e()) {
                this.d = true;
                e = true;
            } else {
                e = zd1Var.e();
                this.d = e;
            }
            if (!e) {
                this.e = true;
            } else if (zd1Var.e()) {
                this.e = true;
            } else {
                this.e = zd1Var.e();
            }
            if (e4) {
                this.f = zd1Var.f(3) + 1;
            } else {
                this.f = 0;
            }
        }
        zd1Var.n(3);
        boolean e5 = (this.g == 2 && zd1Var.e()) ? zd1Var.e() : false;
        boolean e6 = this.g != 1 ? zd1Var.e() : false;
        if (zd1Var.e()) {
            b2 = (byte) zd1Var.f(8);
            b3 = (byte) zd1Var.f(8);
            b = (byte) zd1Var.f(8);
        } else {
            b = 0;
            b2 = 0;
            b3 = 0;
        }
        if (e6) {
            zd1Var.m();
        } else if (b2 != 1 || b3 != 13 || b != 0) {
            zd1Var.m();
            int i3 = this.g;
            if (i3 == 0) {
                r1 = true;
            } else if (i3 == 1) {
                z2 = false;
            } else if (e5) {
                boolean e7 = zd1Var.e();
                z2 = e7 ? zd1Var.e() : false;
                r1 = e7;
            } else {
                z2 = false;
                r1 = true;
            }
            if (r1 && z2) {
                zd1Var.f(2);
            }
        }
        zd1Var.m();
    }
}
