package f2;

import java.nio.ByteBuffer;
import v7.u6;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class s {
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

    public s(r rVar) {
        int i10 = rVar.a;
        ByteBuffer byteBuffer = rVar.b;
        u6.g(i10 == 1);
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        a4.g gVar = new a4.g(bArr, remaining);
        this.g = gVar.g(3);
        gVar.n();
        boolean f7 = gVar.f();
        this.a = f7;
        if (f7) {
            gVar.g(5);
            this.b = false;
            this.h = false;
        } else {
            if (gVar.f()) {
                gVar.o(64);
                if (gVar.f()) {
                    int i11 = 0;
                    while (!gVar.f()) {
                        i11++;
                    }
                    if (i11 < 32) {
                        gVar.o(i11);
                    }
                }
                boolean f10 = gVar.f();
                this.b = f10;
                if (f10) {
                    gVar.o(47);
                }
            } else {
                this.b = false;
            }
            this.h = gVar.f();
            int g10 = gVar.g(5);
            for (int i12 = 0; i12 <= g10; i12++) {
                gVar.o(12);
                if (i12 == 0) {
                    if (gVar.g(5) > 7) {
                        gVar.f();
                    }
                } else if (gVar.g(5) > 7) {
                    gVar.n();
                }
                if (this.b) {
                    gVar.n();
                }
                if (this.h && gVar.f()) {
                    if (i12 == 0) {
                        gVar.g(4);
                    } else {
                        gVar.o(4);
                    }
                }
            }
        }
        int g11 = gVar.g(4);
        int g12 = gVar.g(4);
        gVar.o(g11 + 1);
        gVar.o(g12 + 1);
        if (this.a) {
            this.c = false;
        } else {
            this.c = gVar.f();
        }
        if (this.c) {
            gVar.o(4);
            gVar.o(3);
        }
        gVar.o(3);
        if (this.a) {
            this.e = true;
            this.d = true;
            this.f = 0;
        } else {
            gVar.o(4);
            boolean f11 = gVar.f();
            if (f11) {
                gVar.o(2);
            }
            if (gVar.f()) {
                this.d = true;
            } else {
                this.d = gVar.f();
            }
            if (!this.d) {
                this.e = true;
            } else if (gVar.f()) {
                this.e = true;
            } else {
                this.e = gVar.f();
            }
            if (f11) {
                this.f = gVar.g(3) + 1;
            } else {
                this.f = 0;
            }
        }
        gVar.o(3);
        boolean f12 = gVar.f();
        if (this.g == 2 && f12) {
            this.i = gVar.f();
        } else {
            this.i = false;
        }
        if (this.g != 1) {
            this.j = gVar.f();
        } else {
            this.j = false;
        }
        if (gVar.f()) {
            this.m = (byte) gVar.g(8);
            this.n = (byte) gVar.g(8);
            this.o = (byte) gVar.g(8);
        } else {
            this.m = (byte) 0;
            this.n = (byte) 0;
            this.o = (byte) 0;
        }
        if (this.j) {
            gVar.n();
            this.k = false;
            this.l = false;
        } else if (this.m == 1 && this.n == 13 && this.o == 0) {
            this.k = false;
            this.l = false;
        } else {
            gVar.n();
            int i13 = this.g;
            if (i13 == 0) {
                this.k = true;
                this.l = true;
            } else if (i13 == 1) {
                this.k = false;
                this.l = false;
            } else if (this.i) {
                boolean f13 = gVar.f();
                this.k = f13;
                if (f13) {
                    this.l = gVar.f();
                } else {
                    this.l = false;
                }
            } else {
                this.k = true;
                this.l = false;
            }
            if (this.k && this.l) {
                gVar.g(2);
            }
        }
        gVar.n();
    }
}
