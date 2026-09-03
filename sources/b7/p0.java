package b7;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class p0 extends q0 {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p0(String str, String str2) {
        super(new n0(str, r3), (Character) '=');
        char[] charArray = str2.toCharArray();
        if (charArray.length != 64) {
            throw new IllegalArgumentException();
        }
    }

    @Override // b7.q0
    public final void a(StringBuilder sb, byte[] bArr, int i10) {
        int i11 = 0;
        b.m(0, i10, bArr.length);
        for (int i12 = i10; i12 >= 3; i12 -= 3) {
            int i13 = ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11] & 255) << 16) | (bArr[i11 + 2] & 255);
            n0 n0Var = this.a;
            char[] cArr = n0Var.b;
            char[] cArr2 = n0Var.b;
            sb.append(cArr[i13 >>> 18]);
            sb.append(cArr2[(i13 >>> 12) & 63]);
            sb.append(cArr2[(i13 >>> 6) & 63]);
            sb.append(cArr2[i13 & 63]);
            i11 += 3;
        }
        if (i11 < i10) {
            b(sb, bArr, i11, i10 - i11);
        }
    }
}
