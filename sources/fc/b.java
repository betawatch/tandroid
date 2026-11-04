package fc;

import android.support.v4.media.session.a0;
import b4.n;
import d2.t0;
import e0.e0;
import e5.u;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.HashMap;
import k2.p1;
import l6.m;
import org.telegram.messenger.hs;
import org.telegram.tgnet.ConnectionsManager;
import zb.h;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class b {
    public static final int[] a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};
    public static final Charset b = StandardCharsets.ISO_8859_1;

    /* JADX WARN: Removed duplicated region for block: B:20:0x004d A[LOOP:0: B:13:0x0022->B:20:0x004d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(String str, dc.d dVar, zb.a aVar, Charset charset) {
        int i3;
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
                    throw new m();
                }
                int i13 = i10 + 1;
                if (i13 < length2) {
                    char charAt3 = str.charAt(i13);
                    int i14 = charAt3 < '`' ? iArr[charAt3] : -1;
                    if (i14 == -1) {
                        throw new m();
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
            throw new m("Invalid mode: " + dVar);
        }
        Charset charset2 = h.b;
        if (charset2 == null) {
            throw new m("SJIS Charset not supported on this platform");
        }
        byte[] bytes2 = str.getBytes(charset2);
        if (bytes2.length % 2 != 0) {
            throw new m("Kanji byte size not even");
        }
        int length4 = bytes2.length - 1;
        while (i10 < length4) {
            int i15 = ((bytes2[i10] & 255) << 8) | (bytes2[i10 + 1] & 255);
            int i16 = 33088;
            if (i15 < 33088 || i15 > 40956) {
                if (i15 < 57408 || i15 > 60351) {
                    i3 = -1;
                    if (i3 != -1) {
                        throw new m("Invalid byte sequence");
                    }
                    aVar.b(((i3 >> 8) * hs.W2) + (i3 & hs.e4), 13);
                    i10 += 2;
                } else {
                    i16 = 49472;
                }
            }
            i3 = i15 - i16;
            if (i3 != -1) {
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
    public static e0 b(String str, dc.b bVar, HashMap hashMap) {
        Charset forName;
        int i3;
        int i10;
        int i11;
        dc.d dVar;
        int i12;
        dc.e eVar;
        dc.e eVar2;
        zb.a aVar;
        zb.c cVar;
        int length;
        int i13;
        int i14;
        int i15;
        int i16;
        byte[][] bArr;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        char c2;
        dc.d dVar2;
        int i17;
        dc.b bVar2 = bVar;
        HashMap hashMap2 = hashMap;
        yb.b bVar3 = yb.b.h;
        int i18 = 0;
        int i19 = 1;
        boolean z14 = hashMap2.containsKey(bVar3) && Boolean.parseBoolean(hashMap2.get(bVar3).toString());
        yb.b bVar4 = yb.b.f;
        boolean z15 = hashMap2.containsKey(bVar4) && Boolean.parseBoolean(hashMap2.get(bVar4).toString());
        yb.b bVar5 = yb.b.b;
        boolean containsKey = hashMap2.containsKey(bVar5);
        Charset charset = b;
        if (containsKey) {
            try {
                forName = Charset.forName(hashMap2.get(bVar5).toString());
            } catch (UnsupportedCharsetException unused) {
            }
            dc.d dVar3 = dc.d.h;
            int i20 = 8;
            int i21 = 4;
            if (z15) {
                i3 = 0;
                i10 = 1;
                i11 = 2;
                Charset charset2 = h.b;
                if (charset2 != null && charset2.equals(forName) && c(str)) {
                    dVar = dc.d.r;
                } else {
                    boolean z16 = false;
                    boolean z17 = false;
                    int i22 = 0;
                    while (true) {
                        if (i22 < str.length()) {
                            char charAt = str.charAt(i22);
                            if (charAt < '0' || charAt > '9') {
                                if ((charAt < '`' ? a[charAt] : -1) == -1) {
                                    break;
                                }
                                z16 = true;
                            } else {
                                z17 = true;
                            }
                            i22++;
                        } else if (z16) {
                            dVar = dc.d.e;
                        } else if (z17) {
                            dVar = dc.d.d;
                        }
                    }
                    dVar = dVar3;
                }
                zb.a aVar2 = new zb.a();
                if (dVar == dVar3 && containsKey && (cVar = (zb.c) zb.c.d.get(forName.name())) != null) {
                    i12 = 4;
                    aVar2.b(7, 4);
                    aVar2.b(cVar.a[0], 8);
                } else {
                    i12 = 4;
                }
                if (z14) {
                    aVar2.b(5, i12);
                }
                aVar2.b(dVar.b, i12);
                zb.a aVar3 = new zb.a();
                a(str, dVar, aVar3, forName);
                yb.b bVar6 = yb.b.d;
                if (!hashMap2.containsKey(bVar6)) {
                    int a10 = dVar.a(dc.e.c(1)) + aVar2.b + aVar3.b;
                    int i23 = 1;
                    while (i23 <= 40) {
                        dc.e c10 = dc.e.c(i23);
                        if (d(a10, c10, bVar2)) {
                            int a11 = dVar.a(c10) + aVar2.b + aVar3.b;
                            int i24 = 1;
                            while (i24 <= 40) {
                                dc.e c11 = dc.e.c(i24);
                                if (d(a11, c11, bVar2)) {
                                    eVar = c11;
                                } else {
                                    i24++;
                                    bVar2 = bVar2;
                                    hashMap2 = hashMap2;
                                    i20 = 8;
                                    i3 = 0;
                                }
                            }
                            throw new m("Data too big");
                        }
                        i23++;
                        bVar2 = bVar2;
                        hashMap2 = hashMap2;
                        i20 = 8;
                        i3 = 0;
                    }
                    throw new m("Data too big");
                }
                eVar = dc.e.c(Integer.parseInt(hashMap2.get(bVar6).toString()));
                if (!d(dVar.a(eVar) + aVar2.b + aVar3.b, eVar, bVar2)) {
                    throw new m("Data too big for requested version");
                }
                zb.a aVar4 = new zb.a();
                int i25 = aVar2.b;
                aVar4.c(i25);
                for (int i26 = i3; i26 < i25; i26++) {
                    aVar4.a(aVar2.d(i26));
                }
                int e10 = dVar == dVar3 ? aVar3.e() : str.length();
                int a12 = dVar.a(eVar);
                int i27 = 1 << a12;
                if (e10 >= i27) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(e10);
                    sb2.append(" is bigger than ");
                    sb2.append(i27 - 1);
                    throw new m(sb2.toString());
                }
                aVar4.b(e10, a12);
                int i28 = aVar3.b;
                aVar4.c(aVar4.b + i28);
                for (int i29 = i3; i29 < i28; i29++) {
                    aVar4.a(aVar3.d(i29));
                }
                dVar3 = dVar;
                eVar2 = eVar;
                aVar = aVar4;
            } else {
                if (forName.equals(charset)) {
                    forName = null;
                }
                n nVar = new n();
                nVar.b = str;
                nVar.a = z14;
                nVar.c = new zb.d(str, forName);
                nVar.d = bVar2;
                dc.b bVar7 = (dc.b) nVar.d;
                i11 = 2;
                dc.e[] eVarArr = {n.r(1), n.r(2), n.r(3)};
                a0[] a0VarArr = {nVar.l(eVarArr[0]), nVar.l(eVarArr[1]), nVar.l(eVarArr[2])};
                int i30 = 0;
                int i31 = -1;
                int i32 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                for (int i33 = 3; i30 < i33; i33 = 3) {
                    a0 a0Var = a0VarArr[i30];
                    int i34 = i19;
                    int l10 = a0Var.l((dc.e) a0Var.b);
                    if (d(l10, eVarArr[i30], bVar7) && l10 < i32) {
                        i31 = i30;
                        i32 = l10;
                    }
                    i30++;
                    i19 = i34;
                }
                i10 = i19;
                if (i31 < 0) {
                    throw new m("Data too big for any version");
                }
                a0 a0Var2 = a0VarArr[i31];
                zb.a aVar5 = new zb.a();
                ArrayList arrayList = (ArrayList) a0Var2.d;
                int size = arrayList.size();
                int i35 = 0;
                while (i35 < size) {
                    Object obj = arrayList.get(i35);
                    i35++;
                    e eVar3 = (e) obj;
                    int i36 = eVar3.c;
                    a0 a0Var3 = eVar3.e;
                    int i37 = i18;
                    n nVar2 = (n) a0Var3.c;
                    dc.d dVar4 = eVar3.a;
                    aVar5.b(dVar4.b, i21);
                    int i38 = eVar3.d;
                    if (i38 > 0) {
                        aVar5.b(eVar3.a(), dVar4.a((dc.e) a0Var3.b));
                    }
                    if (dVar4 == dc.d.n) {
                        aVar5.b(((zb.c) zb.c.d.get(((zb.d) nVar2.c).a[i36].charset().name())).a[i37], 8);
                    } else if (i38 > 0) {
                        String str2 = (String) nVar2.b;
                        int i39 = eVar3.b;
                        a(str2.substring(i39, i38 + i39), dVar4, aVar5, ((zb.d) nVar2.c).a[i36].charset());
                    }
                    i18 = i37;
                    i21 = 4;
                }
                i3 = i18;
                eVar2 = (dc.e) a0Var2.b;
                aVar = aVar5;
            }
            u uVar = eVar2.c[bVar2.ordinal()];
            int i40 = eVar2.d;
            int i41 = uVar.b;
            t0[] t0VarArr = (t0[]) uVar.c;
            length = t0VarArr.length;
            i13 = i3;
            int i42 = i13;
            while (i13 < length) {
                i42 += t0VarArr[i13].a;
                i13++;
            }
            int i43 = i40 - (i42 * i41);
            i14 = i43 * 8;
            if (aVar.b <= i14) {
                throw new m("data bits cannot fit in the QR Code" + aVar.b + " > " + i14);
            }
            for (int i44 = i3; i44 < 4 && aVar.b < i14; i44++) {
                aVar.a(i3);
            }
            boolean z18 = i3;
            int i45 = aVar.b & 7;
            if (i45 > 0) {
                while (i45 < i20) {
                    aVar.a(z18);
                    i45++;
                    z18 = 0;
                }
            }
            int e11 = i43 - aVar.e();
            for (int i46 = 0; i46 < e11; i46++) {
                aVar.b((i46 & 1) == 0 ? hs.L3 : 17, i20);
            }
            if (aVar.b != i14) {
                throw new m("Bits size does not equal capacity");
            }
            int i47 = 0;
            for (t0 t0Var : t0VarArr) {
                i47 += t0Var.a;
            }
            if (aVar.e() != i43) {
                throw new m("Number of bits and data bytes does not match");
            }
            ArrayList arrayList2 = new ArrayList(i47);
            int i48 = 0;
            int i49 = 0;
            int i50 = 0;
            int i51 = 0;
            zb.a aVar6 = aVar;
            while (i48 < i47) {
                int i52 = i10;
                int[] iArr = new int[i52];
                int[] iArr2 = new int[i52];
                if (i48 >= i47) {
                    throw new m("Block ID too large");
                }
                int i53 = i40 % i47;
                int i54 = i47 - i53;
                int i55 = i40 / i47;
                int i56 = i43 / i47;
                int i57 = i56 + 1;
                int i58 = i55 - i56;
                int i59 = (i55 + 1) - i57;
                if (i58 != i59) {
                    throw new m("EC bytes mismatch");
                }
                if (i47 != i54 + i53) {
                    throw new m("RS blocks mismatch");
                }
                if (i40 != ((i57 + i59) * i53) + ((i56 + i58) * i54)) {
                    throw new m("Total bytes mismatch");
                }
                if (i48 < i54) {
                    c2 = 0;
                    iArr[0] = i56;
                    iArr2[0] = i58;
                } else {
                    c2 = 0;
                    iArr[0] = i57;
                    iArr2[0] = i59;
                }
                int i60 = iArr[c2];
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
                bc.a aVar7 = bc.a.h;
                ArrayList arrayList3 = new ArrayList();
                zb.a aVar8 = aVar6;
                dc.e eVar4 = eVar2;
                arrayList3.add(new bc.b(aVar7, new int[]{1}));
                if (i69 == 0) {
                    throw new IllegalArgumentException("No error correction bytes");
                }
                int i73 = i72 - i69;
                if (i73 <= 0) {
                    throw new IllegalArgumentException("No data bytes provided");
                }
                if (i69 >= arrayList3.size()) {
                    bc.b bVar8 = (bc.b) p1.h(1, arrayList3);
                    int size2 = arrayList3.size();
                    dVar2 = dVar3;
                    bc.b bVar9 = bVar8;
                    while (size2 <= i69) {
                        int i74 = size2;
                        bVar9 = bVar9.g(new bc.b(aVar7, new int[]{1, aVar7.a[(i74 - 1) + aVar7.g]}));
                        arrayList3.add(bVar9);
                        size2 = i74 + 1;
                        i40 = i40;
                    }
                } else {
                    dVar2 = dVar3;
                }
                int i75 = i40;
                bc.b bVar10 = (bc.b) arrayList3.get(i69);
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
                        bc.b bVar11 = new bc.b(aVar7, iArr6);
                        if (!aVar7.equals(bVar10.a)) {
                            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
                        }
                        if (bVar10.e()) {
                            throw new IllegalArgumentException("Divide by 0");
                        }
                        bc.b bVar12 = aVar7.c;
                        int b10 = aVar7.b(bVar10.c(bVar10.d()));
                        while (bVar11.d() >= bVar10.d() && !bVar11.e()) {
                            int d = bVar11.d() - bVar10.d();
                            int c12 = aVar7.c(bVar11.c(bVar11.d()), b10);
                            int i79 = b10;
                            bc.b h = bVar10.h(d, c12);
                            bVar12 = bVar12.a(aVar7.a(d, c12));
                            bVar11 = bVar11.a(h);
                            b10 = i79;
                        }
                        int i80 = i11;
                        bc.b[] bVarArr = new bc.b[i80];
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
                        dVar3 = dVar2;
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
            dc.e eVar5 = eVar2;
            int i83 = i40;
            dc.d dVar5 = dVar3;
            if (i43 != i49) {
                throw new m("Data bytes does not match offset");
            }
            zb.a aVar9 = new zb.a();
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
                StringBuilder m10 = p1.m(i83, "Interleaving error: ", " and ");
                m10.append(aVar9.e());
                m10.append(" differ.");
                throw new m(m10.toString());
            }
            e0 e0Var = new e0();
            e0Var.b = -1;
            e0Var.d = bVar;
            e0Var.c = dVar5;
            e0Var.e = eVar5;
            int i88 = (eVar5.a * 4) + 17;
            d4.d dVar6 = new d4.d(i88, i88);
            yb.b bVar13 = yb.b.e;
            if (hashMap.containsKey(bVar13)) {
                i15 = Integer.parseInt(hashMap.get(bVar13).toString());
            }
            i15 = -1;
            if (i15 == -1) {
                int i89 = -1;
                int i90 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                int i91 = 0;
                while (i91 < 8) {
                    c.b(aVar9, bVar, eVar5, i91, dVar6);
                    int i92 = 0;
                    int a13 = c.a(dVar6, false) + c.a(dVar6, true);
                    byte[][] bArr6 = (byte[][]) dVar6.d;
                    int i93 = dVar6.b;
                    int i94 = dVar6.c;
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
                                        z12 = true;
                                        if (!z12) {
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
                                                z13 = true;
                                            }
                                            z13 = false;
                                            break;
                                        }
                                        i104++;
                                    }
                                    z12 = false;
                                    if (!z12) {
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
                                        z10 = true;
                                        if (z10) {
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
                                                z11 = true;
                                                if (!z11) {
                                                    i105++;
                                                    bArr6 = bArr;
                                                    i89 = i16;
                                                    i91 = i106;
                                                }
                                            }
                                            z11 = false;
                                            if (!z11) {
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
                                    z10 = false;
                                    if (z10) {
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
            e0Var.b = i15;
            c.b(aVar9, bVar, eVar5, i15, dVar6);
            e0Var.f = dVar6;
            return e0Var;
        }
        forName = charset;
        dc.d dVar32 = dc.d.h;
        int i202 = 8;
        int i212 = 4;
        if (z15) {
        }
        u uVar2 = eVar2.c[bVar2.ordinal()];
        int i402 = eVar2.d;
        int i412 = uVar2.b;
        t0[] t0VarArr2 = (t0[]) uVar2.c;
        length = t0VarArr2.length;
        i13 = i3;
        int i422 = i13;
        while (i13 < length) {
        }
        int i432 = i402 - (i422 * i412);
        i14 = i432 * 8;
        if (aVar.b <= i14) {
        }
    }

    public static boolean c(String str) {
        byte[] bytes = str.getBytes(h.b);
        int length = bytes.length;
        if (length % 2 != 0) {
            return false;
        }
        for (int i3 = 0; i3 < length; i3 += 2) {
            int i10 = bytes[i3] & 255;
            if ((i10 < 129 || i10 > 159) && (i10 < 224 || i10 > 235)) {
                return false;
            }
        }
        return true;
    }

    public static boolean d(int i3, dc.e eVar, dc.b bVar) {
        int i10 = eVar.d;
        u uVar = eVar.c[bVar.ordinal()];
        int i11 = uVar.b;
        int i12 = 0;
        for (t0 t0Var : (t0[]) uVar.c) {
            i12 += t0Var.a;
        }
        return i10 - (i12 * i11) >= (i3 + 7) / 8;
    }
}
