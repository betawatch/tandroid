package i9;

import a8.ia;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class b extends d {
    public final char[] e;

    public b(a aVar) {
        super(aVar, (Character) null);
        this.e = new char[512];
        char[] cArr = aVar.b;
        ia.f(cArr.length == 16);
        for (int i7 = 0; i7 < 256; i7++) {
            char[] cArr2 = this.e;
            cArr2[i7] = cArr[i7 >>> 4];
            cArr2[i7 | 256] = cArr[i7 & 15];
        }
    }

    @Override // i9.d
    public final void b(StringBuilder sb2, byte[] bArr, int i7) {
        ia.n(0, i7, bArr.length);
        for (int i10 = 0; i10 < i7; i10++) {
            int i11 = bArr[i10] & 255;
            char[] cArr = this.e;
            sb2.append(cArr[i11]);
            sb2.append(cArr[i11 | 256]);
        }
    }
}
