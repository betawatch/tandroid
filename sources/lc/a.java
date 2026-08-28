package lc;

import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a {
    public final char[] a;
    public final StringReader b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public final String[] h;

    public a(String str) {
        StringReader stringReader = new StringReader(str);
        str.getClass();
        this.h = new String[128];
        if (!stringReader.markSupported()) {
            throw new IllegalArgumentException("Must be true");
        }
        this.b = stringReader;
        this.a = new char[4096];
        b();
    }

    public static String c(char[] cArr, String[] strArr, int i9, int i10) {
        if (i10 > 12) {
            return new String(cArr, i9, i10);
        }
        if (i10 < 1) {
            return "";
        }
        int i11 = 0;
        int i12 = i9;
        int i13 = 0;
        int i14 = 0;
        while (i13 < i10) {
            i14 = (i14 * 31) + cArr[i12];
            i13++;
            i12++;
        }
        int length = i14 & (strArr.length - 1);
        String str = strArr[length];
        if (str == null) {
            String str2 = new String(cArr, i9, i10);
            strArr[length] = str2;
            return str2;
        }
        if (i10 == str.length()) {
            int i15 = i9;
            int i16 = i10;
            while (true) {
                int i17 = i16 - 1;
                if (i16 == 0) {
                    return str;
                }
                int i18 = i15 + 1;
                int i19 = i11 + 1;
                if (cArr[i15] != str.charAt(i11)) {
                    break;
                }
                i15 = i18;
                i16 = i17;
                i11 = i19;
            }
        }
        String str3 = new String(cArr, i9, i10);
        strArr[length] = str3;
        return str3;
    }

    public final void a() {
        this.e++;
    }

    public final void b() {
        StringReader stringReader = this.b;
        int i9 = this.e;
        if (i9 < this.d) {
            return;
        }
        try {
            stringReader.skip(i9);
            stringReader.mark(4096);
            int read = stringReader.read(this.a);
            stringReader.reset();
            if (read != -1) {
                this.c = read;
                this.f += this.e;
                this.e = 0;
                this.g = 0;
                if (read > 3072) {
                    read = 3072;
                }
                this.d = read;
            }
        } catch (IOException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    public final char d() {
        b();
        int i9 = this.e;
        char c10 = i9 >= this.c ? (char) 65535 : this.a[i9];
        this.e = i9 + 1;
        return c10;
    }

    public final String e() {
        char[] cArr;
        char c10;
        b();
        int i9 = this.e;
        while (true) {
            int i10 = this.e;
            int i11 = this.c;
            cArr = this.a;
            if (i10 >= i11 || (((c10 = cArr[i10]) < 'A' || c10 > 'Z') && ((c10 < 'a' || c10 > 'z') && !Character.isLetter(c10)))) {
                break;
            }
            this.e++;
        }
        return c(cArr, this.h, i9, this.e - i9);
    }

    public final String f(char c10) {
        char[] cArr;
        int i9;
        b();
        int i10 = this.e;
        while (true) {
            int i11 = this.c;
            cArr = this.a;
            if (i10 >= i11) {
                i9 = -1;
                break;
            }
            if (c10 == cArr[i10]) {
                i9 = i10 - this.e;
                break;
            }
            i10++;
        }
        String[] strArr = this.h;
        if (i9 != -1) {
            String c11 = c(cArr, strArr, this.e, i9);
            this.e += i9;
            return c11;
        }
        b();
        int i12 = this.e;
        String c12 = c(cArr, strArr, i12, this.c - i12);
        this.e = this.c;
        return c12;
    }

    public final String g(char... cArr) {
        char[] cArr2;
        b();
        int i9 = this.e;
        int i10 = this.c;
        loop0: while (true) {
            int i11 = this.e;
            cArr2 = this.a;
            if (i11 >= i10) {
                break;
            }
            for (char c10 : cArr) {
                if (cArr2[this.e] == c10) {
                    break loop0;
                }
            }
            this.e++;
        }
        int i12 = this.e;
        return i12 > i9 ? c(cArr2, this.h, i9, i12 - i9) : "";
    }

    public final String h(char... cArr) {
        char[] cArr2;
        b();
        int i9 = this.e;
        int i10 = this.c;
        while (true) {
            int i11 = this.e;
            cArr2 = this.a;
            if (i11 >= i10 || Arrays.binarySearch(cArr, cArr2[i11]) >= 0) {
                break;
            }
            this.e++;
        }
        int i12 = this.e;
        return i12 > i9 ? c(cArr2, this.h, i9, i12 - i9) : "";
    }

    public final char i() {
        b();
        int i9 = this.e;
        if (i9 >= this.c) {
            return (char) 65535;
        }
        return this.a[i9];
    }

    public final boolean j() {
        b();
        return this.e >= this.c;
    }

    public final boolean k(String str) {
        b();
        b();
        int length = str.length();
        if (length <= this.c - this.e) {
            for (int i9 = 0; i9 < length; i9++) {
                if (str.charAt(i9) == this.a[this.e + i9]) {
                }
            }
            this.e = str.length() + this.e;
            return true;
        }
        return false;
    }

    public final boolean l(String str) {
        b();
        int length = str.length();
        if (length <= this.c - this.e) {
            for (int i9 = 0; i9 < length; i9++) {
                if (Character.toUpperCase(str.charAt(i9)) == Character.toUpperCase(this.a[this.e + i9])) {
                }
            }
            this.e = str.length() + this.e;
            return true;
        }
        return false;
    }

    public final boolean m(char c10) {
        return !j() && this.a[this.e] == c10;
    }

    public final boolean n(char... cArr) {
        if (!j()) {
            b();
            char c10 = this.a[this.e];
            for (char c11 : cArr) {
                if (c11 == c10) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean o() {
        if (j()) {
            return false;
        }
        char c10 = this.a[this.e];
        if (c10 < 'A' || c10 > 'Z') {
            return (c10 >= 'a' && c10 <= 'z') || Character.isLetter(c10);
        }
        return true;
    }

    public final int p(String str) {
        b();
        char charAt = str.charAt(0);
        int i9 = this.e;
        while (i9 < this.c) {
            char[] cArr = this.a;
            if (charAt != cArr[i9]) {
                do {
                    i9++;
                    if (i9 >= this.c) {
                        break;
                    }
                } while (charAt != cArr[i9]);
            }
            int i10 = i9 + 1;
            int length = (str.length() + i10) - 1;
            int i11 = this.c;
            if (i9 < i11 && length <= i11) {
                int i12 = i10;
                for (int i13 = 1; i12 < length && str.charAt(i13) == cArr[i12]; i13++) {
                    i12++;
                }
                if (i12 == length) {
                    return i9 - this.e;
                }
            }
            i9 = i10;
        }
        return -1;
    }

    public final void q() {
        this.e--;
    }

    public final String toString() {
        int i9 = this.e;
        return new String(this.a, i9, this.c - i9);
    }
}
