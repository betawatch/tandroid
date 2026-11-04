package h9;

import b8.zb;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c extends d {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c(String str, String str2) {
        super(new a(str, r3), (Character) '=');
        char[] charArray = str2.toCharArray();
        zb.f(charArray.length == 64);
    }

    @Override // h9.d
    public final void b(StringBuilder sb2, byte[] bArr, int i3) {
        int i10 = 0;
        zb.n(0, i3, bArr.length);
        for (int i11 = i3; i11 >= 3; i11 -= 3) {
            int i12 = i10 + 2;
            int i13 = ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10] & 255) << 16);
            i10 += 3;
            int i14 = i13 | (bArr[i12] & 255);
            a aVar = this.a;
            char[] cArr = aVar.b;
            char[] cArr2 = aVar.b;
            sb2.append(cArr[i14 >>> 18]);
            sb2.append(cArr2[(i14 >>> 12) & 63]);
            sb2.append(cArr2[(i14 >>> 6) & 63]);
            sb2.append(cArr2[i14 & 63]);
        }
        if (i10 < i3) {
            a(sb2, bArr, i10, i3 - i10);
        }
    }
}
