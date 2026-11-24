// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class g4c {
    public final byte[] a = new byte[10];
    public boolean b;
    public int c;
    public long d;
    public int e;
    public int f;
    public int g;

    public final void a(yzb yzbVar, xzb xzbVar) {
        if (this.c > 0) {
            yzbVar.a(this.d, this.e, this.f, this.g, xzbVar);
            this.c = 0;
        }
    }

    public final void b(yzb yzbVar, long j, int i, int i2, int i3, xzb xzbVar) {
        jte.o("TrueHD chunk samples must be contiguous in the sample queue.", this.g <= i2 + i3);
        if (this.b) {
            int i4 = this.c;
            int i5 = i4 + 1;
            this.c = i5;
            if (i4 == 0) {
                this.d = j;
                this.e = i;
                this.f = 0;
            }
            this.f += i2;
            this.g = i3;
            if (i5 >= 16) {
                a(yzbVar, xzbVar);
            }
        }
    }

    public final void c(t84 t84Var) {
        if (this.b) {
            return;
        }
        byte[] bArr = this.a;
        t84Var.b(0, 10, bArr);
        t84Var.i();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b = bArr[7];
            if ((b & 254) == 186) {
                r1 = 40 << ((bArr[((b & 255) == 187 ? 1 : 0) != 0 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        if (r1 == 0) {
            return;
        }
        this.b = true;
    }
}
