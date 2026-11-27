// default package

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import j$.util.Objects;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class d2c implements ly9 {
    public final /* synthetic */ byte a;
    public int b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public d2c(pib pibVar, nib[] nibVarArr) {
        this.a = (byte) 4;
        this.f = pibVar;
        int length = nibVarArr.length;
        this.c = new nib[length];
        this.b = length - 1;
        int e = pibVar.e() + 1;
        nib[][] nibVarArr2 = new nib[e][];
        int[] iArr = new int[e];
        for (nib nibVar : nibVarArr) {
            int i = nibVar.a.a;
            iArr[i] = iArr[i] + 1;
        }
        for (int i2 = 0; i2 < e; i2++) {
            nibVarArr2[i2] = new nib[iArr[i2]];
        }
        Arrays.fill(iArr, 0);
        for (nib nibVar2 : nibVarArr) {
            int i3 = nibVar2.a.a;
            nib[] nibVarArr3 = nibVarArr2[i3];
            int i4 = iArr[i3];
            iArr[i3] = i4 + 1;
            nibVarArr3[i4] = nibVar2;
        }
        this.d = nibVarArr2;
        this.e = new int[((pib) this.f).e() + 1];
    }

    public static void d(float[] fArr, int i, float f, float f2, float f3, float f4) {
        int i2 = i << 3;
        fArr[i2] = f;
        fArr[i2 + 1] = f2;
        fArr[i2 + 2] = f3;
        fArr[i2 + 3] = f2;
        fArr[i2 + 4] = f3;
        fArr[i2 + 5] = f4;
        fArr[i2 + 6] = f;
        fArr[i2 + 7] = f4;
    }

    public static /* synthetic */ void m(d2c d2cVar, String str, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = d2cVar.b;
        }
        d2cVar.l(i, str, (i2 & 4) != 0 ? "" : "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'");
        throw null;
    }

    public final int a(int i, CharSequence charSequence) {
        int i2 = i + 4;
        if (i2 < charSequence.length()) {
            ((StringBuilder) this.e).append((char) (o(i + 3, charSequence) + (o(i, charSequence) << 12) + (o(i + 1, charSequence) << 8) + (o(i + 2, charSequence) << 4)));
            return i2;
        }
        this.b = i;
        if (i2 < charSequence.length()) {
            return a(this.b, charSequence);
        }
        m(this, "Unexpected EOF during unicode escape", 0, 6);
        throw null;
    }

    @Override // ly9
    public final void b(ey7 ey7Var) {
        usb usbVar;
        usb usbVar2;
        SparseArray sparseArray;
        int i;
        zd1 zd1Var;
        int i2;
        int i3;
        usb usbVar3;
        SparseArray sparseArray2 = (SparseArray) this.d;
        SparseIntArray sparseIntArray = (SparseIntArray) this.e;
        zd1 zd1Var2 = (zd1) this.c;
        j6c j6cVar = (j6c) this.f;
        SparseArray sparseArray3 = j6cVar.h;
        SparseBooleanArray sparseBooleanArray = j6cVar.i;
        ed edVar = j6cVar.f;
        List list = j6cVar.c;
        byte b = j6cVar.a;
        if (ey7Var.A() == 2) {
            if (b == 1 || b == 2 || j6cVar.n == 1) {
                usbVar = (usb) list.get(0);
            } else {
                usbVar = new usb(((usb) list.get(0)).d());
                list.add(usbVar);
            }
            if ((ey7Var.A() & 128) != 0) {
                ey7Var.O(1);
                int H = ey7Var.H();
                ey7Var.O(3);
                ey7Var.k(0, 2, zd1Var2.b);
                zd1Var2.l(0);
                zd1Var2.n(3);
                j6cVar.t = zd1Var2.f(13);
                ey7Var.k(0, 2, zd1Var2.b);
                zd1Var2.l(0);
                zd1Var2.n(4);
                ey7Var.O(zd1Var2.f(12));
                if (b == 2 && j6cVar.r == null) {
                    m6c c0 = edVar.c0(21, new sx8(21, null, 0, null, gcc.b));
                    j6cVar.r = c0;
                    if (c0 != null) {
                        c0.c(usbVar, j6cVar.m, new l6c(H, 21, TLObject.FLAG_13));
                    }
                }
                sparseArray2.clear();
                sparseIntArray.clear();
                int a = ey7Var.a();
                while (a > 0) {
                    ey7Var.k(0, 5, zd1Var2.b);
                    zd1Var2.l(0);
                    int f = zd1Var2.f(8);
                    zd1Var2.n(3);
                    int f2 = zd1Var2.f(13);
                    zd1Var2.n(4);
                    int f3 = zd1Var2.f(12);
                    int i4 = ey7Var.b;
                    int i5 = i4 + f3;
                    int i6 = -1;
                    String str = null;
                    ArrayList arrayList = null;
                    int i7 = 0;
                    int i8 = a;
                    while (true) {
                        if (ey7Var.b >= i5) {
                            zd1Var = zd1Var2;
                            break;
                        }
                        int A = ey7Var.A();
                        zd1Var = zd1Var2;
                        int A2 = ey7Var.b + ey7Var.A();
                        if (A2 > i5) {
                            break;
                        }
                        SparseArray sparseArray4 = sparseArray3;
                        if (A == 5) {
                            long C = ey7Var.C();
                            if (C == 1094921523) {
                                i6 = 129;
                            } else if (C == 1161904947) {
                                i6 = 135;
                            } else {
                                if (C != 1094921524) {
                                    if (C == 1212503619) {
                                        i6 = 36;
                                    }
                                }
                                i6 = 172;
                            }
                            i2 = A2;
                            i3 = H;
                            usbVar3 = usbVar;
                        } else if (A == 106) {
                            i2 = A2;
                            i3 = H;
                            usbVar3 = usbVar;
                            i6 = 129;
                        } else if (A == 122) {
                            i3 = H;
                            usbVar3 = usbVar;
                            i6 = 135;
                            i2 = A2;
                        } else {
                            if (A == 127) {
                                int A3 = ey7Var.A();
                                if (A3 != 21) {
                                    if (A3 == 14) {
                                        i6 = jn7.R1;
                                    } else if (A3 == 33) {
                                        i6 = jn7.U1;
                                    }
                                }
                                i6 = 172;
                            } else if (A == 123) {
                                i6 = 138;
                            } else if (A == 10) {
                                str = ey7Var.y(3, StandardCharsets.UTF_8).trim();
                                i2 = A2;
                                i7 = ey7Var.A();
                                i3 = H;
                                usbVar3 = usbVar;
                            } else if (A == 89) {
                                ArrayList arrayList2 = new ArrayList();
                                while (ey7Var.b < A2) {
                                    String trim = ey7Var.y(3, StandardCharsets.UTF_8).trim();
                                    ey7Var.A();
                                    usb usbVar4 = usbVar;
                                    byte[] bArr = new byte[4];
                                    ey7Var.k(0, 4, bArr);
                                    arrayList2.add(new k6c(trim, bArr));
                                    usbVar = usbVar4;
                                    A2 = A2;
                                    H = H;
                                }
                                i2 = A2;
                                i3 = H;
                                usbVar3 = usbVar;
                                arrayList = arrayList2;
                                i6 = 89;
                            } else {
                                i2 = A2;
                                i3 = H;
                                usbVar3 = usbVar;
                                if (A == 111) {
                                    i6 = 257;
                                }
                            }
                            i2 = A2;
                            i3 = H;
                            usbVar3 = usbVar;
                        }
                        ey7Var.O(i2 - ey7Var.b);
                        usbVar = usbVar3;
                        zd1Var2 = zd1Var;
                        sparseArray3 = sparseArray4;
                        H = i3;
                    }
                    SparseArray sparseArray5 = sparseArray3;
                    int i9 = H;
                    usb usbVar5 = usbVar;
                    ey7Var.N(i5);
                    sx8 sx8Var = new sx8(i6, str, i7, arrayList, Arrays.copyOfRange(ey7Var.a, i4, i5));
                    if (f == 6 || f == 5) {
                        f = i6;
                    }
                    int i10 = i8 - (f3 + 5);
                    int i11 = b == 2 ? f : f2;
                    if (!sparseBooleanArray.get(i11)) {
                        m6c c02 = (b == 2 && f == 21) ? j6cVar.r : edVar.c0(f, sx8Var);
                        if (b != 2 || f2 < sparseIntArray.get(i11, TLObject.FLAG_13)) {
                            sparseIntArray.put(i11, f2);
                            sparseArray2.put(i11, c02);
                        }
                    }
                    a = i10;
                    usbVar = usbVar5;
                    zd1Var2 = zd1Var;
                    sparseArray3 = sparseArray5;
                    H = i9;
                }
                SparseArray sparseArray6 = sparseArray3;
                int i12 = H;
                usb usbVar6 = usbVar;
                int size = sparseIntArray.size();
                int i13 = 0;
                while (i13 < size) {
                    int keyAt = sparseIntArray.keyAt(i13);
                    int valueAt = sparseIntArray.valueAt(i13);
                    sparseBooleanArray.put(keyAt, true);
                    j6cVar.j.put(valueAt, true);
                    m6c m6cVar = (m6c) sparseArray2.valueAt(i13);
                    if (m6cVar != null) {
                        if (m6cVar != j6cVar.r) {
                            i = i12;
                            usbVar2 = usbVar6;
                            m6cVar.c(usbVar2, j6cVar.m, new l6c(i, keyAt, TLObject.FLAG_13));
                        } else {
                            usbVar2 = usbVar6;
                            i = i12;
                        }
                        sparseArray = sparseArray6;
                        sparseArray.put(valueAt, m6cVar);
                    } else {
                        usbVar2 = usbVar6;
                        sparseArray = sparseArray6;
                        i = i12;
                    }
                    i13++;
                    sparseArray6 = sparseArray;
                    i12 = i;
                    usbVar6 = usbVar2;
                }
                SparseArray sparseArray7 = sparseArray6;
                if (b == 2) {
                    if (j6cVar.o) {
                        return;
                    }
                    j6cVar.m.D();
                    j6cVar.n = 0;
                    j6cVar.o = true;
                    return;
                }
                sparseArray7.remove(this.b);
                int i14 = b == 1 ? 0 : j6cVar.n - 1;
                j6cVar.n = i14;
                if (i14 == 0) {
                    j6cVar.m.D();
                    j6cVar.o = true;
                }
            }
        }
    }

    public final boolean e() {
        int i = this.b;
        if (i == -1) {
            return false;
        }
        String str = (String) this.f;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.b = i;
                return (charAt == ',' || charAt == ':' || charAt == ']' || charAt == '}') ? false : true;
            }
            i++;
        }
        this.b = i;
        return false;
    }

    public final void f(int i, String str) {
        String str2 = (String) this.f;
        if (str2.length() - i < str.length()) {
            m(this, "Unexpected end of boolean literal", 0, 6);
            throw null;
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i2) != (str2.charAt(i + i2) | ' ')) {
                m(this, "Expected valid boolean literal prefix, but had '" + k() + '\'', 0, 6);
                throw null;
            }
        }
        this.b = str.length() + i;
    }

    public final String g() {
        String str;
        StringBuilder sb = (StringBuilder) this.e;
        String str2 = (String) this.f;
        h('\"');
        int i = this.b;
        int g = ddb.g(str2, '\"', i, 4);
        if (g == -1) {
            k();
            n((byte) 1, false);
            throw null;
        }
        int i2 = i;
        while (i2 < g) {
            if (str2.charAt(i2) == '\\') {
                int i3 = this.b;
                char charAt = str2.charAt(i2);
                boolean z = false;
                while (charAt != '\"') {
                    if (charAt == '\\') {
                        sb.append((CharSequence) str2, i3, i2);
                        int r = r(i2 + 1);
                        if (r == -1) {
                            m(this, "Expected escape sequence to continue, got EOF", 0, 6);
                            throw null;
                        }
                        int i4 = r + 1;
                        char charAt2 = str2.charAt(r);
                        if (charAt2 == 'u') {
                            i4 = a(i4, str2);
                        } else {
                            char c = charAt2 < 'u' ? xj1.a[charAt2] : (char) 0;
                            if (c == 0) {
                                m(this, "Invalid escaped char '" + charAt2 + '\'', 0, 6);
                                throw null;
                            }
                            sb.append(c);
                        }
                        i3 = r(i4);
                        if (i3 == -1) {
                            m(this, "Unexpected EOF", i3, 4);
                            throw null;
                        }
                    } else {
                        i2++;
                        if (i2 >= str2.length()) {
                            sb.append((CharSequence) str2, i3, i2);
                            i3 = r(i2);
                            if (i3 == -1) {
                                m(this, "Unexpected EOF", i3, 4);
                                throw null;
                            }
                        } else {
                            continue;
                            charAt = str2.charAt(i2);
                        }
                    }
                    i2 = i3;
                    z = true;
                    charAt = str2.charAt(i2);
                }
                if (z) {
                    sb.append((CharSequence) str2, i3, i2);
                    String sb2 = sb.toString();
                    sb.setLength(0);
                    str = sb2;
                } else {
                    str = str2.subSequence(i3, i2).toString();
                }
                this.b = i2 + 1;
                return str;
            }
            i2++;
        }
        this.b = g + 1;
        return str2.substring(i, g);
    }

    public final void h(char c) {
        int i = this.b;
        if (i == -1) {
            v(c);
            throw null;
        }
        String str = (String) this.f;
        while (i < str.length()) {
            int i2 = i + 1;
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.b = i2;
                if (charAt == c) {
                    return;
                }
                v(c);
                throw null;
            }
            i = i2;
        }
        this.b = -1;
        v(c);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0178, code lost:
    
        if (r10 == Long.MIN_VALUE) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x017b, code lost:
    
        return -r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x017c, code lost:
    
        m(r24, "Numeric value overflow", 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0180, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x014d, code lost:
    
        m(r24, "Can't convert " + r1 + " to Long", 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0164, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0165, code lost:
    
        m(r24, "Numeric value overflow", 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0169, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x012f, code lost:
    
        if (r11 != true) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0131, code lost:
    
        r3 = java.lang.Math.pow(10.0d, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x016f, code lost:
    
        throw new zp2();
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0170, code lost:
    
        r10 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0181, code lost:
    
        m(r24, "Expected numeric literal", 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0187, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x00f8, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00dc, code lost:
    
        m(r24, "Unexpected symbol '" + r5 + "' in numeric literal", 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00f3, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00f4, code lost:
    
        if (r12 == r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00f6, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00f9, code lost:
    
        if (r1 == r12) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00fb, code lost:
    
        if (r14 == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00ff, code lost:
    
        if (r1 == (r12 - 1)) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0101, code lost:
    
        if (r3 == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0103, code lost:
    
        if (r5 == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x010b, code lost:
    
        if (r2.charAt(r12) != '\"') goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x010d, code lost:
    
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0110, code lost:
    
        m(r24, "Expected closing quotation mark", 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0116, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0117, code lost:
    
        m(r24, "EOF", 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x011b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x011c, code lost:
    
        r24.b = r12;
        r1 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0120, code lost:
    
        if (r13 == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0122, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0125, code lost:
    
        if (r11 != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0127, code lost:
    
        r3 = java.lang.Math.pow(10.0d, -r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0136, code lost:
    
        r1 = r1 * r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x013b, code lost:
    
        if (r1 > 9.223372036854776E18d) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0141, code lost:
    
        if (r1 < (-9.223372036854776E18d)) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0149, code lost:
    
        if (java.lang.Math.floor(r1) != r1) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x014b, code lost:
    
        r10 = (long) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0171, code lost:
    
        if (r14 == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0173, code lost:
    
        return r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long i() {
        boolean z;
        int r = r(t());
        String str = (String) this.f;
        int i = 6;
        if (r >= str.length() || r == -1) {
            m(this, "EOF", 0, 6);
            throw null;
        }
        if (str.charAt(r) == '\"') {
            r++;
            if (r == str.length()) {
                m(this, "EOF", 0, 6);
                throw null;
            }
            z = true;
        } else {
            z = false;
        }
        int i2 = r;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        while (true) {
            long j4 = j2;
            if (i2 == str.length()) {
                break;
            }
            char charAt = str.charAt(i2);
            if ((charAt != 'e' && charAt != 'E') || z3) {
                if (charAt == '-' && z3) {
                    if (i2 == r) {
                        m(this, "Unexpected symbol '-' in numeric literal", 0, 6);
                        throw null;
                    }
                    i2++;
                    z2 = false;
                } else if (charAt != '+' || !z3) {
                    if (charAt != '-') {
                        if (lpd.a(charAt) != 0) {
                            break;
                        }
                        i2++;
                        int i3 = charAt - '0';
                        if (i3 < 0 || i3 >= 10) {
                            break;
                        }
                        if (z3) {
                            j = (j * 10) + i3;
                        } else {
                            j3 = (j3 * 10) - i3;
                            if (j3 > j4) {
                                m(this, "Numeric value overflow", 0, 6);
                                throw null;
                            }
                        }
                    } else {
                        if (i2 != r) {
                            m(this, "Unexpected symbol '-' in numeric literal", 0, 6);
                            throw null;
                        }
                        i2++;
                        j2 = j4;
                        i = 6;
                        z4 = true;
                    }
                } else {
                    if (i2 == r) {
                        m(this, "Unexpected symbol '+' in numeric literal", 0, 6);
                        throw null;
                    }
                    i2++;
                    j2 = j4;
                    i = 6;
                    z2 = true;
                }
                j2 = j4;
                i = 6;
            } else {
                if (i2 == r) {
                    m(this, "Unexpected symbol " + charAt + " in numeric literal", 0, i);
                    throw null;
                }
                i2++;
                j2 = j4;
                z2 = true;
                z3 = true;
            }
        }
    }

    public final String j() {
        String str = (String) this.d;
        if (str == null) {
            return g();
        }
        str.getClass();
        this.d = null;
        return str;
    }

    public final String k() {
        String str;
        StringBuilder sb = (StringBuilder) this.e;
        String str2 = (String) this.f;
        String str3 = (String) this.d;
        if (str3 != null) {
            str3.getClass();
            this.d = null;
            return str3;
        }
        int t = t();
        if (t >= str2.length() || t == -1) {
            m(this, "EOF", t, 4);
            throw null;
        }
        byte a = lpd.a(str2.charAt(t));
        if (a == 1) {
            return j();
        }
        if (a != 0) {
            m(this, "Expected beginning of the string, but got " + str2.charAt(t), 0, 6);
            throw null;
        }
        boolean z = false;
        while (lpd.a(str2.charAt(t)) == 0) {
            t++;
            if (t >= str2.length()) {
                sb.append((CharSequence) str2, this.b, t);
                int r = r(t);
                if (r == -1) {
                    this.b = t;
                    sb.append((CharSequence) str2, 0, 0);
                    String sb2 = sb.toString();
                    sb.setLength(0);
                    return sb2;
                }
                t = r;
                z = true;
            }
        }
        int i = this.b;
        if (z) {
            sb.append((CharSequence) str2, i, t);
            String sb3 = sb.toString();
            sb.setLength(0);
            str = sb3;
        } else {
            str = str2.subSequence(i, t).toString();
        }
        this.b = t;
        return str;
    }

    public final void l(int i, String str, String str2) {
        str2.getClass();
        String concat = str2.length() == 0 ? "" : "\n".concat(str2);
        StringBuilder l = c00.l(str, " at path: ");
        l.append(((lp) this.c).m());
        l.append(concat);
        String sb = l.toString();
        String str3 = (String) this.f;
        str3.getClass();
        String str4 = sb + "\nJSON input: " + ((Object) hqe.b(i, str3));
        if (i >= 0) {
            str4 = dze.d("Unexpected JSON token at offset ", i, ": ", str4);
        }
        throw new ww5(str4);
    }

    public final void n(byte b, boolean z) {
        String str = (String) this.f;
        String str2 = b == 1 ? "quotation mark '\"'" : b == 2 ? "string escape sequence '\\'" : b == 4 ? "comma ','" : b == 5 ? "colon ':'" : b == 6 ? "start of the object '{'" : b == 7 ? "end of the object '}'" : b == 8 ? "start of the array '['" : b == 9 ? "end of the array ']'" : b == 10 ? "end of the input" : b == Byte.MAX_VALUE ? "invalid token" : "valid token";
        int i = this.b;
        int i2 = z ? i - 1 : i;
        m(this, c00.j("Expected ", str2, ", but had '", (i == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2)), "' instead"), i2, 4);
        throw null;
    }

    public final int o(int i, CharSequence charSequence) {
        char charAt = charSequence.charAt(i);
        if ('0' <= charAt && charAt < ':') {
            return charAt - '0';
        }
        if ('a' <= charAt && charAt < 'g') {
            return charAt - 'W';
        }
        if ('A' <= charAt && charAt < 'G') {
            return charAt - '7';
        }
        m(this, "Invalid toHexChar char '" + charAt + "' in unicode escape", 0, 6);
        throw null;
    }

    public final boolean p(d2c d2cVar, int i) {
        return Objects.equals(((qa9[]) this.c)[i], ((qa9[]) d2cVar.c)[i]) && Objects.equals(((e74[]) this.d)[i], ((e74[]) d2cVar.d)[i]);
    }

    public final boolean q(int i) {
        return ((qa9[]) this.c)[i] != null;
    }

    public final int r(int i) {
        if (i < ((String) this.f).length()) {
            return i;
        }
        return -1;
    }

    public final void s(int i, int i2) {
        int[] iArr = (int[]) this.f;
        int i3 = i << 2;
        iArr[i3] = i2;
        iArr[i3 + 1] = i2;
        iArr[i3 + 2] = i2;
        iArr[i3 + 3] = i2;
    }

    public final int t() {
        char charAt;
        int i = this.b;
        if (i == -1) {
            return i;
        }
        String str = (String) this.f;
        while (i < str.length() && ((charAt = str.charAt(i)) == ' ' || charAt == '\n' || charAt == '\r' || charAt == '\t')) {
            i++;
        }
        this.b = i;
        return i;
    }

    public final String toString() {
        switch (this.a) {
            case 2:
                StringBuilder sb = new StringBuilder(jn7.d3);
                sb.append("<<\n mode: ");
                sb.append((qg7) this.c);
                sb.append("\n ecLevel: ");
                sb.append((r44) this.d);
                sb.append("\n version: ");
                sb.append((xdc) this.e);
                sb.append("\n maskPattern: ");
                sb.append(this.b);
                if (((sj0) this.f) == null) {
                    sb.append("\n matrix: null\n");
                } else {
                    sb.append("\n matrix:\n");
                    sb.append((sj0) this.f);
                }
                sb.append(">>\n");
                return sb.toString();
            case 3:
                StringBuilder sb2 = new StringBuilder("JsonReader(source='");
                sb2.append(this.f);
                sb2.append("', currentPosition=");
                sb2.append(this.b);
                sb2.append(')');
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public final boolean u() {
        int t = t();
        String str = (String) this.f;
        if (t >= str.length() || t == -1 || str.charAt(t) != ',') {
            return false;
        }
        this.b++;
        return true;
    }

    public final void v(char c) {
        int i = this.b;
        if (i > 0 && c == '\"') {
            try {
                this.b = i - 1;
                String k = k();
                this.b = i;
                if (ur5.a(k, "null")) {
                    l(this.b - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.b = i;
                throw th;
            }
        }
        n(lpd.a(c), true);
        throw null;
    }

    public final void w(int i) {
        int[] iArr = (int[]) this.e;
        if (iArr[i] != 0) {
            return;
        }
        iArr[i] = 1;
        for (nib nibVar : ((nib[][]) this.d)[i]) {
            w(nibVar.a.b);
            nib[] nibVarArr = (nib[]) this.c;
            int i2 = this.b;
            this.b = i2 - 1;
            nibVarArr[i2] = nibVar;
        }
        iArr[i] = 2;
    }

    @Override // ly9
    public final void c(usb usbVar, g84 g84Var, l6c l6cVar) {
    }

    public d2c(int i) {
        this.a = (byte) 1;
        this.b = i;
        int i2 = i << 3;
        this.c = new float[i2];
        this.d = new float[i2];
        this.e = new short[i * 6];
        this.f = new int[i << 2];
        for (short s = 0; s < i; s = (short) (s + 1)) {
            int i3 = s * 6;
            int i4 = s << 2;
            short[] sArr = (short[]) this.e;
            short s2 = (short) i4;
            sArr[i3] = s2;
            sArr[i3 + 1] = (short) (i4 + 1);
            short s3 = (short) (i4 + 2);
            sArr[i3 + 2] = s3;
            sArr[i3 + 3] = s3;
            sArr[i3 + 4] = (short) (i4 + 3);
            sArr[i3 + 5] = s2;
        }
    }

    public d2c(qa9[] qa9VarArr, e74[] e74VarArr, f2c f2cVar, lo loVar) {
        this.a = (byte) 0;
        yve.f(qa9VarArr.length == e74VarArr.length);
        this.c = qa9VarArr;
        this.d = (e74[]) e74VarArr.clone();
        this.e = f2cVar;
        this.f = loVar;
        this.b = qa9VarArr.length;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d2c(String str) {
        this.a = (byte) 3;
        str.getClass();
        lp lpVar = new lp((byte) 6, (boolean) (0 == true ? 1 : 0));
        lpVar.c = new Object[8];
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        lpVar.d = iArr;
        lpVar.b = -1;
        this.c = lpVar;
        this.e = new StringBuilder();
        this.f = str;
    }

    public d2c(j6c j6cVar, int i) {
        this.a = (byte) 5;
        this.f = j6cVar;
        this.c = new zd1(5, new byte[5]);
        this.d = new SparseArray();
        this.e = new SparseIntArray();
        this.b = i;
    }

    public /* synthetic */ d2c() {
        this.a = (byte) 2;
    }
}
