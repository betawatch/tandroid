package i2;

import a8.ia;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class r {
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

    public r(q qVar) {
        int i7 = qVar.a;
        ByteBuffer byteBuffer = qVar.b;
        ia.f(i7 == 1);
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        d4.f fVar = new d4.f(bArr, remaining);
        this.g = fVar.j(3);
        fVar.K();
        boolean i10 = fVar.i();
        this.a = i10;
        if (i10) {
            fVar.j(5);
            this.b = false;
            this.h = false;
        } else {
            if (fVar.i()) {
                fVar.L(64);
                if (fVar.i()) {
                    int i11 = 0;
                    while (!fVar.i()) {
                        i11++;
                    }
                    if (i11 < 32) {
                        fVar.L(i11);
                    }
                }
                boolean i12 = fVar.i();
                this.b = i12;
                if (i12) {
                    fVar.L(47);
                }
            } else {
                this.b = false;
            }
            this.h = fVar.i();
            int j3 = fVar.j(5);
            for (int i13 = 0; i13 <= j3; i13++) {
                fVar.L(12);
                if (i13 == 0) {
                    if (fVar.j(5) > 7) {
                        fVar.i();
                    }
                } else if (fVar.j(5) > 7) {
                    fVar.K();
                }
                if (this.b) {
                    fVar.K();
                }
                if (this.h && fVar.i()) {
                    if (i13 == 0) {
                        fVar.j(4);
                    } else {
                        fVar.L(4);
                    }
                }
            }
        }
        int j10 = fVar.j(4);
        int j11 = fVar.j(4);
        fVar.L(j10 + 1);
        fVar.L(j11 + 1);
        if (this.a) {
            this.c = false;
        } else {
            this.c = fVar.i();
        }
        if (this.c) {
            fVar.L(4);
            fVar.L(3);
        }
        fVar.L(3);
        if (this.a) {
            this.e = true;
            this.d = true;
            this.f = 0;
        } else {
            fVar.L(4);
            boolean i14 = fVar.i();
            if (i14) {
                fVar.L(2);
            }
            if (fVar.i()) {
                this.d = true;
            } else {
                this.d = fVar.i();
            }
            if (!this.d) {
                this.e = true;
            } else if (fVar.i()) {
                this.e = true;
            } else {
                this.e = fVar.i();
            }
            if (i14) {
                this.f = fVar.j(3) + 1;
            } else {
                this.f = 0;
            }
        }
        fVar.L(3);
        boolean i15 = fVar.i();
        if (this.g == 2 && i15) {
            this.i = fVar.i();
        } else {
            this.i = false;
        }
        if (this.g != 1) {
            this.j = fVar.i();
        } else {
            this.j = false;
        }
        if (fVar.i()) {
            this.m = (byte) fVar.j(8);
            this.n = (byte) fVar.j(8);
            this.o = (byte) fVar.j(8);
        } else {
            this.m = (byte) 0;
            this.n = (byte) 0;
            this.o = (byte) 0;
        }
        if (this.j) {
            fVar.K();
            this.k = false;
            this.l = false;
        } else if (this.m == 1 && this.n == 13 && this.o == 0) {
            this.k = false;
            this.l = false;
        } else {
            fVar.K();
            int i16 = this.g;
            if (i16 == 0) {
                this.k = true;
                this.l = true;
            } else if (i16 == 1) {
                this.k = false;
                this.l = false;
            } else if (this.i) {
                boolean i17 = fVar.i();
                this.k = i17;
                if (i17) {
                    this.l = fVar.i();
                } else {
                    this.l = false;
                }
            } else {
                this.k = true;
                this.l = false;
            }
            if (this.k && this.l) {
                fVar.j(2);
            }
        }
        fVar.K();
    }
}
