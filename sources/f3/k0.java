package f3;

import a8.ia;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class k0 {
    public final byte[] a = new byte[10];
    public boolean b;
    public int c;
    public long d;
    public int e;
    public int f;
    public int g;

    public final void a(j0 j0Var, i0 i0Var) {
        if (this.c > 0) {
            j0Var.c(this.d, this.e, this.f, this.g, i0Var);
            this.c = 0;
        }
    }

    public final void b(j0 j0Var, long j3, int i7, int i10, int i11, i0 i0Var) {
        ia.o("TrueHD chunk samples must be contiguous in the sample queue.", this.g <= i10 + i11);
        if (this.b) {
            int i12 = this.c;
            int i13 = i12 + 1;
            this.c = i13;
            if (i12 == 0) {
                this.d = j3;
                this.e = i7;
                this.f = 0;
            }
            this.f += i10;
            this.g = i11;
            if (i13 >= 16) {
                a(j0Var, i0Var);
            }
        }
    }

    public final void c(p pVar) {
        if (this.b) {
            return;
        }
        byte[] bArr = this.a;
        pVar.b(0, 10, bArr);
        pVar.q();
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
