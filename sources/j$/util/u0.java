package j$.util;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class u0 {
    private final String a;
    private final String b;
    private final String c;
    private String[] d;
    private int e;
    private int f;

    public u0(CharSequence charSequence) {
        Objects.requireNonNull("", "The prefix must not be null");
        Objects.requireNonNull(charSequence, "The delimiter must not be null");
        Objects.requireNonNull("", "The suffix must not be null");
        this.a = "";
        this.b = charSequence.toString();
        this.c = "";
    }

    private static int c(String str, char[] cArr, int i) {
        int length = str.length();
        str.getChars(0, length, cArr, i);
        return length;
    }

    public final String toString() {
        String[] strArr = this.d;
        int i = this.e;
        String str = this.a;
        int length = str.length();
        String str2 = this.c;
        int length2 = str2.length() + length;
        if (length2 == 0) {
            b();
            return i == 0 ? "" : strArr[0];
        }
        char[] cArr = new char[this.f + length2];
        int c = c(str, cArr, 0);
        if (i > 0) {
            c += c(strArr[0], cArr, c);
            for (int i2 = 1; i2 < i; i2++) {
                int c2 = c + c(this.b, cArr, c);
                c = c2 + c(strArr[i2], cArr, c2);
            }
        }
        c(str2, cArr, c);
        return new String(cArr);
    }

    public final void a(CharSequence charSequence) {
        String valueOf = String.valueOf(charSequence);
        String[] strArr = this.d;
        if (strArr == null) {
            this.d = new String[8];
        } else {
            int i = this.e;
            if (i == strArr.length) {
                this.d = (String[]) Arrays.copyOf(strArr, i * 2);
            }
            this.f = this.b.length() + this.f;
        }
        this.f = valueOf.length() + this.f;
        String[] strArr2 = this.d;
        int i2 = this.e;
        this.e = i2 + 1;
        strArr2[i2] = valueOf;
    }

    public final void d(u0 u0Var) {
        Objects.requireNonNull(u0Var);
        if (u0Var.d == null) {
            return;
        }
        u0Var.b();
        a(u0Var.d[0]);
    }

    private void b() {
        String[] strArr;
        if (this.e > 1) {
            char[] cArr = new char[this.f];
            int c = c(this.d[0], cArr, 0);
            int i = 1;
            do {
                int c2 = c + c(this.b, cArr, c);
                c = c2 + c(this.d[i], cArr, c2);
                strArr = this.d;
                strArr[i] = null;
                i++;
            } while (i < this.e);
            this.e = 1;
            strArr[0] = new String(cArr);
        }
    }
}
