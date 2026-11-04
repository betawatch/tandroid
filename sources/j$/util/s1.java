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

    public static int c(String str, char[] cArr, int i3) {
        int length = str.length();
        str.getChars(0, length, cArr, i3);
        return length;
    }

    public final String toString() {
        String[] strArr = this.d;
        int i3 = this.e;
        String str = this.a;
        int length = str.length();
        String str2 = this.c;
        int length2 = str2.length() + length;
        if (length2 == 0) {
            b();
            return i3 == 0 ? "" : strArr[0];
        }
        char[] cArr = new char[this.f + length2];
        int c2 = c(str, cArr, 0);
        if (i3 > 0) {
            int c10 = c(strArr[0], cArr, c2) + c2;
            for (int i10 = 1; i10 < i3; i10++) {
                int c11 = c(this.b, cArr, c10) + c10;
                c10 = c(strArr[i10], cArr, c11) + c11;
            }
            c2 = c10;
        }
        c(str2, cArr, c2);
        return new String(cArr);
    }

    public final void a(CharSequence charSequence) {
        String valueOf = String.valueOf(charSequence);
        String[] strArr = this.d;
        if (strArr == null) {
            this.d = new String[8];
        } else {
            int i3 = this.e;
            if (i3 == strArr.length) {
                this.d = (String[]) Arrays.copyOf(strArr, i3 * 2);
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
            int c2 = c(this.d[0], cArr, 0);
            int i3 = 1;
            do {
                int c10 = c(this.b, cArr, c2) + c2;
                c2 = c(this.d[i3], cArr, c10) + c10;
                strArr = this.d;
                strArr[i3] = null;
                i3++;
            } while (i3 < this.e);
            this.e = 1;
            strArr[0] = new String(cArr);
        }
    }
}
