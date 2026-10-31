package cc;

import ac.g;
import android.support.v4.media.session.a0;
import c5.x;
import j6.l;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import wb.h;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class b {
    public static final int[] a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};
    public static final Charset b = StandardCharsets.ISO_8859_1;

    /* JADX WARN: Removed duplicated region for block: B:20:0x004d A[LOOP:0: B:13:0x0022->B:20:0x004d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(String str, ac.f fVar, wb.a aVar, Charset charset) {
        int i10;
        int ordinal = fVar.ordinal();
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
                    throw new l();
                }
                int i14 = i11 + 1;
                if (i14 < length2) {
                    char charAt3 = str.charAt(i14);
                    int i15 = charAt3 < '`' ? iArr[charAt3] : -1;
                    if (i15 == -1) {
                        throw new l();
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
            throw new l("Invalid mode: " + fVar);
        }
        Charset charset2 = h.b;
        if (charset2 == null) {
            throw new l("SJIS Charset not supported on this platform");
        }
        byte[] bytes2 = str.getBytes(charset2);
        if (bytes2.length % 2 != 0) {
            throw new l("Kanji byte size not even");
        }
        int length4 = bytes2.length - 1;
        while (i11 < length4) {
            int i16 = ((bytes2[i11] & 255) << 8) | (bytes2[i11 + 1] & 255);
            int i17 = 33088;
            if (i16 < 33088 || i16 > 40956) {
                if (i16 < 57408 || i16 > 60351) {
                    i10 = -1;
                    if (i10 != -1) {
                        throw new l("Invalid byte sequence");
                    }
                    aVar.b(((i10 >> 8) * zs.W2) + (i10 & zs.e4), 13);
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

    /* JADX WARN: Code restructure failed: missing block: B:241:0x0604, code lost:
    
        if ((r9 >= 0 && r9 < 8) != false) goto L264;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x06df, code lost:
    
        if (r9 == false) goto L334;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:141:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x052d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:300:0x06bd  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0738  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0763 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:362:0x075c  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x07f3  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02b2 A[LOOP:2: B:49:0x02b0->B:50:0x02b2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static f b(String str, ac.d dVar, HashMap hashMap) {
        Charset forName;
        int i10;
        int i11;
        int i12;
        ac.f fVar;
        int i13;
        ac.h hVar;
        ac.h hVar2;
        wb.a aVar;
        wb.c cVar;
        int length;
        int i14;
        int i15;
        int i16;
        int i17;
        byte[][] bArr;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        char c10;
        ac.f fVar2;
        int i18;
        ac.d dVar2 = dVar;
        HashMap hashMap2 = hashMap;
        vb.b bVar = vb.b.h;
        int i19 = 0;
        int i20 = 1;
        boolean z14 = hashMap2.containsKey(bVar) && Boolean.parseBoolean(hashMap2.get(bVar).toString());
        vb.b bVar2 = vb.b.f;
        boolean z15 = hashMap2.containsKey(bVar2) && Boolean.parseBoolean(hashMap2.get(bVar2).toString());
        vb.b bVar3 = vb.b.b;
        boolean containsKey = hashMap2.containsKey(bVar3);
        Charset charset = b;
        if (containsKey) {
            try {
                forName = Charset.forName(hashMap2.get(bVar3).toString());
            } catch (UnsupportedCharsetException unused) {
            }
            ac.f fVar3 = ac.f.h;
            int i21 = 8;
            int i22 = 4;
            if (z15) {
                i10 = 0;
                i11 = 1;
                i12 = 2;
                Charset charset2 = h.b;
                if (charset2 != null && charset2.equals(forName) && c(str)) {
                    fVar = ac.f.r;
                } else {
                    boolean z16 = false;
                    boolean z17 = false;
                    int i23 = 0;
                    while (true) {
                        if (i23 < str.length()) {
                            char charAt = str.charAt(i23);
                            if (charAt < '0' || charAt > '9') {
                                if ((charAt < '`' ? a[charAt] : -1) == -1) {
                                    break;
                                }
                                z16 = true;
                            } else {
                                z17 = true;
                            }
                            i23++;
                        } else if (z16) {
                            fVar = ac.f.e;
                        } else if (z17) {
                            fVar = ac.f.d;
                        }
                    }
                    fVar = fVar3;
                }
                wb.a aVar2 = new wb.a();
                if (fVar == fVar3 && containsKey && (cVar = (wb.c) wb.c.d.get(forName.name())) != null) {
                    i13 = 4;
                    aVar2.b(7, 4);
                    aVar2.b(cVar.a[0], 8);
                } else {
                    i13 = 4;
                }
                if (z14) {
                    aVar2.b(5, i13);
                }
                aVar2.b(fVar.b, i13);
                wb.a aVar3 = new wb.a();
                a(str, fVar, aVar3, forName);
                vb.b bVar4 = vb.b.d;
                if (!hashMap2.containsKey(bVar4)) {
                    int a2 = fVar.a(ac.h.c(1)) + aVar2.b + aVar3.b;
                    int i24 = 1;
                    while (i24 <= 40) {
                        ac.h c11 = ac.h.c(i24);
                        if (d(a2, c11, dVar2)) {
                            int a10 = fVar.a(c11) + aVar2.b + aVar3.b;
                            int i25 = 1;
                            while (i25 <= 40) {
                                ac.h c12 = ac.h.c(i25);
                                if (d(a10, c12, dVar2)) {
                                    hVar = c12;
                                } else {
                                    i25++;
                                    dVar2 = dVar2;
                                    hashMap2 = hashMap2;
                                    i21 = 8;
                                    i10 = 0;
                                }
                            }
                            throw new l("Data too big");
                        }
                        i24++;
                        dVar2 = dVar2;
                        hashMap2 = hashMap2;
                        i21 = 8;
                        i10 = 0;
                    }
                    throw new l("Data too big");
                }
                hVar = ac.h.c(Integer.parseInt(hashMap2.get(bVar4).toString()));
                if (!d(fVar.a(hVar) + aVar2.b + aVar3.b, hVar, dVar2)) {
                    throw new l("Data too big for requested version");
                }
                wb.a aVar4 = new wb.a();
                int i26 = aVar2.b;
                aVar4.c(i26);
                for (int i27 = i10; i27 < i26; i27++) {
                    aVar4.a(aVar2.d(i27));
                }
                int e = fVar == fVar3 ? aVar3.e() : str.length();
                int a11 = fVar.a(hVar);
                int i28 = 1 << a11;
                if (e >= i28) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(e);
                    sb2.append(" is bigger than ");
                    sb2.append(i28 - 1);
                    throw new l(sb2.toString());
                }
                aVar4.b(e, a11);
                int i29 = aVar3.b;
                aVar4.c(aVar4.b + i29);
                for (int i30 = i10; i30 < i29; i30++) {
                    aVar4.a(aVar3.d(i30));
                }
                fVar3 = fVar;
                hVar2 = hVar;
                aVar = aVar4;
            } else {
                if (forName.equals(charset)) {
                    forName = null;
                }
                ac.a aVar5 = new ac.a();
                aVar5.b = str;
                aVar5.a = z14;
                aVar5.c = new wb.d(str, forName);
                aVar5.d = dVar2;
                ac.d dVar3 = (ac.d) aVar5.d;
                i12 = 2;
                ac.h[] hVarArr = {ac.a.p(1), ac.a.p(2), ac.a.p(3)};
                a0[] a0VarArr = {aVar5.k(hVarArr[0]), aVar5.k(hVarArr[1]), aVar5.k(hVarArr[2])};
                int i31 = 0;
                int i32 = -1;
                int i33 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                for (int i34 = 3; i31 < i34; i34 = 3) {
                    a0 a0Var = a0VarArr[i31];
                    int i35 = i20;
                    int r10 = a0Var.r((ac.h) a0Var.b);
                    if (d(r10, hVarArr[i31], dVar3) && r10 < i33) {
                        i32 = i31;
                        i33 = r10;
                    }
                    i31++;
                    i20 = i35;
                }
                i11 = i20;
                if (i32 < 0) {
                    throw new l("Data too big for any version");
                }
                a0 a0Var2 = a0VarArr[i32];
                wb.a aVar6 = new wb.a();
                ArrayList arrayList = (ArrayList) a0Var2.d;
                int size = arrayList.size();
                int i36 = 0;
                while (i36 < size) {
                    Object obj = arrayList.get(i36);
                    i36++;
                    e eVar = (e) obj;
                    int i37 = eVar.c;
                    a0 a0Var3 = eVar.e;
                    int i38 = i19;
                    ac.a aVar7 = (ac.a) a0Var3.c;
                    ac.f fVar4 = eVar.a;
                    aVar6.b(fVar4.b, i22);
                    int i39 = eVar.d;
                    if (i39 > 0) {
                        aVar6.b(eVar.a(), fVar4.a((ac.h) a0Var3.b));
                    }
                    if (fVar4 == ac.f.n) {
                        aVar6.b(((wb.c) wb.c.d.get(((wb.d) aVar7.c).a[i37].charset().name())).a[i38], 8);
                    } else if (i39 > 0) {
                        String str2 = (String) aVar7.b;
                        int i40 = eVar.b;
                        a(str2.substring(i40, i39 + i40), fVar4, aVar6, ((wb.d) aVar7.c).a[i37].charset());
                    }
                    i19 = i38;
                    i22 = 4;
                }
                i10 = i19;
                hVar2 = (ac.h) a0Var2.b;
                aVar = aVar6;
            }
            x xVar = hVar2.c[dVar2.ordinal()];
            int i41 = hVar2.d;
            int i42 = xVar.b;
            g[] gVarArr = (g[]) xVar.c;
            length = gVarArr.length;
            i14 = i10;
            int i43 = i14;
            while (i14 < length) {
                i43 += gVarArr[i14].a;
                i14++;
            }
            int i44 = i41 - (i43 * i42);
            i15 = i44 * 8;
            if (aVar.b <= i15) {
                throw new l("data bits cannot fit in the QR Code" + aVar.b + " > " + i15);
            }
            for (int i45 = i10; i45 < 4 && aVar.b < i15; i45++) {
                aVar.a(i10);
            }
            boolean z18 = i10;
            int i46 = aVar.b & 7;
            if (i46 > 0) {
                while (i46 < i21) {
                    aVar.a(z18);
                    i46++;
                    z18 = 0;
                }
            }
            int e7 = i44 - aVar.e();
            for (int i47 = 0; i47 < e7; i47++) {
                aVar.b((i47 & 1) == 0 ? zs.L3 : 17, i21);
            }
            if (aVar.b != i15) {
                throw new l("Bits size does not equal capacity");
            }
            int i48 = 0;
            for (g gVar : gVarArr) {
                i48 += gVar.a;
            }
            if (aVar.e() != i44) {
                throw new l("Number of bits and data bytes does not match");
            }
            ArrayList arrayList2 = new ArrayList(i48);
            int i49 = 0;
            int i50 = 0;
            int i51 = 0;
            int i52 = 0;
            wb.a aVar8 = aVar;
            while (i49 < i48) {
                int i53 = i11;
                int[] iArr = new int[i53];
                int[] iArr2 = new int[i53];
                if (i49 >= i48) {
                    throw new l("Block ID too large");
                }
                int i54 = i41 % i48;
                int i55 = i48 - i54;
                int i56 = i41 / i48;
                int i57 = i44 / i48;
                int i58 = i57 + 1;
                int i59 = i56 - i57;
                int i60 = (i56 + 1) - i58;
                if (i59 != i60) {
                    throw new l("EC bytes mismatch");
                }
                if (i48 != i55 + i54) {
                    throw new l("RS blocks mismatch");
                }
                if (i41 != ((i58 + i60) * i54) + ((i57 + i59) * i55)) {
                    throw new l("Total bytes mismatch");
                }
                if (i49 < i55) {
                    c10 = 0;
                    iArr[0] = i57;
                    iArr2[0] = i59;
                } else {
                    c10 = 0;
                    iArr[0] = i58;
                    iArr2[0] = i60;
                }
                int i61 = iArr[c10];
                byte[] bArr2 = new byte[i61];
                int i62 = i50 * 8;
                int i63 = i49;
                int i64 = 0;
                while (i64 < i61) {
                    int i65 = i64;
                    int i66 = i48;
                    int i67 = 0;
                    for (int i68 = 0; i68 < 8; i68++) {
                        if (aVar8.d(i62)) {
                            i67 = (1 << (7 - i68)) | i67;
                        }
                        i62++;
                    }
                    bArr2[i65] = (byte) i67;
                    i64 = i65 + 1;
                    i48 = i66;
                }
                int i69 = i48;
                int i70 = iArr2[0];
                int i71 = i61 + i70;
                int[] iArr3 = new int[i71];
                int i72 = 0;
                while (i72 < i61) {
                    iArr3[i72] = bArr2[i72] & 255;
                    i72++;
                    i71 = i71;
                }
                int i73 = i71;
                yb.a aVar9 = yb.a.h;
                ArrayList arrayList3 = new ArrayList();
                wb.a aVar10 = aVar8;
                ac.h hVar3 = hVar2;
                arrayList3.add(new yb.b(aVar9, new int[]{1}));
                if (i70 == 0) {
                    throw new IllegalArgumentException("No error correction bytes");
                }
                int i74 = i73 - i70;
                if (i74 <= 0) {
                    throw new IllegalArgumentException("No data bytes provided");
                }
                if (i70 >= arrayList3.size()) {
                    yb.b bVar5 = (yb.b) i0.a.g(1, arrayList3);
                    int size2 = arrayList3.size();
                    fVar2 = fVar3;
                    yb.b bVar6 = bVar5;
                    while (size2 <= i70) {
                        int i75 = size2;
                        bVar6 = bVar6.g(new yb.b(aVar9, new int[]{1, aVar9.a[(i75 - 1) + aVar9.g]}));
                        arrayList3.add(bVar6);
                        size2 = i75 + 1;
                        i41 = i41;
                    }
                } else {
                    fVar2 = fVar3;
                }
                int i76 = i41;
                yb.b bVar7 = (yb.b) arrayList3.get(i70);
                int[] iArr4 = new int[i74];
                System.arraycopy(iArr3, 0, iArr4, 0, i74);
                if (i74 == 0) {
                    throw new IllegalArgumentException();
                }
                if (i74 > 1 && iArr4[0] == 0) {
                    int i77 = 1;
                    while (i77 < i74 && iArr4[i77] == 0) {
                        i77++;
                    }
                    if (i77 == i74) {
                        iArr4 = new int[]{0};
                    } else {
                        int i78 = i74 - i77;
                        i18 = i74;
                        int[] iArr5 = new int[i78];
                        System.arraycopy(iArr4, i77, iArr5, 0, i78);
                        iArr4 = iArr5;
                        if (i70 >= 0) {
                            throw new IllegalArgumentException();
                        }
                        int length2 = iArr4.length;
                        int[] iArr6 = new int[length2 + i70];
                        int i79 = 0;
                        while (i79 < length2) {
                            iArr6[i79] = aVar9.c(iArr4[i79], 1);
                            i79++;
                            length2 = length2;
                        }
                        yb.b bVar8 = new yb.b(aVar9, iArr6);
                        if (!aVar9.equals(bVar7.a)) {
                            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
                        }
                        if (bVar7.e()) {
                            throw new IllegalArgumentException("Divide by 0");
                        }
                        yb.b bVar9 = aVar9.c;
                        int b10 = aVar9.b(bVar7.c(bVar7.d()));
                        while (bVar8.d() >= bVar7.d() && !bVar8.e()) {
                            int d = bVar8.d() - bVar7.d();
                            int c13 = aVar9.c(bVar8.c(bVar8.d()), b10);
                            int i80 = b10;
                            yb.b h = bVar7.h(d, c13);
                            bVar9 = bVar9.a(aVar9.a(d, c13));
                            bVar8 = bVar8.a(h);
                            b10 = i80;
                        }
                        int i81 = i12;
                        yb.b[] bVarArr = new yb.b[i81];
                        bVarArr[0] = bVar9;
                        bVarArr[1] = bVar8;
                        int[] iArr7 = bVarArr[1].b;
                        int length3 = i70 - iArr7.length;
                        for (int i82 = 0; i82 < length3; i82++) {
                            iArr3[i18 + i82] = 0;
                        }
                        System.arraycopy(iArr7, 0, iArr3, i18 + length3, iArr7.length);
                        byte[] bArr3 = new byte[i70];
                        for (int i83 = 0; i83 < i70; i83++) {
                            bArr3[i83] = (byte) iArr3[i61 + i83];
                        }
                        arrayList2.add(new a(bArr2, bArr3));
                        i51 = Math.max(i51, i61);
                        i52 = Math.max(i52, i70);
                        i50 += iArr[0];
                        i49 = i63 + 1;
                        i12 = i81;
                        fVar3 = fVar2;
                        i48 = i69;
                        aVar8 = aVar10;
                        hVar2 = hVar3;
                        i41 = i76;
                        i11 = 1;
                    }
                }
                i18 = i74;
                if (i70 >= 0) {
                }
            }
            ac.h hVar4 = hVar2;
            int i84 = i41;
            ac.f fVar5 = fVar3;
            if (i44 != i50) {
                throw new l("Data bytes does not match offset");
            }
            wb.a aVar11 = new wb.a();
            for (int i85 = 0; i85 < i51; i85++) {
                int size3 = arrayList2.size();
                int i86 = 0;
                while (i86 < size3) {
                    Object obj2 = arrayList2.get(i86);
                    i86++;
                    byte[] bArr4 = ((a) obj2).a;
                    if (i85 < bArr4.length) {
                        aVar11.b(bArr4[i85], 8);
                    }
                }
            }
            for (int i87 = 0; i87 < i52; i87++) {
                int size4 = arrayList2.size();
                int i88 = 0;
                while (i88 < size4) {
                    Object obj3 = arrayList2.get(i88);
                    i88++;
                    byte[] bArr5 = ((a) obj3).b;
                    if (i87 < bArr5.length) {
                        aVar11.b(bArr5[i87], 8);
                    }
                }
            }
            if (i84 != aVar11.e()) {
                StringBuilder l4 = i0.a.l(i84, "Interleaving error: ", " and ");
                l4.append(aVar11.e());
                l4.append(" differ.");
                throw new l(l4.toString());
            }
            f fVar6 = new f();
            fVar6.b = -1;
            fVar6.d = dVar;
            fVar6.c = fVar5;
            fVar6.e = hVar4;
            int i89 = (hVar4.a * 4) + 17;
            b4.d dVar4 = new b4.d(i89, i89);
            vb.b bVar10 = vb.b.e;
            if (hashMap.containsKey(bVar10)) {
                i16 = Integer.parseInt(hashMap.get(bVar10).toString());
            }
            i16 = -1;
            if (i16 == -1) {
                int i90 = -1;
                int i91 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                int i92 = 0;
                while (i92 < 8) {
                    c.b(aVar11, dVar, hVar4, i92, dVar4);
                    int i93 = 0;
                    int a12 = c.a(dVar4, false) + c.a(dVar4, true);
                    byte[][] bArr6 = (byte[][]) dVar4.d;
                    int i94 = dVar4.b;
                    int i95 = dVar4.c;
                    int i96 = 0;
                    int i97 = 0;
                    while (i96 < i95 - 1) {
                        byte[] bArr7 = bArr6[i96];
                        int i98 = i97;
                        int i99 = i93;
                        while (i99 < i94 - 1) {
                            byte b11 = bArr7[i99];
                            int i100 = i99 + 1;
                            int i101 = a12;
                            if (b11 == bArr7[i100]) {
                                byte[] bArr8 = bArr6[i96 + 1];
                                if (b11 == bArr8[i99] && b11 == bArr8[i100]) {
                                    i98++;
                                }
                            }
                            a12 = i101;
                            i99 = i100;
                        }
                        i96++;
                        i97 = i98;
                        i93 = 0;
                    }
                    int i102 = (i97 * 3) + a12;
                    int i103 = 0;
                    int i104 = 0;
                    while (i103 < i95) {
                        int i105 = i104;
                        int i106 = 0;
                        while (i106 < i94) {
                            byte[] bArr9 = bArr6[i103];
                            int i107 = i92;
                            int i108 = i106 + 6;
                            if (i108 < i94) {
                                i17 = i90;
                                if (bArr9[i106] == 1 && bArr9[i106 + 1] == 0 && bArr9[i106 + 2] == 1 && bArr9[i106 + 3] == 1 && bArr9[i106 + 4] == 1 && bArr9[i106 + 5] == 0 && bArr9[i108] == 1) {
                                    int i109 = i106 - 4;
                                    if (i109 >= 0 && bArr9.length >= i106) {
                                        while (i109 < i106) {
                                            int i110 = i109;
                                            if (bArr9[i109] != 1) {
                                                i109 = i110 + 1;
                                            }
                                        }
                                        z12 = true;
                                        if (!z12) {
                                            int i111 = i106 + 7;
                                            int i112 = i106 + 11;
                                            if (i111 >= 0 && bArr9.length >= i112) {
                                                int i113 = i111;
                                                while (i113 < i112) {
                                                    int i114 = i113;
                                                    int i115 = i112;
                                                    if (bArr9[i114] != 1) {
                                                        i113 = i114 + 1;
                                                        i112 = i115;
                                                    }
                                                }
                                                z13 = true;
                                            }
                                            z13 = false;
                                            break;
                                        }
                                        i105++;
                                    }
                                    z12 = false;
                                    if (!z12) {
                                    }
                                    i105++;
                                }
                            } else {
                                i17 = i90;
                            }
                            int i116 = i103 + 6;
                            if (i116 < i95) {
                                byte b12 = 1;
                                if (bArr6[i103][i106] == 1 && bArr6[i103 + 1][i106] == 0 && bArr6[i103 + 2][i106] == 1 && bArr6[i103 + 3][i106] == 1 && bArr6[i103 + 4][i106] == 1 && bArr6[i103 + 5][i106] == 0 && bArr6[i116][i106] == 1) {
                                    int i117 = i103 - 4;
                                    if (i117 >= 0 && bArr6.length >= i103) {
                                        while (i117 < i103) {
                                            if (bArr6[i117][i106] != b12) {
                                                i117++;
                                                b12 = 1;
                                            }
                                        }
                                        z10 = true;
                                        if (z10) {
                                            int i118 = i103 + 7;
                                            int i119 = i103 + 11;
                                            if (i118 < 0 || bArr6.length < i119) {
                                                bArr = bArr6;
                                            } else {
                                                while (i118 < i119) {
                                                    bArr = bArr6;
                                                    if (bArr6[i118][i106] != 1) {
                                                        i118++;
                                                        bArr6 = bArr;
                                                    }
                                                }
                                                bArr = bArr6;
                                                z11 = true;
                                                if (!z11) {
                                                    i106++;
                                                    bArr6 = bArr;
                                                    i90 = i17;
                                                    i92 = i107;
                                                }
                                            }
                                            z11 = false;
                                            if (!z11) {
                                            }
                                        } else {
                                            bArr = bArr6;
                                        }
                                        i105++;
                                        i106++;
                                        bArr6 = bArr;
                                        i90 = i17;
                                        i92 = i107;
                                    }
                                    z10 = false;
                                    if (z10) {
                                    }
                                    i105++;
                                    i106++;
                                    bArr6 = bArr;
                                    i90 = i17;
                                    i92 = i107;
                                }
                            }
                            bArr = bArr6;
                            i106++;
                            bArr6 = bArr;
                            i90 = i17;
                            i92 = i107;
                        }
                        i103++;
                        i104 = i105;
                    }
                    byte[][] bArr10 = bArr6;
                    int i120 = i92;
                    int i121 = i90;
                    int i122 = (i104 * 40) + i102;
                    int i123 = 0;
                    for (int i124 = 0; i124 < i95; i124++) {
                        byte[] bArr11 = bArr10[i124];
                        for (int i125 = 0; i125 < i94; i125++) {
                            if (bArr11[i125] == 1) {
                                i123++;
                            }
                        }
                    }
                    int i126 = i95 * i94;
                    int abs = (((Math.abs((i123 * 2) - i126) * 10) / i126) * 10) + i122;
                    if (abs < i91) {
                        i91 = abs;
                        i90 = i120;
                    } else {
                        i90 = i121;
                    }
                    i92 = i120 + 1;
                }
                i16 = i90;
            }
            fVar6.b = i16;
            c.b(aVar11, dVar, hVar4, i16, dVar4);
            fVar6.f = dVar4;
            return fVar6;
        }
        forName = charset;
        ac.f fVar32 = ac.f.h;
        int i212 = 8;
        int i222 = 4;
        if (z15) {
        }
        x xVar2 = hVar2.c[dVar2.ordinal()];
        int i412 = hVar2.d;
        int i422 = xVar2.b;
        g[] gVarArr2 = (g[]) xVar2.c;
        length = gVarArr2.length;
        i14 = i10;
        int i432 = i14;
        while (i14 < length) {
        }
        int i442 = i412 - (i432 * i422);
        i15 = i442 * 8;
        if (aVar.b <= i15) {
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

    public static boolean d(int i10, ac.h hVar, ac.d dVar) {
        int i11 = hVar.d;
        x xVar = hVar.c[dVar.ordinal()];
        int i12 = xVar.b;
        int i13 = 0;
        for (g gVar : (g[]) xVar.c) {
            i13 += gVar.a;
        }
        return i11 - (i13 * i12) >= (i10 + 7) / 8;
    }
}
