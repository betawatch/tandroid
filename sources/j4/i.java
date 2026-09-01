package j4;

import h5.d0;
import h5.v;
import h5.w;
import j3.q0;
import j7.d7;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import k7.a7;
import s8.i0;
import s8.t;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class i extends d7 {
    public static final q0 b = new q0(16);
    public final g a;

    public i(g gVar) {
        this.a = gVar;
    }

    public static a d(w wVar, int i10, int i11) {
        int q10;
        String concat;
        int u10 = wVar.u();
        Charset n10 = n(u10);
        int i12 = i10 - 1;
        byte[] bArr = new byte[i12];
        wVar.e(0, i12, bArr);
        if (i11 == 2) {
            concat = "image/" + a7.b(new String(bArr, 0, 3, r8.d.b));
            if ("image/jpg".equals(concat)) {
                concat = "image/jpeg";
            }
            q10 = 2;
        } else {
            q10 = q(0, bArr);
            String b10 = a7.b(new String(bArr, 0, q10, r8.d.b));
            concat = b10.indexOf(47) == -1 ? "image/".concat(b10) : b10;
        }
        int i13 = bArr[q10 + 1] & 255;
        int i14 = q10 + 2;
        int p10 = p(i14, u10, bArr);
        String str = new String(bArr, i14, p10 - i14, n10);
        int m9 = m(u10) + p10;
        return new a(i13, concat, str, i12 <= m9 ? d0.f : Arrays.copyOfRange(bArr, m9, i12));
    }

    public static c e(w wVar, int i10, int i11, boolean z4, int i12, g gVar) {
        int i13 = wVar.b;
        int q10 = q(i13, wVar.a);
        String str = new String(wVar.a, i13, q10 - i13, r8.d.b);
        wVar.F(q10 + 1);
        int g10 = wVar.g();
        int g11 = wVar.g();
        long v = wVar.v();
        if (v == 4294967295L) {
            v = -1;
        }
        long v10 = wVar.v();
        long j10 = v10 == 4294967295L ? -1L : v10;
        ArrayList arrayList = new ArrayList();
        int i14 = i13 + i10;
        while (wVar.b < i14) {
            j h = h(i11, wVar, z4, i12, gVar);
            if (h != null) {
                arrayList.add(h);
            }
        }
        return new c(str, g10, g11, v, j10, (j[]) arrayList.toArray(new j[0]));
    }

    public static d f(w wVar, int i10, int i11, boolean z4, int i12, g gVar) {
        int i13 = wVar.b;
        int q10 = q(i13, wVar.a);
        String str = new String(wVar.a, i13, q10 - i13, r8.d.b);
        wVar.F(q10 + 1);
        int u10 = wVar.u();
        boolean z10 = (u10 & 2) != 0;
        boolean z11 = (u10 & 1) != 0;
        int u11 = wVar.u();
        String[] strArr = new String[u11];
        for (int i14 = 0; i14 < u11; i14++) {
            int i15 = wVar.b;
            int q11 = q(i15, wVar.a);
            strArr[i14] = new String(wVar.a, i15, q11 - i15, r8.d.b);
            wVar.F(q11 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i16 = i13 + i10;
        while (wVar.b < i16) {
            j h = h(i11, wVar, z4, i12, gVar);
            if (h != null) {
                arrayList.add(h);
            }
        }
        return new d(str, z10, z11, strArr, (j[]) arrayList.toArray(new j[0]));
    }

    public static e g(int i10, w wVar) {
        if (i10 < 4) {
            return null;
        }
        int u10 = wVar.u();
        Charset n10 = n(u10);
        byte[] bArr = new byte[3];
        wVar.e(0, 3, bArr);
        String str = new String(bArr, 0, 3);
        int i11 = i10 - 4;
        byte[] bArr2 = new byte[i11];
        wVar.e(0, i11, bArr2);
        int p10 = p(0, u10, bArr2);
        String str2 = new String(bArr2, 0, p10, n10);
        int m9 = m(u10) + p10;
        return new e(str, str2, k(bArr2, m9, p(m9, u10, bArr2), n10));
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x022a, code lost:
    
        if (r4 == 67) goto L144;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02ae A[Catch: all -> 0x0286, TRY_LEAVE, TryCatch #2 {all -> 0x0286, blocks: (B:62:0x02ae, B:138:0x0281, B:146:0x0298, B:147:0x029d), top: B:52:0x0111 }] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17, types: [h5.w] */
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
    public static j h(int i10, w wVar, boolean z4, int i11, g gVar) {
        int x10;
        ?? r12;
        int i12;
        int i13;
        int i14;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        w wVar2;
        int i15;
        int i16;
        int i17;
        int i18;
        w wVar3;
        int i19 = i10;
        int u10 = wVar.u();
        int u11 = wVar.u();
        int u12 = wVar.u();
        int u13 = i19 >= 3 ? wVar.u() : 0;
        if (i19 == 4) {
            x10 = wVar.x();
            if (!z4) {
                x10 = (((x10 >> 24) & 255) << 21) | (x10 & 255) | (((x10 >> 8) & 255) << 7) | (((x10 >> 16) & 255) << 14);
            }
        } else {
            x10 = i19 == 3 ? wVar.x() : wVar.w();
        }
        int i20 = x10;
        int z15 = i19 >= 3 ? wVar.z() : 0;
        j jVar = null;
        if (u10 == 0 && u11 == 0 && u12 == 0 && u13 == 0 && i20 == 0 && z15 == 0) {
            wVar.F(wVar.c);
            return null;
        }
        int i21 = wVar.b + i20;
        if (i21 > wVar.c) {
            h5.a.K("Id3Decoder", "Frame size exceeds remaining tag data");
            wVar.F(wVar.c);
            return null;
        }
        if (gVar != null) {
            boolean d = gVar.d(i19, u10, u11, u12, u13);
            i19 = i19;
            r12 = u11;
            i12 = u10;
            i13 = u12;
            i14 = u13;
            if (!d) {
                wVar.F(i21);
                return null;
            }
        } else {
            r12 = u11;
            i12 = u10;
            i13 = u12;
            i14 = u13;
        }
        if (i19 == 3) {
            z10 = (z15 & 128) != 0;
            z13 = (z15 & 64) != 0;
            z14 = false;
            z12 = (z15 & 32) != 0;
            z11 = z10;
        } else if (i19 == 4) {
            boolean z16 = (z15 & 64) != 0;
            boolean z17 = (z15 & 8) != 0;
            z13 = (z15 & 4) != 0;
            z14 = (z15 & 2) != 0;
            z11 = (z15 & 1) != 0;
            boolean z18 = z17;
            z12 = z16;
            z10 = z18;
        } else {
            z10 = false;
            z11 = false;
            z12 = false;
            z13 = false;
            z14 = false;
        }
        if (z10 || z13) {
            h5.a.K("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
            wVar.F(i21);
            return null;
        }
        if (z12) {
            i20--;
            wVar.G(1);
        }
        if (z11) {
            i20 -= 4;
            wVar.G(4);
        }
        if (z14) {
            i20 = r(i20, wVar);
        }
        try {
            try {
            } catch (Throwable th2) {
                th = th2;
                wVar2 = wVar;
            }
        } catch (Throwable th3) {
            th = th3;
            wVar2 = r12;
        }
        if (i12 == 84 && r12 == 88 && i13 == 88 && (i19 == 2 || i14 == 88)) {
            if (i20 >= 1) {
                int u14 = wVar.u();
                int i22 = i20 - 1;
                byte[] bArr = new byte[i22];
                wVar.e(0, i22, bArr);
                int p10 = p(0, u14, bArr);
                jVar = new n("TXXX", new String(bArr, 0, p10, n(u14)), l(u14, m(u14) + p10, bArr));
            }
        } else if (i12 == 84) {
            String o10 = o(i19, i12, r12, i13, i14);
            if (i20 >= 1) {
                int u15 = wVar.u();
                int i23 = i20 - 1;
                byte[] bArr2 = new byte[i23];
                wVar.e(0, i23, bArr2);
                jVar = new n(o10, null, l(u15, 0, bArr2));
            }
        } else if (i12 == 87 && r12 == 88 && i13 == 88 && (i19 == 2 || i14 == 88)) {
            if (i20 >= 1) {
                int u16 = wVar.u();
                int i24 = i20 - 1;
                byte[] bArr3 = new byte[i24];
                wVar.e(0, i24, bArr3);
                int p11 = p(0, u16, bArr3);
                String str = new String(bArr3, 0, p11, n(u16));
                int m9 = m(u16) + p11;
                jVar = new o("WXXX", str, k(bArr3, m9, q(m9, bArr3), r8.d.b));
            }
        } else if (i12 == 87) {
            String o11 = o(i19, i12, r12, i13, i14);
            byte[] bArr4 = new byte[i20];
            wVar.e(0, i20, bArr4);
            jVar = new o(o11, null, new String(bArr4, 0, q(0, bArr4), r8.d.b));
        } else if (i12 == 80 && r12 == 82 && i13 == 73 && i14 == 86) {
            byte[] bArr5 = new byte[i20];
            wVar.e(0, i20, bArr5);
            int q10 = q(0, bArr5);
            String str2 = new String(bArr5, 0, q10, r8.d.b);
            int i25 = q10 + 1;
            jVar = new m(str2, i20 <= i25 ? d0.f : Arrays.copyOfRange(bArr5, i25, i20));
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
                    wVar3 = wVar;
                    if (i12 != 77) {
                    }
                    String o12 = o(i19, i12, i17, i15, i18);
                    byte[] bArr6 = new byte[i16];
                    wVar3.e(0, i16, bArr6);
                    jVar = new b(o12, bArr6);
                    r12 = wVar3;
                    if (jVar == null) {
                    }
                    r12.F(i21);
                    return jVar;
                }
                if (i12 == 80 && r12 == 73 && i13 == 67) {
                    jVar = d(wVar, i20, i19);
                }
                if (i12 == 67 || r12 != 79 || i13 != 77 || (i14 != 77 && i19 != 2)) {
                    if (i12 != 67 && r12 == 72 && i13 == 65 && i14 == 80) {
                        int i27 = i20;
                        i15 = i13;
                        i16 = i27;
                        i17 = r12;
                        i18 = i14;
                        try {
                            jVar = e(wVar, i16, i19, z4, i11, gVar);
                            i19 = i10;
                            r12 = wVar;
                        } catch (Throwable th4) {
                            th = th4;
                            wVar2 = wVar;
                        }
                    } else {
                        int i262 = i20;
                        i15 = i13;
                        i16 = i262;
                        i17 = r12;
                        i18 = i14;
                        if (i12 != 67 && i17 == 84 && i15 == 79 && i18 == 67) {
                            i19 = i10;
                            w wVar4 = wVar;
                            jVar = f(wVar4, i16, i19, z4, i11, gVar);
                            r12 = wVar4;
                        } else {
                            i19 = i10;
                            wVar3 = wVar;
                            if (i12 != 77 && i17 == 76 && i15 == 76 && i18 == 84) {
                                jVar = j(i16, wVar3);
                                r12 = wVar3;
                            } else {
                                String o122 = o(i19, i12, i17, i15, i18);
                                byte[] bArr62 = new byte[i16];
                                wVar3.e(0, i16, bArr62);
                                jVar = new b(o122, bArr62);
                                r12 = wVar3;
                            }
                        }
                    }
                    if (jVar == null) {
                        h5.a.K("Id3Decoder", "Failed to decode frame: id=" + o(i19, i12, i17, i15, i18) + ", frameSize=" + i16);
                    }
                    r12.F(i21);
                    return jVar;
                }
                jVar = g(i20, wVar);
                th = th3;
                wVar2 = r12;
                wVar2.F(i21);
                throw th;
            }
            jVar = i(i20, wVar);
        }
        int i28 = i20;
        i15 = i13;
        i16 = i28;
        i17 = r12;
        i18 = i14;
        r12 = wVar;
        if (jVar == null) {
        }
        r12.F(i21);
        return jVar;
    }

    public static f i(int i10, w wVar) {
        int u10 = wVar.u();
        Charset n10 = n(u10);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        wVar.e(0, i11, bArr);
        int q10 = q(0, bArr);
        String str = new String(bArr, 0, q10, r8.d.b);
        int i12 = q10 + 1;
        int p10 = p(i12, u10, bArr);
        String k10 = k(bArr, i12, p10, n10);
        int m9 = m(u10) + p10;
        int p11 = p(m9, u10, bArr);
        String k11 = k(bArr, m9, p11, n10);
        int m10 = m(u10) + p11;
        return new f(str, i11 <= m10 ? d0.f : Arrays.copyOfRange(bArr, m10, i11), k10, k11);
    }

    public static l j(int i10, w wVar) {
        int z4 = wVar.z();
        int w10 = wVar.w();
        int w11 = wVar.w();
        int u10 = wVar.u();
        int u11 = wVar.u();
        v vVar = new v();
        vVar.o(wVar);
        int i11 = ((i10 - 10) * 8) / (u10 + u11);
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = vVar.i(u10);
            int i14 = vVar.i(u11);
            iArr[i12] = i13;
            iArr2[i12] = i14;
        }
        return new l(z4, w10, w11, iArr, iArr2);
    }

    public static String k(byte[] bArr, int i10, int i11, Charset charset) {
        return (i11 <= i10 || i11 > bArr.length) ? "" : new String(bArr, i10, i11 - i10, charset);
    }

    public static i0 l(int i10, int i11, byte[] bArr) {
        Object[] objArr;
        if (i11 >= bArr.length) {
            return s8.v.x("");
        }
        t tVar = s8.v.b;
        s8.l.c(4, "initialCapacity");
        Object[] objArr2 = new Object[4];
        int p10 = p(i11, i10, bArr);
        int i12 = 0;
        boolean z4 = false;
        while (i11 < p10) {
            String str = new String(bArr, i11, p10 - i11, n(i10));
            int i13 = i12 + 1;
            if (objArr2.length < i13) {
                objArr = Arrays.copyOf(objArr2, com.google.android.gms.common.api.internal.w.g(objArr2.length, i13));
            } else if (z4) {
                objArr = (Object[]) objArr2.clone();
            } else {
                objArr2[i12] = str;
                int m9 = p10 + m(i10);
                i12++;
                i11 = m9;
                p10 = p(m9, i10, bArr);
            }
            objArr2 = objArr;
            z4 = false;
            objArr2[i12] = str;
            int m92 = p10 + m(i10);
            i12++;
            i11 = m92;
            p10 = p(m92, i10, bArr);
        }
        i0 s6 = s8.v.s(i12, objArr2);
        return s6.isEmpty() ? s8.v.x("") : s6;
    }

    public static int m(int i10) {
        return (i10 == 0 || i10 == 3) ? 1 : 2;
    }

    public static Charset n(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? r8.d.b : r8.d.c : r8.d.d : r8.d.f;
    }

    public static String o(int i10, int i11, int i12, int i13, int i14) {
        return i10 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    public static int p(int i10, int i11, byte[] bArr) {
        int q10 = q(i10, bArr);
        if (i11 == 0 || i11 == 3) {
            return q10;
        }
        while (q10 < bArr.length - 1) {
            if ((q10 - i10) % 2 == 0 && bArr[q10 + 1] == 0) {
                return q10;
            }
            q10 = q(q10 + 1, bArr);
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

    public static int r(int i10, w wVar) {
        byte[] bArr = wVar.a;
        int i11 = wVar.b;
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
    public static boolean s(w wVar, int i10, int i11, boolean z4) {
        int w10;
        long w11;
        int i12;
        int i13;
        int i14 = wVar.b;
        while (true) {
            try {
                boolean z10 = true;
                if (wVar.a() < i11) {
                    wVar.F(i14);
                    return true;
                }
                if (i10 >= 3) {
                    w10 = wVar.g();
                    w11 = wVar.v();
                    i12 = wVar.z();
                } else {
                    w10 = wVar.w();
                    w11 = wVar.w();
                    i12 = 0;
                }
                if (w10 == 0 && w11 == 0 && i12 == 0) {
                    wVar.F(i14);
                    return true;
                }
                if (i10 == 4 && !z4) {
                    if ((8421504 & w11) != 0) {
                        wVar.F(i14);
                        return false;
                    }
                    w11 = (((w11 >> 24) & 255) << 21) | (w11 & 255) | (((w11 >> 8) & 255) << 7) | (((w11 >> 16) & 255) << 14);
                }
                if (i10 == 4) {
                    i13 = (i12 & 64) != 0 ? 1 : 0;
                } else {
                    if (i10 == 3) {
                        i13 = (i12 & 32) != 0 ? 1 : 0;
                    } else {
                        i13 = 0;
                    }
                    z10 = false;
                    if (z10) {
                        i13 += 4;
                    }
                    if (w11 < i13) {
                        wVar.F(i14);
                        return false;
                    }
                    if (wVar.a() < w11) {
                        wVar.F(i14);
                        return false;
                    }
                    wVar.G((int) w11);
                }
            } catch (Throwable th2) {
                wVar.F(i14);
                throw th2;
            }
        }
    }

    @Override // j7.d7
    public final e4.c b(e4.e eVar, ByteBuffer byteBuffer) {
        return c(byteBuffer.limit(), byteBuffer.array());
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final e4.c c(int i10, byte[] bArr) {
        h hVar;
        ArrayList arrayList = new ArrayList();
        w wVar = new w(bArr, i10);
        boolean z4 = false;
        if (wVar.a() < 10) {
            h5.a.K("Id3Decoder", "Data too short to be an ID3 tag");
        } else {
            int w10 = wVar.w();
            if (w10 == 4801587) {
                int u10 = wVar.u();
                wVar.G(1);
                int u11 = wVar.u();
                int t6 = wVar.t();
                if (u10 == 2) {
                    if ((u11 & 64) != 0) {
                        h5.a.K("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                    }
                    hVar = new h(u10, u10 >= 4 && (u11 & 128) != 0, t6);
                } else {
                    if (u10 == 3) {
                        if ((u11 & 64) != 0) {
                            int g10 = wVar.g();
                            wVar.G(g10);
                            t6 -= g10 + 4;
                        }
                    } else if (u10 == 4) {
                        if ((u11 & 64) != 0) {
                            int t9 = wVar.t();
                            wVar.G(t9 - 4);
                            t6 -= t9;
                        }
                        if ((u11 & 16) != 0) {
                            t6 -= 10;
                        }
                    } else {
                        e2.c.q(u10, "Skipped ID3 tag with unsupported majorVersion=", "Id3Decoder");
                    }
                    hVar = new h(u10, u10 >= 4 && (u11 & 128) != 0, t6);
                }
                if (hVar != null) {
                    return null;
                }
                int i11 = hVar.a;
                int i12 = wVar.b;
                int i13 = i11 == 2 ? 6 : 10;
                int i14 = hVar.b;
                if (hVar.c) {
                    i14 = r(i14, wVar);
                }
                wVar.E(i12 + i14);
                if (!s(wVar, i11, i13, false)) {
                    if (i11 != 4 || !s(wVar, 4, i13, true)) {
                        e2.c.q(i11, "Failed to validate ID3 tag with majorVersion=", "Id3Decoder");
                        return null;
                    }
                    z4 = true;
                }
                while (wVar.a() >= i13) {
                    j h = h(i11, wVar, z4, i13, this.a);
                    if (h != null) {
                        arrayList.add(h);
                    }
                }
                return new e4.c(arrayList);
            }
            h5.a.K("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", Integer.valueOf(w10))));
        }
        hVar = null;
        if (hVar != null) {
        }
    }
}
