package a4;

import a8.wa;
import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.core.graphics.drawable.IconCompat;
import androidx.emoji2.text.w;
import bg.o0;
import e0.j0;
import e0.l0;
import e0.m;
import e0.o;
import e0.q;
import h2.k0;
import h2.m0;
import h2.x;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import m4.a0;
import m4.e0;
import m4.f0;
import m4.g0;
import m4.h0;
import m6.n;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Components.bx0;
import org.telegram.ui.Components.dx0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public class k implements a0 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public /* synthetic */ k() {
        this.a = 2;
    }

    public static void d(float[] fArr, int i7, float f10, float f11, float f12, float f13) {
        int i10 = i7 * 8;
        fArr[i10] = f10;
        fArr[i10 + 1] = f11;
        fArr[i10 + 2] = f12;
        fArr[i10 + 3] = f11;
        fArr[i10 + 4] = f12;
        fArr[i10 + 5] = f13;
        fArr[i10 + 6] = f10;
        fArr[i10 + 7] = f13;
    }

    public static /* synthetic */ void n(k kVar, String str, int i7, int i10) {
        if ((i10 & 2) != 0) {
            i7 = kVar.b;
        }
        kVar.m(i7, str, (i10 & 4) != 0 ? "" : "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'");
        throw null;
    }

    public static void s(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -4;
    }

    public int a(int i7, CharSequence charSequence) {
        int i10 = i7 + 4;
        if (i10 < charSequence.length()) {
            ((StringBuilder) this.e).append((char) (p(i7 + 3, charSequence) + (p(i7, charSequence) << 12) + (p(i7 + 1, charSequence) << 8) + (p(i7 + 2, charSequence) << 4)));
            return i10;
        }
        this.b = i7;
        if (i10 < charSequence.length()) {
            return a(this.b, charSequence);
        }
        n(this, "Unexpected EOF during unicode escape", 0, 6);
        throw null;
    }

    @Override // m4.a0
    public void c(x xVar) {
        k0 k0Var;
        k0 k0Var2;
        SparseArray sparseArray;
        int i7;
        d4.f fVar;
        char c10;
        int i10;
        int i11;
        k0 k0Var3;
        SparseArray sparseArray2 = (SparseArray) this.d;
        SparseIntArray sparseIntArray = (SparseIntArray) this.e;
        d4.f fVar2 = (d4.f) this.c;
        e0 e0Var = (e0) this.f;
        SparseArray sparseArray3 = e0Var.h;
        SparseBooleanArray sparseBooleanArray = e0Var.i;
        m4.f fVar3 = e0Var.f;
        List list = e0Var.c;
        int i12 = e0Var.a;
        if (xVar.A() == 2) {
            if (i12 == 1 || i12 == 2 || e0Var.n == 1) {
                k0Var = (k0) list.get(0);
            } else {
                k0Var = new k0(((k0) list.get(0)).d());
                list.add(k0Var);
            }
            if ((xVar.A() & 128) != 0) {
                xVar.O(1);
                int H = xVar.H();
                xVar.O(3);
                xVar.k(0, 2, (byte[]) fVar2.b);
                fVar2.J(0);
                fVar2.L(3);
                e0Var.t = fVar2.j(13);
                xVar.k(0, 2, (byte[]) fVar2.b);
                fVar2.J(0);
                fVar2.L(4);
                xVar.O(fVar2.j(12));
                if (i12 == 2 && e0Var.r == null) {
                    h0 a10 = fVar3.a(21, new n(21, null, 0, null, m0.b));
                    e0Var.r = a10;
                    if (a10 != null) {
                        a10.b(k0Var, e0Var.m, new g0(H, 21, TLObject.FLAG_13));
                    }
                }
                sparseArray2.clear();
                sparseIntArray.clear();
                int a11 = xVar.a();
                while (a11 > 0) {
                    xVar.k(0, 5, (byte[]) fVar2.b);
                    fVar2.J(0);
                    int j3 = fVar2.j(8);
                    fVar2.L(3);
                    int j10 = fVar2.j(13);
                    fVar2.L(4);
                    int j11 = fVar2.j(12);
                    int i13 = xVar.b;
                    int i14 = i13 + j11;
                    int i15 = -1;
                    String str = null;
                    ArrayList arrayList = null;
                    int i16 = 0;
                    int i17 = a11;
                    while (true) {
                        if (xVar.b >= i14) {
                            fVar = fVar2;
                            break;
                        }
                        int A = xVar.A();
                        fVar = fVar2;
                        int A2 = xVar.b + xVar.A();
                        if (A2 > i14) {
                            break;
                        }
                        SparseArray sparseArray4 = sparseArray3;
                        if (A == 5) {
                            long C = xVar.C();
                            if (C == 1094921523) {
                                i15 = 129;
                            } else if (C == 1161904947) {
                                i15 = 135;
                            } else {
                                if (C != 1094921524) {
                                    if (C == 1212503619) {
                                        i15 = 36;
                                    }
                                }
                                i15 = 172;
                            }
                            i10 = A2;
                            i11 = H;
                            k0Var3 = k0Var;
                        } else if (A == 106) {
                            i10 = A2;
                            i11 = H;
                            k0Var3 = k0Var;
                            i15 = 129;
                        } else if (A == 122) {
                            i11 = H;
                            k0Var3 = k0Var;
                            i15 = 135;
                            i10 = A2;
                        } else {
                            if (A == 127) {
                                int A3 = xVar.A();
                                if (A3 != 21) {
                                    if (A3 == 14) {
                                        i15 = qs.S1;
                                    } else if (A3 == 33) {
                                        i15 = qs.V1;
                                    }
                                }
                                i15 = 172;
                            } else if (A == 123) {
                                i15 = 138;
                            } else if (A == 10) {
                                str = xVar.y(3, StandardCharsets.UTF_8).trim();
                                i10 = A2;
                                i16 = xVar.A();
                                i11 = H;
                                k0Var3 = k0Var;
                            } else {
                                if (A == 89) {
                                    ArrayList arrayList2 = new ArrayList();
                                    while (xVar.b < A2) {
                                        String trim = xVar.y(3, StandardCharsets.UTF_8).trim();
                                        xVar.A();
                                        k0 k0Var4 = k0Var;
                                        byte[] bArr = new byte[4];
                                        xVar.k(0, 4, bArr);
                                        arrayList2.add(new f0(trim, bArr));
                                        k0Var = k0Var4;
                                        A2 = A2;
                                        H = H;
                                    }
                                    i10 = A2;
                                    i11 = H;
                                    k0Var3 = k0Var;
                                    arrayList = arrayList2;
                                    i15 = 89;
                                } else {
                                    i10 = A2;
                                    i11 = H;
                                    k0Var3 = k0Var;
                                    if (A == 111) {
                                        i15 = 257;
                                    }
                                }
                                xVar.O(i10 - xVar.b);
                                k0Var = k0Var3;
                                fVar2 = fVar;
                                sparseArray3 = sparseArray4;
                                H = i11;
                            }
                            i10 = A2;
                            i11 = H;
                            k0Var3 = k0Var;
                        }
                        xVar.O(i10 - xVar.b);
                        k0Var = k0Var3;
                        fVar2 = fVar;
                        sparseArray3 = sparseArray4;
                        H = i11;
                    }
                    SparseArray sparseArray5 = sparseArray3;
                    int i18 = H;
                    k0 k0Var5 = k0Var;
                    xVar.N(i14);
                    n nVar = new n(i15, str, i16, arrayList, Arrays.copyOfRange(xVar.a, i13, i14));
                    if (j3 == 6 || j3 == 5) {
                        j3 = i15;
                    }
                    int i19 = i17 - (j11 + 5);
                    int i20 = i12 == 2 ? j3 : j10;
                    if (sparseBooleanArray.get(i20)) {
                        c10 = 21;
                    } else {
                        c10 = 21;
                        h0 a12 = (i12 == 2 && j3 == 21) ? e0Var.r : fVar3.a(j3, nVar);
                        if (i12 != 2 || j10 < sparseIntArray.get(i20, TLObject.FLAG_13)) {
                            sparseIntArray.put(i20, j10);
                            sparseArray2.put(i20, a12);
                        }
                    }
                    a11 = i19;
                    k0Var = k0Var5;
                    fVar2 = fVar;
                    sparseArray3 = sparseArray5;
                    H = i18;
                }
                SparseArray sparseArray6 = sparseArray3;
                int i21 = H;
                k0 k0Var6 = k0Var;
                int size = sparseIntArray.size();
                int i22 = 0;
                while (i22 < size) {
                    int keyAt = sparseIntArray.keyAt(i22);
                    int valueAt = sparseIntArray.valueAt(i22);
                    sparseBooleanArray.put(keyAt, true);
                    e0Var.j.put(valueAt, true);
                    h0 h0Var = (h0) sparseArray2.valueAt(i22);
                    if (h0Var != null) {
                        if (h0Var != e0Var.r) {
                            i7 = i21;
                            k0Var2 = k0Var6;
                            h0Var.b(k0Var2, e0Var.m, new g0(i7, keyAt, TLObject.FLAG_13));
                        } else {
                            k0Var2 = k0Var6;
                            i7 = i21;
                        }
                        sparseArray = sparseArray6;
                        sparseArray.put(valueAt, h0Var);
                    } else {
                        k0Var2 = k0Var6;
                        sparseArray = sparseArray6;
                        i7 = i21;
                    }
                    i22++;
                    sparseArray6 = sparseArray;
                    i21 = i7;
                    k0Var6 = k0Var2;
                }
                SparseArray sparseArray7 = sparseArray6;
                if (i12 == 2) {
                    if (e0Var.o) {
                        return;
                    }
                    e0Var.m.U0();
                    e0Var.n = 0;
                    e0Var.o = true;
                    return;
                }
                sparseArray7.remove(this.b);
                int i23 = i12 == 1 ? 0 : e0Var.n - 1;
                e0Var.n = i23;
                if (i23 == 0) {
                    e0Var.m.U0();
                    e0Var.o = true;
                }
            }
        }
    }

    public boolean e() {
        int i7 = this.b;
        if (i7 == -1) {
            return false;
        }
        String str = (String) this.f;
        while (i7 < str.length()) {
            char charAt = str.charAt(i7);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.b = i7;
                return (charAt == ',' || charAt == ':' || charAt == ']' || charAt == '}') ? false : true;
            }
            i7++;
        }
        this.b = i7;
        return false;
    }

    public void f(int i7, String str) {
        String str2 = (String) this.f;
        if (str2.length() - i7 < str.length()) {
            n(this, "Unexpected end of boolean literal", 0, 6);
            throw null;
        }
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (str.charAt(i10) != (str2.charAt(i7 + i10) | ' ')) {
                n(this, "Expected valid boolean literal prefix, but had '" + k() + '\'', 0, 6);
                throw null;
            }
        }
        this.b = str.length() + i7;
    }

    public String g() {
        StringBuilder sb2 = (StringBuilder) this.e;
        String str = (String) this.f;
        h('\"');
        int i7 = this.b;
        int h = xd.d.h('\"', i7, 4, str);
        if (h == -1) {
            k();
            o((byte) 1, false);
            throw null;
        }
        int i10 = i7;
        while (i10 < h) {
            if (str.charAt(i10) == '\\') {
                int i11 = this.b;
                char charAt = str.charAt(i10);
                boolean z9 = false;
                while (charAt != '\"') {
                    if (charAt == '\\') {
                        sb2.append((CharSequence) str, i11, i10);
                        int r10 = r(i10 + 1);
                        if (r10 == -1) {
                            n(this, "Expected escape sequence to continue, got EOF", 0, 6);
                            throw null;
                        }
                        int i12 = r10 + 1;
                        char charAt2 = str.charAt(r10);
                        if (charAt2 == 'u') {
                            i12 = a(i12, str);
                        } else {
                            char c10 = charAt2 < 'u' ? qe.c.a[charAt2] : (char) 0;
                            if (c10 == 0) {
                                n(this, "Invalid escaped char '" + charAt2 + '\'', 0, 6);
                                throw null;
                            }
                            sb2.append(c10);
                        }
                        i11 = r(i12);
                        if (i11 == -1) {
                            n(this, "Unexpected EOF", i11, 4);
                            throw null;
                        }
                    } else {
                        i10++;
                        if (i10 >= str.length()) {
                            sb2.append((CharSequence) str, i11, i10);
                            i11 = r(i10);
                            if (i11 == -1) {
                                n(this, "Unexpected EOF", i11, 4);
                                throw null;
                            }
                        } else {
                            continue;
                            charAt = str.charAt(i10);
                        }
                    }
                    i10 = i11;
                    z9 = true;
                    charAt = str.charAt(i10);
                }
                String obj = !z9 ? str.subSequence(i11, i10).toString() : l(i11, i10);
                this.b = i10 + 1;
                return obj;
            }
            i10++;
        }
        this.b = h + 1;
        String substring = str.substring(i7, h);
        kotlin.jvm.internal.j.d(substring, "substring(...)");
        return substring;
    }

    public void h(char c10) {
        int i7 = this.b;
        if (i7 == -1) {
            w(c10);
            throw null;
        }
        String str = (String) this.f;
        while (i7 < str.length()) {
            int i10 = i7 + 1;
            char charAt = str.charAt(i7);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.b = i10;
                if (charAt == c10) {
                    return;
                }
                w(c10);
                throw null;
            }
            i7 = i10;
        }
        this.b = -1;
        w(c10);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x018e, code lost:
    
        if (r10 == Long.MIN_VALUE) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0191, code lost:
    
        return -r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0192, code lost:
    
        n(r22, "Numeric value overflow", 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0197, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0161, code lost:
    
        n(r22, "Can't convert " + r1 + " to Long", 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0179, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x017a, code lost:
    
        n(r22, "Numeric value overflow", 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x017f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0143, code lost:
    
        if (r11 != 1) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0145, code lost:
    
        r3 = java.lang.Math.pow(10.0d, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0185, code lost:
    
        throw new androidx.car.app.j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0186, code lost:
    
        r10 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0198, code lost:
    
        n(r22, "Expected numeric literal", 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x019d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0105, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00e9, code lost:
    
        n(r22, "Unexpected symbol '" + r5 + "' in numeric literal", r7, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0100, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0101, code lost:
    
        if (r12 == r1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0103, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0106, code lost:
    
        if (r1 == r12) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0108, code lost:
    
        if (r14 == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x010c, code lost:
    
        if (r1 == (r12 - 1)) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0113, code lost:
    
        if (r3 == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0115, code lost:
    
        if (r5 == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x011d, code lost:
    
        if (r2.charAt(r12) != '\"') goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x011f, code lost:
    
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0122, code lost:
    
        n(r22, "Expected closing quotation mark", 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0129, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x012a, code lost:
    
        n(r22, "EOF", 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x012f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0130, code lost:
    
        r22.b = r12;
        r1 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0134, code lost:
    
        if (r13 == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0136, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0139, code lost:
    
        if (r11 != 0) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x013b, code lost:
    
        r3 = java.lang.Math.pow(10.0d, -r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x014a, code lost:
    
        r1 = r1 * r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x014f, code lost:
    
        if (r1 > 9.223372036854776E18d) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0155, code lost:
    
        if (r1 < (-9.223372036854776E18d)) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x015d, code lost:
    
        if (java.lang.Math.floor(r1) != r1) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x015f, code lost:
    
        r10 = (long) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0187, code lost:
    
        if (r14 == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0189, code lost:
    
        return r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long i() {
        boolean z9;
        int r10 = r(u());
        String str = (String) this.f;
        int i7 = 6;
        int i10 = 0;
        if (r10 >= str.length() || r10 == -1) {
            n(this, "EOF", 0, 6);
            throw null;
        }
        if (str.charAt(r10) == '\"') {
            r10++;
            if (r10 == str.length()) {
                n(this, "EOF", 0, 6);
                throw null;
            }
            z9 = true;
        } else {
            z9 = false;
        }
        int i11 = r10;
        int i12 = 0;
        boolean z10 = false;
        boolean z11 = false;
        long j3 = 0;
        long j10 = 0;
        long j11 = 0;
        while (true) {
            long j12 = j10;
            if (i11 == str.length()) {
                break;
            }
            char charAt = str.charAt(i11);
            if ((charAt == 'e' || charAt == 'E') && !z10) {
                if (i11 == r10) {
                    n(this, "Unexpected symbol " + charAt + " in numeric literal", i10, i7);
                    throw null;
                }
                i11++;
                j10 = j12;
                i12 = 1;
                z10 = true;
            } else if (charAt == '-' && z10) {
                if (i11 == r10) {
                    n(this, "Unexpected symbol '-' in numeric literal", i10, 6);
                    throw null;
                }
                i11++;
                i12 = i10;
                j10 = j12;
                i7 = 6;
            } else if (charAt != '+' || !z10) {
                if (charAt != '-') {
                    if (qe.f.b(charAt) != 0) {
                        break;
                    }
                    i11++;
                    int i13 = charAt - '0';
                    if (i13 < 0 || i13 >= 10) {
                        break;
                    }
                    if (z10) {
                        j3 = (j3 * 10) + i13;
                    } else {
                        j11 = (j11 * 10) - i13;
                        if (j11 > j12) {
                            n(this, "Numeric value overflow", 0, 6);
                            throw null;
                        }
                    }
                    j10 = j12;
                    i7 = 6;
                    i10 = 0;
                } else {
                    if (i11 != r10) {
                        n(this, "Unexpected symbol '-' in numeric literal", i10, 6);
                        throw null;
                    }
                    i11++;
                    j10 = j12;
                    i7 = 6;
                    z11 = true;
                }
            } else {
                if (i11 == r10) {
                    n(this, "Unexpected symbol '+' in numeric literal", i10, 6);
                    throw null;
                }
                i11++;
                j10 = j12;
                i7 = 6;
                i12 = 1;
            }
        }
    }

    public String j() {
        String str = (String) this.d;
        if (str == null) {
            return g();
        }
        kotlin.jvm.internal.j.b(str);
        this.d = null;
        return str;
    }

    public String k() {
        String str = (String) this.f;
        String str2 = (String) this.d;
        if (str2 != null) {
            kotlin.jvm.internal.j.b(str2);
            this.d = null;
            return str2;
        }
        int u10 = u();
        if (u10 >= str.length() || u10 == -1) {
            n(this, "EOF", u10, 4);
            throw null;
        }
        byte b10 = qe.f.b(str.charAt(u10));
        if (b10 == 1) {
            return j();
        }
        if (b10 != 0) {
            n(this, "Expected beginning of the string, but got " + str.charAt(u10), 0, 6);
            throw null;
        }
        boolean z9 = false;
        while (qe.f.b(str.charAt(u10)) == 0) {
            u10++;
            if (u10 >= str.length()) {
                ((StringBuilder) this.e).append((CharSequence) str, this.b, u10);
                int r10 = r(u10);
                if (r10 == -1) {
                    this.b = u10;
                    return l(0, 0);
                }
                u10 = r10;
                z9 = true;
            }
        }
        String obj = !z9 ? str.subSequence(this.b, u10).toString() : l(this.b, u10);
        this.b = u10;
        return obj;
    }

    public String l(int i7, int i10) {
        StringBuilder sb2 = (StringBuilder) this.e;
        sb2.append((CharSequence) this.f, i7, i10);
        String sb3 = sb2.toString();
        kotlin.jvm.internal.j.d(sb3, "toString(...)");
        sb2.setLength(0);
        return sb3;
    }

    public void m(int i7, String message, String hint) {
        kotlin.jvm.internal.j.e(message, "message");
        kotlin.jvm.internal.j.e(hint, "hint");
        String concat = hint.length() == 0 ? "" : "\n".concat(hint);
        StringBuilder j3 = rf.b.j(message, " at path: ");
        j3.append(((wa) this.c).m());
        j3.append(concat);
        String message2 = j3.toString();
        String input = (String) this.f;
        kotlin.jvm.internal.j.e(message2, "message");
        kotlin.jvm.internal.j.e(input, "input");
        String message3 = message2 + "\nJSON input: " + ((Object) qe.f.d(i7, input));
        kotlin.jvm.internal.j.e(message3, "message");
        if (i7 >= 0) {
            message3 = "Unexpected JSON token at offset " + i7 + ": " + message3;
        }
        kotlin.jvm.internal.j.e(message3, "message");
        throw new qe.d(message3);
    }

    public void o(byte b10, boolean z9) {
        String str = (String) this.f;
        String str2 = b10 == 1 ? "quotation mark '\"'" : b10 == 2 ? "string escape sequence '\\'" : b10 == 4 ? "comma ','" : b10 == 5 ? "colon ':'" : b10 == 6 ? "start of the object '{'" : b10 == 7 ? "end of the object '}'" : b10 == 8 ? "start of the array '['" : b10 == 9 ? "end of the array ']'" : b10 == 10 ? "end of the input" : b10 == Byte.MAX_VALUE ? "invalid token" : "valid token";
        int i7 = z9 ? this.b - 1 : this.b;
        n(this, f1.m("Expected ", str2, ", but had '", (this.b == str.length() || i7 < 0) ? "EOF" : String.valueOf(str.charAt(i7)), "' instead"), i7, 4);
        throw null;
    }

    public int p(int i7, CharSequence charSequence) {
        char charAt = charSequence.charAt(i7);
        if ('0' <= charAt && charAt < ':') {
            return charAt - '0';
        }
        if ('a' <= charAt && charAt < 'g') {
            return charAt - 'W';
        }
        if ('A' <= charAt && charAt < 'G') {
            return charAt - '7';
        }
        n(this, "Invalid toHexChar char '" + charAt + "' in unicode escape", 0, 6);
        throw null;
    }

    public void q() {
        ((Canvas) this.c).restore();
        ((Matrix) this.d).set((Matrix) f1.k(1, (ArrayList) this.e));
        this.b--;
    }

    public int r(int i7) {
        if (i7 < ((String) this.f).length()) {
            return i7;
        }
        return -1;
    }

    public void t(int i7, int i10) {
        int[] iArr = (int[]) this.f;
        int i11 = i7 * 4;
        iArr[i11] = i10;
        iArr[i11 + 1] = i10;
        iArr[i11 + 2] = i10;
        iArr[i11 + 3] = i10;
    }

    public String toString() {
        switch (this.a) {
            case 2:
                StringBuilder sb2 = new StringBuilder(qs.e3);
                sb2.append("<<\n mode: ");
                sb2.append((gc.d) this.c);
                sb2.append("\n ecLevel: ");
                sb2.append((gc.b) this.d);
                sb2.append("\n version: ");
                sb2.append((gc.e) this.e);
                sb2.append("\n maskPattern: ");
                sb2.append(this.b);
                if (((cc.c) this.f) == null) {
                    sb2.append("\n matrix: null\n");
                } else {
                    sb2.append("\n matrix:\n");
                    sb2.append((cc.c) this.f);
                }
                sb2.append(">>\n");
                return sb2.toString();
            case 7:
                StringBuilder sb3 = new StringBuilder("JsonReader(source='");
                sb3.append(this.f);
                sb3.append("', currentPosition=");
                sb3.append(this.b);
                sb3.append(')');
                return sb3.toString();
            default:
                return super.toString();
        }
    }

    public int u() {
        char charAt;
        int i7 = this.b;
        if (i7 == -1) {
            return i7;
        }
        String str = (String) this.f;
        while (i7 < str.length() && ((charAt = str.charAt(i7)) == ' ' || charAt == '\n' || charAt == '\r' || charAt == '\t')) {
            i7++;
        }
        this.b = i7;
        return i7;
    }

    public boolean v() {
        int u10 = u();
        String str = (String) this.f;
        if (u10 >= str.length() || u10 == -1 || str.charAt(u10) != ',') {
            return false;
        }
        this.b++;
        return true;
    }

    public void w(char c10) {
        int i7 = this.b;
        if (i7 > 0 && c10 == '\"') {
            try {
                this.b = i7 - 1;
                String k10 = k();
                this.b = i7;
                if (kotlin.jvm.internal.j.a(k10, "null")) {
                    m(this.b - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th2) {
                this.b = i7;
                throw th2;
            }
        }
        o(qe.f.b(c10), true);
        throw null;
    }

    public void x(int i7) {
        int[] iArr = (int[]) this.e;
        if (iArr[i7] != 0) {
            return;
        }
        iArr[i7] = 1;
        for (bx0 bx0Var : ((bx0[][]) this.d)[i7]) {
            x(bx0Var.a.b);
            bx0[] bx0VarArr = (bx0[]) this.c;
            int i10 = this.b;
            this.b = i10 - 1;
            bx0VarArr[i10] = bx0Var;
        }
        iArr[i7] = 2;
    }

    public k(int i7) {
        this.a = 4;
        this.b = i7;
        int i10 = i7 * 8;
        this.c = new float[i10];
        this.d = new float[i10];
        this.e = new short[i7 * 6];
        this.f = new int[i7 * 4];
        for (short s5 = 0; s5 < i7; s5 = (short) (s5 + 1)) {
            int i11 = s5 * 6;
            int i12 = s5 * 4;
            short[] sArr = (short[]) this.e;
            short s9 = (short) i12;
            sArr[i11] = s9;
            sArr[i11 + 1] = (short) (i12 + 1);
            short s10 = (short) (i12 + 2);
            sArr[i11 + 2] = s10;
            sArr[i11 + 3] = s10;
            sArr[i11 + 4] = (short) (i12 + 3);
            sArr[i11 + 5] = s9;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:157:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k(q qVar) {
        String str;
        int i7;
        Notification.BubbleMetadata bubbleMetadata;
        int i10;
        Notification.BubbleMetadata a10;
        f0.g gVar;
        Bundle bundle;
        ArrayList arrayList;
        int i11;
        Bundle[] bundleArr;
        ArrayList arrayList2;
        Bundle bundle2;
        this.a = 1;
        new ArrayList();
        this.f = new Bundle();
        this.e = qVar;
        Context context = qVar.a;
        ArrayList arrayList3 = qVar.G;
        ArrayList arrayList4 = qVar.c;
        ArrayList arrayList5 = qVar.d;
        this.c = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.d = z6.a.a(context, qVar.y);
        } else {
            this.d = new Notification.Builder(context);
        }
        Notification notification = qVar.F;
        Context context2 = null;
        ((Notification.Builder) this.d).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(qVar.e).setContentText(qVar.f).setContentInfo(null).setContentIntent(qVar.g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(qVar.i).setProgress(qVar.n, qVar.o, qVar.p);
        Notification.Builder builder = (Notification.Builder) this.d;
        IconCompat iconCompat = qVar.h;
        builder.setLargeIcon(iconCompat == null ? null : iconCompat.m(context));
        ((Notification.Builder) this.d).setSubText(qVar.m).setUsesChronometer(false).setPriority(qVar.j);
        ArrayList arrayList6 = qVar.b;
        int size = arrayList6.size();
        int i12 = 0;
        while (true) {
            str = "android.support.allowGeneratedReplies";
            if (i12 >= size) {
                break;
            }
            Object obj = arrayList6.get(i12);
            i12++;
            e0.h hVar = (e0.h) obj;
            IconCompat a11 = hVar.a();
            int i13 = hVar.f;
            boolean z9 = hVar.d;
            Bundle bundle3 = hVar.a;
            ArrayList arrayList7 = arrayList6;
            int i14 = size;
            Notification.Action.Builder builder2 = new Notification.Action.Builder(a11 != null ? a11.m(context2) : context2, hVar.h, hVar.i);
            l0[] l0VarArr = hVar.c;
            if (l0VarArr != null) {
                RemoteInput[] a12 = l0.a(l0VarArr);
                int length = a12.length;
                int i15 = 0;
                while (i15 < length) {
                    RemoteInput[] remoteInputArr = a12;
                    builder2.addRemoteInput(remoteInputArr[i15]);
                    i15++;
                    a12 = remoteInputArr;
                }
            }
            if (bundle3 != null) {
                bundle2 = new Bundle(bundle3);
            } else {
                bundle2 = new Bundle();
            }
            bundle2.putBoolean("android.support.allowGeneratedReplies", z9);
            int i16 = Build.VERSION.SDK_INT;
            if (i16 >= 24) {
                w.i(builder2, z9);
            }
            bundle2.putInt("android.support.action.semanticAction", i13);
            if (i16 >= 28) {
                d1.f.y(builder2, i13);
            }
            if (i16 >= 29) {
                ab.x.m(builder2);
            }
            if (i16 >= 31) {
                o0.g(builder2);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", hVar.e);
            builder2.addExtras(bundle2);
            ((Notification.Builder) this.d).addAction(builder2.build());
            arrayList6 = arrayList7;
            size = i14;
            context2 = null;
        }
        Bundle bundle4 = qVar.v;
        if (bundle4 != null) {
            ((Bundle) this.f).putAll(bundle4);
        }
        int i17 = Build.VERSION.SDK_INT;
        ((Notification.Builder) this.d).setShowWhen(qVar.k);
        ((Notification.Builder) this.d).setLocalOnly(qVar.t);
        ((Notification.Builder) this.d).setGroup(qVar.q);
        ((Notification.Builder) this.d).setSortKey(qVar.s);
        ((Notification.Builder) this.d).setGroupSummary(qVar.r);
        this.b = qVar.C;
        ((Notification.Builder) this.d).setCategory(qVar.u);
        ((Notification.Builder) this.d).setColor(qVar.w);
        ((Notification.Builder) this.d).setVisibility(qVar.x);
        ((Notification.Builder) this.d).setPublicVersion(null);
        ((Notification.Builder) this.d).setSound(notification.sound, notification.audioAttributes);
        if (i17 < 28) {
            if (arrayList4 == null) {
                arrayList2 = null;
            } else {
                arrayList2 = new ArrayList(arrayList4.size());
                int size2 = arrayList4.size();
                int i18 = 0;
                while (i18 < size2) {
                    Object obj2 = arrayList4.get(i18);
                    i18++;
                    j0 j0Var = (j0) obj2;
                    CharSequence charSequence = j0Var.a;
                    String str2 = j0Var.c;
                    if (str2 == null) {
                        if (charSequence != null) {
                            str2 = "name:" + ((Object) charSequence);
                        } else {
                            str2 = "";
                        }
                    }
                    arrayList2.add(str2);
                }
            }
            if (arrayList2 != null) {
                if (arrayList3 == null) {
                    arrayList3 = arrayList2;
                } else {
                    a0.g gVar2 = new a0.g(arrayList3.size() + arrayList2.size());
                    gVar2.addAll(arrayList2);
                    gVar2.addAll(arrayList3);
                    arrayList3 = new ArrayList(gVar2);
                }
            }
        }
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            int size3 = arrayList3.size();
            int i19 = 0;
            while (i19 < size3) {
                Object obj3 = arrayList3.get(i19);
                i19++;
                ((Notification.Builder) this.d).addPerson((String) obj3);
            }
        }
        if (arrayList5.size() > 0) {
            if (qVar.v == null) {
                qVar.v = new Bundle();
            }
            Bundle bundle5 = qVar.v.getBundle("android.car.EXTENSIONS");
            bundle5 = bundle5 == null ? new Bundle() : bundle5;
            Bundle bundle6 = new Bundle(bundle5);
            Bundle bundle7 = new Bundle();
            int i20 = 0;
            while (i20 < arrayList5.size()) {
                String num = Integer.toString(i20);
                e0.h hVar2 = (e0.h) arrayList5.get(i20);
                Bundle bundle8 = new Bundle();
                IconCompat a13 = hVar2.a();
                Bundle bundle9 = hVar2.a;
                bundle8.putInt("icon", a13 != null ? a13.g() : 0);
                bundle8.putCharSequence("title", hVar2.h);
                bundle8.putParcelable("actionIntent", hVar2.i);
                if (bundle9 != null) {
                    bundle = new Bundle(bundle9);
                } else {
                    bundle = new Bundle();
                }
                bundle.putBoolean(str, hVar2.d);
                bundle8.putBundle("extras", bundle);
                l0[] l0VarArr2 = hVar2.c;
                if (l0VarArr2 == null) {
                    arrayList = arrayList5;
                    i11 = i20;
                    bundleArr = null;
                } else {
                    Bundle[] bundleArr2 = new Bundle[l0VarArr2.length];
                    arrayList = arrayList5;
                    i11 = i20;
                    int i21 = 0;
                    while (i21 < l0VarArr2.length) {
                        l0 l0Var = l0VarArr2[i21];
                        int i22 = i21;
                        Bundle bundle10 = new Bundle();
                        l0Var.getClass();
                        l0[] l0VarArr3 = l0VarArr2;
                        String str3 = str;
                        bundle10.putString("resultKey", "extra_voice_reply");
                        bundle10.putCharSequence("label", l0Var.a);
                        bundle10.putCharSequenceArray("choices", null);
                        bundle10.putBoolean("allowFreeFormInput", true);
                        bundle10.putBundle("extras", l0Var.b);
                        HashSet hashSet = l0Var.c;
                        if (!hashSet.isEmpty()) {
                            ArrayList<String> arrayList8 = new ArrayList<>(hashSet.size());
                            Iterator it = hashSet.iterator();
                            while (it.hasNext()) {
                                arrayList8.add((String) it.next());
                            }
                            bundle10.putStringArrayList("allowedDataTypes", arrayList8);
                        }
                        bundleArr2[i22] = bundle10;
                        i21 = i22 + 1;
                        l0VarArr2 = l0VarArr3;
                        str = str3;
                    }
                    bundleArr = bundleArr2;
                }
                String str4 = str;
                bundle8.putParcelableArray("remoteInputs", bundleArr);
                bundle8.putBoolean("showsUserInterface", hVar2.e);
                bundle8.putInt("semanticAction", hVar2.f);
                bundle7.putBundle(num, bundle8);
                i20 = i11 + 1;
                arrayList5 = arrayList;
                str = str4;
            }
            bundle5.putBundle("invisible_actions", bundle7);
            bundle6.putBundle("invisible_actions", bundle7);
            if (qVar.v == null) {
                qVar.v = new Bundle();
            }
            qVar.v.putBundle("android.car.EXTENSIONS", bundle5);
            ((Bundle) this.f).putBundle("android.car.EXTENSIONS", bundle6);
        }
        int i23 = Build.VERSION.SDK_INT;
        if (i23 >= 24) {
            ((Notification.Builder) this.d).setExtras(qVar.v);
            w.j((Notification.Builder) this.d);
        }
        if (i23 >= 26) {
            z6.a.g((Notification.Builder) this.d);
            z6.a.i((Notification.Builder) this.d);
            z6.a.j((Notification.Builder) this.d, qVar.z);
            z6.a.k((Notification.Builder) this.d, qVar.B);
            z6.a.h((Notification.Builder) this.d, qVar.C);
            if (!TextUtils.isEmpty(qVar.y)) {
                bubbleMetadata = null;
                i7 = 0;
                ((Notification.Builder) this.d).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
                if (i23 >= 28) {
                    int size4 = arrayList4.size();
                    int i24 = i7;
                    while (i24 < size4) {
                        Object obj4 = arrayList4.get(i24);
                        i24++;
                        j0 j0Var2 = (j0) obj4;
                        Notification.Builder builder3 = (Notification.Builder) this.d;
                        j0Var2.getClass();
                        d1.f.a(builder3, d1.f.E(j0Var2));
                    }
                }
                i10 = Build.VERSION.SDK_INT;
                if (i10 >= 29) {
                    return;
                }
                ab.x.j((Notification.Builder) this.d, qVar.D);
                Notification.Builder builder4 = (Notification.Builder) this.d;
                o oVar = qVar.E;
                if (oVar != null) {
                    if (i10 >= 30) {
                        a10 = e0.n.a(oVar);
                    } else if (i10 == 29) {
                        a10 = m.a(oVar);
                    }
                    ab.x.l(builder4, a10);
                    gVar = qVar.A;
                    if (gVar == null) {
                        ab.x.o((Notification.Builder) this.d, gVar.b);
                        return;
                    }
                    return;
                }
                a10 = bubbleMetadata;
                ab.x.l(builder4, a10);
                gVar = qVar.A;
                if (gVar == null) {
                }
            }
        }
        i7 = 0;
        bubbleMetadata = null;
        if (i23 >= 28) {
        }
        i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
        }
    }

    @Override // m4.a0
    public void b(k0 k0Var, f3.q qVar, g0 g0Var) {
    }

    public k(String source) {
        this.a = 7;
        kotlin.jvm.internal.j.e(source, "source");
        wa waVar = new wa((char) 0, 21);
        waVar.c = new Object[8];
        int[] iArr = new int[8];
        for (int i7 = 0; i7 < 8; i7++) {
            iArr[i7] = -1;
        }
        waVar.d = iArr;
        waVar.b = -1;
        this.c = waVar;
        this.e = new StringBuilder();
        this.f = source;
    }

    public k(f3.a0 a0Var, f3.l0 l0Var, byte[] bArr, ci.a[] aVarArr, int i7) {
        this.a = 0;
        this.c = a0Var;
        this.d = l0Var;
        this.e = bArr;
        this.f = aVarArr;
        this.b = i7;
    }

    public k(Canvas canvas) {
        this.a = 6;
        this.d = new Matrix();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.c = canvas;
    }

    public k(e0 e0Var, int i7) {
        this.a = 3;
        this.f = e0Var;
        this.c = new d4.f(new byte[5], 5);
        this.d = new SparseArray();
        this.e = new SparseIntArray();
        this.b = i7;
    }

    public k(dx0 dx0Var, bx0[] bx0VarArr) {
        this.a = 5;
        this.f = dx0Var;
        int length = bx0VarArr.length;
        this.c = new bx0[length];
        this.b = length - 1;
        int e10 = dx0Var.e() + 1;
        bx0[][] bx0VarArr2 = new bx0[e10][];
        int[] iArr = new int[e10];
        for (bx0 bx0Var : bx0VarArr) {
            int i7 = bx0Var.a.a;
            iArr[i7] = iArr[i7] + 1;
        }
        for (int i10 = 0; i10 < e10; i10++) {
            bx0VarArr2[i10] = new bx0[iArr[i10]];
        }
        Arrays.fill(iArr, 0);
        for (bx0 bx0Var2 : bx0VarArr) {
            int i11 = bx0Var2.a.a;
            bx0[] bx0VarArr3 = bx0VarArr2[i11];
            int i12 = iArr[i11];
            iArr[i11] = i12 + 1;
            bx0VarArr3[i12] = bx0Var2;
        }
        this.d = bx0VarArr2;
        this.e = new int[((dx0) this.f).e() + 1];
    }
}
