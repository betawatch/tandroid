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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
        byte[][] bArr;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        char c10;
        gc.d dVar3;
        int i17;
        gc.b bVar2 = bVar;
        HashMap hashMap2 = hashMap;
        bc.b bVar3 = bc.b.h;
        int i18 = 0;
        int i19 = 1;
        boolean z13 = hashMap2.containsKey(bVar3) && Boolean.parseBoolean(hashMap2.get(bVar3).toString());
        bc.b bVar4 = bc.b.f;
        boolean z14 = hashMap2.containsKey(bVar4) && Boolean.parseBoolean(hashMap2.get(bVar4).toString());
        bc.b bVar5 = bc.b.b;
        boolean containsKey = hashMap2.containsKey(bVar5);
        Charset charset = b;
        if (containsKey) {
            try {
                forName = Charset.forName(hashMap2.get(bVar5).toString());
            } catch (UnsupportedCharsetException unused) {
            }
            gc.d dVar4 = gc.d.h;
            int i20 = 8;
            int i21 = 4;
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
                    int i22 = 0;
                    while (true) {
                        if (i22 < str.length()) {
                            char charAt = str.charAt(i22);
                            if (charAt < '0' || charAt > '9') {
                                if ((charAt < '`' ? a[charAt] : -1) == -1) {
                                    break;
                                }
                                z15 = true;
                            } else {
                                z16 = true;
                            }
                            i22++;
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
                bc.b bVar6 = bc.b.d;
                if (!hashMap2.containsKey(bVar6)) {
                    int a10 = dVar.a(gc.e.c(1)) + aVar2.b + aVar3.b;
                    int i23 = 1;
                    while (i23 <= 40) {
                        gc.e c11 = gc.e.c(i23);
                        if (d(a10, c11, bVar2)) {
                            int a11 = dVar.a(c11) + aVar2.b + aVar3.b;
                            int i24 = 1;
                            while (i24 <= 40) {
                                gc.e c12 = gc.e.c(i24);
                                if (d(a11, c12, bVar2)) {
                                    eVar = c12;
                                } else {
                                    i24++;
                                    bVar2 = bVar2;
                                    hashMap2 = hashMap2;
                                    i20 = 8;
                                    i7 = 0;
                                }
                            }
                            throw new a0("Data too big");
                        }
                        i23++;
                        bVar2 = bVar2;
                        hashMap2 = hashMap2;
                        i20 = 8;
                        i7 = 0;
                    }
                    throw new a0("Data too big");
                }
                eVar = gc.e.c(Integer.parseInt(hashMap2.get(bVar6).toString()));
                if (!d(dVar.a(eVar) + aVar2.b + aVar3.b, eVar, bVar2)) {
                    throw new a0("Data too big for requested version");
                }
                cc.a aVar4 = new cc.a();
                int i25 = aVar2.b;
                aVar4.c(i25);
                for (int i26 = i7; i26 < i25; i26++) {
                    aVar4.a(aVar2.d(i26));
                }
                int e10 = dVar == dVar4 ? aVar3.e() : str.length();
                int a12 = dVar.a(eVar);
                int i27 = 1 << a12;
                if (e10 >= i27) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(e10);
                    sb2.append(" is bigger than ");
                    sb2.append(i27 - 1);
                    throw new a0(sb2.toString());
                }
                aVar4.b(e10, a12);
                int i28 = aVar3.b;
                aVar4.c(aVar4.b + i28);
                for (int i29 = i7; i29 < i28; i29++) {
                    aVar4.a(aVar3.d(i29));
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
                qVar.d = bVar2;
                gc.b bVar7 = (gc.b) qVar.d;
                i11 = 2;
                gc.e[] eVarArr = {q.q(1), q.q(2), q.q(3)};
                m[] mVarArr = {qVar.l(eVarArr[0]), qVar.l(eVarArr[1]), qVar.l(eVarArr[2])};
                int i30 = 0;
                int i31 = -1;
                int i32 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                for (int i33 = 3; i30 < i33; i33 = 3) {
                    m mVar = mVarArr[i30];
                    int i34 = i19;
                    int w10 = mVar.w((gc.e) mVar.c);
                    if (d(w10, eVarArr[i30], bVar7) && w10 < i32) {
                        i31 = i30;
                        i32 = w10;
                    }
                    i30++;
                    i19 = i34;
                }
                i10 = i19;
                if (i31 < 0) {
                    throw new a0("Data too big for any version");
                }
                m mVar2 = mVarArr[i31];
                cc.a aVar5 = new cc.a();
                ArrayList arrayList = (ArrayList) mVar2.b;
                int size = arrayList.size();
                int i35 = 0;
                while (i35 < size) {
                    Object obj = arrayList.get(i35);
                    i35++;
                    e eVar3 = (e) obj;
                    int i36 = eVar3.c;
                    m mVar3 = eVar3.e;
                    int i37 = i18;
                    q qVar2 = (q) mVar3.d;
                    gc.d dVar5 = eVar3.a;
                    aVar5.b(dVar5.b, i21);
                    int i38 = eVar3.d;
                    if (i38 > 0) {
                        aVar5.b(eVar3.a(), dVar5.a((gc.e) mVar3.c));
                    }
                    if (dVar5 == gc.d.n) {
                        aVar5.b(((cc.d) cc.d.d.get(((f) qVar2.c).a[i36].charset().name())).a[i37], 8);
                    } else if (i38 > 0) {
                        String str2 = (String) qVar2.b;
                        int i39 = eVar3.b;
                        a(str2.substring(i39, i38 + i39), dVar5, aVar5, ((f) qVar2.c).a[i36].charset());
                    }
                    i18 = i37;
                    i21 = 4;
                }
                i7 = i18;
                eVar2 = (gc.e) mVar2.c;
                aVar = aVar5;
            }
            u uVar = eVar2.c[bVar2.ordinal()];
            int i40 = eVar2.d;
            int i41 = uVar.b;
            r0[] r0VarArr = (r0[]) uVar.c;
            length = r0VarArr.length;
            i13 = i7;
            int i42 = i13;
            while (i13 < length) {
                i42 += r0VarArr[i13].a;
                i13++;
            }
            int i43 = i40 - (i42 * i41);
            i14 = i43 * 8;
            if (aVar.b <= i14) {
                throw new a0("data bits cannot fit in the QR Code" + aVar.b + " > " + i14);
            }
            for (int i44 = i7; i44 < 4 && aVar.b < i14; i44++) {
                aVar.a(i7);
            }
            boolean z17 = i7;
            int i45 = aVar.b & 7;
            if (i45 > 0) {
                while (i45 < i20) {
                    aVar.a(z17);
                    i45++;
                    z17 = 0;
                }
            }
            int e11 = i43 - aVar.e();
            for (int i46 = 0; i46 < e11; i46++) {
                aVar.b((i46 & 1) == 0 ? qs.L3 : 17, i20);
            }
            if (aVar.b != i14) {
                throw new a0("Bits size does not equal capacity");
            }
            int i47 = 0;
            for (r0 r0Var : r0VarArr) {
                i47 += r0Var.a;
            }
            if (aVar.e() != i43) {
                throw new a0("Number of bits and data bytes does not match");
            }
            ArrayList arrayList2 = new ArrayList(i47);
            int i48 = 0;
            int i49 = 0;
            int i50 = 0;
            int i51 = 0;
            cc.a aVar6 = aVar;
            while (i48 < i47) {
                int i52 = i10;
                int[] iArr = new int[i52];
                int[] iArr2 = new int[i52];
                if (i48 >= i47) {
                    throw new a0("Block ID too large");
                }
                int i53 = i40 % i47;
                int i54 = i47 - i53;
                int i55 = i40 / i47;
                int i56 = i43 / i47;
                int i57 = i56 + 1;
                int i58 = i55 - i56;
                int i59 = (i55 + 1) - i57;
                if (i58 != i59) {
                    throw new a0("EC bytes mismatch");
                }
                if (i47 != i54 + i53) {
                    throw new a0("RS blocks mismatch");
                }
                if (i40 != ((i57 + i59) * i53) + ((i56 + i58) * i54)) {
                    throw new a0("Total bytes mismatch");
                }
                if (i48 < i54) {
                    c10 = 0;
                    iArr[0] = i56;
                    iArr2[0] = i58;
                } else {
                    c10 = 0;
                    iArr[0] = i57;
                    iArr2[0] = i59;
                }
                int i60 = iArr[c10];
                byte[] bArr2 = new byte[i60];
                int i61 = i49 * 8;
                int i62 = i48;
                int i63 = 0;
                while (i63 < i60) {
                    int i64 = i63;
                    int i65 = i47;
                    int i66 = 0;
                    for (int i67 = 0; i67 < 8; i67++) {
                        if (aVar6.d(i61)) {
                            i66 = (1 << (7 - i67)) | i66;
                        }
                        i61++;
                    }
                    bArr2[i64] = (byte) i66;
                    i63 = i64 + 1;
                    i47 = i65;
                }
                int i68 = i47;
                int i69 = iArr2[0];
                int i70 = i60 + i69;
                int[] iArr3 = new int[i70];
                int i71 = 0;
                while (i71 < i60) {
                    iArr3[i71] = bArr2[i71] & 255;
                    i71++;
                    i70 = i70;
                }
                int i72 = i70;
                ec.a aVar7 = ec.a.h;
                ArrayList arrayList3 = new ArrayList();
                cc.a aVar8 = aVar6;
                gc.e eVar4 = eVar2;
                arrayList3.add(new ec.b(aVar7, new int[]{1}));
                if (i69 == 0) {
                    throw new IllegalArgumentException("No error correction bytes");
                }
                int i73 = i72 - i69;
                if (i73 <= 0) {
                    throw new IllegalArgumentException("No data bytes provided");
                }
                if (i69 >= arrayList3.size()) {
                    ec.b bVar8 = (ec.b) g.i(1, arrayList3);
                    int size2 = arrayList3.size();
                    dVar3 = dVar4;
                    ec.b bVar9 = bVar8;
                    while (size2 <= i69) {
                        int i74 = size2;
                        bVar9 = bVar9.g(new ec.b(aVar7, new int[]{1, aVar7.a[(i74 - 1) + aVar7.g]}));
                        arrayList3.add(bVar9);
                        size2 = i74 + 1;
                        i40 = i40;
                    }
                } else {
                    dVar3 = dVar4;
                }
                int i75 = i40;
                ec.b bVar10 = (ec.b) arrayList3.get(i69);
                int[] iArr4 = new int[i73];
                System.arraycopy(iArr3, 0, iArr4, 0, i73);
                if (i73 == 0) {
                    throw new IllegalArgumentException();
                }
                if (i73 > 1 && iArr4[0] == 0) {
                    int i76 = 1;
                    while (i76 < i73 && iArr4[i76] == 0) {
                        i76++;
                    }
                    if (i76 == i73) {
                        iArr4 = new int[]{0};
                    } else {
                        int i77 = i73 - i76;
                        i17 = i73;
                        int[] iArr5 = new int[i77];
                        System.arraycopy(iArr4, i76, iArr5, 0, i77);
                        iArr4 = iArr5;
                        if (i69 >= 0) {
                            throw new IllegalArgumentException();
                        }
                        int length2 = iArr4.length;
                        int[] iArr6 = new int[length2 + i69];
                        int i78 = 0;
                        while (i78 < length2) {
                            iArr6[i78] = aVar7.c(iArr4[i78], 1);
                            i78++;
                            length2 = length2;
                        }
                        ec.b bVar11 = new ec.b(aVar7, iArr6);
                        if (!aVar7.equals(bVar10.a)) {
                            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
                        }
                        if (bVar10.e()) {
                            throw new IllegalArgumentException("Divide by 0");
                        }
                        ec.b bVar12 = aVar7.c;
                        int b10 = aVar7.b(bVar10.c(bVar10.d()));
                        while (bVar11.d() >= bVar10.d() && !bVar11.e()) {
                            int d = bVar11.d() - bVar10.d();
                            int c13 = aVar7.c(bVar11.c(bVar11.d()), b10);
                            int i79 = b10;
                            ec.b h = bVar10.h(d, c13);
                            bVar12 = bVar12.a(aVar7.a(d, c13));
                            bVar11 = bVar11.a(h);
                            b10 = i79;
                        }
                        int i80 = i11;
                        ec.b[] bVarArr = new ec.b[i80];
                        bVarArr[0] = bVar12;
                        bVarArr[1] = bVar11;
                        int[] iArr7 = bVarArr[1].b;
                        int length3 = i69 - iArr7.length;
                        for (int i81 = 0; i81 < length3; i81++) {
                            iArr3[i17 + i81] = 0;
                        }
                        System.arraycopy(iArr7, 0, iArr3, i17 + length3, iArr7.length);
                        byte[] bArr3 = new byte[i69];
                        for (int i82 = 0; i82 < i69; i82++) {
                            bArr3[i82] = (byte) iArr3[i60 + i82];
                        }
                        arrayList2.add(new a(bArr2, bArr3));
                        i50 = Math.max(i50, i60);
                        i51 = Math.max(i51, i69);
                        i49 += iArr[0];
                        i48 = i62 + 1;
                        i11 = i80;
                        dVar4 = dVar3;
                        i47 = i68;
                        aVar6 = aVar8;
                        eVar2 = eVar4;
                        i40 = i75;
                        i10 = 1;
                    }
                }
                i17 = i73;
                if (i69 >= 0) {
                }
            }
            gc.e eVar5 = eVar2;
            int i83 = i40;
            gc.d dVar6 = dVar4;
            if (i43 != i49) {
                throw new a0("Data bytes does not match offset");
            }
            cc.a aVar9 = new cc.a();
            for (int i84 = 0; i84 < i50; i84++) {
                int size3 = arrayList2.size();
                int i85 = 0;
                while (i85 < size3) {
                    Object obj2 = arrayList2.get(i85);
                    i85++;
                    byte[] bArr4 = ((a) obj2).a;
                    if (i84 < bArr4.length) {
                        aVar9.b(bArr4[i84], 8);
                    }
                }
            }
            for (int i86 = 0; i86 < i51; i86++) {
                int size4 = arrayList2.size();
                int i87 = 0;
                while (i87 < size4) {
                    Object obj3 = arrayList2.get(i87);
                    i87++;
                    byte[] bArr5 = ((a) obj3).b;
                    if (i86 < bArr5.length) {
                        aVar9.b(bArr5[i86], 8);
                    }
                }
            }
            if (i83 != aVar9.e()) {
                StringBuilder n10 = g.n(i83, "Interleaving error: ", " and ");
                n10.append(aVar9.e());
                n10.append(" differ.");
                throw new a0(n10.toString());
            }
            k kVar = new k();
            kVar.b = -1;
            kVar.d = bVar;
            kVar.c = dVar6;
            kVar.e = eVar5;
            int i88 = (eVar5.a * 4) + 17;
            cc.c cVar = new cc.c(i88, i88);
            bc.b bVar13 = bc.b.e;
            if (hashMap.containsKey(bVar13)) {
                i15 = Integer.parseInt(hashMap.get(bVar13).toString());
            }
            i15 = -1;
            if (i15 == -1) {
                int i89 = -1;
                int i90 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                int i91 = 0;
                while (i91 < 8) {
                    c.b(aVar9, bVar, eVar5, i91, cVar);
                    int i92 = 0;
                    int a13 = c.a(cVar, false) + c.a(cVar, true);
                    byte[][] bArr6 = (byte[][]) cVar.d;
                    int i93 = cVar.b;
                    int i94 = cVar.c;
                    int i95 = 0;
                    int i96 = 0;
                    while (i95 < i94 - 1) {
                        byte[] bArr7 = bArr6[i95];
                        int i97 = i96;
                        int i98 = i92;
                        while (i98 < i93 - 1) {
                            byte b11 = bArr7[i98];
                            int i99 = i98 + 1;
                            int i100 = a13;
                            if (b11 == bArr7[i99]) {
                                byte[] bArr8 = bArr6[i95 + 1];
                                if (b11 == bArr8[i98] && b11 == bArr8[i99]) {
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
                            byte[] bArr9 = bArr6[i102];
                            int i106 = i91;
                            int i107 = i105 + 6;
                            if (i107 < i93) {
                                i16 = i89;
                                if (bArr9[i105] == 1 && bArr9[i105 + 1] == 0 && bArr9[i105 + 2] == 1 && bArr9[i105 + 3] == 1 && bArr9[i105 + 4] == 1 && bArr9[i105 + 5] == 0 && bArr9[i107] == 1) {
                                    int i108 = i105 - 4;
                                    if (i108 >= 0 && bArr9.length >= i105) {
                                        while (i108 < i105) {
                                            int i109 = i108;
                                            if (bArr9[i108] != 1) {
                                                i108 = i109 + 1;
                                            }
                                        }
                                        z11 = true;
                                        if (!z11) {
                                            int i110 = i105 + 7;
                                            int i111 = i105 + 11;
                                            if (i110 >= 0 && bArr9.length >= i111) {
                                                int i112 = i110;
                                                while (i112 < i111) {
                                                    int i113 = i112;
                                                    int i114 = i111;
                                                    if (bArr9[i113] != 1) {
                                                        i112 = i113 + 1;
                                                        i111 = i114;
                                                    }
                                                }
                                                z12 = true;
                                            }
                                            z12 = false;
                                            break;
                                        }
                                        i104++;
                                    }
                                    z11 = false;
                                    if (!z11) {
                                    }
                                    i104++;
                                }
                            } else {
                                i16 = i89;
                            }
                            int i115 = i102 + 6;
                            if (i115 < i94) {
                                byte b12 = 1;
                                if (bArr6[i102][i105] == 1 && bArr6[i102 + 1][i105] == 0 && bArr6[i102 + 2][i105] == 1 && bArr6[i102 + 3][i105] == 1 && bArr6[i102 + 4][i105] == 1 && bArr6[i102 + 5][i105] == 0 && bArr6[i115][i105] == 1) {
                                    int i116 = i102 - 4;
                                    if (i116 >= 0 && bArr6.length >= i102) {
                                        while (i116 < i102) {
                                            if (bArr6[i116][i105] != b12) {
                                                i116++;
                                                b12 = 1;
                                            }
                                        }
                                        z9 = true;
                                        if (z9) {
                                            int i117 = i102 + 7;
                                            int i118 = i102 + 11;
                                            if (i117 < 0 || bArr6.length < i118) {
                                                bArr = bArr6;
                                            } else {
                                                while (i117 < i118) {
                                                    bArr = bArr6;
                                                    if (bArr6[i117][i105] != 1) {
                                                        i117++;
                                                        bArr6 = bArr;
                                                    }
                                                }
                                                bArr = bArr6;
                                                z10 = true;
                                                if (!z10) {
                                                    i105++;
                                                    bArr6 = bArr;
                                                    i89 = i16;
                                                    i91 = i106;
                                                }
                                            }
                                            z10 = false;
                                            if (!z10) {
                                            }
                                        } else {
                                            bArr = bArr6;
                                        }
                                        i104++;
                                        i105++;
                                        bArr6 = bArr;
                                        i89 = i16;
                                        i91 = i106;
                                    }
                                    z9 = false;
                                    if (z9) {
                                    }
                                    i104++;
                                    i105++;
                                    bArr6 = bArr;
                                    i89 = i16;
                                    i91 = i106;
                                }
                            }
                            bArr = bArr6;
                            i105++;
                            bArr6 = bArr;
                            i89 = i16;
                            i91 = i106;
                        }
                        i102++;
                        i103 = i104;
                    }
                    byte[][] bArr10 = bArr6;
                    int i119 = i91;
                    int i120 = i89;
                    int i121 = (i103 * 40) + i101;
                    int i122 = 0;
                    for (int i123 = 0; i123 < i94; i123++) {
                        byte[] bArr11 = bArr10[i123];
                        for (int i124 = 0; i124 < i93; i124++) {
                            if (bArr11[i124] == 1) {
                                i122++;
                            }
                        }
                    }
                    int i125 = i94 * i93;
                    int abs = (((Math.abs((i122 * 2) - i125) * 10) / i125) * 10) + i121;
                    if (abs < i90) {
                        i90 = abs;
                        i89 = i119;
                    } else {
                        i89 = i120;
                    }
                    i91 = i119 + 1;
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
        int i202 = 8;
        int i212 = 4;
        if (z14) {
        }
        u uVar2 = eVar2.c[bVar2.ordinal()];
        int i402 = eVar2.d;
        int i412 = uVar2.b;
        r0[] r0VarArr2 = (r0[]) uVar2.c;
        length = r0VarArr2.length;
        i13 = i7;
        int i422 = i13;
        while (i13 < length) {
        }
        int i432 = i402 - (i422 * i412);
        i14 = i432 * 8;
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
