package c3;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class i0 {
    public final byte[] a = new byte[10];
    public boolean b;
    public int c;
    public long d;
    public int e;
    public int f;
    public int g;

    public final void a(h0 h0Var, g0 g0Var) {
        if (this.c > 0) {
            h0Var.c(this.d, this.e, this.f, this.g, g0Var);
            this.c = 0;
        }
    }

    public final void b(h0 h0Var, long j3, int i10, int i11, int i12, g0 g0Var) {
        e2.d.f("TrueHD chunk samples must be contiguous in the sample queue.", this.g <= i11 + i12);
        if (this.b) {
            int i13 = this.c;
            int i14 = i13 + 1;
            this.c = i14;
            if (i13 == 0) {
                this.d = j3;
                this.e = i10;
                this.f = 0;
            }
            this.f += i11;
            this.g = i12;
            if (i14 >= 16) {
                a(h0Var, g0Var);
            }
        }
    }

    public final void c(p pVar) {
        if (this.b) {
            return;
        }
        byte[] bArr = this.a;
        pVar.b(0, 10, bArr);
        pVar.p();
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
