package ic;

import a4.k;
import ab.a0;
import ab.q;
import cc.f;
import cc.j;
import e2.r0;
import f5.u;
import h6.m;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.HashMap;
import jg.g;
import org.telegram.messenger.qs;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public abstract class b {
    public static final int[] a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};
    public static final Charset b = StandardCharsets.ISO_8859_1;

    /* JADX WARN: Removed duplicated region for block: B:20:0x004d A[LOOP:0: B:13:0x0022->B:20:0x004d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(String str, gc.d dVar, cc.a aVar, Charset charset) {
        int i7;
        int ordinal = dVar.ordinal();
        int i10 = 0;
        if (ordinal == 1) {
            int length = str.length();
            while (i10 < length) {
                int charAt = str.charAt(i10) - '0';
                int i11 = i10 + 2;
                if (i11 < length) {
                    aVar.b(((str.charAt(i10 + 1) - '0') * 10) + (charAt * 100) + (str.charAt(i11) - '0'), 10);
                    i10 += 3;
                } else {
                    i10++;
                    if (i10 < length) {
                        aVar.b((charAt * 10) + (str.charAt(i10) - '0'), 7);
                        i10 = i11;
                    } else {
                        aVar.b(charAt, 4);
                    }
                }
            }
            return;
        }
        if (ordinal == 2) {
            int length2 = str.length();
            while (i10 < length2) {
                char charAt2 = str.charAt(i10);
                int[] iArr = a;
                int i12 = charAt2 < '`' ? iArr[charAt2] : -1;
                if (i12 == -1) {
                    throw new a0();
                }
                int i13 = i10 + 1;
                if (i13 < length2) {
                    char charAt3 = str.charAt(i13);
                    int i14 = charAt3 < '`' ? iArr[charAt3] : -1;
                    if (i14 == -1) {
                        throw new a0();
                    }
                    aVar.b((i12 * 45) + i14, 11);
                    i10 += 2;
                } else {
                    aVar.b(i12, 6);
                    i10 = i13;
                }
            }
            return;
        }
        if (ordinal == 4) {
            byte[] bytes = str.getBytes(charset);
            int length3 = bytes.length;
            while (i10 < length3) {
                aVar.b(bytes[i10], 8);
                i10++;
            }
            return;
        }
        if (ordinal != 6) {
            throw new a0("Invalid mode: " + dVar);
        }
        Charset charset2 = j.b;
        if (charset2 == null) {
            throw new a0("SJIS Charset not supported on this platform");
        }
        byte[] bytes2 = str.getBytes(charset2);
        if (bytes2.length % 2 != 0) {
            throw new a0("Kanji byte size not even");
        }
        int length4 = bytes2.length - 1;
        while (i10 < length4) {
            int i15 = ((bytes2[i10] & 255) << 8) | (bytes2[i10 + 1] & 255);
            int i16 = 33088;
            if (i15 < 33088 || i15 > 40956) {
                if (i15 < 57408 || i15 > 60351) {
                    i7 = -1;
                    if (i7 != -1) {
                        throw new a0("Invalid byte sequence");
                    }
                    aVar.b(((i7 >> 8) * qs.W2) + (i7 & qs.e4), 13);
                    i10 += 2;
                } else {
                    i16 = 49472;
                }
            }
            i7 = i15 - i16;
            if (i7 != -1) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:241:0x0606, code lost:
    
        if ((r9 >= 0 && r9 < 8) != false) goto L264;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x06e4, code lost:
    
        if (r9 == false) goto L337;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:141:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x052d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:300:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0745  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0762 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:370:0x06e7  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x07ed  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02b2 A[LOOP:2: B:49:0x02b0->B:50:0x02b2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static k b(String str, gc.b bVar, HashMap hashMap) {
        Charset forName;
        int i7;
        int i10;
        int i11;
        gc.d dVar;
        int i12;
        gc.e eVar;
        gc.e eVar2;
        cc.a aVar;
        cc.d dVar2;
        int length;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        char c10;
        gc.d dVar3;
        int i18;
        HashMap hashMap2 = hashMap;
        bc.b bVar2 = bc.b.h;
        int i19 = 0;
        int i20 = 1;
        boolean z13 = hashMap2.containsKey(bVar2) && Boolean.parseBoolean(hashMap2.get(bVar2).toString());
        bc.b bVar3 = bc.b.f;
        boolean z14 = hashMap2.containsKey(bVar3) && Boolean.parseBoolean(hashMap2.get(bVar3).toString());
        bc.b bVar4 = bc.b.b;
        boolean containsKey = hashMap2.containsKey(bVar4);
        Charset charset = b;
        if (containsKey) {
            try {
                forName = Charset.forName(hashMap2.get(bVar4).toString());
            } catch (UnsupportedCharsetException unused) {
            }
            gc.d dVar4 = gc.d.h;
            int i21 = 8;
            int i22 = 4;
            if (z14) {
                i7 = 0;
                i10 = 1;
                i11 = 2;
                Charset charset2 = j.b;
                if (charset2 != null && charset2.equals(forName) && c(str)) {
                    dVar = gc.d.r;
                } else {
                    boolean z15 = false;
                    boolean z16 = false;
                    int i23 = 0;
                    while (true) {
                        if (i23 < str.length()) {
                            char charAt = str.charAt(i23);
                            if (charAt < '0' || charAt > '9') {
                                if ((charAt < '`' ? a[charAt] : -1) == -1) {
                                    break;
                                }
                                z15 = true;
                            } else {
                                z16 = true;
                            }
                            i23++;
                        } else if (z15) {
                            dVar = gc.d.e;
                        } else if (z16) {
                            dVar = gc.d.d;
                        }
                    }
                    dVar = dVar4;
                }
                cc.a aVar2 = new cc.a();
                if (dVar == dVar4 && containsKey && (dVar2 = (cc.d) cc.d.d.get(forName.name())) != null) {
                    i12 = 4;
                    aVar2.b(7, 4);
                    aVar2.b(dVar2.a[0], 8);
                } else {
                    i12 = 4;
                }
                if (z13) {
                    aVar2.b(5, i12);
                }
                aVar2.b(dVar.b, i12);
                cc.a aVar3 = new cc.a();
                a(str, dVar, aVar3, forName);
                bc.b bVar5 = bc.b.d;
                if (!hashMap2.containsKey(bVar5)) {
                    int a10 = dVar.a(gc.e.c(1)) + aVar2.b + aVar3.b;
                    int i24 = 1;
                    while (i24 <= 40) {
                        gc.e c11 = gc.e.c(i24);
                        if (d(a10, c11, bVar)) {
                            int a11 = dVar.a(c11) + aVar2.b + aVar3.b;
                            int i25 = 1;
                            while (i25 <= 40) {
                                gc.e c12 = gc.e.c(i25);
                                if (d(a11, c12, bVar)) {
                                    eVar = c12;
                                } else {
                                    i25++;
                                    hashMap2 = hashMap2;
                                    i21 = 8;
                                    i7 = 0;
                                }
                            }
                            throw new a0("Data too big");
                        }
                        i24++;
                        hashMap2 = hashMap2;
                        i21 = 8;
                        i7 = 0;
                    }
                    throw new a0("Data too big");
                }
                eVar = gc.e.c(Integer.parseInt(hashMap2.get(bVar5).toString()));
                if (!d(dVar.a(eVar) + aVar2.b + aVar3.b, eVar, bVar)) {
                    throw new a0("Data too big for requested version");
                }
                cc.a aVar4 = new cc.a();
                int i26 = aVar2.b;
                aVar4.c(i26);
                for (int i27 = i7; i27 < i26; i27++) {
                    aVar4.a(aVar2.d(i27));
                }
                int e10 = dVar == dVar4 ? aVar3.e() : str.length();
                int a12 = dVar.a(eVar);
                int i28 = 1 << a12;
                if (e10 >= i28) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(e10);
                    sb2.append(" is bigger than ");
                    sb2.append(i28 - 1);
                    throw new a0(sb2.toString());
                }
                aVar4.b(e10, a12);
                int i29 = aVar3.b;
                aVar4.c(aVar4.b + i29);
                for (int i30 = i7; i30 < i29; i30++) {
                    aVar4.a(aVar3.d(i30));
                }
                dVar4 = dVar;
                eVar2 = eVar;
                aVar = aVar4;
            } else {
                if (forName.equals(charset)) {
                    forName = null;
                }
                q qVar = new q();
                qVar.b = str;
                qVar.a = z13;
                qVar.c = new f(str, forName);
                qVar.d = bVar;
                gc.b bVar6 = (gc.b) qVar.d;
                i11 = 2;
                gc.e[] eVarArr = {q.q(1), q.q(2), q.q(3)};
                m[] mVarArr = {qVar.l(eVarArr[0]), qVar.l(eVarArr[1]), qVar.l(eVarArr[2])};
                int i31 = 0;
                int i32 = -1;
                int i33 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                for (int i34 = 3; i31 < i34; i34 = 3) {
                    m mVar = mVarArr[i31];
                    int i35 = i20;
                    int w10 = mVar.w((gc.e) mVar.c);
                    if (d(w10, eVarArr[i31], bVar6) && w10 < i33) {
                        i32 = i31;
                        i33 = w10;
                    }
                    i31++;
                    i20 = i35;
                }
                i10 = i20;
                if (i32 < 0) {
                    throw new a0("Data too big for any version");
                }
                m mVar2 = mVarArr[i32];
                cc.a aVar5 = new cc.a();
                ArrayList arrayList = (ArrayList) mVar2.b;
                int size = arrayList.size();
                int i36 = 0;
                while (i36 < size) {
                    Object obj = arrayList.get(i36);
                    i36++;
                    e eVar3 = (e) obj;
                    int i37 = eVar3.c;
                    m mVar3 = eVar3.e;
                    int i38 = i19;
                    q qVar2 = (q) mVar3.d;
                    gc.d dVar5 = eVar3.a;
                    aVar5.b(dVar5.b, i22);
                    int i39 = eVar3.d;
                    if (i39 > 0) {
                        aVar5.b(eVar3.a(), dVar5.a((gc.e) mVar3.c));
                    }
                    if (dVar5 == gc.d.n) {
                        aVar5.b(((cc.d) cc.d.d.get(((f) qVar2.c).a[i37].charset().name())).a[i38], 8);
                    } else if (i39 > 0) {
                        String str2 = (String) qVar2.b;
                        int i40 = eVar3.b;
                        a(str2.substring(i40, i39 + i40), dVar5, aVar5, ((f) qVar2.c).a[i37].charset());
                    }
                    i19 = i38;
                    i22 = 4;
                }
                i7 = i19;
                eVar2 = (gc.e) mVar2.c;
                aVar = aVar5;
            }
            u uVar = eVar2.c[bVar.ordinal()];
            int i41 = eVar2.d;
            int i42 = uVar.b;
            r0[] r0VarArr = (r0[]) uVar.c;
            length = r0VarArr.length;
            i13 = i7;
            int i43 = i13;
            while (i13 < length) {
                i43 += r0VarArr[i13].a;
                i13++;
            }
            int i44 = i41 - (i43 * i42);
            i14 = i44 * 8;
            if (aVar.b <= i14) {
                throw new a0("data bits cannot fit in the QR Code" + aVar.b + " > " + i14);
            }
            for (int i45 = i7; i45 < 4 && aVar.b < i14; i45++) {
                aVar.a(i7);
            }
            boolean z17 = i7;
            int i46 = aVar.b & 7;
            if (i46 > 0) {
                while (i46 < i21) {
                    aVar.a(z17);
                    i46++;
                    z17 = 0;
                }
            }
            int e11 = i44 - aVar.e();
            for (int i47 = 0; i47 < e11; i47++) {
                aVar.b((i47 & 1) == 0 ? qs.L3 : 17, i21);
            }
            if (aVar.b != i14) {
                throw new a0("Bits size does not equal capacity");
            }
            int i48 = 0;
            for (r0 r0Var : r0VarArr) {
                i48 += r0Var.a;
            }
            if (aVar.e() != i44) {
                throw new a0("Number of bits and data bytes does not match");
            }
            ArrayList arrayList2 = new ArrayList(i48);
            int i49 = 0;
            int i50 = 0;
            int i51 = 0;
            int i52 = 0;
            cc.a aVar6 = aVar;
            while (i49 < i48) {
                int i53 = i10;
                int[] iArr = new int[i53];
                int[] iArr2 = new int[i53];
                if (i49 >= i48) {
                    throw new a0("Block ID too large");
                }
                int i54 = i41 % i48;
                int i55 = i48 - i54;
                int i56 = i41 / i48;
                int i57 = i44 / i48;
                int i58 = i57 + 1;
                int i59 = i56 - i57;
                int i60 = (i56 + 1) - i58;
                if (i59 != i60) {
                    throw new a0("EC bytes mismatch");
                }
                if (i48 != i55 + i54) {
                    throw new a0("RS blocks mismatch");
                }
                if (i41 != ((i58 + i60) * i54) + ((i57 + i59) * i55)) {
                    throw new a0("Total bytes mismatch");
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
                byte[] bArr = new byte[i61];
                int i62 = i50 * 8;
                int i63 = i49;
                int i64 = 0;
                while (i64 < i61) {
                    int i65 = i64;
                    int i66 = i48;
                    int i67 = 0;
                    for (int i68 = 0; i68 < 8; i68++) {
                        if (aVar6.d(i62)) {
                            i67 = (1 << (7 - i68)) | i67;
                        }
                        i62++;
                    }
                    bArr[i65] = (byte) i67;
                    i64 = i65 + 1;
                    i48 = i66;
                }
                int i69 = i48;
                int i70 = iArr2[0];
                int i71 = i61 + i70;
                int[] iArr3 = new int[i71];
                int i72 = 0;
                while (i72 < i61) {
                    iArr3[i72] = bArr[i72] & 255;
                    i72++;
                    i71 = i71;
                }
                int i73 = i71;
                ec.a aVar7 = ec.a.h;
                ArrayList arrayList3 = new ArrayList();
                cc.a aVar8 = aVar6;
                gc.e eVar4 = eVar2;
                arrayList3.add(new ec.b(aVar7, new int[]{1}));
                if (i70 == 0) {
                    throw new IllegalArgumentException("No error correction bytes");
                }
                int i74 = i73 - i70;
                if (i74 <= 0) {
                    throw new IllegalArgumentException("No data bytes provided");
                }
                if (i70 >= arrayList3.size()) {
                    ec.b bVar7 = (ec.b) g.i(1, arrayList3);
                    int size2 = arrayList3.size();
                    dVar3 = dVar4;
                    ec.b bVar8 = bVar7;
                    while (size2 <= i70) {
                        int i75 = size2;
                        bVar8 = bVar8.g(new ec.b(aVar7, new int[]{1, aVar7.a[(i75 - 1) + aVar7.g]}));
                        arrayList3.add(bVar8);
                        size2 = i75 + 1;
                        i41 = i41;
                    }
                } else {
                    dVar3 = dVar4;
                }
                int i76 = i41;
                ec.b bVar9 = (ec.b) arrayList3.get(i70);
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
                            iArr6[i79] = aVar7.c(iArr4[i79], 1);
                            i79++;
                            length2 = length2;
                        }
                        ec.b bVar10 = new ec.b(aVar7, iArr6);
                        if (!aVar7.equals(bVar9.a)) {
                            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
                        }
                        if (bVar9.e()) {
                            throw new IllegalArgumentException("Divide by 0");
                        }
                        ec.b bVar11 = aVar7.c;
                        int b10 = aVar7.b(bVar9.c(bVar9.d()));
                        while (bVar10.d() >= bVar9.d() && !bVar10.e()) {
                            int d = bVar10.d() - bVar9.d();
                            int c13 = aVar7.c(bVar10.c(bVar10.d()), b10);
                            int i80 = b10;
                            ec.b h = bVar9.h(d, c13);
                            bVar11 = bVar11.a(aVar7.a(d, c13));
                            bVar10 = bVar10.a(h);
                            b10 = i80;
                        }
                        ec.b[] bVarArr = new ec.b[i11];
                        bVarArr[0] = bVar11;
                        bVarArr[1] = bVar10;
                        int[] iArr7 = bVarArr[1].b;
                        int length3 = i70 - iArr7.length;
                        for (int i81 = 0; i81 < length3; i81++) {
                            iArr3[i18 + i81] = 0;
                        }
                        System.arraycopy(iArr7, 0, iArr3, i18 + length3, iArr7.length);
                        byte[] bArr2 = new byte[i70];
                        for (int i82 = 0; i82 < i70; i82++) {
                            bArr2[i82] = (byte) iArr3[i61 + i82];
                        }
                        arrayList2.add(new a(bArr, bArr2));
                        i51 = Math.max(i51, i61);
                        i52 = Math.max(i52, i70);
                        i50 += iArr[0];
                        i49 = i63 + 1;
                        dVar4 = dVar3;
                        i48 = i69;
                        aVar6 = aVar8;
                        eVar2 = eVar4;
                        i41 = i76;
                        i11 = 2;
                        i10 = 1;
                    }
                }
                i18 = i74;
                if (i70 >= 0) {
                }
            }
            gc.e eVar5 = eVar2;
            int i83 = i41;
            gc.d dVar6 = dVar4;
            if (i44 != i50) {
                throw new a0("Data bytes does not match offset");
            }
            cc.a aVar9 = new cc.a();
            for (int i84 = 0; i84 < i51; i84++) {
                int size3 = arrayList2.size();
                int i85 = 0;
                while (i85 < size3) {
                    Object obj2 = arrayList2.get(i85);
                    i85++;
                    byte[] bArr3 = ((a) obj2).a;
                    if (i84 < bArr3.length) {
                        aVar9.b(bArr3[i84], 8);
                    }
                }
            }
            for (int i86 = 0; i86 < i52; i86++) {
                int size4 = arrayList2.size();
                int i87 = 0;
                while (i87 < size4) {
                    Object obj3 = arrayList2.get(i87);
                    i87++;
                    byte[] bArr4 = ((a) obj3).b;
                    if (i86 < bArr4.length) {
                        aVar9.b(bArr4[i86], 8);
                    }
                }
            }
            if (i83 != aVar9.e()) {
                StringBuilder n10 = g.n(i83, "Interleaving error: ", " and ");
                n10.append(aVar9.e());
                n10.append(" differ.");
                throw new a0(n10.toString());
            }
            k kVar = new k(2, (byte) 0);
            kVar.b = -1;
            kVar.d = bVar;
            kVar.c = dVar6;
            kVar.e = eVar5;
            int i88 = (eVar5.a * 4) + 17;
            cc.c cVar = new cc.c(i88, i88);
            bc.b bVar12 = bc.b.e;
            if (hashMap.containsKey(bVar12)) {
                i15 = Integer.parseInt(hashMap.get(bVar12).toString());
            }
            i15 = -1;
            int i89 = -1;
            if (i15 == -1) {
                int i90 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                int i91 = 0;
                while (i91 < 8) {
                    c.b(aVar9, bVar, eVar5, i91, cVar);
                    int i92 = 0;
                    int a13 = c.a(cVar, false) + c.a(cVar, true);
                    byte[][] bArr5 = (byte[][]) cVar.d;
                    int i93 = cVar.b;
                    int i94 = cVar.c;
                    int i95 = 0;
                    int i96 = 0;
                    while (i95 < i94 - 1) {
                        byte[] bArr6 = bArr5[i95];
                        int i97 = i96;
                        int i98 = i92;
                        while (i98 < i93 - 1) {
                            byte b11 = bArr6[i98];
                            int i99 = i98 + 1;
                            int i100 = a13;
                            if (b11 == bArr6[i99]) {
                                byte[] bArr7 = bArr5[i95 + 1];
                                if (b11 == bArr7[i98] && b11 == bArr7[i99]) {
                                    i97++;
                                }
                            }
                            a13 = i100;
                            i98 = i99;
                        }
                        i95++;
                        i96 = i97;
                        i92 = 0;
                    }
                    int i101 = (i96 * 3) + a13;
                    int i102 = 0;
                    int i103 = 0;
                    while (i102 < i94) {
                        int i104 = i103;
                        int i105 = 0;
                        while (i105 < i93) {
                            byte[] bArr8 = bArr5[i102];
                            int i106 = i91;
                            int i107 = i105 + 6;
                            if (i107 < i93) {
                                i17 = i101;
                                if (bArr8[i105] == 1 && bArr8[i105 + 1] == 0 && bArr8[i105 + 2] == 1 && bArr8[i105 + 3] == 1 && bArr8[i105 + 4] == 1 && bArr8[i105 + 5] == 0 && bArr8[i107] == 1) {
                                    int i108 = i105 - 4;
                                    if (i108 >= 0 && bArr8.length >= i105) {
                                        while (i108 < i105) {
                                            int i109 = i108;
                                            if (bArr8[i108] != 1) {
                                                i108 = i109 + 1;
                                            }
                                        }
                                        z11 = true;
                                        if (z11) {
                                            int i110 = i105 + 7;
                                            int i111 = i105 + 11;
                                            if (i110 < 0 || bArr8.length < i111) {
                                                i16 = i105;
                                            } else {
                                                int i112 = i110;
                                                while (i112 < i111) {
                                                    int i113 = i112;
                                                    i16 = i105;
                                                    if (bArr8[i113] != 1) {
                                                        i112 = i113 + 1;
                                                        i105 = i16;
                                                    }
                                                }
                                                i16 = i105;
                                                z12 = true;
                                            }
                                            z12 = false;
                                            break;
                                        } else {
                                            i16 = i105;
                                        }
                                        i104++;
                                    }
                                    z11 = false;
                                    if (z11) {
                                    }
                                    i104++;
                                } else {
                                    i16 = i105;
                                }
                            } else {
                                i16 = i105;
                                i17 = i101;
                            }
                            int i114 = i102 + 6;
                            if (i114 < i94) {
                                byte b12 = 1;
                                if (bArr5[i102][i16] == 1 && bArr5[i102 + 1][i16] == 0 && bArr5[i102 + 2][i16] == 1 && bArr5[i102 + 3][i16] == 1 && bArr5[i102 + 4][i16] == 1 && bArr5[i102 + 5][i16] == 0 && bArr5[i114][i16] == 1) {
                                    int i115 = i102 - 4;
                                    if (i115 >= 0 && bArr5.length >= i102) {
                                        while (i115 < i102) {
                                            if (bArr5[i115][i16] != b12) {
                                                i115++;
                                                b12 = 1;
                                            }
                                        }
                                        z9 = true;
                                        if (!z9) {
                                            int i116 = i102 + 7;
                                            int i117 = i102 + 11;
                                            if (i116 >= 0 && bArr5.length >= i117) {
                                                while (i116 < i117) {
                                                    if (bArr5[i116][i16] != 1) {
                                                        i116++;
                                                    }
                                                }
                                                z10 = true;
                                                if (!z10) {
                                                }
                                            }
                                            z10 = false;
                                            if (!z10) {
                                            }
                                        }
                                        i104++;
                                    }
                                    z9 = false;
                                    if (!z9) {
                                    }
                                    i104++;
                                }
                            }
                            i105 = i16 + 1;
                            i101 = i17;
                            i91 = i106;
                        }
                        i102++;
                        i103 = i104;
                    }
                    int i118 = i91;
                    int i119 = (i103 * 40) + i101;
                    int i120 = 0;
                    for (int i121 = 0; i121 < i94; i121++) {
                        byte[] bArr9 = bArr5[i121];
                        int i122 = 0;
                        while (i122 < i93) {
                            byte[][] bArr10 = bArr5;
                            if (bArr9[i122] == 1) {
                                i120++;
                            }
                            i122++;
                            bArr5 = bArr10;
                        }
                    }
                    int i123 = i94 * i93;
                    int abs = (((Math.abs((i120 * 2) - i123) * 10) / i123) * 10) + i119;
                    if (abs < i90) {
                        i90 = abs;
                        i89 = i118;
                    }
                    i91 = i118 + 1;
                }
                i15 = i89;
            }
            kVar.b = i15;
            c.b(aVar9, bVar, eVar5, i15, cVar);
            kVar.f = cVar;
            return kVar;
        }
        forName = charset;
        gc.d dVar42 = gc.d.h;
        int i212 = 8;
        int i222 = 4;
        if (z14) {
        }
        u uVar2 = eVar2.c[bVar.ordinal()];
        int i412 = eVar2.d;
        int i422 = uVar2.b;
        r0[] r0VarArr2 = (r0[]) uVar2.c;
        length = r0VarArr2.length;
        i13 = i7;
        int i432 = i13;
        while (i13 < length) {
        }
        int i442 = i412 - (i432 * i422);
        i14 = i442 * 8;
        if (aVar.b <= i14) {
        }
    }

    public static boolean c(String str) {
        byte[] bytes = str.getBytes(j.b);
        int length = bytes.length;
        if (length % 2 != 0) {
            return false;
        }
        for (int i7 = 0; i7 < length; i7 += 2) {
            int i10 = bytes[i7] & 255;
            if ((i10 < 129 || i10 > 159) && (i10 < 224 || i10 > 235)) {
                return false;
            }
        }
        return true;
    }

    public static boolean d(int i7, gc.e eVar, gc.b bVar) {
        int i10 = eVar.d;
        u uVar = eVar.c[bVar.ordinal()];
        int i11 = uVar.b;
        int i12 = 0;
        for (r0 r0Var : (r0[]) uVar.c) {
            i12 += r0Var.a;
        }
        return i10 - (i12 * i11) >= (i7 + 7) / 8;
    }
}
