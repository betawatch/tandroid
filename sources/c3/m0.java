package c3;

import v7.u6;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final class m0 {
    public final byte[] a = new byte[10];
    public boolean b;
    public int c;
    public long d;
    public int e;
    public int f;
    public int g;

    public final void a(l0 l0Var, k0 k0Var) {
        if (this.c > 0) {
            l0Var.c(this.d, this.e, this.f, this.g, k0Var);
            this.c = 0;
        }
    }

    public final void b(l0 l0Var, long j10, int i10, int i11, int i12, k0 k0Var) {
        u6.o("TrueHD chunk samples must be contiguous in the sample queue.", this.g <= i11 + i12);
        if (this.b) {
            int i13 = this.c;
            int i14 = i13 + 1;
            this.c = i14;
            if (i13 == 0) {
                this.d = j10;
                this.e = i10;
                this.f = 0;
            }
            this.f += i11;
            this.g = i12;
            if (i14 >= 16) {
                a(l0Var, k0Var);
            }
        }
    }

    public final void c(r rVar) {
        if (this.b) {
            return;
        }
        byte[] bArr = this.a;
        rVar.a(0, 10, bArr);
        rVar.q();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b10 = bArr[7];
            if ((b10 & 254) == 186) {
                r1 = 40 << ((bArr[((b10 & 255) == 187 ? 1 : 0) != 0 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        if (r1 == 0) {
            return;
        }
        this.b = true;
    }
}
