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

    public static int c(String str, char[] cArr, int i10) {
        int length = str.length();
        str.getChars(0, length, cArr, i10);
        return length;
    }

    public final String toString() {
        String[] strArr = this.d;
        int i10 = this.e;
        String str = this.a;
        int length = str.length();
        String str2 = this.c;
        int length2 = str2.length() + length;
        if (length2 == 0) {
            b();
            return i10 == 0 ? "" : strArr[0];
        }
        char[] cArr = new char[this.f + length2];
        int c3 = c(str, cArr, 0);
        if (i10 > 0) {
            int c10 = c(strArr[0], cArr, c3) + c3;
            for (int i11 = 1; i11 < i10; i11++) {
                int c11 = c(this.b, cArr, c10) + c10;
                c10 = c(strArr[i11], cArr, c11) + c11;
            }
            c3 = c10;
        }
        c(str2, cArr, c3);
        return new String(cArr);
    }

    public final void a(CharSequence charSequence) {
        String valueOf = String.valueOf(charSequence);
        String[] strArr = this.d;
        if (strArr == null) {
            this.d = new String[8];
        } else {
            int i10 = this.e;
            if (i10 == strArr.length) {
                this.d = (String[]) Arrays.copyOf(strArr, i10 * 2);
            }
            this.f = this.b.length() + this.f;
        }
        this.f = valueOf.length() + this.f;
        String[] strArr2 = this.d;
        int i11 = this.e;
        this.e = i11 + 1;
        strArr2[i11] = valueOf;
    }

    public final void b() {
        String[] strArr;
        if (this.e > 1) {
            char[] cArr = new char[this.f];
            int c3 = c(this.d[0], cArr, 0);
            int i10 = 1;
            do {
                int c10 = c(this.b, cArr, c3) + c3;
                c3 = c(this.d[i10], cArr, c10) + c10;
                strArr = this.d;
                strArr[i10] = null;
                i10++;
            } while (i10 < this.e);
            this.e = 1;
            strArr[0] = new String(cArr);
        }
    }
}
