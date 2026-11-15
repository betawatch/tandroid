package i9;

import a8.ja;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class c extends d {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c(String str, String str2) {
        super(new a(str, r3), (Character) '=');
        char[] charArray = str2.toCharArray();
        ja.f(charArray.length == 64);
    }

    @Override // i9.d
    public final void b(StringBuilder sb2, byte[] bArr, int i7) {
        int i10 = 0;
        ja.n(0, i7, bArr.length);
        for (int i11 = i7; i11 >= 3; i11 -= 3) {
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
        if (i10 < i7) {
            a(sb2, bArr, i10, i7 - i10);
        }
    }
}
