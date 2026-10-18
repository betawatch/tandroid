package kc;

import b2.u0;
import c5.b0;
import com.google.firebase.messaging.q;
import e0.f0;
import ec.h;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Map;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public abstract class c {
    public static final int[] a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};
    public static final Charset b = StandardCharsets.ISO_8859_1;

    /* JADX WARN: Removed duplicated region for block: B:20:0x004d A[LOOP:0: B:13:0x0022->B:20:0x004d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(String str, ic.e eVar, ec.a aVar, Charset charset) {
        int i10;
        int ordinal = eVar.ordinal();
        int i11 = 0;
        if (ordinal == 1) {
            int length = str.length();
            while (i11 < length) {
                int charAt = str.charAt(i11) - '0';
                int i12 = i11 + 2;
                if (i12 < length) {
                    aVar.b(((str.charAt(i11 + 1) - '0') * 10) + (charAt * 100) + (str.charAt(i12) - '0'), 10);
                    i11 += 3;
                } else {
                    i11++;
                    if (i11 < length) {
                        aVar.b((charAt * 10) + (str.charAt(i11) - '0'), 7);
                        i11 = i12;
                    } else {
                        aVar.b(charAt, 4);
                    }
                }
            }
            return;
        }
        if (ordinal == 2) {
            int length2 = str.length();
            while (i11 < length2) {
                char charAt2 = str.charAt(i11);
                int[] iArr = a;
                int i13 = charAt2 < '`' ? iArr[charAt2] : -1;
                if (i13 == -1) {
                    throw new q();
                }
                int i14 = i11 + 1;
                if (i14 < length2) {
                    char charAt3 = str.charAt(i14);
                    int i15 = charAt3 < '`' ? iArr[charAt3] : -1;
                    if (i15 == -1) {
                        throw new q();
                    }
                    aVar.b((i13 * 45) + i15, 11);
                    i11 += 2;
                } else {
                    aVar.b(i13, 6);
                    i11 = i14;
                }
            }
            return;
        }
        if (ordinal == 4) {
            byte[] bytes = str.getBytes(charset);
            int length3 = bytes.length;
            while (i11 < length3) {
                aVar.b(bytes[i11], 8);
                i11++;
            }
            return;
        }
        if (ordinal != 6) {
            throw new q("Invalid mode: " + eVar);
        }
        Charset charset2 = h.b;
        if (charset2 == null) {
            throw new q("SJIS Charset not supported on this platform");
        }
        byte[] bytes2 = str.getBytes(charset2);
        if (bytes2.length % 2 != 0) {
            throw new q("Kanji byte size not even");
        }
        int length4 = bytes2.length - 1;
        while (i11 < length4) {
            int i16 = ((bytes2[i11] & 255) << 8) | (bytes2[i11 + 1] & 255);
            int i17 = 33088;
            if (i16 < 33088 || i16 > 40956) {
                if (i16 < 57408 || i16 > 60351) {
                    i10 = -1;
                    if (i10 != -1) {
                        throw new q("Invalid byte sequence");
                    }
                    aVar.b(((i10 >> 8) * 192) + (i10 & 255), 13);
                    i11 += 2;
                } else {
                    i17 = 49472;
                }
            }
            i10 = i16 - i17;
            if (i10 != -1) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:251:0x0613, code lost:
    
        if ((r9 >= 0 && r9 < 8) != false) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x06e4, code lost:
    
        if (r7 == false) goto L347;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x0762, code lost:
    
        if (r5 == false) goto L393;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x053a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x06f1  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0741  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0765  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x076d  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0805  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x0270 A[LOOP:32: B:444:0x026e->B:445:0x0270, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:448:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x0825  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x004f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02bf A[LOOP:2: B:57:0x02bd->B:58:0x02bf, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static f0 b(String str, ic.c cVar, Map map) {
        boolean z10;
        boolean z11;
        boolean z12;
        Charset forName;
        int i10;
        int i11;
        int i12;
        ic.e eVar;
        int i13;
        ic.f fVar;
        int i14;
        int i15;
        int e;
        int i16;
        ic.f fVar2;
        ec.a aVar;
        ec.c cVar2;
        int length;
        int i17;
        int i18;
        int i19;
        int i20;
        byte[][] bArr;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        char c10;
        ic.e eVar2;
        int i27;
        ic.c cVar3 = cVar;
        Map map2 = map;
        int i28 = 0;
        int i29 = 1;
        if (map2 != null) {
            dc.b bVar = dc.b.h;
            if (map2.containsKey(bVar) && Boolean.parseBoolean(map2.get(bVar).toString())) {
                z10 = true;
                if (map2 != null) {
                    dc.b bVar2 = dc.b.f;
                    if (map2.containsKey(bVar2) && Boolean.parseBoolean(map2.get(bVar2).toString())) {
                        z11 = true;
                        dc.b bVar3 = dc.b.b;
                        z12 = map2 == null && map2.containsKey(bVar3);
                        Charset charset = b;
                        if (z12) {
                            try {
                                forName = Charset.forName(map2.get(bVar3).toString());
                            } catch (UnsupportedCharsetException unused) {
                            }
                            ic.e eVar3 = ic.e.h;
                            int i30 = 8;
                            int i31 = 4;
                            if (z11) {
                                i10 = 0;
                                i11 = 1;
                                i12 = 2;
                                Charset charset2 = h.b;
                                if (charset2 != null && charset2.equals(forName) && c(str)) {
                                    eVar = ic.e.r;
                                } else {
                                    boolean z17 = false;
                                    boolean z18 = false;
                                    int i32 = 0;
                                    while (true) {
                                        if (i32 < str.length()) {
                                            char charAt = str.charAt(i32);
                                            if (charAt < '0' || charAt > '9') {
                                                if ((charAt < '`' ? a[charAt] : -1) == -1) {
                                                    break;
                                                }
                                                z17 = true;
                                            } else {
                                                z18 = true;
                                            }
                                            i32++;
                                        } else if (z17) {
                                            eVar = ic.e.e;
                                        } else if (z18) {
                                            eVar = ic.e.d;
                                        }
                                    }
                                    eVar = eVar3;
                                }
                                ec.a aVar2 = new ec.a();
                                if (eVar == eVar3 && z12 && (cVar2 = (ec.c) ec.c.d.get(forName.name())) != null) {
                                    i13 = 4;
                                    aVar2.b(7, 4);
                                    aVar2.b(cVar2.a[0], 8);
                                } else {
                                    i13 = 4;
                                }
                                if (z10) {
                                    aVar2.b(5, i13);
                                }
                                aVar2.b(eVar.b, i13);
                                ec.a aVar3 = new ec.a();
                                a(str, eVar, aVar3, forName);
                                if (map2 != null) {
                                    dc.b bVar4 = dc.b.d;
                                    if (map2.containsKey(bVar4)) {
                                        fVar = ic.f.c(Integer.parseInt(map2.get(bVar4).toString()));
                                        if (!d(eVar.a(fVar) + aVar2.b + aVar3.b, fVar, cVar3)) {
                                            throw new q("Data too big for requested version");
                                        }
                                        ec.a aVar4 = new ec.a();
                                        i14 = aVar2.b;
                                        aVar4.c(i14);
                                        for (i15 = i10; i15 < i14; i15++) {
                                            aVar4.a(aVar2.d(i15));
                                        }
                                        e = eVar != eVar3 ? aVar3.e() : str.length();
                                        int a2 = eVar.a(fVar);
                                        i16 = 1 << a2;
                                        if (e < i16) {
                                            StringBuilder sb2 = new StringBuilder();
                                            sb2.append(e);
                                            sb2.append(" is bigger than ");
                                            sb2.append(i16 - 1);
                                            throw new q(sb2.toString());
                                        }
                                        aVar4.b(e, a2);
                                        int i33 = aVar3.b;
                                        aVar4.c(aVar4.b + i33);
                                        for (int i34 = i10; i34 < i33; i34++) {
                                            aVar4.a(aVar3.d(i34));
                                        }
                                        eVar3 = eVar;
                                        fVar2 = fVar;
                                        aVar = aVar4;
                                    }
                                }
                                int a10 = eVar.a(ic.f.c(1)) + aVar2.b + aVar3.b;
                                int i35 = 1;
                                while (i35 <= 40) {
                                    ic.f c11 = ic.f.c(i35);
                                    if (d(a10, c11, cVar3)) {
                                        int a11 = eVar.a(c11) + aVar2.b + aVar3.b;
                                        int i36 = 1;
                                        while (i36 <= 40) {
                                            ic.f c12 = ic.f.c(i36);
                                            if (d(a11, c12, cVar3)) {
                                                fVar = c12;
                                                ec.a aVar42 = new ec.a();
                                                i14 = aVar2.b;
                                                aVar42.c(i14);
                                                while (i15 < i14) {
                                                }
                                                if (eVar != eVar3) {
                                                }
                                                int a22 = eVar.a(fVar);
                                                i16 = 1 << a22;
                                                if (e < i16) {
                                                }
                                            } else {
                                                i36++;
                                                cVar3 = cVar3;
                                                map2 = map2;
                                                i30 = 8;
                                                i10 = 0;
                                            }
                                        }
                                        throw new q("Data too big");
                                    }
                                    i35++;
                                    cVar3 = cVar3;
                                    map2 = map2;
                                    i30 = 8;
                                    i10 = 0;
                                }
                                throw new q("Data too big");
                            }
                            if (forName.equals(charset)) {
                                forName = null;
                            }
                            c2.b bVar5 = new c2.b();
                            bVar5.b = str;
                            bVar5.a = z10;
                            bVar5.c = new ec.d(str, forName);
                            bVar5.d = cVar3;
                            ic.c cVar4 = (ic.c) bVar5.d;
                            i12 = 2;
                            ic.f[] fVarArr = {c2.b.o(1), c2.b.o(2), c2.b.o(3)};
                            androidx.biometric.e[] eVarArr = {bVar5.j(fVarArr[0]), bVar5.j(fVarArr[1]), bVar5.j(fVarArr[2])};
                            int i37 = 0;
                            int i38 = -1;
                            int i39 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                            for (int i40 = 3; i37 < i40; i40 = 3) {
                                androidx.biometric.e eVar4 = eVarArr[i37];
                                int i41 = i29;
                                int q6 = eVar4.q((ic.f) eVar4.c);
                                if (d(q6, fVarArr[i37], cVar4) && q6 < i39) {
                                    i39 = q6;
                                    i38 = i37;
                                }
                                i37++;
                                i29 = i41;
                            }
                            i11 = i29;
                            if (i38 < 0) {
                                throw new q("Data too big for any version");
                            }
                            androidx.biometric.e eVar5 = eVarArr[i38];
                            ec.a aVar5 = new ec.a();
                            ArrayList arrayList = (ArrayList) eVar5.b;
                            int size = arrayList.size();
                            int i42 = 0;
                            while (i42 < size) {
                                Object obj = arrayList.get(i42);
                                i42++;
                                f fVar3 = (f) obj;
                                int i43 = fVar3.c;
                                androidx.biometric.e eVar6 = fVar3.e;
                                int i44 = i28;
                                c2.b bVar6 = (c2.b) eVar6.d;
                                ic.e eVar7 = fVar3.a;
                                aVar5.b(eVar7.b, i31);
                                int i45 = fVar3.d;
                                if (i45 > 0) {
                                    aVar5.b(fVar3.a(), eVar7.a((ic.f) eVar6.c));
                                }
                                if (eVar7 == ic.e.n) {
                                    aVar5.b(((ec.c) ec.c.d.get(((ec.d) bVar6.c).a[i43].charset().name())).a[i44], 8);
                                } else if (i45 > 0) {
                                    String str2 = (String) bVar6.b;
                                    int i46 = fVar3.b;
                                    a(str2.substring(i46, i45 + i46), eVar7, aVar5, ((ec.d) bVar6.c).a[i43].charset());
                                }
                                i28 = i44;
                                i31 = 4;
                            }
                            i10 = i28;
                            fVar2 = (ic.f) eVar5.c;
                            aVar = aVar5;
                            b0 b0Var = fVar2.c[cVar3.ordinal()];
                            int i47 = fVar2.d;
                            int i48 = b0Var.b;
                            u0[] u0VarArr = (u0[]) b0Var.c;
                            length = u0VarArr.length;
                            i17 = i10;
                            int i49 = i17;
                            while (i17 < length) {
                                i49 += u0VarArr[i17].a;
                                i17++;
                            }
                            int i50 = i47 - (i49 * i48);
                            i18 = i50 * 8;
                            if (aVar.b <= i18) {
                                throw new q("data bits cannot fit in the QR Code" + aVar.b + " > " + i18);
                            }
                            for (int i51 = i10; i51 < 4 && aVar.b < i18; i51++) {
                                aVar.a(i10);
                            }
                            boolean z19 = i10;
                            int i52 = aVar.b & 7;
                            if (i52 > 0) {
                                while (i52 < i30) {
                                    aVar.a(z19);
                                    i52++;
                                    z19 = 0;
                                }
                            }
                            int e7 = i50 - aVar.e();
                            for (int i53 = 0; i53 < e7; i53++) {
                                aVar.b((i53 & 1) == 0 ? 236 : 17, i30);
                            }
                            if (aVar.b != i18) {
                                throw new q("Bits size does not equal capacity");
                            }
                            int i54 = 0;
                            for (u0 u0Var : u0VarArr) {
                                i54 += u0Var.a;
                            }
                            if (aVar.e() != i50) {
                                throw new q("Number of bits and data bytes does not match");
                            }
                            ArrayList arrayList2 = new ArrayList(i54);
                            int i55 = 0;
                            int i56 = 0;
                            int i57 = 0;
                            int i58 = 0;
                            ec.a aVar6 = aVar;
                            while (i55 < i54) {
                                int i59 = i11;
                                int[] iArr = new int[i59];
                                int[] iArr2 = new int[i59];
                                if (i55 >= i54) {
                                    throw new q("Block ID too large");
                                }
                                int i60 = i47 % i54;
                                int i61 = i54 - i60;
                                int i62 = i47 / i54;
                                int i63 = i50 / i54;
                                int i64 = i63 + 1;
                                int i65 = i62 - i63;
                                int i66 = (i62 + 1) - i64;
                                if (i65 != i66) {
                                    throw new q("EC bytes mismatch");
                                }
                                if (i54 != i61 + i60) {
                                    throw new q("RS blocks mismatch");
                                }
                                if (i47 != ((i64 + i66) * i60) + ((i63 + i65) * i61)) {
                                    throw new q("Total bytes mismatch");
                                }
                                if (i55 < i61) {
                                    c10 = 0;
                                    iArr[0] = i63;
                                    iArr2[0] = i65;
                                } else {
                                    c10 = 0;
                                    iArr[0] = i64;
                                    iArr2[0] = i66;
                                }
                                int i67 = iArr[c10];
                                byte[] bArr2 = new byte[i67];
                                int i68 = i56 * 8;
                                int i69 = i55;
                                int i70 = 0;
                                while (i70 < i67) {
                                    int i71 = i70;
                                    int i72 = i54;
                                    int i73 = 0;
                                    for (int i74 = 0; i74 < 8; i74++) {
                                        if (aVar6.d(i68)) {
                                            i73 = (1 << (7 - i74)) | i73;
                                        }
                                        i68++;
                                    }
                                    bArr2[i71] = (byte) i73;
                                    i70 = i71 + 1;
                                    i54 = i72;
                                }
                                int i75 = i54;
                                int i76 = iArr2[0];
                                int i77 = i67 + i76;
                                int[] iArr3 = new int[i77];
                                int i78 = 0;
                                while (i78 < i67) {
                                    iArr3[i78] = bArr2[i78] & 255;
                                    i78++;
                                    i77 = i77;
                                }
                                int i79 = i77;
                                gc.a aVar7 = gc.a.h;
                                ArrayList arrayList3 = new ArrayList();
                                ec.a aVar8 = aVar6;
                                ic.f fVar4 = fVar2;
                                arrayList3.add(new gc.b(aVar7, new int[]{1}));
                                if (i76 == 0) {
                                    throw new IllegalArgumentException("No error correction bytes");
                                }
                                int i80 = i79 - i76;
                                if (i80 <= 0) {
                                    throw new IllegalArgumentException("No data bytes provided");
                                }
                                if (i76 >= arrayList3.size()) {
                                    gc.b bVar7 = (gc.b) i2.d.h(1, arrayList3);
                                    int size2 = arrayList3.size();
                                    eVar2 = eVar3;
                                    gc.b bVar8 = bVar7;
                                    while (size2 <= i76) {
                                        int i81 = size2;
                                        bVar8 = bVar8.g(new gc.b(aVar7, new int[]{1, aVar7.a[(i81 - 1) + aVar7.g]}));
                                        arrayList3.add(bVar8);
                                        size2 = i81 + 1;
                                        i47 = i47;
                                    }
                                } else {
                                    eVar2 = eVar3;
                                }
                                int i82 = i47;
                                gc.b bVar9 = (gc.b) arrayList3.get(i76);
                                int[] iArr4 = new int[i80];
                                System.arraycopy(iArr3, 0, iArr4, 0, i80);
                                if (i80 == 0) {
                                    throw new IllegalArgumentException();
                                }
                                if (i80 > 1 && iArr4[0] == 0) {
                                    int i83 = 1;
                                    while (i83 < i80 && iArr4[i83] == 0) {
                                        i83++;
                                    }
                                    if (i83 == i80) {
                                        iArr4 = new int[]{0};
                                    } else {
                                        int i84 = i80 - i83;
                                        i27 = i80;
                                        int[] iArr5 = new int[i84];
                                        System.arraycopy(iArr4, i83, iArr5, 0, i84);
                                        iArr4 = iArr5;
                                        if (i76 >= 0) {
                                            throw new IllegalArgumentException();
                                        }
                                        int length2 = iArr4.length;
                                        int[] iArr6 = new int[length2 + i76];
                                        int i85 = 0;
                                        while (i85 < length2) {
                                            iArr6[i85] = aVar7.c(iArr4[i85], 1);
                                            i85++;
                                            length2 = length2;
                                        }
                                        gc.b bVar10 = new gc.b(aVar7, iArr6);
                                        if (!aVar7.equals(bVar9.a)) {
                                            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
                                        }
                                        if (bVar9.e()) {
                                            throw new IllegalArgumentException("Divide by 0");
                                        }
                                        gc.b bVar11 = aVar7.c;
                                        int b10 = aVar7.b(bVar9.c(bVar9.d()));
                                        while (bVar10.d() >= bVar9.d() && !bVar10.e()) {
                                            int d = bVar10.d() - bVar9.d();
                                            int c13 = aVar7.c(bVar10.c(bVar10.d()), b10);
                                            int i86 = b10;
                                            gc.b h = bVar9.h(d, c13);
                                            bVar11 = bVar11.a(aVar7.a(d, c13));
                                            bVar10 = bVar10.a(h);
                                            b10 = i86;
                                        }
                                        int i87 = i12;
                                        gc.b[] bVarArr = new gc.b[i87];
                                        bVarArr[0] = bVar11;
                                        bVarArr[1] = bVar10;
                                        int[] iArr7 = bVarArr[1].b;
                                        int length3 = i76 - iArr7.length;
                                        for (int i88 = 0; i88 < length3; i88++) {
                                            iArr3[i27 + i88] = 0;
                                        }
                                        System.arraycopy(iArr7, 0, iArr3, i27 + length3, iArr7.length);
                                        byte[] bArr3 = new byte[i76];
                                        for (int i89 = 0; i89 < i76; i89++) {
                                            bArr3[i89] = (byte) iArr3[i67 + i89];
                                        }
                                        arrayList2.add(new a(bArr2, bArr3));
                                        i57 = Math.max(i57, i67);
                                        i58 = Math.max(i58, i76);
                                        i56 += iArr[0];
                                        i55 = i69 + 1;
                                        i12 = i87;
                                        eVar3 = eVar2;
                                        i54 = i75;
                                        aVar6 = aVar8;
                                        fVar2 = fVar4;
                                        i47 = i82;
                                        i11 = 1;
                                    }
                                }
                                i27 = i80;
                                if (i76 >= 0) {
                                }
                            }
                            ic.f fVar5 = fVar2;
                            int i90 = i47;
                            ic.e eVar8 = eVar3;
                            if (i50 != i56) {
                                throw new q("Data bytes does not match offset");
                            }
                            ec.a aVar9 = new ec.a();
                            for (int i91 = 0; i91 < i57; i91++) {
                                int size3 = arrayList2.size();
                                int i92 = 0;
                                while (i92 < size3) {
                                    Object obj2 = arrayList2.get(i92);
                                    i92++;
                                    byte[] bArr4 = ((a) obj2).a;
                                    if (i91 < bArr4.length) {
                                        aVar9.b(bArr4[i91], 8);
                                    }
                                }
                            }
                            for (int i93 = 0; i93 < i58; i93++) {
                                int size4 = arrayList2.size();
                                int i94 = 0;
                                while (i94 < size4) {
                                    Object obj3 = arrayList2.get(i94);
                                    i94++;
                                    byte[] bArr5 = ((a) obj3).b;
                                    if (i93 < bArr5.length) {
                                        aVar9.b(bArr5[i93], 8);
                                    }
                                }
                            }
                            if (i90 != aVar9.e()) {
                                StringBuilder l4 = i2.d.l(i90, "Interleaving error: ", " and ");
                                l4.append(aVar9.e());
                                l4.append(" differ.");
                                throw new q(l4.toString());
                            }
                            f0 f0Var = new f0();
                            f0Var.b = -1;
                            f0Var.d = cVar;
                            f0Var.c = eVar8;
                            f0Var.e = fVar5;
                            int i95 = (fVar5.a * 4) + 17;
                            b bVar12 = new b(i95, i95);
                            if (map != null) {
                                dc.b bVar13 = dc.b.e;
                                if (map.containsKey(bVar13)) {
                                    i19 = Integer.parseInt(map.get(bVar13).toString());
                                }
                            }
                            i19 = -1;
                            if (i19 == -1) {
                                int i96 = -1;
                                int i97 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                for (int i98 = 0; i98 < 8; i98++) {
                                    d.b(aVar9, cVar, fVar5, i98, bVar12);
                                    int i99 = 0;
                                    int a12 = d.a(bVar12, false) + d.a(bVar12, true);
                                    int i100 = 0;
                                    int i101 = 0;
                                    while (true) {
                                        i20 = bVar12.c;
                                        int i102 = i20 - 1;
                                        bArr = bVar12.a;
                                        i21 = bVar12.b;
                                        if (i100 >= i102) {
                                            break;
                                        }
                                        byte[] bArr6 = bArr[i100];
                                        int i103 = i99;
                                        while (i103 < i21 - 1) {
                                            byte b11 = bArr6[i103];
                                            int i104 = i103 + 1;
                                            int i105 = i100;
                                            if (b11 == bArr6[i104]) {
                                                byte[] bArr7 = bArr[i105 + 1];
                                                if (b11 == bArr7[i103] && b11 == bArr7[i104]) {
                                                    i101++;
                                                }
                                            }
                                            i103 = i104;
                                            i100 = i105;
                                        }
                                        i100++;
                                        i99 = 0;
                                    }
                                    int i106 = (i101 * 3) + a12;
                                    int i107 = 0;
                                    int i108 = 0;
                                    while (i107 < i20) {
                                        int i109 = 0;
                                        while (i109 < i21) {
                                            byte[] bArr8 = bArr[i107];
                                            int i110 = i108;
                                            int i111 = i109 + 6;
                                            if (i111 < i21) {
                                                i22 = i106;
                                                if (bArr8[i109] == 1 && bArr8[i109 + 1] == 0 && bArr8[i109 + 2] == 1 && bArr8[i109 + 3] == 1 && bArr8[i109 + 4] == 1 && bArr8[i109 + 5] == 0 && bArr8[i111] == 1) {
                                                    int i112 = i109 - 4;
                                                    if (i112 >= 0 && bArr8.length >= i109) {
                                                        while (i112 < i109) {
                                                            int i113 = i112;
                                                            if (bArr8[i112] != 1) {
                                                                i112 = i113 + 1;
                                                            }
                                                        }
                                                        z15 = true;
                                                        if (!z15) {
                                                            int i114 = i109 + 7;
                                                            int i115 = i109 + 11;
                                                            if (i114 >= 0 && bArr8.length >= i115) {
                                                                int i116 = i114;
                                                                while (i116 < i115) {
                                                                    int i117 = i116;
                                                                    int i118 = i115;
                                                                    if (bArr8[i117] != 1) {
                                                                        i116 = i117 + 1;
                                                                        i115 = i118;
                                                                    }
                                                                }
                                                                z16 = true;
                                                            }
                                                            z16 = false;
                                                            break;
                                                        }
                                                        i23 = i110 + 1;
                                                        i24 = i107 + 6;
                                                        if (i24 < i20) {
                                                            i26 = i23;
                                                            byte b12 = 1;
                                                            if (bArr[i107][i109] == 1 && bArr[i107 + 1][i109] == 0 && bArr[i107 + 2][i109] == 1 && bArr[i107 + 3][i109] == 1 && bArr[i107 + 4][i109] == 1 && bArr[i107 + 5][i109] == 0 && bArr[i24][i109] == 1) {
                                                                int i119 = i107 - 4;
                                                                if (i119 >= 0 && bArr.length >= i107) {
                                                                    while (i119 < i107) {
                                                                        if (bArr[i119][i109] != b12) {
                                                                            i119++;
                                                                            b12 = 1;
                                                                        }
                                                                    }
                                                                    z13 = true;
                                                                    if (z13) {
                                                                        int i120 = i107 + 7;
                                                                        int i121 = i107 + 11;
                                                                        if (i120 < 0 || bArr.length < i121) {
                                                                            i25 = i107;
                                                                        } else {
                                                                            while (i120 < i121) {
                                                                                i25 = i107;
                                                                                if (bArr[i120][i109] != 1) {
                                                                                    i120++;
                                                                                    i107 = i25;
                                                                                }
                                                                            }
                                                                            i25 = i107;
                                                                            z14 = true;
                                                                        }
                                                                        z14 = false;
                                                                        break;
                                                                    } else {
                                                                        i25 = i107;
                                                                    }
                                                                    i108 = i26 + 1;
                                                                    i109++;
                                                                    i106 = i22;
                                                                    i107 = i25;
                                                                }
                                                                z13 = false;
                                                                if (z13) {
                                                                }
                                                                i108 = i26 + 1;
                                                                i109++;
                                                                i106 = i22;
                                                                i107 = i25;
                                                            } else {
                                                                i25 = i107;
                                                            }
                                                        } else {
                                                            i25 = i107;
                                                            i26 = i23;
                                                        }
                                                        i108 = i26;
                                                        i109++;
                                                        i106 = i22;
                                                        i107 = i25;
                                                    }
                                                    z15 = false;
                                                    if (!z15) {
                                                    }
                                                    i23 = i110 + 1;
                                                    i24 = i107 + 6;
                                                    if (i24 < i20) {
                                                    }
                                                    i108 = i26;
                                                    i109++;
                                                    i106 = i22;
                                                    i107 = i25;
                                                }
                                            } else {
                                                i22 = i106;
                                            }
                                            i23 = i110;
                                            i24 = i107 + 6;
                                            if (i24 < i20) {
                                            }
                                            i108 = i26;
                                            i109++;
                                            i106 = i22;
                                            i107 = i25;
                                        }
                                        i107++;
                                    }
                                    int i122 = (i108 * 40) + i106;
                                    int i123 = 0;
                                    int i124 = 0;
                                    while (i123 < i20) {
                                        byte[] bArr9 = bArr[i123];
                                        int i125 = 0;
                                        while (i125 < i21) {
                                            int i126 = i123;
                                            int i127 = i122;
                                            if (bArr9[i125] == 1) {
                                                i124++;
                                            }
                                            i125++;
                                            i122 = i127;
                                            i123 = i126;
                                        }
                                        i123++;
                                    }
                                    int i128 = i20 * i21;
                                    int abs = (((Math.abs((i124 * 2) - i128) * 10) / i128) * 10) + i122;
                                    if (abs < i97) {
                                        i97 = abs;
                                        i96 = i98;
                                    }
                                }
                                i19 = i96;
                            }
                            f0Var.b = i19;
                            d.b(aVar9, cVar, fVar5, i19, bVar12);
                            f0Var.f = bVar12;
                            return f0Var;
                        }
                        forName = charset;
                        ic.e eVar32 = ic.e.h;
                        int i302 = 8;
                        int i312 = 4;
                        if (z11) {
                        }
                        b0 b0Var2 = fVar2.c[cVar3.ordinal()];
                        int i472 = fVar2.d;
                        int i482 = b0Var2.b;
                        u0[] u0VarArr2 = (u0[]) b0Var2.c;
                        length = u0VarArr2.length;
                        i17 = i10;
                        int i492 = i17;
                        while (i17 < length) {
                        }
                        int i502 = i472 - (i492 * i482);
                        i18 = i502 * 8;
                        if (aVar.b <= i18) {
                        }
                    }
                }
                z11 = false;
                dc.b bVar32 = dc.b.b;
                if (map2 == null) {
                }
                Charset charset3 = b;
                if (z12) {
                }
                forName = charset3;
                ic.e eVar322 = ic.e.h;
                int i3022 = 8;
                int i3122 = 4;
                if (z11) {
                }
                b0 b0Var22 = fVar2.c[cVar3.ordinal()];
                int i4722 = fVar2.d;
                int i4822 = b0Var22.b;
                u0[] u0VarArr22 = (u0[]) b0Var22.c;
                length = u0VarArr22.length;
                i17 = i10;
                int i4922 = i17;
                while (i17 < length) {
                }
                int i5022 = i4722 - (i4922 * i4822);
                i18 = i5022 * 8;
                if (aVar.b <= i18) {
                }
            }
        }
        z10 = false;
        if (map2 != null) {
        }
        z11 = false;
        dc.b bVar322 = dc.b.b;
        if (map2 == null) {
        }
        Charset charset32 = b;
        if (z12) {
        }
        forName = charset32;
        ic.e eVar3222 = ic.e.h;
        int i30222 = 8;
        int i31222 = 4;
        if (z11) {
        }
        b0 b0Var222 = fVar2.c[cVar3.ordinal()];
        int i47222 = fVar2.d;
        int i48222 = b0Var222.b;
        u0[] u0VarArr222 = (u0[]) b0Var222.c;
        length = u0VarArr222.length;
        i17 = i10;
        int i49222 = i17;
        while (i17 < length) {
        }
        int i50222 = i47222 - (i49222 * i48222);
        i18 = i50222 * 8;
        if (aVar.b <= i18) {
        }
    }

    public static boolean c(String str) {
        byte[] bytes = str.getBytes(h.b);
        int length = bytes.length;
        if (length % 2 != 0) {
            return false;
        }
        for (int i10 = 0; i10 < length; i10 += 2) {
            int i11 = bytes[i10] & 255;
            if ((i11 < 129 || i11 > 159) && (i11 < 224 || i11 > 235)) {
                return false;
            }
        }
        return true;
    }

    public static boolean d(int i10, ic.f fVar, ic.c cVar) {
        int i11 = fVar.d;
        b0 b0Var = fVar.c[cVar.ordinal()];
        int i12 = b0Var.b;
        int i13 = 0;
        for (u0 u0Var : (u0[]) b0Var.c) {
            i13 += u0Var.a;
        }
        return i11 - (i13 * i12) >= (i10 + 7) / 8;
    }
}
