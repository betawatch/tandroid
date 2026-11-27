// default package

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class mp3 {
    public static final LinkedHashSet p = new LinkedHashSet(Arrays.asList(jk0.class, of5.class, oa4.class, ei5.class, inb.class, c76.class, kp5.class));
    public static final Map q;
    public String a;
    public boolean d;
    public boolean h;
    public final ArrayList i;
    public final up5 j;
    public final ArrayList k;
    public final jp3 l;
    public final ArrayList n;
    public final LinkedHashSet o;
    public int b = 0;
    public int c = 0;
    public int e = 0;
    public int f = 0;
    public int g = 0;
    public final LinkedHashMap m = new LinkedHashMap();

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(jk0.class, new kk0((byte) 0));
        hashMap.put(of5.class, new kk0((byte) 2));
        hashMap.put(oa4.class, new kk0((byte) 1));
        hashMap.put(ei5.class, new kk0((byte) 3));
        hashMap.put(inb.class, new kk0((byte) 8));
        hashMap.put(c76.class, new kk0((byte) 6));
        hashMap.put(kp5.class, new kk0((byte) 4));
        q = DesugarCollections.unmodifiableMap(hashMap);
    }

    public mp3(ArrayList arrayList, up5 up5Var, ArrayList arrayList2) {
        ArrayList arrayList3 = new ArrayList();
        this.n = arrayList3;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.o = linkedHashSet;
        this.i = arrayList;
        this.j = up5Var;
        this.k = arrayList2;
        jp3 jp3Var = new jp3((byte) 0);
        this.l = jp3Var;
        arrayList3.add(jp3Var);
        linkedHashSet.add(jp3Var);
    }

    public final void a(y1 y1Var) {
        while (!h().b(y1Var.e())) {
            e(h());
        }
        h().e().b(y1Var.e());
        this.n.add(y1Var);
        this.o.add(y1Var);
    }

    public final void b(by7 by7Var) {
        j66 j66Var = by7Var.b;
        j66Var.a();
        ArrayList arrayList = j66Var.c;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            i66 i66Var = (i66) obj;
            ay7 ay7Var = by7Var.a;
            i66Var.g();
            yi6 yi6Var = (yi6) ay7Var.e;
            i66Var.e = yi6Var;
            if (yi6Var != null) {
                yi6Var.f = i66Var;
            }
            i66Var.f = ay7Var;
            ay7Var.e = i66Var;
            yi6 yi6Var2 = (yi6) ay7Var.b;
            i66Var.b = yi6Var2;
            if (((yi6) i66Var.e) == null) {
                yi6Var2.c = i66Var;
            }
            String str = i66Var.g;
            LinkedHashMap linkedHashMap = this.m;
            if (!linkedHashMap.containsKey(str)) {
                linkedHashMap.put(str, i66Var);
            }
        }
    }

    public final void c() {
        CharSequence subSequence;
        if (this.d) {
            int i = this.b + 1;
            String str = this.a;
            CharSequence subSequence2 = str.subSequence(i, str.length());
            int i2 = 4 - (this.c % 4);
            StringBuilder sb = new StringBuilder(subSequence2.length() + i2);
            for (int i3 = 0; i3 < i2; i3++) {
                sb.append(' ');
            }
            sb.append(subSequence2);
            subSequence = sb.toString();
        } else {
            String str2 = this.a;
            subSequence = str2.subSequence(this.b, str2.length());
        }
        h().a(subSequence);
    }

    public final void d() {
        char charAt = this.a.charAt(this.b);
        int i = this.b + 1;
        if (charAt != '\t') {
            this.b = i;
            this.c++;
        } else {
            this.b = i;
            int i2 = this.c;
            this.c = (4 - (i2 % 4)) + i2;
        }
    }

    public final void e(y1 y1Var) {
        if (h() == y1Var) {
            qd4.v(1, this.n);
        }
        if (y1Var instanceof by7) {
            b((by7) y1Var);
        }
        y1Var.d();
    }

    public final void f(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            e((y1) arrayList.get(size));
        }
    }

    public final void g() {
        int i = this.b;
        int i2 = this.c;
        this.h = true;
        int length = this.a.length();
        while (true) {
            if (i >= length) {
                break;
            }
            char charAt = this.a.charAt(i);
            if (charAt == '\t') {
                i++;
                i2 += 4 - (i2 % 4);
            } else if (charAt != ' ') {
                this.h = false;
                break;
            } else {
                i++;
                i2++;
            }
        }
        this.e = i;
        this.f = i2;
        this.g = i2 - this.c;
    }

    public final y1 h() {
        return (y1) c00.g(1, this.n);
    }

    /* JADX WARN: Code restructure failed: missing block: B:209:0x0227, code lost:
    
        if (r8 == 0) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x070c, code lost:
    
        r23 = r6;
        r24 = r7;
        k(r25.e);
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:229:0x02a3. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x0637  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(String str) {
        y1 y1Var;
        boolean z;
        int i;
        nk0 nk0Var;
        int i2;
        char charAt;
        int i3;
        pa4 pa4Var;
        nk0 nk0Var2;
        char c;
        pf5 pf5Var;
        int i4;
        StringBuilder z2;
        int i5;
        int i6;
        int i7;
        int i8;
        d76 d76Var;
        char charAt2;
        d76 d76Var2;
        int i9;
        char charAt3;
        int i10;
        char charAt4;
        int i11;
        int i12;
        int i13;
        String str2 = str;
        int length = str2.length();
        int i14 = 0;
        StringBuilder sb = null;
        for (int i15 = 0; i15 < length; i15++) {
            char charAt5 = str2.charAt(i15);
            if (charAt5 == 0) {
                if (sb == null) {
                    sb = new StringBuilder(length);
                    sb.append((CharSequence) str2, 0, i15);
                }
                sb.append((char) 65533);
            } else if (sb != null) {
                sb.append(charAt5);
            }
        }
        if (sb != null) {
            str2 = sb.toString();
        }
        this.a = str2;
        this.b = 0;
        this.c = 0;
        this.d = false;
        ArrayList arrayList = this.n;
        int i16 = 1;
        for (y1 y1Var2 : arrayList.subList(1, arrayList.size())) {
            g();
            qk2 h = y1Var2.h(this);
            if (h == null) {
                break;
            }
            if (h.c) {
                e(y1Var2);
                return;
            }
            int i17 = h.a;
            if (i17 != -1) {
                k(i17);
            } else {
                int i18 = h.b;
                if (i18 != -1) {
                    j(i18);
                }
            }
            i16++;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.subList(i16, arrayList.size()));
        y1 y1Var3 = (y1) arrayList.get(i16 - 1);
        boolean isEmpty = arrayList2.isEmpty();
        boolean z3 = (y1Var3.e() instanceof ay7) || y1Var3.f();
        while (true) {
            if (z3) {
                g();
                if (!this.h) {
                    int i19 = 4;
                    if (this.g >= 4 || !Character.isLetter(Character.codePointAt(this.a, this.e))) {
                        ri6 ri6Var = new ri6(y1Var3, (byte) 27);
                        ArrayList arrayList3 = this.i;
                        int size = arrayList3.size();
                        int i20 = i14;
                        while (true) {
                            if (i20 < size) {
                                Object obj = arrayList3.get(i20);
                                i20++;
                                byte b = ((kk0) obj).a;
                                i = i14;
                                char c2 = '\t';
                                char c3 = ' ';
                                Object obj2 = ri6Var.b;
                                switch (b) {
                                    case 0:
                                        y1Var = y1Var3;
                                        z = isEmpty;
                                        int i21 = this.e;
                                        String str3 = this.a;
                                        i2 = 4;
                                        if (this.g < 4 && i21 < str3.length() && str3.charAt(i21) == '>') {
                                            int i22 = this.c + this.g;
                                            int i23 = i22 + 1;
                                            String str4 = this.a;
                                            int i24 = i21 + 1;
                                            if (i24 < str4.length() && ((charAt = str4.charAt(i24)) == '\t' || charAt == ' ')) {
                                                i23 = i22 + 2;
                                            }
                                            y1[] y1VarArr = new y1[1];
                                            y1VarArr[i] = new lk0();
                                            nk0Var = new nk0(y1VarArr);
                                            nk0Var.c = i23;
                                            break;
                                        }
                                        nk0Var = null;
                                        break;
                                    case 1:
                                        y1Var = y1Var3;
                                        z = isEmpty;
                                        int i25 = this.g;
                                        if (i25 < 4) {
                                            int i26 = this.e;
                                            String str5 = this.a;
                                            int length2 = str5.length();
                                            int i27 = i26;
                                            int i28 = i;
                                            int i29 = i28;
                                            while (true) {
                                                i3 = i26;
                                                if (i27 < length2) {
                                                    char charAt6 = str5.charAt(i27);
                                                    if (charAt6 == '`') {
                                                        i28++;
                                                    } else if (charAt6 == '~') {
                                                        i29++;
                                                    }
                                                    i27++;
                                                    i26 = i3;
                                                }
                                            }
                                            int i30 = 3;
                                            if (i28 >= 3) {
                                                if (i29 == 0) {
                                                    int i31 = i3 + i28;
                                                    int length3 = str5.length();
                                                    while (true) {
                                                        if (i31 < length3) {
                                                            c = '`';
                                                            if (str5.charAt(i31) != '`') {
                                                                i31++;
                                                            }
                                                        } else {
                                                            c = '`';
                                                            i31 = -1;
                                                        }
                                                    }
                                                    if (i31 == -1) {
                                                        pa4Var = new pa4(c, i28, i25);
                                                        if (pa4Var != null) {
                                                            y1[] y1VarArr2 = new y1[1];
                                                            y1VarArr2[i] = pa4Var;
                                                            nk0Var2 = new nk0(y1VarArr2);
                                                            nk0Var2.b = i3 + pa4Var.a.h;
                                                            nk0Var = nk0Var2;
                                                            i2 = 4;
                                                            break;
                                                        }
                                                    }
                                                    pa4Var = null;
                                                    if (pa4Var != null) {
                                                    }
                                                } else {
                                                    i30 = 3;
                                                }
                                            }
                                            if (i29 >= i30 && i28 == 0) {
                                                pa4Var = new pa4('~', i29, i25);
                                                if (pa4Var != null) {
                                                }
                                            }
                                            pa4Var = null;
                                            if (pa4Var != null) {
                                            }
                                        }
                                        nk0Var = null;
                                        i2 = 4;
                                    case 2:
                                        y1Var = y1Var3;
                                        z = isEmpty;
                                        if (this.g < 4) {
                                            String str6 = this.a;
                                            int i32 = this.e;
                                            int b2 = dve.b('#', str6, i32, str6.length()) - i32;
                                            if (b2 != 0 && b2 <= 6) {
                                                int i33 = i32 + b2;
                                                if (i33 >= str6.length()) {
                                                    pf5Var = new pf5(b2, "");
                                                } else {
                                                    char charAt7 = str6.charAt(i33);
                                                    char c4 = ' ';
                                                    char c5 = '\t';
                                                    if (charAt7 == ' ' || charAt7 == '\t') {
                                                        int length4 = str6.length() - 1;
                                                        while (true) {
                                                            if (length4 < i33) {
                                                                length4 = i33 - 1;
                                                            } else {
                                                                char charAt8 = str6.charAt(length4);
                                                                if (charAt8 == c5 || charAt8 == c4) {
                                                                    length4--;
                                                                    c5 = '\t';
                                                                    c4 = ' ';
                                                                }
                                                            }
                                                        }
                                                        int i34 = length4;
                                                        while (true) {
                                                            if (i34 < i33) {
                                                                i34 = i33 - 1;
                                                            } else if (str6.charAt(i34) == '#') {
                                                                i34--;
                                                            }
                                                        }
                                                        int i35 = i34;
                                                        while (true) {
                                                            if (i35 >= i33) {
                                                                char charAt9 = str6.charAt(i35);
                                                                int i36 = i35;
                                                                if (charAt9 == '\t' || charAt9 == ' ') {
                                                                    i35 = i36 - 1;
                                                                } else {
                                                                    i5 = i36;
                                                                }
                                                            } else {
                                                                i5 = i33 - 1;
                                                            }
                                                        }
                                                        pf5Var = i5 != i34 ? new pf5(b2, str6.subSequence(i33, i5 + 1).toString()) : new pf5(b2, str6.subSequence(i33, length4 + 1).toString());
                                                    }
                                                }
                                                if (pf5Var == null) {
                                                    y1[] y1VarArr3 = new y1[1];
                                                    y1VarArr3[i] = pf5Var;
                                                    nk0Var2 = new nk0(y1VarArr3);
                                                    nk0Var2.b = str6.length();
                                                } else {
                                                    char charAt10 = str6.charAt(i32);
                                                    if (charAt10 != '-') {
                                                        if (charAt10 == '=') {
                                                            if (dve.c(dve.b('=', str6, i32 + 1, str6.length()), str6.length(), str6) >= str6.length()) {
                                                                i4 = 1;
                                                                if (i4 > 0 && (z2 = ri6Var.z()) != null) {
                                                                    y1[] y1VarArr4 = new y1[1];
                                                                    y1VarArr4[i] = new pf5(i4, z2.toString());
                                                                    nk0Var2 = new nk0(y1VarArr4);
                                                                    nk0Var2.b = str6.length();
                                                                    nk0Var2.a = true;
                                                                }
                                                            }
                                                        }
                                                        i4 = i;
                                                        if (i4 > 0) {
                                                            y1[] y1VarArr42 = new y1[1];
                                                            y1VarArr42[i] = new pf5(i4, z2.toString());
                                                            nk0Var2 = new nk0(y1VarArr42);
                                                            nk0Var2.b = str6.length();
                                                            nk0Var2.a = true;
                                                        }
                                                    }
                                                    if (dve.c(dve.b('-', str6, i32 + 1, str6.length()), str6.length(), str6) >= str6.length()) {
                                                        i4 = 2;
                                                        if (i4 > 0) {
                                                        }
                                                    }
                                                    i4 = i;
                                                    if (i4 > 0) {
                                                    }
                                                }
                                                nk0Var = nk0Var2;
                                                i2 = 4;
                                                break;
                                            }
                                            pf5Var = null;
                                            if (pf5Var == null) {
                                            }
                                            nk0Var = nk0Var2;
                                            i2 = 4;
                                        }
                                        nk0Var = null;
                                        i2 = 4;
                                        break;
                                    case 3:
                                        y1Var = y1Var3;
                                        z = isEmpty;
                                        int i37 = i19;
                                        int i38 = this.e;
                                        String str7 = this.a;
                                        if (this.g < i37 && str7.charAt(i38) == '<') {
                                            for (int i39 = 1; i39 <= 7; i39++) {
                                                if (i39 != 7 || !(((y1) obj2).e() instanceof ay7)) {
                                                    Pattern[] patternArr = fi5.e[i39];
                                                    Pattern pattern = patternArr[i];
                                                    Pattern pattern2 = patternArr[1];
                                                    if (pattern.matcher(str7.subSequence(i38, str7.length())).find()) {
                                                        y1[] y1VarArr5 = new y1[1];
                                                        y1VarArr5[i] = new fi5(pattern2);
                                                        nk0Var = new nk0(y1VarArr5);
                                                        nk0Var.b = this.b;
                                                        i2 = 4;
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        nk0Var = null;
                                        i2 = 4;
                                        break;
                                    case 4:
                                        y1Var = y1Var3;
                                        z = isEmpty;
                                        if (this.g < 4) {
                                            i2 = 4;
                                        } else if (!this.h && !(h().e() instanceof ay7)) {
                                            y1[] y1VarArr6 = new y1[1];
                                            y1VarArr6[i] = new pf5();
                                            nk0Var = new nk0(y1VarArr6);
                                            i2 = 4;
                                            nk0Var.c = this.c + 4;
                                            break;
                                        } else {
                                            i2 = 4;
                                        }
                                        nk0Var = null;
                                        break;
                                    case 5:
                                        y1Var = y1Var3;
                                        z = isEmpty;
                                        if (this.g < 4) {
                                            int i40 = this.e;
                                            String str8 = this.a;
                                            int length5 = str8.length();
                                            int i41 = i40;
                                            while (true) {
                                                if (i41 >= length5) {
                                                    i6 = length5 - i40;
                                                } else if ('$' != str8.charAt(i41)) {
                                                    i6 = i41 - i40;
                                                } else {
                                                    i41++;
                                                }
                                            }
                                            if (i6 >= 2 && dve.b(' ', str8, i40 + i6, length5) == length5) {
                                                uu5 uu5Var = new uu5(i6);
                                                y1[] y1VarArr7 = new y1[1];
                                                y1VarArr7[i] = uu5Var;
                                                nk0Var = new nk0(y1VarArr7);
                                                nk0Var.b = length5 + 1;
                                                i2 = 4;
                                                break;
                                            }
                                        }
                                        nk0Var = null;
                                        i2 = 4;
                                        break;
                                    case 6:
                                        y1Var = y1Var3;
                                        z = isEmpty;
                                        y1 y1Var4 = (y1) obj2;
                                        int i42 = this.g;
                                        if (i42 < 4) {
                                            int i43 = this.e;
                                            int i44 = this.c + i42;
                                            int i45 = ri6Var.z() != null ? 1 : i;
                                            String str9 = this.a;
                                            char charAt11 = str9.charAt(i43);
                                            if (charAt11 == '*' || charAt11 == '+' || charAt11 == '-') {
                                                i7 = i45;
                                                i8 = i44;
                                                int i46 = i43 + 1;
                                                if (i46 >= str9.length() || (charAt2 = str9.charAt(i46)) == '\t' || charAt2 == ' ') {
                                                    g11 g11Var = new g11();
                                                    g11Var.g = charAt11;
                                                    d76Var = new d76(g11Var, i46);
                                                    if (d76Var != null) {
                                                        c76 c76Var = d76Var.a;
                                                        int i47 = d76Var.b;
                                                        int i48 = (i47 - i43) + i8;
                                                        int length6 = str9.length();
                                                        int i49 = i48;
                                                        while (true) {
                                                            if (i47 < length6) {
                                                                char charAt12 = str9.charAt(i47);
                                                                int i50 = i47;
                                                                if (charAt12 == '\t') {
                                                                    i49 = (4 - (i49 % 4)) + i49;
                                                                } else if (charAt12 == ' ') {
                                                                    i49++;
                                                                } else {
                                                                    i9 = 1;
                                                                }
                                                                i47 = i50 + 1;
                                                            } else {
                                                                i9 = i;
                                                            }
                                                        }
                                                        if (i7 == 0 || ((!(c76Var instanceof du7) || ((du7) c76Var).g == 1) && i9 != 0)) {
                                                            if (i9 == 0 || i49 - i48 > 4) {
                                                                i49 = i48 + 1;
                                                            }
                                                            d76Var2 = new d76(c76Var, i49);
                                                            if (d76Var2 != null) {
                                                                c76 c76Var2 = d76Var2.a;
                                                                int i51 = d76Var2.b;
                                                                k76 k76Var = new k76(i51 - this.c);
                                                                if (y1Var4 instanceof e76) {
                                                                    c76 c76Var3 = ((e76) y1Var4).a;
                                                                    if ((((c76Var3 instanceof g11) && (c76Var2 instanceof g11)) ? Character.valueOf(((g11) c76Var3).g).equals(Character.valueOf(((g11) c76Var2).g)) : ((c76Var3 instanceof du7) && (c76Var2 instanceof du7)) ? Character.valueOf(((du7) c76Var3).h).equals(Character.valueOf(((du7) c76Var2).h)) : i) != 0) {
                                                                        y1[] y1VarArr8 = new y1[1];
                                                                        y1VarArr8[i] = k76Var;
                                                                        nk0Var2 = new nk0(y1VarArr8);
                                                                        nk0Var2.c = i51;
                                                                        nk0Var = nk0Var2;
                                                                    }
                                                                }
                                                                e76 e76Var = new e76(c76Var2);
                                                                y1[] y1VarArr9 = new y1[2];
                                                                y1VarArr9[i] = e76Var;
                                                                y1VarArr9[1] = k76Var;
                                                                nk0Var2 = new nk0(y1VarArr9);
                                                                nk0Var2.c = i51;
                                                                nk0Var = nk0Var2;
                                                            }
                                                        }
                                                    }
                                                    d76Var2 = null;
                                                    if (d76Var2 != null) {
                                                    }
                                                }
                                                d76Var = null;
                                                if (d76Var != null) {
                                                }
                                                d76Var2 = null;
                                                if (d76Var2 != null) {
                                                }
                                            } else {
                                                int length7 = str9.length();
                                                int i52 = i43;
                                                int i53 = i;
                                                while (true) {
                                                    i7 = i45;
                                                    if (i52 < length7) {
                                                        charAt3 = str9.charAt(i52);
                                                        i8 = i44;
                                                        if (charAt3 != ')' && charAt3 != '.') {
                                                            switch (charAt3) {
                                                                case '0':
                                                                case '1':
                                                                case '2':
                                                                case jn7.n0 /* 51 */:
                                                                case jn7.o0 /* 52 */:
                                                                case jn7.p0 /* 53 */:
                                                                case jn7.q0 /* 54 */:
                                                                case jn7.r0 /* 55 */:
                                                                case '8':
                                                                case jn7.t0 /* 57 */:
                                                                    i53++;
                                                                    if (i53 > 9) {
                                                                        break;
                                                                    } else {
                                                                        i52++;
                                                                        i45 = i7;
                                                                        i44 = i8;
                                                                    }
                                                            }
                                                            if (d76Var != null) {
                                                            }
                                                            d76Var2 = null;
                                                            if (d76Var2 != null) {
                                                            }
                                                        }
                                                    } else {
                                                        i8 = i44;
                                                    }
                                                }
                                                if (i53 >= 1 && ((i10 = i52 + 1) >= str9.length() || (charAt4 = str9.charAt(i10)) == '\t' || charAt4 == ' ')) {
                                                    String charSequence = str9.subSequence(i43, i52).toString();
                                                    du7 du7Var = new du7();
                                                    du7Var.g = Integer.parseInt(charSequence);
                                                    du7Var.h = charAt3;
                                                    d76Var = new d76(du7Var, i10);
                                                    if (d76Var != null) {
                                                    }
                                                    d76Var2 = null;
                                                    if (d76Var2 != null) {
                                                    }
                                                }
                                                d76Var = null;
                                                if (d76Var != null) {
                                                }
                                                d76Var2 = null;
                                                if (d76Var2 != null) {
                                                }
                                            }
                                            i2 = 4;
                                            break;
                                        }
                                        nk0Var = null;
                                        i2 = 4;
                                        break;
                                    case 7:
                                        String str10 = this.a;
                                        StringBuilder z4 = ri6Var.z();
                                        if (z4 != null && z4.toString().contains("|") && !z4.toString().contains("\n")) {
                                            CharSequence subSequence = str10.subSequence(this.b, str10.length());
                                            ArrayList arrayList4 = new ArrayList();
                                            int i54 = i;
                                            int i55 = i54;
                                            int i56 = i55;
                                            while (true) {
                                                if (i55 >= subSequence.length()) {
                                                    y1Var = y1Var3;
                                                    z = isEmpty;
                                                    break;
                                                } else {
                                                    char charAt13 = subSequence.charAt(i55);
                                                    y1Var = y1Var3;
                                                    if (charAt13 == '\t' || charAt13 == ' ') {
                                                        z = isEmpty;
                                                        i55++;
                                                    } else {
                                                        z = isEmpty;
                                                        if (charAt13 == '-' || charAt13 == ':') {
                                                            if (i56 != 0 || arrayList4.isEmpty()) {
                                                                if (charAt13 == ':') {
                                                                    i55++;
                                                                    i11 = 1;
                                                                } else {
                                                                    i11 = i;
                                                                }
                                                                int i57 = i;
                                                                while (i55 < subSequence.length() && subSequence.charAt(i55) == '-') {
                                                                    i55++;
                                                                    i57 = 1;
                                                                }
                                                                if (i57 != 0) {
                                                                    if (i55 >= subSequence.length() || subSequence.charAt(i55) != ':') {
                                                                        i12 = i;
                                                                    } else {
                                                                        i55++;
                                                                        i12 = 1;
                                                                    }
                                                                    arrayList4.add(i11 != 0 ? i12 != 0 ? gib.b : gib.a : i12 != 0 ? gib.c : null);
                                                                    i56 = i;
                                                                }
                                                            }
                                                        } else if (charAt13 == '|') {
                                                            i55++;
                                                            i56++;
                                                            if (i56 <= 1) {
                                                                i54 = 1;
                                                            }
                                                        }
                                                    }
                                                    y1Var3 = y1Var;
                                                    isEmpty = z;
                                                }
                                            }
                                            arrayList4 = null;
                                            if (arrayList4 != null && !arrayList4.isEmpty()) {
                                                ArrayList i58 = bib.i(z4);
                                                if (arrayList4.size() >= i58.size()) {
                                                    bib bibVar = new bib(arrayList4, i58);
                                                    y1[] y1VarArr10 = new y1[1];
                                                    y1VarArr10[i] = bibVar;
                                                    nk0 nk0Var3 = new nk0(y1VarArr10);
                                                    nk0Var3.b = this.b;
                                                    nk0Var3.a = true;
                                                    nk0Var = nk0Var3;
                                                    i2 = 4;
                                                    break;
                                                }
                                            }
                                        } else {
                                            y1Var = y1Var3;
                                            z = isEmpty;
                                        }
                                        nk0Var = null;
                                        i2 = 4;
                                        break;
                                    default:
                                        if (this.g < i19) {
                                            int i59 = this.e;
                                            String str11 = this.a;
                                            int length8 = str11.length();
                                            int i60 = i;
                                            int i61 = i60;
                                            int i62 = i61;
                                            while (true) {
                                                if (i59 >= length8) {
                                                    int i63 = i60;
                                                    int i64 = i61;
                                                    int i65 = i62;
                                                    if ((i63 >= 3 && i64 == 0 && i65 == 0) || ((i64 >= 3 && i63 == 0 && i65 == 0) || (i65 >= 3 && i63 == 0 && i64 == 0))) {
                                                        y1[] y1VarArr11 = new y1[1];
                                                        y1VarArr11[i] = new jp3((byte) 1);
                                                        nk0Var = new nk0(y1VarArr11);
                                                        nk0Var.b = str11.length();
                                                    }
                                                } else {
                                                    char charAt14 = str11.charAt(i59);
                                                    if (charAt14 == c2 || charAt14 == c3) {
                                                        i13 = i60;
                                                        i61 = i61;
                                                        i62 = i62;
                                                    } else if (charAt14 != '*') {
                                                        if (charAt14 == '-') {
                                                            i60++;
                                                        } else if (charAt14 == '_') {
                                                            i61++;
                                                        }
                                                        i13 = i60;
                                                    } else {
                                                        i13 = i60;
                                                        i62++;
                                                    }
                                                    i59++;
                                                    i60 = i13;
                                                    c3 = ' ';
                                                    c2 = '\t';
                                                }
                                            }
                                        }
                                        nk0Var = null;
                                        y1Var = y1Var3;
                                        z = isEmpty;
                                        i2 = 4;
                                        break;
                                }
                                if (nk0Var == null) {
                                    i19 = i2;
                                    i14 = i;
                                    y1Var3 = y1Var;
                                    isEmpty = z;
                                }
                            } else {
                                i = i14;
                                y1Var = y1Var3;
                                z = isEmpty;
                                nk0Var = null;
                            }
                        }
                        if (nk0Var == null) {
                            k(this.e);
                        } else {
                            if (z) {
                                isEmpty = z;
                            } else {
                                f(arrayList2);
                                isEmpty = true;
                            }
                            int i66 = nk0Var.b;
                            if (i66 != -1) {
                                k(i66);
                            } else {
                                int i67 = nk0Var.c;
                                if (i67 != -1) {
                                    j(i67);
                                }
                            }
                            if (nk0Var.a) {
                                y1 h2 = h();
                                qd4.v(1, arrayList);
                                this.o.remove(h2);
                                if (h2 instanceof by7) {
                                    b((by7) h2);
                                }
                                h2.e().g();
                            }
                            y1[] y1VarArr12 = (y1[]) nk0Var.d;
                            int length9 = y1VarArr12.length;
                            y1Var3 = y1Var;
                            for (int i68 = i; i68 < length9; i68++) {
                                y1Var3 = y1VarArr12[i68];
                                a(y1Var3);
                                z3 = y1Var3.f();
                            }
                            i14 = i;
                        }
                    }
                }
            } else {
                y1Var = y1Var3;
                z = isEmpty;
            }
        }
        if (!z && !this.h && h().c()) {
            c();
            return;
        }
        if (!z) {
            f(arrayList2);
        }
        if (!y1Var.f()) {
            c();
        } else {
            if (this.h) {
                return;
            }
            a(new by7());
            c();
        }
    }

    public final void j(int i) {
        int i2;
        int i3 = this.f;
        if (i >= i3) {
            this.b = this.e;
            this.c = i3;
        }
        int length = this.a.length();
        while (true) {
            i2 = this.c;
            if (i2 >= i || this.b == length) {
                break;
            } else {
                d();
            }
        }
        if (i2 <= i) {
            this.d = false;
            return;
        }
        this.b--;
        this.c = i;
        this.d = true;
    }

    public final void k(int i) {
        int i2 = this.e;
        if (i >= i2) {
            this.b = i2;
            this.c = this.f;
        }
        int length = this.a.length();
        while (true) {
            int i3 = this.b;
            if (i3 >= i || i3 == length) {
                break;
            } else {
                d();
            }
        }
        this.d = false;
    }
}
