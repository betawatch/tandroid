package g9;

import a8.yb;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class b extends d {
    public final char[] e;

    public b(a aVar) {
        super(aVar, (Character) null);
        this.e = new char[512];
        char[] cArr = aVar.b;
        yb.g(cArr.length == 16);
        for (int i10 = 0; i10 < 256; i10++) {
            char[] cArr2 = this.e;
            cArr2[i10] = cArr[i10 >>> 4];
            cArr2[i10 | 256] = cArr[i10 & 15];
        }
    }

    @Override // g9.d
    public final void b(StringBuilder sb2, byte[] bArr, int i10) {
        yb.n(0, i10, bArr.length);
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = bArr[i11] & 255;
            char[] cArr = this.e;
            sb2.append(cArr[i12]);
            sb2.append(cArr[i12 | 256]);
        }
    }
}
