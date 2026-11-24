// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class b7e extends m7e {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b7e(String str, String str2) {
        super(new p6e(str, r3), (Character) '=');
        char[] charArray = str2.toCharArray();
        if (charArray.length == 64) {
            return;
        }
        sc8.e();
        throw null;
    }

    @Override // m7e
    public final void a(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        k0f.b(0, i, bArr.length);
        for (int i3 = i; i3 >= 3; i3 -= 3) {
            int i4 = ((bArr[i2] & 255) << 16) | ((bArr[i2 + 1] & 255) << 8) | (bArr[i2 + 2] & 255);
            p6e p6eVar = this.a;
            char[] cArr = p6eVar.b;
            char[] cArr2 = p6eVar.b;
            sb.append(cArr[i4 >>> 18]);
            sb.append(cArr2[(i4 >>> 12) & 63]);
            sb.append(cArr2[(i4 >>> 6) & 63]);
            sb.append(cArr2[i4 & 63]);
            i2 += 3;
        }
        if (i2 < i) {
            b(i2, i - i2, sb, bArr);
        }
    }
}
