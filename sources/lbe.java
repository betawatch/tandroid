// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class lbe extends cce {
    public final char[] e;

    public lbe(fbe fbeVar) {
        super(fbeVar, (Character) null);
        this.e = new char[512];
        if (fbeVar.b.length != 16) {
            iy8.d();
            throw null;
        }
        for (int i = 0; i < 256; i++) {
            char[] cArr = this.e;
            char[] cArr2 = fbeVar.b;
            cArr[i] = cArr2[i >>> 4];
            cArr[i | 256] = cArr2[i & 15];
        }
    }

    @Override // cce
    public final void a(StringBuilder sb, byte[] bArr, int i) {
        c5f.b(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = bArr[i2] & 255;
            char[] cArr = this.e;
            sb.append(cArr[i3]);
            sb.append(cArr[i3 | 256]);
        }
    }
}
