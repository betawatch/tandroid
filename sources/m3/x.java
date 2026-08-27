package m3;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class x {
    public final byte[] a = new byte[10];
    public boolean b;
    public int c;
    public long d;
    public int e;
    public int f;
    public int g;

    public final void a(w wVar, v vVar) {
        if (this.c > 0) {
            wVar.e(this.d, this.e, this.f, this.g, vVar);
            this.c = 0;
        }
    }

    public final void b(w wVar, long j10, int i10, int i11, int i12, v vVar) {
        if (!(this.g <= i11 + i12)) {
            throw new IllegalStateException("TrueHD chunk samples must be contiguous in the sample queue.");
        }
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
                a(wVar, vVar);
            }
        }
    }

    public final void c(l lVar) {
        if (this.b) {
            return;
        }
        byte[] bArr = this.a;
        lVar.b(0, 10, bArr);
        lVar.q();
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
