package j$.util;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class s1 {
    public final String a;
    public final String b;
    public final String c;
    public String[] d;
    public int e;
    public int f;

    public s1(CharSequence charSequence) {
        Objects.requireNonNull("", "The prefix must not be null");
        Objects.requireNonNull(charSequence, "The delimiter must not be null");
        Objects.requireNonNull("", "The suffix must not be null");
        this.a = "";
        this.b = charSequence.toString();
        this.c = "";
    }

    public static int c(String str, char[] cArr, int i7) {
        int length = str.length();
        str.getChars(0, length, cArr, i7);
        return length;
    }

    public final String toString() {
        String[] strArr = this.d;
        int i7 = this.e;
        String str = this.a;
        int length = str.length();
        String str2 = this.c;
        int length2 = str2.length() + length;
        if (length2 == 0) {
            b();
            return i7 == 0 ? "" : strArr[0];
        }
        char[] cArr = new char[this.f + length2];
        int c10 = c(str, cArr, 0);
        if (i7 > 0) {
            int c11 = c(strArr[0], cArr, c10) + c10;
            for (int i10 = 1; i10 < i7; i10++) {
                int c12 = c(this.b, cArr, c11) + c11;
                c11 = c(strArr[i10], cArr, c12) + c12;
            }
            c10 = c11;
        }
        c(str2, cArr, c10);
        return new String(cArr);
    }

    public final void a(CharSequence charSequence) {
        String valueOf = String.valueOf(charSequence);
        String[] strArr = this.d;
        if (strArr == null) {
            this.d = new String[8];
        } else {
            int i7 = this.e;
            if (i7 == strArr.length) {
                this.d = (String[]) Arrays.copyOf(strArr, i7 * 2);
            }
            this.f = this.b.length() + this.f;
        }
        this.f = valueOf.length() + this.f;
        String[] strArr2 = this.d;
        int i10 = this.e;
        this.e = i10 + 1;
        strArr2[i10] = valueOf;
    }

    public final void b() {
        String[] strArr;
        if (this.e > 1) {
            char[] cArr = new char[this.f];
            int c10 = c(this.d[0], cArr, 0);
            int i7 = 1;
            do {
                int c11 = c(this.b, cArr, c10) + c10;
                c10 = c(this.d[i7], cArr, c11) + c11;
                strArr = this.d;
                strArr[i7] = null;
                i7++;
            } while (i7 < this.e);
            this.e = 1;
            strArr[0] = new String(cArr);
        }
    }
}
