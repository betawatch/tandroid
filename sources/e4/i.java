package e4;

import d5.g0;
import d5.y;
import d5.z;
import h7.d0;
import h7.p8;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import p8.l0;
import p8.w;
import p8.x;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class i extends p8 {
    public static final a9.m b = new a9.m(26);
    public final g a;

    public i(g gVar) {
        this.a = gVar;
    }

    public static a d(z zVar, int i10, int i11) {
        int q6;
        String concat;
        int r10 = zVar.r();
        Charset n10 = n(r10);
        int i12 = i10 - 1;
        byte[] bArr = new byte[i12];
        zVar.c(0, i12, bArr);
        if (i11 == 2) {
            concat = "image/" + d0.b(new String(bArr, 0, 3, o8.d.b));
            if ("image/jpg".equals(concat)) {
                concat = "image/jpeg";
            }
            q6 = 2;
        } else {
            q6 = q(0, bArr);
            String b10 = d0.b(new String(bArr, 0, q6, o8.d.b));
            concat = b10.indexOf(47) == -1 ? "image/".concat(b10) : b10;
        }
        int i13 = bArr[q6 + 1] & 255;
        int i14 = q6 + 2;
        int p6 = p(i14, r10, bArr);
        String str = new String(bArr, i14, p6 - i14, n10);
        int m10 = m(r10) + p6;
        return new a(i13, concat, str, i12 <= m10 ? g0.f : Arrays.copyOfRange(bArr, m10, i12));
    }

    public static c e(z zVar, int i10, int i11, boolean z10, int i12, g gVar) {
        int i13 = zVar.b;
        int q6 = q(i13, zVar.a);
        String str = new String(zVar.a, i13, q6 - i13, o8.d.b);
        zVar.C(q6 + 1);
        int e9 = zVar.e();
        int e10 = zVar.e();
        long s10 = zVar.s();
        if (s10 == 4294967295L) {
            s10 = -1;
        }
        long s11 = zVar.s();
        long j10 = s11 == 4294967295L ? -1L : s11;
        ArrayList arrayList = new ArrayList();
        int i14 = i13 + i10;
        while (zVar.b < i14) {
            j h = h(i11, zVar, z10, i12, gVar);
            if (h != null) {
                arrayList.add(h);
            }
        }
        return new c(str, e9, e10, s10, j10, (j[]) arrayList.toArray(new j[0]));
    }

    public static d f(z zVar, int i10, int i11, boolean z10, int i12, g gVar) {
        int i13 = zVar.b;
        int q6 = q(i13, zVar.a);
        String str = new String(zVar.a, i13, q6 - i13, o8.d.b);
        zVar.C(q6 + 1);
        int r10 = zVar.r();
        boolean z11 = (r10 & 2) != 0;
        boolean z12 = (r10 & 1) != 0;
        int r11 = zVar.r();
        String[] strArr = new String[r11];
        for (int i14 = 0; i14 < r11; i14++) {
            int i15 = zVar.b;
            int q9 = q(i15, zVar.a);
            strArr[i14] = new String(zVar.a, i15, q9 - i15, o8.d.b);
            zVar.C(q9 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i16 = i13 + i10;
        while (zVar.b < i16) {
            j h = h(i11, zVar, z10, i12, gVar);
            if (h != null) {
                arrayList.add(h);
            }
        }
        return new d(str, z11, z12, strArr, (j[]) arrayList.toArray(new j[0]));
    }

    public static e g(int i10, z zVar) {
        if (i10 < 4) {
            return null;
        }
        int r10 = zVar.r();
        Charset n10 = n(r10);
        byte[] bArr = new byte[3];
        zVar.c(0, 3, bArr);
        String str = new String(bArr, 0, 3);
        int i11 = i10 - 4;
        byte[] bArr2 = new byte[i11];
        zVar.c(0, i11, bArr2);
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
    /* JADX WARN: Type inference failed for: r1v17, types: [d5.z] */
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
    public static j h(int i10, z zVar, boolean z10, int i11, g gVar) {
        int u10;
        ?? r12;
        int i12;
        int i13;
        int i14;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        z zVar2;
        int i15;
        int i16;
        int i17;
        int i18;
        z zVar3;
        int i19 = i10;
        int r10 = zVar.r();
        int r11 = zVar.r();
        int r13 = zVar.r();
        int r14 = i19 >= 3 ? zVar.r() : 0;
        if (i19 == 4) {
            u10 = zVar.u();
            if (!z10) {
                u10 = (((u10 >> 24) & 255) << 21) | (u10 & 255) | (((u10 >> 8) & 255) << 7) | (((u10 >> 16) & 255) << 14);
            }
        } else {
            u10 = i19 == 3 ? zVar.u() : zVar.t();
        }
        int i20 = u10;
        int w10 = i19 >= 3 ? zVar.w() : 0;
        j jVar = null;
        if (r10 == 0 && r11 == 0 && r13 == 0 && r14 == 0 && i20 == 0 && w10 == 0) {
            zVar.C(zVar.c);
            return null;
        }
        int i21 = zVar.b + i20;
        if (i21 > zVar.c) {
            d5.a.K("Id3Decoder", "Frame size exceeds remaining tag data");
            zVar.C(zVar.c);
            return null;
        }
        if (gVar != null) {
            boolean c10 = gVar.c(i19, r10, r11, r13, r14);
            i19 = i19;
            r12 = r11;
            i12 = r10;
            i13 = r13;
            i14 = r14;
            if (!c10) {
                zVar.C(i21);
                return null;
            }
        } else {
            r12 = r11;
            i12 = r10;
            i13 = r13;
            i14 = r14;
        }
        if (i19 == 3) {
            z11 = (w10 & 128) != 0;
            z14 = (w10 & 64) != 0;
            z15 = false;
            z13 = (w10 & 32) != 0;
            z12 = z11;
        } else if (i19 == 4) {
            boolean z16 = (w10 & 64) != 0;
            boolean z17 = (w10 & 8) != 0;
            z14 = (w10 & 4) != 0;
            z15 = (w10 & 2) != 0;
            z12 = (w10 & 1) != 0;
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
            zVar.C(i21);
            return null;
        }
        if (z13) {
            i20--;
            zVar.D(1);
        }
        if (z12) {
            i20 -= 4;
            zVar.D(4);
        }
        if (z15) {
            i20 = r(i20, zVar);
        }
        try {
            try {
            } catch (Throwable th) {
                th = th;
                zVar2 = zVar;
            }
        } catch (Throwable th2) {
            th = th2;
            zVar2 = r12;
        }
        if (i12 == 84 && r12 == 88 && i13 == 88 && (i19 == 2 || i14 == 88)) {
            if (i20 >= 1) {
                int r15 = zVar.r();
                int i22 = i20 - 1;
                byte[] bArr = new byte[i22];
                zVar.c(0, i22, bArr);
                int p6 = p(0, r15, bArr);
                jVar = new n("TXXX", new String(bArr, 0, p6, n(r15)), l(r15, m(r15) + p6, bArr));
            }
        } else if (i12 == 84) {
            String o10 = o(i19, i12, r12, i13, i14);
            if (i20 >= 1) {
                int r16 = zVar.r();
                int i23 = i20 - 1;
                byte[] bArr2 = new byte[i23];
                zVar.c(0, i23, bArr2);
                jVar = new n(o10, null, l(r16, 0, bArr2));
            }
        } else if (i12 == 87 && r12 == 88 && i13 == 88 && (i19 == 2 || i14 == 88)) {
            if (i20 >= 1) {
                int r17 = zVar.r();
                int i24 = i20 - 1;
                byte[] bArr3 = new byte[i24];
                zVar.c(0, i24, bArr3);
                int p9 = p(0, r17, bArr3);
                String str = new String(bArr3, 0, p9, n(r17));
                int m10 = m(r17) + p9;
                jVar = new o("WXXX", str, k(bArr3, m10, q(m10, bArr3), o8.d.b));
            }
        } else if (i12 == 87) {
            String o11 = o(i19, i12, r12, i13, i14);
            byte[] bArr4 = new byte[i20];
            zVar.c(0, i20, bArr4);
            jVar = new o(o11, null, new String(bArr4, 0, q(0, bArr4), o8.d.b));
        } else if (i12 == 80 && r12 == 82 && i13 == 73 && i14 == 86) {
            byte[] bArr5 = new byte[i20];
            zVar.c(0, i20, bArr5);
            int q6 = q(0, bArr5);
            String str2 = new String(bArr5, 0, q6, o8.d.b);
            int i25 = q6 + 1;
            jVar = new m(str2, i20 <= i25 ? g0.f : Arrays.copyOfRange(bArr5, i25, i20));
        } else {
            if (i12 != 71 || r12 != 69 || i13 != 79 || (i14 != 66 && i19 != 2)) {
                if (i19 != 2) {
                    if (i12 == 65) {
                        if (r12 == 80) {
                            if (i13 == 73) {
                            }
                        }
                    }
                    if (i12 == 67) {
                    }
                    if (i12 != 67) {
                    }
                    int i26 = i20;
                    i15 = i13;
                    i16 = i26;
                    i17 = r12;
                    i18 = i14;
                    if (i12 != 67) {
                    }
                    i19 = i10;
                    zVar3 = zVar;
                    if (i12 != 77) {
                    }
                    String o12 = o(i19, i12, i17, i15, i18);
                    byte[] bArr6 = new byte[i16];
                    zVar3.c(0, i16, bArr6);
                    jVar = new b(o12, bArr6);
                    r12 = zVar3;
                    if (jVar == null) {
                    }
                    r12.C(i21);
                    return jVar;
                }
                if (i12 == 80 && r12 == 73 && i13 == 67) {
                    jVar = d(zVar, i20, i19);
                }
                if (i12 == 67 || r12 != 79 || i13 != 77 || (i14 != 77 && i19 != 2)) {
                    if (i12 != 67 && r12 == 72 && i13 == 65 && i14 == 80) {
                        int i27 = i20;
                        i15 = i13;
                        i16 = i27;
                        i17 = r12;
                        i18 = i14;
                        try {
                            jVar = e(zVar, i16, i19, z10, i11, gVar);
                            i19 = i10;
                            r12 = zVar;
                        } catch (Throwable th3) {
                            th = th3;
                            zVar2 = zVar;
                        }
                    } else {
                        int i262 = i20;
                        i15 = i13;
                        i16 = i262;
                        i17 = r12;
                        i18 = i14;
                        if (i12 != 67 && i17 == 84 && i15 == 79 && i18 == 67) {
                            i19 = i10;
                            z zVar4 = zVar;
                            jVar = f(zVar4, i16, i19, z10, i11, gVar);
                            r12 = zVar4;
                        } else {
                            i19 = i10;
                            zVar3 = zVar;
                            if (i12 != 77 && i17 == 76 && i15 == 76 && i18 == 84) {
                                jVar = j(i16, zVar3);
                                r12 = zVar3;
                            } else {
                                String o122 = o(i19, i12, i17, i15, i18);
                                byte[] bArr62 = new byte[i16];
                                zVar3.c(0, i16, bArr62);
                                jVar = new b(o122, bArr62);
                                r12 = zVar3;
                            }
                        }
                    }
                    if (jVar == null) {
                        d5.a.K("Id3Decoder", "Failed to decode frame: id=" + o(i19, i12, i17, i15, i18) + ", frameSize=" + i16);
                    }
                    r12.C(i21);
                    return jVar;
                }
                jVar = g(i20, zVar);
                th = th2;
                zVar2 = r12;
                zVar2.C(i21);
                throw th;
            }
            jVar = i(i20, zVar);
        }
        int i28 = i20;
        i15 = i13;
        i16 = i28;
        i17 = r12;
        i18 = i14;
        r12 = zVar;
        if (jVar == null) {
        }
        r12.C(i21);
        return jVar;
    }

    public static f i(int i10, z zVar) {
        int r10 = zVar.r();
        Charset n10 = n(r10);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        zVar.c(0, i11, bArr);
        int q6 = q(0, bArr);
        String str = new String(bArr, 0, q6, o8.d.b);
        int i12 = q6 + 1;
        int p6 = p(i12, r10, bArr);
        String k10 = k(bArr, i12, p6, n10);
        int m10 = m(r10) + p6;
        int p9 = p(m10, r10, bArr);
        String k11 = k(bArr, m10, p9, n10);
        int m11 = m(r10) + p9;
        return new f(str, i11 <= m11 ? g0.f : Arrays.copyOfRange(bArr, m11, i11), k10, k11);
    }

    public static l j(int i10, z zVar) {
        int w10 = zVar.w();
        int t10 = zVar.t();
        int t11 = zVar.t();
        int r10 = zVar.r();
        int r11 = zVar.r();
        y yVar = new y();
        yVar.o(zVar);
        int i11 = ((i10 - 10) * 8) / (r10 + r11);
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = yVar.i(r10);
            int i14 = yVar.i(r11);
            iArr[i12] = i13;
            iArr2[i12] = i14;
        }
        return new l(w10, t10, t11, iArr, iArr2);
    }

    public static String k(byte[] bArr, int i10, int i11, Charset charset) {
        return (i11 <= i10 || i11 > bArr.length) ? "" : new String(bArr, i10, i11 - i10, charset);
    }

    public static l0 l(int i10, int i11, byte[] bArr) {
        if (i11 >= bArr.length) {
            return p8.z.y("");
        }
        x xVar = p8.z.b;
        p8.l.a(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int p6 = p(i11, i10, bArr);
        int i12 = 0;
        while (i11 < p6) {
            String str = new String(bArr, i11, p6 - i11, n(i10));
            int i13 = i12 + 1;
            if (objArr.length < i13) {
                objArr = Arrays.copyOf(objArr, w.d(objArr.length, i13));
            }
            objArr[i12] = str;
            int m10 = p6 + m(i10);
            i12 = i13;
            i11 = m10;
            p6 = p(m10, i10, bArr);
        }
        l0 s10 = p8.z.s(i12, objArr);
        return s10.isEmpty() ? p8.z.y("") : s10;
    }

    public static int m(int i10) {
        return (i10 == 0 || i10 == 3) ? 1 : 2;
    }

    public static Charset n(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? o8.d.b : o8.d.c : o8.d.d : o8.d.f;
    }

    public static String o(int i10, int i11, int i12, int i13, int i14) {
        return i10 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    public static int p(int i10, int i11, byte[] bArr) {
        int q6 = q(i10, bArr);
        if (i11 == 0 || i11 == 3) {
            return q6;
        }
        while (q6 < bArr.length - 1) {
            if ((q6 - i10) % 2 == 0 && bArr[q6 + 1] == 0) {
                return q6;
            }
            q6 = q(q6 + 1, bArr);
        }
        return bArr.length;
    }

    public static int q(int i10, byte[] bArr) {
        while (i10 < bArr.length) {
            if (bArr[i10] == 0) {
                return i10;
            }
            i10++;
        }
        return bArr.length;
    }

    public static int r(int i10, z zVar) {
        byte[] bArr = zVar.a;
        int i11 = zVar.b;
        int i12 = i11;
        while (true) {
            int i13 = i12 + 1;
            if (i13 >= i11 + i10) {
                return i10;
            }
            if ((bArr[i12] & 255) == 255 && bArr[i13] == 0) {
                System.arraycopy(bArr, i12 + 2, bArr, i13, (i10 - (i12 - i11)) - 2);
                i10--;
            }
            i12 = i13;
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
    public static boolean s(z zVar, int i10, int i11, boolean z10) {
        int t10;
        long t11;
        int i12;
        int i13;
        int i14 = zVar.b;
        while (true) {
            try {
                boolean z11 = true;
                if (zVar.a() < i11) {
                    zVar.C(i14);
                    return true;
                }
                if (i10 >= 3) {
                    t10 = zVar.e();
                    t11 = zVar.s();
                    i12 = zVar.w();
                } else {
                    t10 = zVar.t();
                    t11 = zVar.t();
                    i12 = 0;
                }
                if (t10 == 0 && t11 == 0 && i12 == 0) {
                    zVar.C(i14);
                    return true;
                }
                if (i10 == 4 && !z10) {
                    if ((8421504 & t11) != 0) {
                        zVar.C(i14);
                        return false;
                    }
                    t11 = (((t11 >> 24) & 255) << 21) | (t11 & 255) | (((t11 >> 8) & 255) << 7) | (((t11 >> 16) & 255) << 14);
                }
                if (i10 == 4) {
                    i13 = (i12 & 64) != 0 ? 1 : 0;
                } else {
                    if (i10 == 3) {
                        i13 = (i12 & 32) != 0 ? 1 : 0;
                    } else {
                        i13 = 0;
                    }
                    z11 = false;
                    if (z11) {
                        i13 += 4;
                    }
                    if (t11 < i13) {
                        zVar.C(i14);
                        return false;
                    }
                    if (zVar.a() < t11) {
                        zVar.C(i14);
                        return false;
                    }
                    zVar.D((int) t11);
                }
            } catch (Throwable th) {
                zVar.C(i14);
                throw th;
            }
        }
    }

    @Override // h7.p8
    public final z3.c b(z3.e eVar, ByteBuffer byteBuffer) {
        return c(byteBuffer.limit(), byteBuffer.array());
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final z3.c c(int i10, byte[] bArr) {
        h hVar;
        ArrayList arrayList = new ArrayList();
        z zVar = new z(bArr, i10);
        boolean z10 = false;
        if (zVar.a() < 10) {
            d5.a.K("Id3Decoder", "Data too short to be an ID3 tag");
        } else {
            int t10 = zVar.t();
            if (t10 == 4801587) {
                int r10 = zVar.r();
                zVar.D(1);
                int r11 = zVar.r();
                int q6 = zVar.q();
                if (r10 == 2) {
                    if ((r11 & 64) != 0) {
                        d5.a.K("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                    }
                    hVar = new h(r10, r10 >= 4 && (r11 & 128) != 0, q6);
                } else {
                    if (r10 == 3) {
                        if ((r11 & 64) != 0) {
                            int e9 = zVar.e();
                            zVar.D(e9);
                            q6 -= e9 + 4;
                        }
                    } else if (r10 == 4) {
                        if ((r11 & 64) != 0) {
                            int q9 = zVar.q();
                            zVar.D(q9 - 4);
                            q6 -= q9;
                        }
                        if ((r11 & 16) != 0) {
                            q6 -= 10;
                        }
                    } else {
                        com.google.android.recaptcha.internal.a.s(r10, "Skipped ID3 tag with unsupported majorVersion=", "Id3Decoder");
                    }
                    hVar = new h(r10, r10 >= 4 && (r11 & 128) != 0, q6);
                }
                if (hVar != null) {
                    return null;
                }
                int i11 = hVar.a;
                int i12 = zVar.b;
                int i13 = i11 == 2 ? 6 : 10;
                int i14 = hVar.b;
                if (hVar.c) {
                    i14 = r(i14, zVar);
                }
                zVar.B(i12 + i14);
                if (!s(zVar, i11, i13, false)) {
                    if (i11 != 4 || !s(zVar, 4, i13, true)) {
                        com.google.android.recaptcha.internal.a.s(i11, "Failed to validate ID3 tag with majorVersion=", "Id3Decoder");
                        return null;
                    }
                    z10 = true;
                }
                while (zVar.a() >= i13) {
                    j h = h(i11, zVar, z10, i13, this.a);
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
