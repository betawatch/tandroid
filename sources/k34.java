// default package

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;
import java.util.AbstractMap;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class k34 {
    public static final int[] a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};
    public static final Charset b = StandardCharsets.ISO_8859_1;

    /* JADX WARN: Removed duplicated region for block: B:20:0x004d A[LOOP:0: B:13:0x0022->B:20:0x004d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(String str, qg7 qg7Var, qj0 qj0Var, Charset charset) {
        int i;
        int ordinal = qg7Var.ordinal();
        int i2 = 0;
        if (ordinal == 1) {
            int length = str.length();
            while (i2 < length) {
                int charAt = str.charAt(i2) - '0';
                int i3 = i2 + 2;
                if (i3 < length) {
                    qj0Var.b(((str.charAt(i2 + 1) - '0') * 10) + (charAt * 100) + (str.charAt(i3) - '0'), 10);
                    i2 += 3;
                } else {
                    i2++;
                    if (i2 < length) {
                        qj0Var.b((charAt * 10) + (str.charAt(i2) - '0'), 7);
                        i2 = i3;
                    } else {
                        qj0Var.b(charAt, 4);
                    }
                }
            }
            return;
        }
        if (ordinal == 2) {
            int length2 = str.length();
            while (i2 < length2) {
                char charAt2 = str.charAt(i2);
                int[] iArr = a;
                int i4 = charAt2 < '`' ? iArr[charAt2] : -1;
                if (i4 == -1) {
                    throw new w30();
                }
                int i5 = i2 + 1;
                if (i5 < length2) {
                    char charAt3 = str.charAt(i5);
                    int i6 = charAt3 < '`' ? iArr[charAt3] : -1;
                    if (i6 == -1) {
                        throw new w30();
                    }
                    qj0Var.b((i4 * 45) + i6, 11);
                    i2 += 2;
                } else {
                    qj0Var.b(i4, 6);
                    i2 = i5;
                }
            }
            return;
        }
        if (ordinal == 4) {
            byte[] bytes = str.getBytes(charset);
            int length3 = bytes.length;
            while (i2 < length3) {
                qj0Var.b(bytes[i2], 8);
                i2++;
            }
            return;
        }
        if (ordinal != 6) {
            throw new w30("Invalid mode: " + qg7Var);
        }
        Charset charset2 = bdb.b;
        if (charset2 == null) {
            throw new w30("SJIS Charset not supported on this platform");
        }
        byte[] bytes2 = str.getBytes(charset2);
        if (bytes2.length % 2 != 0) {
            throw new w30("Kanji byte size not even");
        }
        int length4 = bytes2.length - 1;
        while (i2 < length4) {
            int i7 = ((bytes2[i2] & 255) << 8) | (bytes2[i2 + 1] & 255);
            int i8 = 33088;
            if (i7 < 33088 || i7 > 40956) {
                if (i7 < 57408 || i7 > 60351) {
                    i = -1;
                    if (i != -1) {
                        throw new w30("Invalid byte sequence");
                    }
                    qj0Var.b(((i >> 8) * jn7.V2) + (i & jn7.d4), 13);
                    i2 += 2;
                } else {
                    i8 = 49472;
                }
            }
            i = i7 - i8;
            if (i != -1) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:170:0x0473, code lost:
    
        if (r9 < 8) goto L204;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x063a  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02a1 A[LOOP:2: B:49:0x029f->B:50:0x02a1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static d2c b(String str, r44 r44Var, AbstractMap abstractMap) {
        Charset forName;
        int i;
        int i2;
        qg7 qg7Var;
        int i3;
        xdc xdcVar;
        xdc xdcVar2;
        qj0 qj0Var;
        jk1 a2;
        int length;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        byte[][] bArr;
        i34 i34Var = i34.x;
        int i9 = 0;
        int i10 = 1;
        boolean z = abstractMap.containsKey(i34Var) && Boolean.parseBoolean(abstractMap.get(i34Var).toString());
        i34 i34Var2 = i34.w;
        boolean z2 = abstractMap.containsKey(i34Var2) && Boolean.parseBoolean(abstractMap.get(i34Var2).toString());
        i34 i34Var3 = i34.b;
        boolean containsKey = abstractMap.containsKey(i34Var3);
        Charset charset = b;
        if (containsKey) {
            try {
                forName = Charset.forName(abstractMap.get(i34Var3).toString());
            } catch (UnsupportedCharsetException unused) {
            }
            qg7 qg7Var2 = qg7.h;
            int i11 = 8;
            int i12 = 4;
            if (z2) {
                i = 0;
                i2 = 1;
                Charset charset2 = bdb.b;
                if (charset2 != null && charset2.equals(forName) && c(str)) {
                    qg7Var = qg7.r;
                } else {
                    boolean z3 = false;
                    boolean z4 = false;
                    int i13 = 0;
                    while (true) {
                        if (i13 < str.length()) {
                            char charAt = str.charAt(i13);
                            if (charAt < '0' || charAt > '9') {
                                if ((charAt < '`' ? a[charAt] : -1) == -1) {
                                    break;
                                }
                                z3 = true;
                            } else {
                                z4 = true;
                            }
                            i13++;
                        } else if (z3) {
                            qg7Var = qg7.e;
                        } else if (z4) {
                            qg7Var = qg7.d;
                        }
                    }
                    qg7Var = qg7Var2;
                }
                qj0 qj0Var2 = new qj0();
                if (qg7Var == qg7Var2 && containsKey && (a2 = jk1.a(forName)) != null) {
                    i3 = 4;
                    qj0Var2.b(7, 4);
                    qj0Var2.b(a2.a[0], 8);
                } else {
                    i3 = 4;
                }
                if (z) {
                    qj0Var2.b(5, i3);
                }
                qj0Var2.b(qg7Var.b, i3);
                qj0 qj0Var3 = new qj0();
                a(str, qg7Var, qj0Var3, forName);
                i34 i34Var4 = i34.r;
                if (!abstractMap.containsKey(i34Var4)) {
                    int a3 = qg7Var.a(xdc.c(1)) + qj0Var2.b + qj0Var3.b;
                    int i14 = 1;
                    while (i14 <= 40) {
                        xdc c = xdc.c(i14);
                        if (d(a3, c, r44Var)) {
                            int a4 = qg7Var.a(c) + qj0Var2.b + qj0Var3.b;
                            int i15 = 1;
                            while (i15 <= 40) {
                                xdc c2 = xdc.c(i15);
                                if (d(a4, c2, r44Var)) {
                                    xdcVar = c2;
                                } else {
                                    i15++;
                                    i11 = 8;
                                    i = 0;
                                }
                            }
                            throw new w30("Data too big");
                        }
                        i14++;
                        i11 = 8;
                        i = 0;
                    }
                    throw new w30("Data too big");
                }
                xdcVar = xdc.c(Integer.parseInt(abstractMap.get(i34Var4).toString()));
                if (!d(qg7Var.a(xdcVar) + qj0Var2.b + qj0Var3.b, xdcVar, r44Var)) {
                    throw new w30("Data too big for requested version");
                }
                qj0 qj0Var4 = new qj0();
                int i16 = qj0Var2.b;
                qj0Var4.c(i16);
                for (int i17 = i; i17 < i16; i17++) {
                    qj0Var4.a(qj0Var2.d(i17));
                }
                int e = qg7Var == qg7Var2 ? qj0Var3.e() : str.length();
                int a5 = qg7Var.a(xdcVar);
                int i18 = 1 << a5;
                if (e >= i18) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(e);
                    sb.append(" is bigger than ");
                    sb.append(i18 - 1);
                    throw new w30(sb.toString());
                }
                qj0Var4.b(e, a5);
                int i19 = qj0Var3.b;
                qj0Var4.c(qj0Var4.b + i19);
                for (int i20 = i; i20 < i19; i20++) {
                    qj0Var4.a(qj0Var3.d(i20));
                }
                qg7Var2 = qg7Var;
                xdcVar2 = xdcVar;
                qj0Var = qj0Var4;
            } else {
                if (forName.equals(charset)) {
                    forName = null;
                }
                vh4 vh4Var = new vh4();
                vh4Var.b = str;
                vh4Var.a = z;
                vh4Var.c = new xs3(str, forName);
                vh4Var.d = r44Var;
                r44 r44Var2 = (r44) vh4Var.d;
                xdc[] xdcVarArr = {vh4.t(1), vh4.t(2), vh4.t(3)};
                pm3[] pm3VarArr = {vh4Var.n(xdcVarArr[0]), vh4Var.n(xdcVarArr[1]), vh4Var.n(xdcVarArr[2])};
                int i21 = 0;
                int i22 = -1;
                int i23 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                for (int i24 = 3; i21 < i24; i24 = 3) {
                    pm3 pm3Var = pm3VarArr[i21];
                    int i25 = i10;
                    int x = pm3Var.x((xdc) pm3Var.b);
                    if (d(x, xdcVarArr[i21], r44Var2) && x < i23) {
                        i22 = i21;
                        i23 = x;
                    }
                    i21++;
                    i10 = i25;
                }
                i2 = i10;
                if (i22 < 0) {
                    throw new w30("Data too big for any version");
                }
                pm3 pm3Var2 = pm3VarArr[i22];
                qj0 qj0Var5 = new qj0();
                ArrayList arrayList = (ArrayList) pm3Var2.d;
                int size = arrayList.size();
                int i26 = 0;
                while (i26 < size) {
                    Object obj = arrayList.get(i26);
                    i26++;
                    hg7 hg7Var = (hg7) obj;
                    int i27 = hg7Var.c;
                    pm3 pm3Var3 = hg7Var.e;
                    int i28 = i9;
                    vh4 vh4Var2 = (vh4) pm3Var3.c;
                    qg7 qg7Var3 = hg7Var.a;
                    qj0Var5.b(qg7Var3.b, i12);
                    int i29 = hg7Var.d;
                    if (i29 > 0) {
                        qj0Var5.b(hg7Var.a(), qg7Var3.a((xdc) pm3Var3.b));
                    }
                    if (qg7Var3 == qg7.n) {
                        qj0Var5.b(jk1.a(((xs3) vh4Var2.c).a[i27].charset()).a[i28], 8);
                    } else if (i29 > 0) {
                        String str2 = (String) vh4Var2.b;
                        int i30 = hg7Var.b;
                        a(str2.substring(i30, i29 + i30), qg7Var3, qj0Var5, ((xs3) vh4Var2.c).a[i27].charset());
                    }
                    i9 = i28;
                    i12 = 4;
                }
                i = i9;
                xdcVar2 = (xdc) pm3Var2.b;
                qj0Var = qj0Var5;
            }
            ekd ekdVar = xdcVar2.c[r44Var.ordinal()];
            int i31 = xdcVar2.d;
            int i32 = ekdVar.a;
            wdc[] wdcVarArr = (wdc[]) ekdVar.b;
            length = wdcVarArr.length;
            i4 = i;
            int i33 = i4;
            while (i4 < length) {
                i33 += wdcVarArr[i4].a;
                i4++;
            }
            int i34 = i31 - (i33 * i32);
            i5 = i34 << 3;
            if (qj0Var.b <= i5) {
                throw new w30("data bits cannot fit in the QR Code" + qj0Var.b + " > " + i5);
            }
            for (int i35 = i; i35 < 4 && qj0Var.b < i5; i35++) {
                qj0Var.a(i);
            }
            boolean z5 = i;
            int i36 = qj0Var.b & 7;
            if (i36 > 0) {
                while (i36 < i11) {
                    qj0Var.a(z5);
                    i36++;
                    z5 = 0;
                }
            }
            int e2 = i34 - qj0Var.e();
            for (int i37 = 0; i37 < e2; i37++) {
                qj0Var.b((i37 & 1) == 0 ? jn7.L3 : 17, i11);
            }
            if (qj0Var.b != i5) {
                throw new w30("Bits size does not equal capacity");
            }
            int i38 = 0;
            for (wdc wdcVar : wdcVarArr) {
                i38 += wdcVar.a;
            }
            if (qj0Var.e() != i34) {
                throw new w30("Number of bits and data bytes does not match");
            }
            ArrayList arrayList2 = new ArrayList(i38);
            int i39 = 0;
            int i40 = 0;
            int i41 = 0;
            int i42 = 0;
            while (i39 < i38) {
                int i43 = i2;
                int[] iArr = new int[i43];
                int[] iArr2 = new int[i43];
                if (i39 >= i38) {
                    throw new w30("Block ID too large");
                }
                int i44 = i31 % i38;
                int i45 = i38 - i44;
                int i46 = i31 / i38;
                int i47 = i34 / i38;
                int i48 = i47 + 1;
                int i49 = i46 - i47;
                int i50 = (i46 + 1) - i48;
                if (i49 != i50) {
                    throw new w30("EC bytes mismatch");
                }
                if (i38 != i45 + i44) {
                    throw new w30("RS blocks mismatch");
                }
                if (i31 != ((i48 + i50) * i44) + ((i47 + i49) * i45)) {
                    throw new w30("Total bytes mismatch");
                }
                if (i39 < i45) {
                    iArr[0] = i47;
                    iArr2[0] = i49;
                } else {
                    iArr[0] = i48;
                    iArr2[0] = i50;
                }
                int i51 = iArr[0];
                byte[] bArr2 = new byte[i51];
                int i52 = i40 << 3;
                int i53 = i39;
                int i54 = 0;
                while (i54 < i51) {
                    int i55 = i54;
                    int i56 = i38;
                    int i57 = 0;
                    for (int i58 = 0; i58 < 8; i58++) {
                        if (qj0Var.d(i52)) {
                            i57 |= 1 << (7 - i58);
                        }
                        i52++;
                    }
                    bArr2[i55] = (byte) i57;
                    i54 = i55 + 1;
                    i38 = i56;
                }
                int i59 = i38;
                int i60 = iArr2[0];
                int[] iArr3 = new int[i51 + i60];
                for (int i61 = 0; i61 < i51; i61++) {
                    iArr3[i61] = bArr2[i61] & 255;
                }
                new um4(lu4.l).P(iArr3, i60);
                byte[] bArr3 = new byte[i60];
                int i62 = 0;
                while (i62 < i60) {
                    int[] iArr4 = iArr3;
                    bArr3[i62] = (byte) iArr4[i51 + i62];
                    i62++;
                    iArr3 = iArr4;
                }
                arrayList2.add(new ik0(bArr2, bArr3));
                i41 = Math.max(i41, i51);
                i42 = Math.max(i42, i60);
                i40 += iArr[0];
                i39 = i53 + 1;
                i38 = i59;
                i2 = 1;
            }
            if (i34 != i40) {
                throw new w30("Data bytes does not match offset");
            }
            qj0 qj0Var6 = new qj0();
            for (int i63 = 0; i63 < i41; i63++) {
                int size2 = arrayList2.size();
                int i64 = 0;
                while (i64 < size2) {
                    Object obj2 = arrayList2.get(i64);
                    i64++;
                    byte[] bArr4 = ((ik0) obj2).a;
                    if (i63 < bArr4.length) {
                        qj0Var6.b(bArr4[i63], 8);
                    }
                }
            }
            for (int i65 = 0; i65 < i42; i65++) {
                int size3 = arrayList2.size();
                int i66 = 0;
                while (i66 < size3) {
                    Object obj3 = arrayList2.get(i66);
                    i66++;
                    byte[] bArr5 = ((ik0) obj3).b;
                    if (i65 < bArr5.length) {
                        qj0Var6.b(bArr5[i65], 8);
                    }
                }
            }
            if (i31 != qj0Var6.e()) {
                StringBuilder m = uh9.m(i31, "Interleaving error: ", " and ");
                m.append(qj0Var6.e());
                m.append(" differ.");
                throw new w30(m.toString());
            }
            d2c d2cVar = new d2c();
            d2cVar.b = -1;
            d2cVar.d = r44Var;
            d2cVar.c = qg7Var2;
            d2cVar.e = xdcVar2;
            int i67 = (xdcVar2.a << 2) + 17;
            sj0 sj0Var = new sj0(i67, i67);
            i34 i34Var5 = i34.s;
            if (abstractMap.containsKey(i34Var5)) {
                i7 = Integer.parseInt(abstractMap.get(i34Var5).toString());
                i6 = 8;
                if (i7 >= 0) {
                }
            } else {
                i6 = 8;
            }
            i7 = -1;
            if (i7 == -1) {
                int i68 = -1;
                int i69 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                int i70 = 0;
                while (i70 < i6) {
                    jfd.a(qj0Var6, r44Var, xdcVar2, i70, sj0Var);
                    int i71 = 0;
                    int a6 = zse.a(sj0Var, false) + zse.a(sj0Var, true);
                    byte[][] bArr6 = (byte[][]) sj0Var.d;
                    int i72 = sj0Var.b;
                    int i73 = sj0Var.c;
                    int i74 = 0;
                    int i75 = 0;
                    while (i74 < i73 - 1) {
                        byte[] bArr7 = bArr6[i74];
                        int i76 = i75;
                        int i77 = i71;
                        while (i77 < i72 - 1) {
                            byte b2 = bArr7[i77];
                            int i78 = i77 + 1;
                            int i79 = a6;
                            if (b2 == bArr7[i78]) {
                                byte[] bArr8 = bArr6[i74 + 1];
                                if (b2 == bArr8[i77] && b2 == bArr8[i78]) {
                                    i76++;
                                }
                            }
                            a6 = i79;
                            i77 = i78;
                        }
                        i74++;
                        i75 = i76;
                        i71 = 0;
                    }
                    int i80 = (i75 * 3) + a6;
                    int i81 = 0;
                    int i82 = 0;
                    while (i81 < i73) {
                        int i83 = i82;
                        int i84 = 0;
                        while (i84 < i72) {
                            byte[] bArr9 = bArr6[i81];
                            int i85 = i70;
                            int i86 = i84 + 6;
                            if (i86 < i72) {
                                i8 = i68;
                                if (bArr9[i84] == 1 && bArr9[i84 + 1] == 0 && bArr9[i84 + 2] == 1 && bArr9[i84 + 3] == 1 && bArr9[i84 + 4] == 1 && bArr9[i84 + 5] == 0 && bArr9[i86] == 1) {
                                    int i87 = i84 - 4;
                                    if (i87 >= 0 && bArr9.length >= i84) {
                                        while (i87 < i84) {
                                            int i88 = i87;
                                            if (bArr9[i87] != 1) {
                                                i87 = i88 + 1;
                                            }
                                        }
                                        i83++;
                                    }
                                    int i89 = i84 + 7;
                                    int i90 = i84 + 11;
                                    if (i89 >= 0 && bArr9.length >= i90) {
                                        int i91 = i89;
                                        while (i91 < i90) {
                                            int i92 = i91;
                                            int i93 = i90;
                                            if (bArr9[i92] == 1) {
                                                break;
                                            }
                                            i91 = i92 + 1;
                                            i90 = i93;
                                        }
                                        i83++;
                                    }
                                }
                            } else {
                                i8 = i68;
                            }
                            int i94 = i81 + 6;
                            if (i94 < i73) {
                                byte b3 = 1;
                                if (bArr6[i81][i84] == 1 && bArr6[i81 + 1][i84] == 0 && bArr6[i81 + 2][i84] == 1 && bArr6[i81 + 3][i84] == 1 && bArr6[i81 + 4][i84] == 1 && bArr6[i81 + 5][i84] == 0 && bArr6[i94][i84] == 1) {
                                    int i95 = i81 - 4;
                                    if (i95 >= 0 && bArr6.length >= i81) {
                                        while (i95 < i81) {
                                            if (bArr6[i95][i84] != b3) {
                                                i95++;
                                                b3 = 1;
                                            }
                                        }
                                        bArr = bArr6;
                                        i83++;
                                        i84++;
                                        bArr6 = bArr;
                                        i68 = i8;
                                        i70 = i85;
                                    }
                                    int i96 = i81 + 7;
                                    int i97 = i81 + 11;
                                    if (i96 >= 0 && bArr6.length >= i97) {
                                        while (i96 < i97) {
                                            bArr = bArr6;
                                            if (bArr6[i96][i84] != 1) {
                                                i96++;
                                                bArr6 = bArr;
                                            }
                                        }
                                        bArr = bArr6;
                                        i83++;
                                        i84++;
                                        bArr6 = bArr;
                                        i68 = i8;
                                        i70 = i85;
                                    }
                                }
                            }
                            bArr = bArr6;
                            i84++;
                            bArr6 = bArr;
                            i68 = i8;
                            i70 = i85;
                        }
                        i81++;
                        i82 = i83;
                    }
                    byte[][] bArr10 = bArr6;
                    int i98 = i70;
                    int i99 = i68;
                    int i100 = (i82 * 40) + i80;
                    int i101 = 0;
                    for (int i102 = 0; i102 < i73; i102++) {
                        byte[] bArr11 = bArr10[i102];
                        for (int i103 = 0; i103 < i72; i103++) {
                            if (bArr11[i103] == 1) {
                                i101++;
                            }
                        }
                    }
                    int i104 = i73 * i72;
                    int abs = (((Math.abs((i101 << 1) - i104) * 10) / i104) * 10) + i100;
                    if (abs < i69) {
                        i69 = abs;
                        i68 = i98;
                    } else {
                        i68 = i99;
                    }
                    i70 = i98 + 1;
                    i6 = 8;
                }
                i7 = i68;
            }
            d2cVar.b = i7;
            jfd.a(qj0Var6, r44Var, xdcVar2, i7, sj0Var);
            d2cVar.f = sj0Var;
            return d2cVar;
        }
        forName = charset;
        qg7 qg7Var22 = qg7.h;
        int i112 = 8;
        int i122 = 4;
        if (z2) {
        }
        ekd ekdVar2 = xdcVar2.c[r44Var.ordinal()];
        int i312 = xdcVar2.d;
        int i322 = ekdVar2.a;
        wdc[] wdcVarArr2 = (wdc[]) ekdVar2.b;
        length = wdcVarArr2.length;
        i4 = i;
        int i332 = i4;
        while (i4 < length) {
        }
        int i342 = i312 - (i332 * i322);
        i5 = i342 << 3;
        if (qj0Var.b <= i5) {
        }
    }

    public static boolean c(String str) {
        byte[] bytes = str.getBytes(bdb.b);
        int length = bytes.length;
        if (length % 2 != 0) {
            return false;
        }
        for (int i = 0; i < length; i += 2) {
            int i2 = bytes[i] & 255;
            if ((i2 < 129 || i2 > 159) && (i2 < 224 || i2 > 235)) {
                return false;
            }
        }
        return true;
    }

    public static boolean d(int i, xdc xdcVar, r44 r44Var) {
        int i2 = xdcVar.d;
        ekd ekdVar = xdcVar.c[r44Var.ordinal()];
        byte b2 = ekdVar.a;
        int i3 = 0;
        for (wdc wdcVar : (wdc[]) ekdVar.b) {
            i3 += wdcVar.a;
        }
        return i2 - (i3 * b2) >= (i + 7) / 8;
    }
}
