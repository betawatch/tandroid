package fd;

import j3.r0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class j extends i {
    public static boolean b(String str, String str2) {
        kotlin.jvm.internal.i.e(str, "<this>");
        return d(0, str, str2, false) >= 0;
    }

    public static final int c(CharSequence charSequence) {
        kotlin.jvm.internal.i.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int d(int i9, CharSequence charSequence, String string, boolean z10) {
        char upperCase;
        char upperCase2;
        String str;
        boolean z11;
        boolean regionMatches;
        kotlin.jvm.internal.i.e(charSequence, "<this>");
        kotlin.jvm.internal.i.e(string, "string");
        if (!z10 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(string, i9);
        }
        int length = charSequence.length();
        if (i9 < 0) {
            i9 = 0;
        }
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        cd.e eVar = new cd.e(i9, length, 1);
        boolean z12 = charSequence instanceof String;
        int i10 = eVar.c;
        int i11 = eVar.b;
        if (z12 && e2.c.v(string)) {
            if ((i10 <= 0 || i9 > i11) && (i10 >= 0 || i11 > i9)) {
                return -1;
            }
            int i12 = i9;
            while (true) {
                String str2 = (String) charSequence;
                int length3 = string.length();
                if (z10) {
                    str = string;
                    z11 = z10;
                    regionMatches = str.regionMatches(z11, 0, str2, i12, length3);
                } else {
                    regionMatches = string.regionMatches(0, str2, i12, length3);
                    str = string;
                    z11 = z10;
                }
                if (regionMatches) {
                    return i12;
                }
                if (i12 == i11) {
                    return -1;
                }
                i12 += i10;
                string = str;
                z10 = z11;
            }
        } else {
            if ((i10 <= 0 || i9 > i11) && (i10 >= 0 || i11 > i9)) {
                return -1;
            }
            while (true) {
                int length4 = string.length();
                if (i9 >= 0 && string.length() - length4 >= 0 && i9 <= charSequence.length() - length4) {
                    for (int i13 = 0; i13 < length4; i13++) {
                        char charAt = string.charAt(i13);
                        char charAt2 = charSequence.charAt(i9 + i13);
                        if (charAt == charAt2 || (z10 && ((upperCase = Character.toUpperCase(charAt)) == (upperCase2 = Character.toUpperCase(charAt2)) || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)))) {
                        }
                    }
                    return i9;
                }
                if (i9 == i11) {
                    return -1;
                }
                i9 += i10;
            }
        }
    }

    public static boolean e(String str) {
        kotlin.jvm.internal.i.e(str, "<this>");
        for (int i9 = 0; i9 < str.length(); i9++) {
            char charAt = str.charAt(i9);
            if (!Character.isWhitespace(charAt) && !Character.isSpaceChar(charAt)) {
                return false;
            }
        }
        return true;
    }

    public static String f(int i9, String str) {
        CharSequence charSequence;
        kotlin.jvm.internal.i.e(str, "<this>");
        if (i9 < 0) {
            throw new IllegalArgumentException(r0.m(i9, "Desired length ", " is less than zero."));
        }
        if (i9 <= str.length()) {
            charSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb2 = new StringBuilder(i9);
            sb2.append((CharSequence) str);
            int length = i9 - str.length();
            int i10 = 1;
            if (1 <= length) {
                while (true) {
                    sb2.append(' ');
                    if (i10 == length) {
                        break;
                    }
                    i10++;
                }
            }
            charSequence = sb2;
        }
        return charSequence.toString();
    }

    public static String g(String str, String str2, String newValue) {
        kotlin.jvm.internal.i.e(str, "<this>");
        kotlin.jvm.internal.i.e(newValue, "newValue");
        int d = d(0, str, str2, false);
        if (d < 0) {
            return str;
        }
        int length = str2.length();
        int i9 = length >= 1 ? length : 1;
        int length2 = newValue.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb2 = new StringBuilder(length2);
        int i10 = 0;
        do {
            sb2.append((CharSequence) str, i10, d);
            sb2.append(newValue);
            i10 = d + length;
            if (d >= str.length()) {
                break;
            }
            d = d(d + i9, str, str2, false);
        } while (d > 0);
        sb2.append((CharSequence) str, i10, str.length());
        String sb3 = sb2.toString();
        kotlin.jvm.internal.i.d(sb3, "toString(...)");
        return sb3;
    }

    public static boolean h(String str, String prefix) {
        kotlin.jvm.internal.i.e(str, "<this>");
        kotlin.jvm.internal.i.e(prefix, "prefix");
        return str.startsWith(prefix);
    }

    public static String i(String str, String delimiter, String str2) {
        kotlin.jvm.internal.i.e(delimiter, "delimiter");
        int d = d(0, str, delimiter, false);
        if (d == -1) {
            return str2;
        }
        String substring = str.substring(delimiter.length() + d, str.length());
        kotlin.jvm.internal.i.d(substring, "substring(...)");
        return substring;
    }

    public static String j(String str, String str2) {
        int lastIndexOf = str.lastIndexOf(46, c(str));
        if (lastIndexOf == -1) {
            return str2;
        }
        String substring = str.substring(lastIndexOf + 1, str.length());
        kotlin.jvm.internal.i.d(substring, "substring(...)");
        return substring;
    }
}
