package e3;

import b8.zb;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class j0 {
    public final byte[] a = new byte[10];
    public boolean b;
    public int c;
    public long d;
    public int e;
    public int f;
    public int g;

    public final void a(i0 i0Var, h0 h0Var) {
        if (this.c > 0) {
            i0Var.d(this.d, this.e, this.f, this.g, h0Var);
            this.c = 0;
        }
    }

    public final void b(i0 i0Var, long j10, int i3, int i10, int i11, h0 h0Var) {
        zb.o("TrueHD chunk samples must be contiguous in the sample queue.", this.g <= i10 + i11);
        if (this.b) {
            int i12 = this.c;
            int i13 = i12 + 1;
            this.c = i13;
            if (i12 == 0) {
                this.d = j10;
                this.e = i3;
                this.f = 0;
            }
            this.f += i10;
            this.g = i11;
            if (i13 >= 16) {
                a(i0Var, h0Var);
            }
        }
    }

    public final void c(p pVar) {
        if (this.b) {
            return;
        }
        byte[] bArr = this.a;
        pVar.c(0, 10, bArr);
        pVar.o();
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
