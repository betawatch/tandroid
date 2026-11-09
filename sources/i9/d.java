package i9;

import a8.ia;
import j$.util.Objects;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public class d {
    public static final b d;
    public final a a;
    public final Character b;
    public volatile d c;

    static {
        new c("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        new c("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new d("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new d("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        d = new b(new a("base16()", "0123456789ABCDEF".toCharArray()));
    }

    public d(a aVar, Character ch2) {
        boolean z9;
        this.a = aVar;
        if (ch2 != null) {
            char charValue = ch2.charValue();
            byte[] bArr = aVar.g;
            if (charValue < bArr.length && bArr[charValue] != -1) {
                z9 = false;
                ia.h(z9, "Padding character %s was already in alphabet", ch2);
                this.b = ch2;
            }
        }
        z9 = true;
        ia.h(z9, "Padding character %s was already in alphabet", ch2);
        this.b = ch2;
    }

    public final void a(StringBuilder sb2, byte[] bArr, int i7, int i10) {
        ia.n(i7, i7 + i10, bArr.length);
        a aVar = this.a;
        int i11 = aVar.f;
        int i12 = aVar.d;
        int i13 = 0;
        ia.f(i10 <= i11);
        long j3 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            j3 = (j3 | (bArr[i7 + i14] & 255)) << 8;
        }
        int i15 = ((i10 + 1) * 8) - i12;
        while (i13 < i10 * 8) {
            sb2.append(aVar.b[((int) (j3 >>> (i15 - i13))) & aVar.c]);
            i13 += i12;
        }
        Character ch2 = this.b;
        if (ch2 != null) {
            while (i13 < aVar.f * 8) {
                sb2.append(ch2.charValue());
                i13 += i12;
            }
        }
    }

    public void b(StringBuilder sb2, byte[] bArr, int i7) {
        int i10 = 0;
        ia.n(0, i7, bArr.length);
        while (i10 < i7) {
            a aVar = this.a;
            a(sb2, bArr, i10, Math.min(aVar.f, i7 - i10));
            i10 += aVar.f;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.a.equals(dVar.a) && Objects.equals(this.b, dVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ Objects.hashCode(this.b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BaseEncoding.");
        a aVar = this.a;
        sb2.append(aVar);
        if (8 % aVar.d != 0) {
            Character ch2 = this.b;
            if (ch2 == null) {
                sb2.append(".omitPadding()");
            } else {
                sb2.append(".withPadChar('");
                sb2.append(ch2);
                sb2.append("')");
            }
        }
        return sb2.toString();
    }

    public d(String str, String str2) {
        this(new a(str, str2.toCharArray()), (Character) '=');
    }
}
