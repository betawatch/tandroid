package e4;

import d5.f0;
import d5.x;
import d5.y;
import g7.b0;
import g7.y8;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import o8.l0;
import o8.w;
import o8.z;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class i extends y8 {
    public static final a9.b b = new a9.b(20);
    public final g a;

    public i(g gVar) {
        this.a = gVar;
    }

    public static a d(y yVar, int i9, int i10) {
        int q10;
        String concat;
        int r10 = yVar.r();
        Charset n10 = n(r10);
        int i11 = i9 - 1;
        byte[] bArr = new byte[i11];
        yVar.c(0, i11, bArr);
        if (i10 == 2) {
            concat = "image/" + b0.b(new String(bArr, 0, 3, n8.d.b));
            if ("image/jpg".equals(concat)) {
                concat = "image/jpeg";
            }
            q10 = 2;
        } else {
            q10 = q(0, bArr);
            String b10 = b0.b(new String(bArr, 0, q10, n8.d.b));
            concat = b10.indexOf(47) == -1 ? "image/".concat(b10) : b10;
        }
        int i12 = bArr[q10 + 1] & 255;
        int i13 = q10 + 2;
        int p6 = p(i13, r10, bArr);
        String str = new String(bArr, i13, p6 - i13, n10);
        int m10 = m(r10) + p6;
        return new a(i12, concat, str, i11 <= m10 ? f0.f : Arrays.copyOfRange(bArr, m10, i11));
    }

    public static c e(y yVar, int i9, int i10, boolean z10, int i11, g gVar) {
        int i12 = yVar.b;
        int q10 = q(i12, yVar.a);
        String str = new String(yVar.a, i12, q10 - i12, n8.d.b);
        yVar.C(q10 + 1);
        int e10 = yVar.e();
        int e11 = yVar.e();
        long s10 = yVar.s();
        if (s10 == 4294967295L) {
            s10 = -1;
        }
        long s11 = yVar.s();
        long j10 = s11 == 4294967295L ? -1L : s11;
        ArrayList arrayList = new ArrayList();
        int i13 = i12 + i9;
        while (yVar.b < i13) {
            j h = h(i10, yVar, z10, i11, gVar);
            if (h != null) {
                arrayList.add(h);
            }
        }
        return new c(str, e10, e11, s10, j10, (j[]) arrayList.toArray(new j[0]));
    }

    public static d f(y yVar, int i9, int i10, boolean z10, int i11, g gVar) {
        int i12 = yVar.b;
        int q10 = q(i12, yVar.a);
        String str = new String(yVar.a, i12, q10 - i12, n8.d.b);
        yVar.C(q10 + 1);
        int r10 = yVar.r();
        boolean z11 = (r10 & 2) != 0;
        boolean z12 = (r10 & 1) != 0;
        int r11 = yVar.r();
        String[] strArr = new String[r11];
        for (int i13 = 0; i13 < r11; i13++) {
            int i14 = yVar.b;
            int q11 = q(i14, yVar.a);
            strArr[i13] = new String(yVar.a, i14, q11 - i14, n8.d.b);
            yVar.C(q11 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i15 = i12 + i9;
        while (yVar.b < i15) {
            j h = h(i10, yVar, z10, i11, gVar);
            if (h != null) {
                arrayList.add(h);
            }
        }
        return new d(str, z11, z12, strArr, (j[]) arrayList.toArray(new j[0]));
    }

    public static e g(int i9, y yVar) {
        if (i9 < 4) {
            return null;
        }
        int r10 = yVar.r();
        Charset n10 = n(r10);
        byte[] bArr = new byte[3];
        yVar.c(0, 3, bArr);
        String str = new String(bArr, 0, 3);
        int i10 = i9 - 4;
        byte[] bArr2 = new byte[i10];
        yVar.c(0, i10, bArr2);
        int p6 = p(0, r10, bArr2);
        String str2 = new String(bArr2, 0, p6, n10);
        int m10 = m(r10) + p6;
        return new e(str, str2, k(bArr2, m10, p(m10, r10, bArr2), n10));
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x022a, code lost:
    
        if (r4 == 67) goto L144;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02ae A[Catch: all -> 0x0286, TRY_LEAVE, TryCatch #2 {all -> 0x0286, blocks: (B:62:0x02ae, B:138:0x0281, B:146:0x0298, B:147:0x029d), top: B:52:0x0111 }] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17, types: [d5.y] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static j h(int i9, y yVar, boolean z10, int i10, g gVar) {
        int u10;
        ?? r12;
        int i11;
        int i12;
        int i13;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        y yVar2;
        int i14;
        int i15;
        int i16;
        int i17;
        y yVar3;
        int i18 = i9;
        int r10 = yVar.r();
        int r11 = yVar.r();
        int r13 = yVar.r();
        int r14 = i18 >= 3 ? yVar.r() : 0;
        if (i18 == 4) {
            u10 = yVar.u();
            if (!z10) {
                u10 = (((u10 >> 24) & 255) << 21) | (u10 & 255) | (((u10 >> 8) & 255) << 7) | (((u10 >> 16) & 255) << 14);
            }
        } else {
            u10 = i18 == 3 ? yVar.u() : yVar.t();
        }
        int i19 = u10;
        int w8 = i18 >= 3 ? yVar.w() : 0;
        j jVar = null;
        if (r10 == 0 && r11 == 0 && r13 == 0 && r14 == 0 && i19 == 0 && w8 == 0) {
            yVar.C(yVar.c);
            return null;
        }
        int i20 = yVar.b + i19;
        if (i20 > yVar.c) {
            d5.a.K("Id3Decoder", "Frame size exceeds remaining tag data");
            yVar.C(yVar.c);
            return null;
        }
        if (gVar != null) {
            boolean a2 = gVar.a(i18, r10, r11, r13, r14);
            i18 = i18;
            r12 = r11;
            i11 = r10;
            i12 = r13;
            i13 = r14;
            if (!a2) {
                yVar.C(i20);
                return null;
            }
        } else {
            r12 = r11;
            i11 = r10;
            i12 = r13;
            i13 = r14;
        }
        if (i18 == 3) {
            z11 = (w8 & 128) != 0;
            z14 = (w8 & 64) != 0;
            z15 = false;
            z13 = (w8 & 32) != 0;
            z12 = z11;
        } else if (i18 == 4) {
            boolean z16 = (w8 & 64) != 0;
            boolean z17 = (w8 & 8) != 0;
            z14 = (w8 & 4) != 0;
            z15 = (w8 & 2) != 0;
            z12 = (w8 & 1) != 0;
            boolean z18 = z17;
            z13 = z16;
            z11 = z18;
        } else {
            z11 = false;
            z12 = false;
            z13 = false;
            z14 = false;
            z15 = false;
        }
        if (z11 || z14) {
            d5.a.K("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
            yVar.C(i20);
            return null;
        }
        if (z13) {
            i19--;
            yVar.D(1);
        }
        if (z12) {
            i19 -= 4;
            yVar.D(4);
        }
        if (z15) {
            i19 = r(i19, yVar);
        }
        try {
            try {
            } catch (Throwable th) {
                th = th;
                yVar2 = yVar;
            }
        } catch (Throwable th2) {
            th = th2;
            yVar2 = r12;
        }
        if (i11 == 84 && r12 == 88 && i12 == 88 && (i18 == 2 || i13 == 88)) {
            if (i19 >= 1) {
                int r15 = yVar.r();
                int i21 = i19 - 1;
                byte[] bArr = new byte[i21];
                yVar.c(0, i21, bArr);
                int p6 = p(0, r15, bArr);
                jVar = new n("TXXX", new String(bArr, 0, p6, n(r15)), l(r15, m(r15) + p6, bArr));
            }
        } else if (i11 == 84) {
            String o6 = o(i18, i11, r12, i12, i13);
            if (i19 >= 1) {
                int r16 = yVar.r();
                int i22 = i19 - 1;
                byte[] bArr2 = new byte[i22];
                yVar.c(0, i22, bArr2);
                jVar = new n(o6, null, l(r16, 0, bArr2));
            }
        } else if (i11 == 87 && r12 == 88 && i12 == 88 && (i18 == 2 || i13 == 88)) {
            if (i19 >= 1) {
                int r17 = yVar.r();
                int i23 = i19 - 1;
                byte[] bArr3 = new byte[i23];
                yVar.c(0, i23, bArr3);
                int p9 = p(0, r17, bArr3);
                String str = new String(bArr3, 0, p9, n(r17));
                int m10 = m(r17) + p9;
                jVar = new o("WXXX", str, k(bArr3, m10, q(m10, bArr3), n8.d.b));
            }
        } else if (i11 == 87) {
            String o9 = o(i18, i11, r12, i12, i13);
            byte[] bArr4 = new byte[i19];
            yVar.c(0, i19, bArr4);
            jVar = new o(o9, null, new String(bArr4, 0, q(0, bArr4), n8.d.b));
        } else if (i11 == 80 && r12 == 82 && i12 == 73 && i13 == 86) {
            byte[] bArr5 = new byte[i19];
            yVar.c(0, i19, bArr5);
            int q10 = q(0, bArr5);
            String str2 = new String(bArr5, 0, q10, n8.d.b);
            int i24 = q10 + 1;
            jVar = new m(str2, i19 <= i24 ? f0.f : Arrays.copyOfRange(bArr5, i24, i19));
        } else {
            if (i11 != 71 || r12 != 69 || i12 != 79 || (i13 != 66 && i18 != 2)) {
                if (i18 != 2) {
                    if (i11 == 65) {
                        if (r12 == 80) {
                            if (i12 == 73) {
                            }
                        }
                    }
                    if (i11 == 67) {
                    }
                    if (i11 != 67) {
                    }
                    int i25 = i19;
                    i14 = i12;
                    i15 = i25;
                    i16 = r12;
                    i17 = i13;
                    if (i11 != 67) {
                    }
                    i18 = i9;
                    yVar3 = yVar;
                    if (i11 != 77) {
                    }
                    String o10 = o(i18, i11, i16, i14, i17);
                    byte[] bArr6 = new byte[i15];
                    yVar3.c(0, i15, bArr6);
                    jVar = new b(o10, bArr6);
                    r12 = yVar3;
                    if (jVar == null) {
                    }
                    r12.C(i20);
                    return jVar;
                }
                if (i11 == 80 && r12 == 73 && i12 == 67) {
                    jVar = d(yVar, i19, i18);
                }
                if (i11 == 67 || r12 != 79 || i12 != 77 || (i13 != 77 && i18 != 2)) {
                    if (i11 != 67 && r12 == 72 && i12 == 65 && i13 == 80) {
                        int i26 = i19;
                        i14 = i12;
                        i15 = i26;
                        i16 = r12;
                        i17 = i13;
                        try {
                            jVar = e(yVar, i15, i18, z10, i10, gVar);
                            i18 = i9;
                            r12 = yVar;
                        } catch (Throwable th3) {
                            th = th3;
                            yVar2 = yVar;
                        }
                    } else {
                        int i252 = i19;
                        i14 = i12;
                        i15 = i252;
                        i16 = r12;
                        i17 = i13;
                        if (i11 != 67 && i16 == 84 && i14 == 79 && i17 == 67) {
                            i18 = i9;
                            y yVar4 = yVar;
                            jVar = f(yVar4, i15, i18, z10, i10, gVar);
                            r12 = yVar4;
                        } else {
                            i18 = i9;
                            yVar3 = yVar;
                            if (i11 != 77 && i16 == 76 && i14 == 76 && i17 == 84) {
                                jVar = j(i15, yVar3);
                                r12 = yVar3;
                            } else {
                                String o102 = o(i18, i11, i16, i14, i17);
                                byte[] bArr62 = new byte[i15];
                                yVar3.c(0, i15, bArr62);
                                jVar = new b(o102, bArr62);
                                r12 = yVar3;
                            }
                        }
                    }
                    if (jVar == null) {
                        d5.a.K("Id3Decoder", "Failed to decode frame: id=" + o(i18, i11, i16, i14, i17) + ", frameSize=" + i15);
                    }
                    r12.C(i20);
                    return jVar;
                }
                jVar = g(i19, yVar);
                th = th2;
                yVar2 = r12;
                yVar2.C(i20);
                throw th;
            }
            jVar = i(i19, yVar);
        }
        int i27 = i19;
        i14 = i12;
        i15 = i27;
        i16 = r12;
        i17 = i13;
        r12 = yVar;
        if (jVar == null) {
        }
        r12.C(i20);
        return jVar;
    }

    public static f i(int i9, y yVar) {
        int r10 = yVar.r();
        Charset n10 = n(r10);
        int i10 = i9 - 1;
        byte[] bArr = new byte[i10];
        yVar.c(0, i10, bArr);
        int q10 = q(0, bArr);
        String str = new String(bArr, 0, q10, n8.d.b);
        int i11 = q10 + 1;
        int p6 = p(i11, r10, bArr);
        String k10 = k(bArr, i11, p6, n10);
        int m10 = m(r10) + p6;
        int p9 = p(m10, r10, bArr);
        String k11 = k(bArr, m10, p9, n10);
        int m11 = m(r10) + p9;
        return new f(str, i10 <= m11 ? f0.f : Arrays.copyOfRange(bArr, m11, i10), k10, k11);
    }

    public static l j(int i9, y yVar) {
        int w8 = yVar.w();
        int t10 = yVar.t();
        int t11 = yVar.t();
        int r10 = yVar.r();
        int r11 = yVar.r();
        x xVar = new x();
        xVar.o(yVar);
        int i10 = ((i9 - 10) * 8) / (r10 + r11);
        int[] iArr = new int[i10];
        int[] iArr2 = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = xVar.i(r10);
            int i13 = xVar.i(r11);
            iArr[i11] = i12;
            iArr2[i11] = i13;
        }
        return new l(w8, t10, t11, iArr, iArr2);
    }

    public static String k(byte[] bArr, int i9, int i10, Charset charset) {
        return (i10 <= i9 || i10 > bArr.length) ? "" : new String(bArr, i9, i10 - i9, charset);
    }

    public static l0 l(int i9, int i10, byte[] bArr) {
        if (i10 >= bArr.length) {
            return z.y("");
        }
        o8.x xVar = z.b;
        o8.l.a(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int p6 = p(i10, i9, bArr);
        int i11 = 0;
        while (i10 < p6) {
            String str = new String(bArr, i10, p6 - i10, n(i9));
            int i12 = i11 + 1;
            if (objArr.length < i12) {
                objArr = Arrays.copyOf(objArr, w.d(objArr.length, i12));
            }
            objArr[i11] = str;
            int m10 = p6 + m(i9);
            i11 = i12;
            i10 = m10;
            p6 = p(m10, i9, bArr);
        }
        l0 s10 = z.s(i11, objArr);
        return s10.isEmpty() ? z.y("") : s10;
    }

    public static int m(int i9) {
        return (i9 == 0 || i9 == 3) ? 1 : 2;
    }

    public static Charset n(int i9) {
        return i9 != 1 ? i9 != 2 ? i9 != 3 ? n8.d.b : n8.d.c : n8.d.d : n8.d.f;
    }

    public static String o(int i9, int i10, int i11, int i12, int i13) {
        return i9 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
    }

    public static int p(int i9, int i10, byte[] bArr) {
        int q10 = q(i9, bArr);
        if (i10 == 0 || i10 == 3) {
            return q10;
        }
        while (q10 < bArr.length - 1) {
            if ((q10 - i9) % 2 == 0 && bArr[q10 + 1] == 0) {
                return q10;
            }
            q10 = q(q10 + 1, bArr);
        }
        return bArr.length;
    }

    public static int q(int i9, byte[] bArr) {
        while (i9 < bArr.length) {
            if (bArr[i9] == 0) {
                return i9;
            }
            i9++;
        }
        return bArr.length;
    }

    public static int r(int i9, y yVar) {
        byte[] bArr = yVar.a;
        int i10 = yVar.b;
        int i11 = i10;
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= i10 + i9) {
                return i9;
            }
            if ((bArr[i11] & 255) == 255 && bArr[i12] == 0) {
                System.arraycopy(bArr, i11 + 2, bArr, i12, (i9 - (i11 - i10)) - 2);
                i9--;
            }
            i11 = i12;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0077, code lost:
    
        if ((r10 & 1) != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0085, code lost:
    
        if ((r10 & 128) != 0) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean s(y yVar, int i9, int i10, boolean z10) {
        int t10;
        long t11;
        int i11;
        int i12;
        int i13 = yVar.b;
        while (true) {
            try {
                boolean z11 = true;
                if (yVar.a() < i10) {
                    yVar.C(i13);
                    return true;
                }
                if (i9 >= 3) {
                    t10 = yVar.e();
                    t11 = yVar.s();
                    i11 = yVar.w();
                } else {
                    t10 = yVar.t();
                    t11 = yVar.t();
                    i11 = 0;
                }
                if (t10 == 0 && t11 == 0 && i11 == 0) {
                    yVar.C(i13);
                    return true;
                }
                if (i9 == 4 && !z10) {
                    if ((8421504 & t11) != 0) {
                        yVar.C(i13);
                        return false;
                    }
                    t11 = (((t11 >> 24) & 255) << 21) | (t11 & 255) | (((t11 >> 8) & 255) << 7) | (((t11 >> 16) & 255) << 14);
                }
                if (i9 == 4) {
                    i12 = (i11 & 64) != 0 ? 1 : 0;
                } else {
                    if (i9 == 3) {
                        i12 = (i11 & 32) != 0 ? 1 : 0;
                    } else {
                        i12 = 0;
                    }
                    z11 = false;
                    if (z11) {
                        i12 += 4;
                    }
                    if (t11 < i12) {
                        yVar.C(i13);
                        return false;
                    }
                    if (yVar.a() < t11) {
                        yVar.C(i13);
                        return false;
                    }
                    yVar.D((int) t11);
                }
            } catch (Throwable th) {
                yVar.C(i13);
                throw th;
            }
        }
    }

    @Override // g7.y8
    public final z3.c b(z3.e eVar, ByteBuffer byteBuffer) {
        return c(byteBuffer.limit(), byteBuffer.array());
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final z3.c c(int i9, byte[] bArr) {
        h hVar;
        ArrayList arrayList = new ArrayList();
        y yVar = new y(bArr, i9);
        boolean z10 = false;
        if (yVar.a() < 10) {
            d5.a.K("Id3Decoder", "Data too short to be an ID3 tag");
        } else {
            int t10 = yVar.t();
            if (t10 == 4801587) {
                int r10 = yVar.r();
                yVar.D(1);
                int r11 = yVar.r();
                int q10 = yVar.q();
                if (r10 == 2) {
                    if ((r11 & 64) != 0) {
                        d5.a.K("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                    }
                    hVar = new h(r10, r10 >= 4 && (r11 & 128) != 0, q10);
                } else {
                    if (r10 == 3) {
                        if ((r11 & 64) != 0) {
                            int e10 = yVar.e();
                            yVar.D(e10);
                            q10 -= e10 + 4;
                        }
                    } else if (r10 == 4) {
                        if ((r11 & 64) != 0) {
                            int q11 = yVar.q();
                            yVar.D(q11 - 4);
                            q10 -= q11;
                        }
                        if ((r11 & 16) != 0) {
                            q10 -= 10;
                        }
                    } else {
                        e2.c.t(r10, "Skipped ID3 tag with unsupported majorVersion=", "Id3Decoder");
                    }
                    hVar = new h(r10, r10 >= 4 && (r11 & 128) != 0, q10);
                }
                if (hVar != null) {
                    return null;
                }
                int i10 = hVar.a;
                int i11 = yVar.b;
                int i12 = i10 == 2 ? 6 : 10;
                int i13 = hVar.b;
                if (hVar.c) {
                    i13 = r(i13, yVar);
                }
                yVar.B(i11 + i13);
                if (!s(yVar, i10, i12, false)) {
                    if (i10 != 4 || !s(yVar, 4, i12, true)) {
                        e2.c.t(i10, "Failed to validate ID3 tag with majorVersion=", "Id3Decoder");
                        return null;
                    }
                    z10 = true;
                }
                while (yVar.a() >= i12) {
                    j h = h(i10, yVar, z10, i12, this.a);
                    if (h != null) {
                        arrayList.add(h);
                    }
                }
                return new z3.c(arrayList);
            }
            d5.a.K("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", Integer.valueOf(t10))));
        }
        hVar = null;
        if (hVar != null) {
        }
    }
}
