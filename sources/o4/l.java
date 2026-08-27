package o4;

import android.net.Uri;
import android.util.SparseArray;
import com.google.android.exoplayer2.upstream.j0;
import com.google.android.exoplayer2.upstream.k0;
import com.google.android.exoplayer2.upstream.q0;
import com.google.android.exoplayer2.upstream.y0;
import g7.e0;
import h3.j2;
import h3.s0;
import h3.t0;
import h3.t1;
import h7.u6;
import j4.b1;
import j4.d1;
import j4.g0;
import j4.i1;
import j4.j1;
import j4.y;
import j4.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class l implements z, p4.r {
    public final i3.k A;
    public final o0.b B = new o0.b(this, 1);
    public y C;
    public int D;
    public j1 E;
    public r[] F;
    public r[] G;
    public int H;
    public a9.i I;
    public final j a;
    public final p4.c b;
    public final m5.o c;
    public final y0 d;
    public final l3.j e;
    public final b6.a f;
    public final ab.a h;
    public final g0 n;
    public final com.google.android.exoplayer2.upstream.r r;
    public final IdentityHashMap s;
    public final n1.d v;
    public final za.b w;
    public final boolean x;
    public final int y;

    public l(j jVar, p4.c cVar, m5.o oVar, y0 y0Var, l3.j jVar2, b6.a aVar, ab.a aVar2, g0 g0Var, com.google.android.exoplayer2.upstream.r rVar, za.b bVar, boolean z10, int i10, i3.k kVar) {
        this.a = jVar;
        this.b = cVar;
        this.c = oVar;
        this.d = y0Var;
        this.e = jVar2;
        this.f = aVar;
        this.h = aVar2;
        this.n = g0Var;
        this.r = rVar;
        this.w = bVar;
        this.x = z10;
        this.y = i10;
        this.A = kVar;
        bVar.getClass();
        this.I = new a9.i(new d1[0], 21);
        this.s = new IdentityHashMap();
        this.v = new n1.d();
        this.F = new r[0];
        this.G = new r[0];
    }

    public static t0 e(t0 t0Var, t0 t0Var2, boolean z10) {
        String o10;
        z3.c cVar;
        int i10;
        String str;
        String str2;
        int i11;
        int i12;
        if (t0Var2 != null) {
            o10 = t0Var2.r;
            cVar = t0Var2.s;
            i11 = t0Var2.O;
            i10 = t0Var2.d;
            i12 = t0Var2.e;
            str = t0Var2.c;
            str2 = t0Var2.b;
        } else {
            o10 = d5.g0.o(1, t0Var.r);
            cVar = t0Var.s;
            if (z10) {
                i11 = t0Var.O;
                i10 = t0Var.d;
                i12 = t0Var.e;
                str = t0Var.c;
                str2 = t0Var.b;
            } else {
                i10 = 0;
                str = null;
                str2 = null;
                i11 = -1;
                i12 = 0;
            }
        }
        String c10 = d5.q.c(o10);
        int i13 = z10 ? t0Var.f : -1;
        int i14 = z10 ? t0Var.h : -1;
        s0 s0Var = new s0();
        s0Var.a = t0Var.a;
        s0Var.b = str2;
        s0Var.n = t0Var.A;
        s0Var.o = c10;
        s0Var.h = o10;
        s0Var.i = cVar;
        s0Var.f = i13;
        s0Var.g = i14;
        s0Var.B = i11;
        s0Var.d = i10;
        s0Var.e = i12;
        s0Var.c = str;
        return new t0(s0Var);
    }

    @Override // j4.z
    public final long B(long j10, j2 j2Var) {
        r[] rVarArr = this.G;
        int length = rVarArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            r rVar = rVarArr[i10];
            if (rVar.M == 2) {
                i iVar = rVar.d;
                p4.c cVar = iVar.g;
                int d = iVar.q.d();
                Uri[] uriArr = iVar.e;
                p4.j a2 = (d >= uriArr.length || d == -1) ? null : cVar.a(uriArr[iVar.q.n()], true);
                if (a2 != null) {
                    p8.z zVar = a2.r;
                    if (!zVar.isEmpty() && a2.c) {
                        long j11 = a2.h - cVar.y;
                        long j12 = j10 - j11;
                        int c10 = d5.g0.c(zVar, Long.valueOf(j12), true);
                        long j13 = ((p4.g) zVar.get(c10)).e;
                        return j2Var.a(j12, j13, c10 != zVar.size() - 1 ? ((p4.g) zVar.get(c10 + 1)).e : j13) + j11;
                    }
                }
            } else {
                i10++;
            }
        }
        return j10;
    }

    @Override // j4.d1
    public final long D() {
        return this.I.D();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01c7  */
    @Override // j4.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E(y yVar, long j10) {
        boolean z10;
        List list;
        List list2;
        int i10;
        boolean z11;
        int i11;
        boolean z12;
        boolean z13;
        int i12;
        int n10;
        r d;
        Uri[] uriArr;
        this.C = yVar;
        p4.c cVar = this.b;
        cVar.getClass();
        cVar.e.add(this);
        p4.m mVar = cVar.s;
        mVar.getClass();
        List list3 = mVar.g;
        List list4 = mVar.e;
        Map map = Collections.EMPTY_MAP;
        boolean isEmpty = list4.isEmpty();
        List list5 = mVar.h;
        int i13 = 0;
        this.D = 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        boolean z14 = this.x;
        if (isEmpty) {
            z10 = z14;
            list = list3;
            list2 = list5;
        } else {
            t0 t0Var = mVar.j;
            int size = list4.size();
            int[] iArr = new int[size];
            int i14 = 0;
            int i15 = 0;
            while (true) {
                list2 = list5;
                if (i14 >= list4.size()) {
                    break;
                }
                t0 t0Var2 = ((p4.l) list4.get(i14)).b;
                int i16 = t0Var2.H;
                String str = t0Var2.r;
                if (i16 > 0 || d5.g0.o(2, str) != null) {
                    iArr[i14] = 2;
                    i15++;
                } else if (d5.g0.o(1, str) != null) {
                    iArr[i14] = 1;
                    i13++;
                } else {
                    iArr[i14] = -1;
                }
                i14++;
                list5 = list2;
            }
            if (i15 > 0) {
                z11 = z14;
                i11 = i15;
                z12 = true;
            } else if (i13 < size) {
                z11 = z14;
                i11 = size - i13;
                z12 = false;
                z13 = true;
                Uri[] uriArr2 = new Uri[i11];
                boolean z15 = z12;
                t0[] t0VarArr = new t0[i11];
                int[] iArr2 = new int[i11];
                i12 = 0;
                int i17 = 0;
                while (i12 < list4.size()) {
                    if (z15) {
                        uriArr = uriArr2;
                        if (iArr[i12] != 2) {
                            i12++;
                            uriArr2 = uriArr;
                        }
                    } else {
                        uriArr = uriArr2;
                    }
                    if (!z13 || iArr[i12] != 1) {
                        p4.l lVar = (p4.l) list4.get(i12);
                        uriArr[i17] = lVar.a;
                        t0VarArr[i17] = lVar.b;
                        iArr2[i17] = i12;
                        i17++;
                    }
                    i12++;
                    uriArr2 = uriArr;
                }
                Uri[] uriArr3 = uriArr2;
                String str2 = t0VarArr[0].r;
                n10 = d5.g0.n(2, str2);
                int n11 = d5.g0.n(1, str2);
                boolean z16 = (n11 != 1 || (n11 == 0 && list3.isEmpty())) && n10 <= 1 && n11 + n10 > 0;
                z10 = z11;
                list = list3;
                d = d("main", (!z15 || n11 <= 0) ? 0 : 1, uriArr3, t0VarArr, mVar.j, mVar.k, map, j10);
                arrayList.add(d);
                arrayList2.add(iArr2);
                if (z10 && z16) {
                    ArrayList arrayList3 = new ArrayList();
                    if (n10 <= 0) {
                        t0[] t0VarArr2 = new t0[i11];
                        int i18 = 0;
                        while (i18 < i11) {
                            t0 t0Var3 = t0VarArr[i18];
                            String o10 = d5.g0.o(2, t0Var3.r);
                            String c10 = d5.q.c(o10);
                            s0 s0Var = new s0();
                            s0Var.a = t0Var3.a;
                            s0Var.b = t0Var3.b;
                            s0Var.n = t0Var3.A;
                            s0Var.o = c10;
                            s0Var.h = o10;
                            s0Var.i = t0Var3.s;
                            s0Var.f = t0Var3.f;
                            s0Var.g = t0Var3.h;
                            s0Var.t = t0Var3.G;
                            s0Var.u = t0Var3.H;
                            s0Var.v = t0Var3.I;
                            s0Var.d = t0Var3.d;
                            s0Var.e = t0Var3.e;
                            t0VarArr2[i18] = new t0(s0Var);
                            i18++;
                            t0VarArr = t0VarArr;
                        }
                        t0[] t0VarArr3 = t0VarArr;
                        arrayList3.add(new i1("main", t0VarArr2));
                        if (n11 > 0 && (t0Var != null || list.isEmpty())) {
                            arrayList3.add(new i1("main:audio", e(t0VarArr3[0], t0Var, false)));
                        }
                        List list6 = mVar.k;
                        if (list6 != null) {
                            for (int i19 = 0; i19 < list6.size(); i19++) {
                                arrayList3.add(new i1(i0.a.k(i19, "main:cc:"), (t0) list6.get(i19)));
                            }
                        }
                    } else {
                        t0[] t0VarArr4 = new t0[i11];
                        for (int i20 = 0; i20 < i11; i20++) {
                            t0VarArr4[i20] = e(t0VarArr[i20], t0Var, true);
                        }
                        arrayList3.add(new i1("main", t0VarArr4));
                    }
                    s0 s0Var2 = new s0();
                    s0Var2.a = "ID3";
                    s0Var2.o = "application/id3";
                    i1 i1Var = new i1("main:id3", new t0(s0Var2));
                    arrayList3.add(i1Var);
                    d.x((i1[]) arrayList3.toArray(new i1[0]), arrayList3.indexOf(i1Var));
                }
            } else {
                z11 = z14;
                i11 = size;
                z12 = false;
            }
            z13 = false;
            Uri[] uriArr22 = new Uri[i11];
            boolean z152 = z12;
            t0[] t0VarArr5 = new t0[i11];
            int[] iArr22 = new int[i11];
            i12 = 0;
            int i172 = 0;
            while (i12 < list4.size()) {
            }
            Uri[] uriArr32 = uriArr22;
            String str22 = t0VarArr5[0].r;
            n10 = d5.g0.n(2, str22);
            int n112 = d5.g0.n(1, str22);
            if (n112 != 1) {
            }
            z10 = z11;
            list = list3;
            d = d("main", (!z152 || n112 <= 0) ? 0 : 1, uriArr32, t0VarArr5, mVar.j, mVar.k, map, j10);
            arrayList.add(d);
            arrayList2.add(iArr22);
            if (z10) {
                ArrayList arrayList32 = new ArrayList();
                if (n10 <= 0) {
                }
                s0 s0Var22 = new s0();
                s0Var22.a = "ID3";
                s0Var22.o = "application/id3";
                i1 i1Var2 = new i1("main:id3", new t0(s0Var22));
                arrayList32.add(i1Var2);
                d.x((i1[]) arrayList32.toArray(new i1[0]), arrayList32.indexOf(i1Var2));
            }
        }
        ArrayList arrayList4 = new ArrayList(list.size());
        ArrayList arrayList5 = new ArrayList(list.size());
        ArrayList arrayList6 = new ArrayList(list.size());
        HashSet hashSet = new HashSet();
        int i21 = 0;
        while (i21 < list.size()) {
            List list7 = list;
            String str3 = ((p4.k) list7.get(i21)).c;
            if (hashSet.add(str3)) {
                arrayList4.clear();
                arrayList5.clear();
                arrayList6.clear();
                boolean z17 = true;
                for (int i22 = 0; i22 < list7.size(); i22++) {
                    String str4 = ((p4.k) list7.get(i22)).c;
                    int i23 = d5.g0.a;
                    if (str3.equals(str4)) {
                        p4.k kVar = (p4.k) list7.get(i22);
                        arrayList6.add(Integer.valueOf(i22));
                        Uri uri = kVar.a;
                        t0 t0Var4 = kVar.b;
                        arrayList4.add(uri);
                        arrayList5.add(t0Var4);
                        z17 &= d5.g0.n(1, t0Var4.r) == 1;
                    }
                }
                String concat = "audio:".concat(str3);
                int i24 = d5.g0.a;
                list = list7;
                i10 = i21;
                r d10 = d(concat, 1, (Uri[]) arrayList4.toArray(new Uri[0]), (t0[]) arrayList5.toArray(new t0[0]), null, Collections.EMPTY_LIST, map, j10);
                arrayList2.add(u6.e(arrayList6));
                arrayList.add(d10);
                if (z10 && z17) {
                    d10.x(new i1[]{new i1(concat, (t0[]) arrayList5.toArray(new t0[0]))}, new int[0]);
                }
            } else {
                i10 = i21;
                list = list7;
            }
            i21 = i10 + 1;
        }
        this.H = arrayList.size();
        for (int i25 = 0; i25 < list2.size(); i25++) {
            p4.k kVar2 = (p4.k) list2.get(i25);
            StringBuilder o11 = i0.a.o(i25, "subtitle:", ":");
            String str5 = kVar2.c;
            t0 t0Var5 = kVar2.b;
            o11.append(str5);
            String sb2 = o11.toString();
            r d11 = d(sb2, 3, new Uri[]{kVar2.a}, new t0[]{t0Var5}, null, Collections.EMPTY_LIST, map, j10);
            arrayList2.add(new int[]{i25});
            arrayList.add(d11);
            d11.x(new i1[]{new i1(sb2, t0Var5)}, new int[0]);
        }
        this.F = (r[]) arrayList.toArray(new r[0]);
        this.D = this.F.length;
        for (int i26 = 0; i26 < this.H; i26++) {
            this.F[i26].d.l = true;
        }
        for (r rVar : this.F) {
            if (!rVar.P) {
                rVar.q(rVar.b0);
            }
        }
        this.G = this.F;
    }

    /* JADX WARN: Code restructure failed: missing block: B:184:0x0110, code lost:
    
        if (r42 != r3.b0) goto L60;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02e1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0187  */
    /* JADX WARN: Type inference failed for: r27v0 */
    /* JADX WARN: Type inference failed for: r28v2 */
    /* JADX WARN: Type inference failed for: r6v41 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    @Override // j4.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long F(b5.s[] sVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j10) {
        IdentityHashMap identityHashMap;
        b1[] b1VarArr2;
        i iVar;
        i iVar2;
        boolean z10;
        int i10;
        int[] iArr;
        r[] rVarArr;
        int i11;
        int i12;
        b1[] b1VarArr3;
        int i13;
        i iVar3;
        int[] iArr2;
        r rVar;
        boolean z11;
        boolean z12;
        int i14;
        int i15;
        int i16;
        boolean z13;
        ?? r82;
        int i17;
        b5.s[] sVarArr2;
        int i18;
        q0 q0Var;
        int[] iArr3 = new int[sVarArr.length];
        int[] iArr4 = new int[sVarArr.length];
        int i19 = 0;
        while (true) {
            int length = sVarArr.length;
            identityHashMap = this.s;
            if (i19 >= length) {
                break;
            }
            b1 b1Var = b1VarArr[i19];
            iArr3[i19] = b1Var == null ? -1 : ((Integer) identityHashMap.get(b1Var)).intValue();
            iArr4[i19] = -1;
            b5.s sVar = sVarArr[i19];
            if (sVar != null) {
                i1 b10 = sVar.b();
                int i20 = 0;
                while (true) {
                    r[] rVarArr2 = this.F;
                    if (i20 < rVarArr2.length) {
                        r rVar2 = rVarArr2[i20];
                        rVar2.e();
                        if (rVar2.U.b(b10) != -1) {
                            iArr4[i19] = i20;
                            break;
                        }
                        i20++;
                    }
                }
            }
            i19++;
        }
        identityHashMap.clear();
        int length2 = sVarArr.length;
        b1[] b1VarArr4 = new b1[length2];
        int length3 = sVarArr.length;
        b1[] b1VarArr5 = new b1[length3];
        int length4 = sVarArr.length;
        b5.s[] sVarArr3 = new b5.s[length4];
        r[] rVarArr3 = new r[this.F.length];
        int i21 = length3;
        int i22 = 0;
        int i23 = 0;
        boolean z14 = false;
        while (i22 < this.F.length) {
            int i24 = length2;
            int i25 = 0;
            while (true) {
                b1VarArr2 = b1VarArr4;
                if (i25 >= sVarArr.length) {
                    break;
                }
                b1VarArr5[i25] = iArr3[i25] == i22 ? b1VarArr[i25] : null;
                sVarArr3[i25] = iArr4[i25] == i22 ? sVarArr[i25] : null;
                i25++;
                b1VarArr4 = b1VarArr2;
            }
            r rVar3 = this.F[i22];
            q0 q0Var2 = rVar3.s;
            int i26 = i22;
            i iVar4 = rVar3.d;
            ArrayList arrayList = rVar3.y;
            rVar3.e();
            int i27 = rVar3.Q;
            ?? r27 = b1VarArr5;
            int i28 = 0;
            while (i28 < length4) {
                n nVar = (n) r27[i28];
                if (nVar == null || (sVarArr3[i28] != null && zArr[i28])) {
                    i18 = i28;
                    q0Var = q0Var2;
                } else {
                    i18 = i28;
                    rVar3.Q--;
                    q0Var = q0Var2;
                    if (nVar.c != -1) {
                        r rVar4 = nVar.b;
                        int i29 = nVar.a;
                        rVar4.e();
                        rVar4.W.getClass();
                        int i30 = rVar4.W[i29];
                        d5.a.i(rVar4.Z[i30]);
                        rVar4.Z[i30] = false;
                        nVar.c = -1;
                    }
                    r27[i18] = 0;
                }
                i28 = i18 + 1;
                q0Var2 = q0Var;
            }
            q0 q0Var3 = q0Var2;
            boolean z15 = true;
            if (!z14) {
                if (!rVar3.e0) {
                    iVar = iVar4;
                } else if (i27 != 0) {
                    iVar = iVar4;
                }
                iVar2 = iVar;
                z10 = false;
                b5.s sVar2 = iVar2.q;
                boolean z16 = z10;
                b5.s sVar3 = sVar2;
                i10 = 0;
                while (i10 < length4) {
                    int i31 = i10;
                    b5.s sVar4 = sVarArr3[i31];
                    if (sVar4 == null) {
                        i17 = length4;
                        sVarArr2 = sVarArr3;
                    } else {
                        i17 = length4;
                        sVarArr2 = sVarArr3;
                        int b11 = rVar3.U.b(sVar4.b());
                        if (b11 == rVar3.X) {
                            iVar2.q = sVar4;
                            sVar3 = sVar4;
                        }
                        if (r27[i31] == 0) {
                            rVar3.Q++;
                            n nVar2 = new n(rVar3, b11);
                            r27[i31] = nVar2;
                            zArr2[i31] = z15;
                            if (rVar3.W != null) {
                                nVar2.b();
                                if (!z16) {
                                    q qVar = rVar3.H[rVar3.W[b11]];
                                    z16 = (qVar.D(j10, true) || qVar.q() == 0) ? false : true;
                                }
                            }
                        }
                    }
                    i10 = i31 + 1;
                    length4 = i17;
                    sVarArr3 = sVarArr2;
                    z15 = true;
                }
                int i32 = length4;
                b5.s[] sVarArr4 = sVarArr3;
                if (rVar3.Q != 0) {
                    iVar2.n = null;
                    rVar3.S = null;
                    rVar3.d0 = true;
                    arrayList.clear();
                    if (q0Var3.d()) {
                        if (rVar3.O) {
                            for (q qVar2 : rVar3.H) {
                                qVar2.i();
                            }
                        }
                        q0Var3.b();
                    } else {
                        rVar3.y();
                    }
                    int[] iArr5 = iArr4;
                    rVar = rVar3;
                    i14 = i21;
                    iArr2 = iArr5;
                    iArr = iArr3;
                    rVarArr = rVarArr3;
                    i12 = i24;
                    b1VarArr3 = b1VarArr2;
                    i13 = i26;
                    iVar3 = iVar2;
                } else {
                    boolean z17 = true;
                    if (arrayList.isEmpty() || d5.g0.a(sVar3, sVar2)) {
                        iArr = iArr3;
                        rVarArr = rVarArr3;
                        i11 = i21;
                        i12 = i24;
                        b1VarArr3 = b1VarArr2;
                        i13 = i26;
                        iVar3 = iVar2;
                        iArr2 = iArr4;
                        rVar = rVar3;
                    } else {
                        if (rVar3.e0) {
                            iArr = iArr3;
                            rVarArr = rVarArr3;
                            i11 = i21;
                            i12 = i24;
                            b1VarArr3 = b1VarArr2;
                            i13 = i26;
                            iVar3 = iVar2;
                            iArr2 = iArr4;
                            rVar = rVar3;
                        } else {
                            long j11 = j10 < 0 ? -j10 : 0L;
                            k r10 = rVar3.r();
                            b5.s sVar5 = sVar3;
                            iArr = iArr3;
                            rVarArr = rVarArr3;
                            i11 = i21;
                            i12 = i24;
                            b1VarArr3 = b1VarArr2;
                            i13 = i26;
                            iVar3 = iVar2;
                            iArr2 = iArr4;
                            rVar = rVar3;
                            sVar5.m(j10, j11, -9223372036854775807L, rVar3.A, iVar2.a(r10, j10));
                            if (sVar5.n() != iVar3.h.a(r10.d)) {
                                z17 = true;
                            } else {
                                z17 = true;
                            }
                        }
                        rVar.d0 = z17;
                        z11 = true;
                        z12 = true;
                        if (z12) {
                            i14 = i11;
                        } else {
                            rVar.G(j10, z11);
                            i14 = i11;
                            int i33 = 0;
                            while (i33 < i14) {
                                if (r27[i33] != 0) {
                                    zArr2[i33] = z17;
                                }
                                i33++;
                                z17 = true;
                            }
                        }
                        z16 = z12;
                    }
                    z11 = z14;
                    z12 = z16;
                    if (z12) {
                    }
                    z16 = z12;
                }
                ArrayList arrayList2 = rVar.E;
                arrayList2.clear();
                for (i15 = 0; i15 < i14; i15++) {
                    ?? r83 = r27[i15];
                    if (r83 != 0) {
                        arrayList2.add((n) r83);
                    }
                }
                rVar.e0 = true;
                i16 = 0;
                z13 = false;
                while (i16 < sVarArr.length) {
                    ?? r72 = r27[i16];
                    int i34 = i13;
                    if (iArr2[i16] == i34) {
                        r72.getClass();
                        r82 = b1VarArr3;
                        r82[i16] = r72;
                        identityHashMap.put(r72, Integer.valueOf(i34));
                        z13 = true;
                    } else {
                        r82 = b1VarArr3;
                        if (iArr[i16] == i34) {
                            d5.a.i(r72 == 0);
                        }
                    }
                    i16++;
                    b1VarArr3 = r82;
                    i13 = i34;
                }
                b1[] b1VarArr6 = b1VarArr3;
                int i35 = i13;
                int i36 = i23;
                if (!z13) {
                    rVarArr[i36] = rVar;
                    i23 = i36 + 1;
                    if (i36 == 0) {
                        iVar3.l = true;
                        if (!z16) {
                            r[] rVarArr4 = this.G;
                            if (rVarArr4.length != 0 && rVar == rVarArr4[0]) {
                            }
                        }
                        ((SparseArray) this.v.b).clear();
                        z14 = true;
                    } else {
                        iVar3.l = i35 < this.H;
                    }
                }
                i22 = i35 + 1;
                b1VarArr4 = b1VarArr6;
                iArr4 = iArr2;
                rVarArr3 = rVarArr;
                b1VarArr5 = r27;
                iArr3 = iArr;
                length4 = i32;
                sVarArr3 = sVarArr4;
                i21 = i14;
                length2 = i12;
            }
            iVar = iVar4;
            iVar2 = iVar;
            z10 = true;
            b5.s sVar22 = iVar2.q;
            boolean z162 = z10;
            b5.s sVar32 = sVar22;
            i10 = 0;
            while (i10 < length4) {
            }
            int i322 = length4;
            b5.s[] sVarArr42 = sVarArr3;
            if (rVar3.Q != 0) {
            }
            ArrayList arrayList22 = rVar.E;
            arrayList22.clear();
            while (i15 < i14) {
            }
            rVar.e0 = true;
            i16 = 0;
            z13 = false;
            while (i16 < sVarArr.length) {
            }
            b1[] b1VarArr62 = b1VarArr3;
            int i352 = i13;
            int i362 = i23;
            if (!z13) {
            }
            i22 = i352 + 1;
            b1VarArr4 = b1VarArr62;
            iArr4 = iArr2;
            rVarArr3 = rVarArr;
            b1VarArr5 = r27;
            iArr3 = iArr;
            length4 = i322;
            sVarArr3 = sVarArr42;
            i21 = i14;
            length2 = i12;
        }
        System.arraycopy(b1VarArr4, 0, b1VarArr, 0, length2);
        r[] rVarArr5 = (r[]) d5.g0.J(i23, rVarArr3);
        this.G = rVarArr5;
        this.w.getClass();
        this.I = new a9.i(rVarArr5, 21);
        return j10;
    }

    @Override // j4.d1
    public final void I(long j10) {
        this.I.I(j10);
    }

    @Override // p4.r
    public final void a() {
        for (r rVar : this.F) {
            q0 q0Var = rVar.s;
            ArrayList arrayList = rVar.y;
            if (!arrayList.isEmpty()) {
                k kVar = (k) p8.l.g(arrayList);
                int b10 = rVar.d.b(kVar);
                if (b10 == 1) {
                    kVar.W = true;
                } else if (b10 == 2 && !rVar.f0 && q0Var.d()) {
                    q0Var.b();
                }
            }
        }
        this.C.a(this);
    }

    @Override // j4.d1
    public final boolean b() {
        return this.I.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x008f, code lost:
    
        if ((((p4.b) r9.g.d.get(r18)) != null ? !p4.b.a(r4, r13) : false) != false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0056 A[SYNTHETIC] */
    @Override // p4.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(Uri uri, n2.v vVar, boolean z10) {
        long j10;
        int i10;
        int u10;
        boolean z11;
        boolean z12;
        boolean z13 = true;
        for (r rVar : this.F) {
            i iVar = rVar.d;
            Uri[] uriArr = iVar.e;
            if (d5.g0.j(uriArr, uri)) {
                if (!z10) {
                    ab.a aVar = rVar.r;
                    j0 a2 = e0.a(iVar.q);
                    aVar.getClass();
                    k0 x32 = ab.a.x3(a2, vVar);
                    if (x32 != null && x32.a == 2) {
                        j10 = x32.b;
                        i10 = 0;
                        while (true) {
                            if (i10 < uriArr.length) {
                                i10 = -1;
                                break;
                            }
                            if (uriArr[i10].equals(uri)) {
                                break;
                            }
                            i10++;
                        }
                        if (i10 != -1 && (u10 = iVar.q.u(i10)) != -1) {
                            iVar.s |= uri.equals(iVar.o);
                            if (j10 != -9223372036854775807L) {
                                if (iVar.q.e(u10, j10)) {
                                }
                                z11 = false;
                                z12 = (z11 || j10 == -9223372036854775807L) ? false : true;
                            }
                        }
                        z11 = true;
                        if (z11) {
                        }
                    }
                }
                j10 = -9223372036854775807L;
                i10 = 0;
                while (true) {
                    if (i10 < uriArr.length) {
                    }
                    i10++;
                }
                if (i10 != -1) {
                    iVar.s |= uri.equals(iVar.o);
                    if (j10 != -9223372036854775807L) {
                    }
                }
                z11 = true;
                if (z11) {
                }
            } else {
                z12 = true;
            }
            z13 &= z12;
        }
        this.C.a(this);
        return z13;
    }

    public final r d(String str, int i10, Uri[] uriArr, t0[] t0VarArr, t0 t0Var, List list, Map map, long j10) {
        return new r(str, i10, this.B, new i(this.a, this.b, uriArr, t0VarArr, this.c, this.d, this.v, list, this.A), map, this.r, j10, t0Var, this.e, this.f, this.h, this.n, this.y);
    }

    @Override // j4.d1
    public final long g() {
        return this.I.g();
    }

    @Override // j4.z
    public final void m() {
        for (r rVar : this.F) {
            rVar.v();
            if (rVar.f0 && !rVar.P) {
                throw t1.a("Loading finished before preparation is complete.", null);
            }
        }
    }

    @Override // j4.z
    public final long o(long j10) {
        r[] rVarArr = this.G;
        if (rVarArr.length > 0) {
            boolean G = rVarArr[0].G(j10, false);
            int i10 = 1;
            while (true) {
                r[] rVarArr2 = this.G;
                if (i10 >= rVarArr2.length) {
                    break;
                }
                rVarArr2[i10].G(j10, G);
                i10++;
            }
            if (G) {
                ((SparseArray) this.v.b).clear();
            }
        }
        return j10;
    }

    @Override // j4.z
    public final void p(long j10) {
        for (r rVar : this.G) {
            if (rVar.O && !rVar.t()) {
                int length = rVar.H.length;
                for (int i10 = 0; i10 < length; i10++) {
                    rVar.H[i10].h(j10, rVar.Z[i10]);
                }
            }
        }
    }

    @Override // j4.d1
    public final boolean q(long j10) {
        if (this.E != null) {
            return this.I.q(j10);
        }
        for (r rVar : this.F) {
            if (!rVar.P) {
                rVar.q(rVar.b0);
            }
        }
        return false;
    }

    @Override // j4.z
    public final long w() {
        return -9223372036854775807L;
    }

    @Override // j4.z
    public final j1 z() {
        j1 j1Var = this.E;
        j1Var.getClass();
        return j1Var;
    }
}
