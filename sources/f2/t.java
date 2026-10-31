package f2;

import java.nio.ByteBuffer;
import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class t {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final int g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final byte m;
    public final byte n;
    public final byte o;

    public t(s sVar) {
        int i10 = sVar.a;
        ByteBuffer byteBuffer = sVar.b;
        t6.f(i10 == 1);
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        a4.g gVar = new a4.g(bArr, remaining);
        this.g = gVar.i(3);
        gVar.e0();
        boolean h = gVar.h();
        this.a = h;
        if (h) {
            gVar.i(5);
            this.b = false;
            this.h = false;
        } else {
            if (gVar.h()) {
                gVar.f0(64);
                if (gVar.h()) {
                    int i11 = 0;
                    while (!gVar.h()) {
                        i11++;
                    }
                    if (i11 < 32) {
                        gVar.f0(i11);
                    }
                }
                boolean h10 = gVar.h();
                this.b = h10;
                if (h10) {
                    gVar.f0(47);
                }
            } else {
                this.b = false;
            }
            this.h = gVar.h();
            int i12 = gVar.i(5);
            for (int i13 = 0; i13 <= i12; i13++) {
                gVar.f0(12);
                if (i13 == 0) {
                    if (gVar.i(5) > 7) {
                        gVar.h();
                    }
                } else if (gVar.i(5) > 7) {
                    gVar.e0();
                }
                if (this.b) {
                    gVar.e0();
                }
                if (this.h && gVar.h()) {
                    if (i13 == 0) {
                        gVar.i(4);
                    } else {
                        gVar.f0(4);
                    }
                }
            }
        }
        int i14 = gVar.i(4);
        int i15 = gVar.i(4);
        gVar.f0(i14 + 1);
        gVar.f0(i15 + 1);
        if (this.a) {
            this.c = false;
        } else {
            this.c = gVar.h();
        }
        if (this.c) {
            gVar.f0(4);
            gVar.f0(3);
        }
        gVar.f0(3);
        if (this.a) {
            this.e = true;
            this.d = true;
            this.f = 0;
        } else {
            gVar.f0(4);
            boolean h11 = gVar.h();
            if (h11) {
                gVar.f0(2);
            }
            if (gVar.h()) {
                this.d = true;
            } else {
                this.d = gVar.h();
            }
            if (!this.d) {
                this.e = true;
            } else if (gVar.h()) {
                this.e = true;
            } else {
                this.e = gVar.h();
            }
            if (h11) {
                this.f = gVar.i(3) + 1;
            } else {
                this.f = 0;
            }
        }
        gVar.f0(3);
        boolean h12 = gVar.h();
        if (this.g == 2 && h12) {
            this.i = gVar.h();
        } else {
            this.i = false;
        }
        if (this.g != 1) {
            this.j = gVar.h();
        } else {
            this.j = false;
        }
        if (gVar.h()) {
            this.m = (byte) gVar.i(8);
            this.n = (byte) gVar.i(8);
            this.o = (byte) gVar.i(8);
        } else {
            this.m = (byte) 0;
            this.n = (byte) 0;
            this.o = (byte) 0;
        }
        if (this.j) {
            gVar.e0();
            this.k = false;
            this.l = false;
        } else if (this.m == 1 && this.n == 13 && this.o == 0) {
            this.k = false;
            this.l = false;
        } else {
            gVar.e0();
            int i16 = this.g;
            if (i16 == 0) {
                this.k = true;
                this.l = true;
            } else if (i16 == 1) {
                this.k = false;
                this.l = false;
            } else if (this.i) {
                boolean h13 = gVar.h();
                this.k = h13;
                if (h13) {
                    this.l = gVar.h();
                } else {
                    this.l = false;
                }
            } else {
                this.k = true;
                this.l = false;
            }
            if (this.k && this.l) {
                gVar.i(2);
            }
        }
        gVar.e0();
    }
}
