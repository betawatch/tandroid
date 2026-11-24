// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class g2c {
    public final byte[] a = new byte[10];
    public boolean b;
    public int c;
    public long d;
    public int e;
    public int f;
    public int g;

    public final void a(wxb wxbVar, vxb vxbVar) {
        if (this.c > 0) {
            wxbVar.a(this.d, this.e, this.f, this.g, vxbVar);
            this.c = 0;
        }
    }

    public final void b(wxb wxbVar, long j, int i, int i2, int i3, vxb vxbVar) {
        gre.o("TrueHD chunk samples must be contiguous in the sample queue.", this.g <= i2 + i3);
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
                a(wxbVar, vxbVar);
            }
        }
    }

    public final void c(k74 k74Var) {
        if (this.b) {
            return;
        }
        byte[] bArr = this.a;
        k74Var.b(0, 10, bArr);
        k74Var.h();
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
