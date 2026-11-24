// default package

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Set;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class bj2 implements vyc {
    static {
        Pattern.compile("[0-9]+");
    }

    public static int a(int i, CharSequence charSequence) {
        char charAt;
        int length = charSequence.length();
        if (i < length) {
            char charAt2 = charSequence.charAt(i);
            if (charAt2 == 241) {
                return 4;
            }
            if (charAt2 >= '0' && charAt2 <= '9') {
                int i2 = i + 1;
                return (i2 >= length || (charAt = charSequence.charAt(i2)) < '0' || charAt > '9') ? 2 : 3;
            }
        }
        return 1;
    }

    public static boolean[] b(int i, ArrayList arrayList) {
        int i2 = i % kk7.n1;
        if (i2 < 0) {
            w26.j("Unable to compute a valid input checksum");
            return null;
        }
        int[][] iArr = y53.a;
        arrayList.add(iArr[i2]);
        arrayList.add(iArr[106]);
        int size = arrayList.size();
        int i3 = 0;
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            for (int i5 : (int[]) obj) {
                i3 += i5;
            }
        }
        boolean[] zArr = new boolean[i3];
        int size2 = arrayList.size();
        int i6 = 0;
        int i7 = 0;
        while (i7 < size2) {
            Object obj2 = arrayList.get(i7);
            i7++;
            boolean z = true;
            int i8 = 0;
            int i9 = i6;
            for (int i10 : (int[]) obj2) {
                int i11 = 0;
                while (i11 < i10) {
                    zArr[i9] = z;
                    i11++;
                    i9++;
                }
                i8 += i10;
                z = !z;
            }
            i6 += i8;
        }
        return zArr;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0248, code lost:
    
        if (r6 > 244) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x027a, code lost:
    
        if (a(r5 + 3, r28) == 3) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0298, code lost:
    
        r6 = 99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x028a, code lost:
    
        if (r14 == r9) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0296, code lost:
    
        if (r6 == 3) goto L170;
     */
    @Override // vyc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final qj0 n(String str, ze0 ze0Var, EnumMap enumMap) {
        int i;
        int i2;
        boolean[] b;
        int i3;
        int i4;
        int i5;
        int i6;
        int a;
        int i7;
        int i8;
        boolean z;
        Object obj = null;
        if (str.isEmpty()) {
            w26.j("Found empty contents");
            return null;
        }
        Set singleton = Collections.singleton(ze0.b);
        if (singleton != null && !singleton.contains(ze0Var)) {
            k32.h("Can only encode ", singleton, ", but got ", ze0Var);
            return null;
        }
        n24 n24Var = n24.c;
        int parseInt = enumMap.containsKey(n24Var) ? Integer.parseInt(enumMap.get(n24Var).toString()) : 10;
        n24 n24Var2 = n24.y;
        int i9 = -1;
        int i10 = 0;
        int i11 = 2;
        if (enumMap.containsKey(n24Var2)) {
            String obj2 = enumMap.get(n24Var2).toString();
            obj2.getClass();
            switch (obj2.hashCode()) {
                case 65:
                    if (obj2.equals("A")) {
                        z = false;
                        break;
                    }
                    z = -1;
                    break;
                case kk7.C0 /* 66 */:
                    if (obj2.equals("B")) {
                        z = true;
                        break;
                    }
                    z = -1;
                    break;
                case kk7.D0 /* 67 */:
                    if (obj2.equals("C")) {
                        z = 2;
                        break;
                    }
                    z = -1;
                    break;
                default:
                    z = -1;
                    break;
            }
            switch (z) {
                case false:
                    i = 101;
                    break;
                case true:
                    i = 100;
                    break;
                case true:
                    i = 99;
                    break;
                default:
                    w26.j("Unsupported code set hint: ".concat(obj2));
                    return null;
            }
        } else {
            i = -1;
        }
        int length = str.length();
        for (int i12 = 0; i12 < length; i12++) {
            char charAt = str.charAt(i12);
            switch (charAt) {
                case kk7.P3 /* 241 */:
                case kk7.Q3 /* 242 */:
                case kk7.R3 /* 243 */:
                case kk7.S3 /* 244 */:
                    break;
                default:
                    if (charAt > 127) {
                        w26.j(de9.k(charAt, "Bad character in input: ASCII value="));
                        return null;
                    }
                    break;
            }
            switch (i) {
                case kk7.j1 /* 99 */:
                    if (charAt < '0' || ((charAt > '9' && charAt <= 127) || charAt == 242 || charAt == 243 || charAt == 244)) {
                        w26.j(de9.k(charAt, "Bad character in input for forced code set C: ASCII value="));
                        return null;
                    }
                    break;
                    break;
                case kk7.k1 /* 100 */:
                    if (charAt < ' ') {
                        w26.j(de9.k(charAt, "Bad character in input for forced code set B: ASCII value="));
                        return null;
                    }
                    break;
                case 101:
                    if (charAt > '_' && charAt <= 127) {
                        w26.j(de9.k(charAt, "Bad character in input for forced code set A: ASCII value="));
                        return null;
                    }
                    break;
            }
        }
        n24 n24Var3 = n24.E;
        char c = 241;
        char c2 = ' ';
        if (enumMap.containsKey(n24Var3) && Boolean.parseBoolean(enumMap.get(n24Var3).toString())) {
            lv6 lv6Var = new lv6((byte) 14, false);
            int[] iArr = {4, str.length()};
            Class cls = Integer.TYPE;
            lv6Var.b = (int[][]) Array.newInstance((Class<?>) cls, iArr);
            lv6Var.c = (int[][]) Array.newInstance((Class<?>) cls, 4, str.length());
            lv6Var.q(4, 0, str);
            ArrayList arrayList = new ArrayList();
            int[] iArr2 = {0};
            int[] iArr3 = {1};
            int length2 = str.length();
            i2 = 0;
            int i13 = 4;
            while (i10 < length2) {
                int i14 = ((int[][]) lv6Var.c)[ug8.F(i13)][i10];
                int F = ug8.F(i14);
                if (F == 0) {
                    lv6.b(arrayList, i10 == 0 ? 103 : 101, iArr2, iArr3, i10);
                    i7 = 1;
                } else if (F == 1) {
                    lv6.b(arrayList, i10 == 0 ? 104 : 100, iArr2, iArr3, i10);
                    i7 = 2;
                } else if (F != 2) {
                    if (F == 3) {
                        lv6.b(arrayList, 98, iArr2, iArr3, i10);
                    }
                    i7 = i13;
                } else {
                    lv6.b(arrayList, i10 == 0 ? 105 : 99, iArr2, iArr3, i10);
                    i7 = 3;
                }
                if (i7 != 3) {
                    switch (str.charAt(i10)) {
                        case kk7.P3 /* 241 */:
                            i8 = 102;
                            break;
                        case kk7.Q3 /* 242 */:
                            i8 = 97;
                            break;
                        case kk7.R3 /* 243 */:
                            i8 = 96;
                            break;
                        case kk7.S3 /* 244 */:
                            if ((i7 != 1 || i14 == 4) && (i7 != 2 || i14 != 4)) {
                                i8 = 100;
                                break;
                            } else {
                                i8 = 101;
                                break;
                            }
                        default:
                            i8 = str.charAt(i10) - ' ';
                            break;
                    }
                    if (((i7 == 1 && i14 != 4) || (i7 == 2 && i14 == 4)) && i8 < 0) {
                        i8 += 96;
                    }
                    lv6.b(arrayList, i8, iArr2, iArr3, i10);
                } else if (str.charAt(i10) == 241) {
                    lv6.b(arrayList, kk7.m1, iArr2, iArr3, i10);
                } else {
                    lv6.b(arrayList, Integer.parseInt(str.substring(i10, i10 + 2)), iArr2, iArr3, i10);
                    int i15 = i10 + 1;
                    if (i15 < length2) {
                        i10 = i15;
                    }
                }
                i10++;
                i13 = i7;
                obj = null;
            }
            lv6Var.b = obj;
            lv6Var.c = obj;
            b = b(iArr2[0], arrayList);
        } else {
            i2 = 0;
            int length3 = str.length();
            ArrayList arrayList2 = new ArrayList();
            int i16 = 1;
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            while (i17 < length3) {
                if (i == i9) {
                    int a2 = a(i17, str);
                    if (a2 == i11) {
                        i4 = i19 == 101 ? 101 : 100;
                        i3 = 96;
                    } else if (a2 == 1) {
                        if (i17 < str.length()) {
                            char charAt2 = str.charAt(i17);
                            if (charAt2 < c2) {
                                i3 = 96;
                            } else if (i19 == 101) {
                                i3 = 96;
                                if (charAt2 >= '`') {
                                    if (charAt2 >= c) {
                                    }
                                    i4 = 100;
                                }
                            }
                            i4 = 101;
                        }
                        i3 = 96;
                        i4 = 100;
                    } else {
                        i3 = 96;
                        if (i19 != 101 || a2 != 4) {
                            if (i19 == 99) {
                                i4 = 99;
                            } else if (i19 == 100) {
                                if (a2 != 4 && (a = a(i17 + 2, str)) != 1 && a != i11) {
                                    if (a != 4) {
                                        int i20 = 3;
                                        int i21 = i17 + 4;
                                        while (true) {
                                            int a3 = a(i21, str);
                                            if (a3 == i20) {
                                                i21 += 2;
                                                i20 = 3;
                                            }
                                        }
                                    }
                                }
                                i4 = 100;
                            } else if (a2 == 4) {
                                a2 = a(i17 + 1, str);
                            }
                        }
                        i4 = 101;
                    }
                } else {
                    i3 = 96;
                    i4 = i;
                }
                if (i4 == i19) {
                    switch (str.charAt(i17)) {
                        case kk7.P3 /* 241 */:
                            c2 = ' ';
                            i6 = kk7.m1;
                            break;
                        case kk7.Q3 /* 242 */:
                            c2 = ' ';
                            i6 = 97;
                            break;
                        case kk7.R3 /* 243 */:
                            c2 = ' ';
                            i6 = i3;
                            break;
                        case kk7.S3 /* 244 */:
                            c2 = ' ';
                            if (i19 == 101) {
                                i6 = 101;
                                break;
                            } else {
                                i6 = 100;
                                break;
                            }
                        default:
                            if (i19 != 100) {
                                if (i19 != 101) {
                                    int i22 = i17 + 1;
                                    if (i22 == length3) {
                                        w26.j("Bad number of characters for digit only encoding.");
                                        return null;
                                    }
                                    i6 = Integer.parseInt(str.substring(i17, i17 + 2));
                                    i17 = i22;
                                } else {
                                    char charAt3 = str.charAt(i17);
                                    int i23 = charAt3 - ' ';
                                    i6 = i23 < 0 ? charAt3 + '@' : i23;
                                }
                                c2 = ' ';
                                break;
                            } else {
                                c2 = ' ';
                                i6 = str.charAt(i17) - ' ';
                                break;
                            }
                    }
                    i17++;
                    i5 = i19;
                } else {
                    c2 = ' ';
                    i5 = i4;
                    i6 = i19 == 0 ? i4 != 100 ? i4 != 101 ? 105 : 103 : 104 : i4;
                }
                int i24 = i11;
                arrayList2.add(y53.a[i6]);
                i18 += i6 * i16;
                if (i17 != 0) {
                    i16++;
                }
                i19 = i5;
                i9 = -1;
                c = 241;
                i11 = i24;
            }
            b = b(i18, arrayList2);
        }
        int length4 = b.length;
        int i25 = parseInt + length4;
        int i26 = i2;
        int max = Math.max(i26, i25);
        int i27 = max / i25;
        int i28 = (max - (length4 * i27)) / 2;
        qj0 qj0Var = new qj0(max, 1);
        int i29 = i26;
        while (i29 < length4) {
            if (b[i29]) {
                qj0Var.d(i28, i26, i27, 1);
            }
            i29++;
            i28 += i27;
        }
        return qj0Var;
    }
}
