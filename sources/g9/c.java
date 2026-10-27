package g9;

import a8.yb;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class c extends d {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c(String str, String str2) {
        super(new a(str, r3), (Character) '=');
        char[] charArray = str2.toCharArray();
        yb.g(charArray.length == 64);
    }

    @Override // g9.d
    public final void b(StringBuilder sb2, byte[] bArr, int i10) {
        int i11 = 0;
        yb.n(0, i10, bArr.length);
        for (int i12 = i10; i12 >= 3; i12 -= 3) {
            int i13 = i11 + 2;
            int i14 = ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11] & 255) << 16);
            i11 += 3;
            int i15 = i14 | (bArr[i13] & 255);
            a aVar = this.a;
            char[] cArr = aVar.b;
            char[] cArr2 = aVar.b;
            sb2.append(cArr[i15 >>> 18]);
            sb2.append(cArr2[(i15 >>> 12) & 63]);
            sb2.append(cArr2[(i15 >>> 6) & 63]);
            sb2.append(cArr2[i15 & 63]);
        }
        if (i11 < i10) {
            a(sb2, bArr, i11, i10 - i11);
        }
    }
}
