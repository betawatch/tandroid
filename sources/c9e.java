// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class c9e extends n9e {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c9e(String str, String str2) {
        super(new q8e(str, r3), (Character) '=');
        char[] charArray = str2.toCharArray();
        if (charArray.length == 64) {
            return;
        }
        i98.g();
        throw null;
    }

    @Override // n9e
    public final void a(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        m2f.b(0, i, bArr.length);
        for (int i3 = i; i3 >= 3; i3 -= 3) {
            int i4 = ((bArr[i2] & 255) << 16) | ((bArr[i2 + 1] & 255) << 8) | (bArr[i2 + 2] & 255);
            q8e q8eVar = this.a;
            char[] cArr = q8eVar.b;
            char[] cArr2 = q8eVar.b;
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
