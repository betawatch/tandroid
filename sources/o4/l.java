package o4;

import android.net.Uri;
import android.util.SparseArray;
import com.google.android.exoplayer2.upstream.j0;
import com.google.android.exoplayer2.upstream.k0;
import com.google.android.exoplayer2.upstream.q0;
import com.google.android.exoplayer2.upstream.y0;
import d5.f0;
import f7.g0;
import g7.r6;
import h3.j2;
import h3.s0;
import h3.t0;
import h3.t1;
import j3.r0;
import j4.a0;
import j4.b1;
import j4.d1;
import j4.h0;
import j4.i1;
import j4.j1;
import j4.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import m5.c0;
import n2.w;
import n5.e0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class l implements a0, p4.r {
    public final i3.l A;
    public final n5.a0 B = new n5.a0(this, 3);
    public z C;
    public int D;
    public j1 E;
    public r[] F;
    public r[] G;
    public int H;
    public android.support.v4.media.c I;
    public final j a;
    public final p4.c b;
    public final e0 c;
    public final y0 d;
    public final l3.i e;
    public final a6.a f;
    public final v9.d h;
    public final h0 n;
    public final com.google.android.exoplayer2.upstream.r r;
    public final IdentityHashMap s;
    public final c0 v;
    public final za.a w;
    public final boolean x;
    public final int y;

    public l(j jVar, p4.c cVar, e0 e0Var, y0 y0Var, l3.i iVar, a6.a aVar, v9.d dVar, h0 h0Var, com.google.android.exoplayer2.upstream.r rVar, za.a aVar2, boolean z10, int i9, i3.l lVar) {
        this.a = jVar;
        this.b = cVar;
        this.c = e0Var;
        this.d = y0Var;
        this.e = iVar;
        this.f = aVar;
        this.h = dVar;
        this.n = h0Var;
        this.r = rVar;
        this.w = aVar2;
        this.x = z10;
        this.y = i9;
        this.A = lVar;
        aVar2.getClass();
        this.I = new android.support.v4.media.c(new d1[0], 19);
        this.s = new IdentityHashMap();
        this.v = new c0(8);
        this.F = new r[0];
        this.G = new r[0];
    }

    public static t0 f(t0 t0Var, t0 t0Var2, boolean z10) {
        String o6;
        z3.c cVar;
        int i9;
        String str;
        String str2;
        int i10;
        int i11;
        if (t0Var2 != null) {
            o6 = t0Var2.r;
            cVar = t0Var2.s;
            i10 = t0Var2.O;
            i9 = t0Var2.d;
            i11 = t0Var2.e;
            str = t0Var2.c;
            str2 = t0Var2.b;
        } else {
            o6 = f0.o(1, t0Var.r);
            cVar = t0Var.s;
            if (z10) {
                i10 = t0Var.O;
                i9 = t0Var.d;
                i11 = t0Var.e;
                str = t0Var.c;
                str2 = t0Var.b;
            } else {
                i9 = 0;
                str = null;
                str2 = null;
                i10 = -1;
                i11 = 0;
            }
        }
        String c10 = d5.q.c(o6);
        int i12 = z10 ? t0Var.f : -1;
        int i13 = z10 ? t0Var.h : -1;
        s0 s0Var = new s0();
        s0Var.a = t0Var.a;
        s0Var.b = str2;
        s0Var.n = t0Var.A;
        s0Var.o = c10;
        s0Var.h = o6;
        s0Var.i = cVar;
        s0Var.f = i12;
        s0Var.g = i13;
        s0Var.B = i10;
        s0Var.d = i9;
        s0Var.e = i11;
        s0Var.c = str;
        return new t0(s0Var);
    }

    @Override // p4.r
    public final void a() {
        for (r rVar : this.F) {
            q0 q0Var = rVar.s;
            ArrayList arrayList = rVar.y;
            if (!arrayList.isEmpty()) {
                k kVar = (k) o8.l.g(arrayList);
                int b10 = rVar.d.b(kVar);
                if (b10 == 1) {
                    kVar.W = true;
                } else if (b10 == 2 && !rVar.f0 && q0Var.d()) {
                    q0Var.b();
                }
            }
        }
        this.C.c(this);
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
    public final boolean c(Uri uri, w wVar, boolean z10) {
        long j10;
        int i9;
        int u10;
        boolean z11;
        boolean z12;
        boolean z13 = true;
        for (r rVar : this.F) {
            i iVar = rVar.d;
            Uri[] uriArr = iVar.e;
            if (f0.j(uriArr, uri)) {
                if (!z10) {
                    v9.d dVar = rVar.r;
                    j0 a2 = g0.a(iVar.q);
                    dVar.getClass();
                    k0 k32 = v9.d.k3(a2, wVar);
                    if (k32 != null && k32.a == 2) {
                        j10 = k32.b;
                        i9 = 0;
                        while (true) {
                            if (i9 < uriArr.length) {
                                i9 = -1;
                                break;
                            }
                            if (uriArr[i9].equals(uri)) {
                                break;
                            }
                            i9++;
                        }
                        if (i9 != -1 && (u10 = iVar.q.u(i9)) != -1) {
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
                i9 = 0;
                while (true) {
                    if (i9 < uriArr.length) {
                    }
                    i9++;
                }
                if (i9 != -1) {
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
        this.C.c(this);
        return z13;
    }

    @Override // j4.d1
    public final long d() {
        return this.I.d();
    }

    public final r e(String str, int i9, Uri[] uriArr, t0[] t0VarArr, t0 t0Var, List list, Map map, long j10) {
        return new r(str, i9, this.B, new i(this.a, this.b, uriArr, t0VarArr, this.c, this.d, this.v, list, this.A), map, this.r, j10, t0Var, this.e, this.f, this.h, this.n, this.y);
    }

    @Override // j4.a0
    public final void g() {
        for (r rVar : this.F) {
            rVar.D();
            if (rVar.f0 && !rVar.P) {
                throw t1.a("Loading finished before preparation is complete.", null);
            }
        }
    }

    @Override // j4.a0
    public final long i(long j10) {
        r[] rVarArr = this.G;
        if (rVarArr.length > 0) {
            boolean G = rVarArr[0].G(j10, false);
            int i9 = 1;
            while (true) {
                r[] rVarArr2 = this.G;
                if (i9 >= rVarArr2.length) {
                    break;
                }
                rVarArr2[i9].G(j10, G);
                i9++;
            }
            if (G) {
                ((SparseArray) this.v.b).clear();
            }
        }
        return j10;
    }

    @Override // j4.a0
    public final void k(long j10) {
        for (r rVar : this.G) {
            if (rVar.O && !rVar.A()) {
                int length = rVar.H.length;
                for (int i9 = 0; i9 < length; i9++) {
                    rVar.H[i9].h(j10, rVar.Z[i9]);
                }
            }
        }
    }

    @Override // j4.d1
    public final boolean n(long j10) {
        if (this.E != null) {
            return this.I.n(j10);
        }
        for (r rVar : this.F) {
            if (!rVar.P) {
                rVar.n(rVar.b0);
            }
        }
        return false;
    }

    @Override // j4.a0
    public final long o() {
        return -9223372036854775807L;
    }

    @Override // j4.a0
    public final j1 q() {
        j1 j1Var = this.E;
        j1Var.getClass();
        return j1Var;
    }

    @Override // j4.a0
    public final long u(long j10, j2 j2Var) {
        r[] rVarArr = this.G;
        int length = rVarArr.length;
        int i9 = 0;
        while (true) {
            if (i9 >= length) {
                break;
            }
            r rVar = rVarArr[i9];
            if (rVar.M == 2) {
                i iVar = rVar.d;
                p4.c cVar = iVar.g;
                int d = iVar.q.d();
                Uri[] uriArr = iVar.e;
                p4.j a2 = (d >= uriArr.length || d == -1) ? null : cVar.a(uriArr[iVar.q.n()], true);
                if (a2 != null) {
                    o8.z zVar = a2.r;
                    if (!zVar.isEmpty() && a2.c) {
                        long j11 = a2.h - cVar.y;
                        long j12 = j10 - j11;
                        int c10 = f0.c(zVar, Long.valueOf(j12), true);
                        long j13 = ((p4.g) zVar.get(c10)).e;
                        return j2Var.a(j12, j13, c10 != zVar.size() - 1 ? ((p4.g) zVar.get(c10 + 1)).e : j13) + j11;
                    }
                }
            } else {
                i9++;
            }
        }
        return j10;
    }

    @Override // j4.d1
    public final long v() {
        return this.I.v();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01c7  */
    @Override // j4.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w(z zVar, long j10) {
        boolean z10;
        List list;
        List list2;
        int i9;
        boolean z11;
        int i10;
        boolean z12;
        boolean z13;
        int i11;
        int n10;
        r e10;
        Uri[] uriArr;
        this.C = zVar;
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
        int i12 = 0;
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
            int i13 = 0;
            int i14 = 0;
            while (true) {
                list2 = list5;
                if (i13 >= list4.size()) {
                    break;
                }
                t0 t0Var2 = ((p4.l) list4.get(i13)).b;
                int i15 = t0Var2.H;
                String str = t0Var2.r;
                if (i15 > 0 || f0.o(2, str) != null) {
                    iArr[i13] = 2;
                    i14++;
                } else if (f0.o(1, str) != null) {
                    iArr[i13] = 1;
                    i12++;
                } else {
                    iArr[i13] = -1;
                }
                i13++;
                list5 = list2;
            }
            if (i14 > 0) {
                z11 = z14;
                i10 = i14;
                z12 = true;
            } else if (i12 < size) {
                z11 = z14;
                i10 = size - i12;
                z12 = false;
                z13 = true;
                Uri[] uriArr2 = new Uri[i10];
                boolean z15 = z12;
                t0[] t0VarArr = new t0[i10];
                int[] iArr2 = new int[i10];
                i11 = 0;
                int i16 = 0;
                while (i11 < list4.size()) {
                    if (z15) {
                        uriArr = uriArr2;
                        if (iArr[i11] != 2) {
                            i11++;
                            uriArr2 = uriArr;
                        }
                    } else {
                        uriArr = uriArr2;
                    }
                    if (!z13 || iArr[i11] != 1) {
                        p4.l lVar = (p4.l) list4.get(i11);
                        uriArr[i16] = lVar.a;
                        t0VarArr[i16] = lVar.b;
                        iArr2[i16] = i11;
                        i16++;
                    }
                    i11++;
                    uriArr2 = uriArr;
                }
                Uri[] uriArr3 = uriArr2;
                String str2 = t0VarArr[0].r;
                n10 = f0.n(2, str2);
                int n11 = f0.n(1, str2);
                boolean z16 = (n11 != 1 || (n11 == 0 && list3.isEmpty())) && n10 <= 1 && n11 + n10 > 0;
                z10 = z11;
                list = list3;
                e10 = e("main", (!z15 || n11 <= 0) ? 0 : 1, uriArr3, t0VarArr, mVar.j, mVar.k, map, j10);
                arrayList.add(e10);
                arrayList2.add(iArr2);
                if (z10 && z16) {
                    ArrayList arrayList3 = new ArrayList();
                    if (n10 <= 0) {
                        t0[] t0VarArr2 = new t0[i10];
                        int i17 = 0;
                        while (i17 < i10) {
                            t0 t0Var3 = t0VarArr[i17];
                            String o6 = f0.o(2, t0Var3.r);
                            String c10 = d5.q.c(o6);
                            s0 s0Var = new s0();
                            s0Var.a = t0Var3.a;
                            s0Var.b = t0Var3.b;
                            s0Var.n = t0Var3.A;
                            s0Var.o = c10;
                            s0Var.h = o6;
                            s0Var.i = t0Var3.s;
                            s0Var.f = t0Var3.f;
                            s0Var.g = t0Var3.h;
                            s0Var.t = t0Var3.G;
                            s0Var.u = t0Var3.H;
                            s0Var.v = t0Var3.I;
                            s0Var.d = t0Var3.d;
                            s0Var.e = t0Var3.e;
                            t0VarArr2[i17] = new t0(s0Var);
                            i17++;
                            t0VarArr = t0VarArr;
                        }
                        t0[] t0VarArr3 = t0VarArr;
                        arrayList3.add(new i1("main", t0VarArr2));
                        if (n11 > 0 && (t0Var != null || list.isEmpty())) {
                            arrayList3.add(new i1("main:audio", f(t0VarArr3[0], t0Var, false)));
                        }
                        List list6 = mVar.k;
                        if (list6 != null) {
                            for (int i18 = 0; i18 < list6.size(); i18++) {
                                arrayList3.add(new i1(r0.l(i18, "main:cc:"), (t0) list6.get(i18)));
                            }
                        }
                    } else {
                        t0[] t0VarArr4 = new t0[i10];
                        for (int i19 = 0; i19 < i10; i19++) {
                            t0VarArr4[i19] = f(t0VarArr[i19], t0Var, true);
                        }
                        arrayList3.add(new i1("main", t0VarArr4));
                    }
                    s0 s0Var2 = new s0();
                    s0Var2.a = "ID3";
                    s0Var2.o = "application/id3";
                    i1 i1Var = new i1("main:id3", new t0(s0Var2));
                    arrayList3.add(i1Var);
                    e10.E((i1[]) arrayList3.toArray(new i1[0]), arrayList3.indexOf(i1Var));
                }
            } else {
                z11 = z14;
                i10 = size;
                z12 = false;
            }
            z13 = false;
            Uri[] uriArr22 = new Uri[i10];
            boolean z152 = z12;
            t0[] t0VarArr5 = new t0[i10];
            int[] iArr22 = new int[i10];
            i11 = 0;
            int i162 = 0;
            while (i11 < list4.size()) {
            }
            Uri[] uriArr32 = uriArr22;
            String str22 = t0VarArr5[0].r;
            n10 = f0.n(2, str22);
            int n112 = f0.n(1, str22);
            if (n112 != 1) {
            }
            z10 = z11;
            list = list3;
            e10 = e("main", (!z152 || n112 <= 0) ? 0 : 1, uriArr32, t0VarArr5, mVar.j, mVar.k, map, j10);
            arrayList.add(e10);
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
                e10.E((i1[]) arrayList32.toArray(new i1[0]), arrayList32.indexOf(i1Var2));
            }
        }
        ArrayList arrayList4 = new ArrayList(list.size());
        ArrayList arrayList5 = new ArrayList(list.size());
        ArrayList arrayList6 = new ArrayList(list.size());
        HashSet hashSet = new HashSet();
        int i20 = 0;
        while (i20 < list.size()) {
            List list7 = list;
            String str3 = ((p4.k) list7.get(i20)).c;
            if (hashSet.add(str3)) {
                arrayList4.clear();
                arrayList5.clear();
                arrayList6.clear();
                boolean z17 = true;
                for (int i21 = 0; i21 < list7.size(); i21++) {
                    String str4 = ((p4.k) list7.get(i21)).c;
                    int i22 = f0.a;
                    if (str3.equals(str4)) {
                        p4.k kVar = (p4.k) list7.get(i21);
                        arrayList6.add(Integer.valueOf(i21));
                        Uri uri = kVar.a;
                        t0 t0Var4 = kVar.b;
                        arrayList4.add(uri);
                        arrayList5.add(t0Var4);
                        z17 &= f0.n(1, t0Var4.r) == 1;
                    }
                }
                String concat = "audio:".concat(str3);
                int i23 = f0.a;
                list = list7;
                i9 = i20;
                r e11 = e(concat, 1, (Uri[]) arrayList4.toArray(new Uri[0]), (t0[]) arrayList5.toArray(new t0[0]), null, Collections.EMPTY_LIST, map, j10);
                arrayList2.add(r6.e(arrayList6));
                arrayList.add(e11);
                if (z10 && z17) {
                    e11.E(new i1[]{new i1(concat, (t0[]) arrayList5.toArray(new t0[0]))}, new int[0]);
                }
            } else {
                i9 = i20;
                list = list7;
            }
            i20 = i9 + 1;
        }
        this.H = arrayList.size();
        for (int i24 = 0; i24 < list2.size(); i24++) {
            p4.k kVar2 = (p4.k) list2.get(i24);
            StringBuilder p6 = r0.p(i24, "subtitle:", ":");
            String str5 = kVar2.c;
            t0 t0Var5 = kVar2.b;
            p6.append(str5);
            String sb2 = p6.toString();
            r e12 = e(sb2, 3, new Uri[]{kVar2.a}, new t0[]{t0Var5}, null, Collections.EMPTY_LIST, map, j10);
            arrayList2.add(new int[]{i24});
            arrayList.add(e12);
            e12.E(new i1[]{new i1(sb2, t0Var5)}, new int[0]);
        }
        this.F = (r[]) arrayList.toArray(new r[0]);
        this.D = this.F.length;
        for (int i25 = 0; i25 < this.H; i25++) {
            this.F[i25].d.l = true;
        }
        for (r rVar : this.F) {
            if (!rVar.P) {
                rVar.n(rVar.b0);
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
    @Override // j4.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long x(b5.t[] tVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j10) {
        IdentityHashMap identityHashMap;
        b1[] b1VarArr2;
        i iVar;
        i iVar2;
        boolean z10;
        int i9;
        int[] iArr;
        r[] rVarArr;
        int i10;
        int i11;
        b1[] b1VarArr3;
        int i12;
        i iVar3;
        int[] iArr2;
        r rVar;
        boolean z11;
        boolean z12;
        int i13;
        int i14;
        int i15;
        boolean z13;
        ?? r82;
        int i16;
        b5.t[] tVarArr2;
        int i17;
        q0 q0Var;
        int[] iArr3 = new int[tVarArr.length];
        int[] iArr4 = new int[tVarArr.length];
        int i18 = 0;
        while (true) {
            int length = tVarArr.length;
            identityHashMap = this.s;
            if (i18 >= length) {
                break;
            }
            b1 b1Var = b1VarArr[i18];
            iArr3[i18] = b1Var == null ? -1 : ((Integer) identityHashMap.get(b1Var)).intValue();
            iArr4[i18] = -1;
            b5.t tVar = tVarArr[i18];
            if (tVar != null) {
                i1 b10 = tVar.b();
                int i19 = 0;
                while (true) {
                    r[] rVarArr2 = this.F;
                    if (i19 < rVarArr2.length) {
                        r rVar2 = rVarArr2[i19];
                        rVar2.f();
                        if (rVar2.U.b(b10) != -1) {
                            iArr4[i18] = i19;
                            break;
                        }
                        i19++;
                    }
                }
            }
            i18++;
        }
        identityHashMap.clear();
        int length2 = tVarArr.length;
        b1[] b1VarArr4 = new b1[length2];
        int length3 = tVarArr.length;
        b1[] b1VarArr5 = new b1[length3];
        int length4 = tVarArr.length;
        b5.t[] tVarArr3 = new b5.t[length4];
        r[] rVarArr3 = new r[this.F.length];
        int i20 = length3;
        int i21 = 0;
        int i22 = 0;
        boolean z14 = false;
        while (i21 < this.F.length) {
            int i23 = length2;
            int i24 = 0;
            while (true) {
                b1VarArr2 = b1VarArr4;
                if (i24 >= tVarArr.length) {
                    break;
                }
                b1VarArr5[i24] = iArr3[i24] == i21 ? b1VarArr[i24] : null;
                tVarArr3[i24] = iArr4[i24] == i21 ? tVarArr[i24] : null;
                i24++;
                b1VarArr4 = b1VarArr2;
            }
            r rVar3 = this.F[i21];
            q0 q0Var2 = rVar3.s;
            int i25 = i21;
            i iVar4 = rVar3.d;
            ArrayList arrayList = rVar3.y;
            rVar3.f();
            int i26 = rVar3.Q;
            ?? r27 = b1VarArr5;
            int i27 = 0;
            while (i27 < length4) {
                n nVar = (n) r27[i27];
                if (nVar == null || (tVarArr3[i27] != null && zArr[i27])) {
                    i17 = i27;
                    q0Var = q0Var2;
                } else {
                    i17 = i27;
                    rVar3.Q--;
                    q0Var = q0Var2;
                    if (nVar.c != -1) {
                        r rVar4 = nVar.b;
                        int i28 = nVar.a;
                        rVar4.f();
                        rVar4.W.getClass();
                        int i29 = rVar4.W[i28];
                        d5.a.i(rVar4.Z[i29]);
                        rVar4.Z[i29] = false;
                        nVar.c = -1;
                    }
                    r27[i17] = 0;
                }
                i27 = i17 + 1;
                q0Var2 = q0Var;
            }
            q0 q0Var3 = q0Var2;
            boolean z15 = true;
            if (!z14) {
                if (!rVar3.e0) {
                    iVar = iVar4;
                } else if (i26 != 0) {
                    iVar = iVar4;
                }
                iVar2 = iVar;
                z10 = false;
                b5.t tVar2 = iVar2.q;
                boolean z16 = z10;
                b5.t tVar3 = tVar2;
                i9 = 0;
                while (i9 < length4) {
                    int i30 = i9;
                    b5.t tVar4 = tVarArr3[i30];
                    if (tVar4 == null) {
                        i16 = length4;
                        tVarArr2 = tVarArr3;
                    } else {
                        i16 = length4;
                        tVarArr2 = tVarArr3;
                        int b11 = rVar3.U.b(tVar4.b());
                        if (b11 == rVar3.X) {
                            iVar2.q = tVar4;
                            tVar3 = tVar4;
                        }
                        if (r27[i30] == 0) {
                            rVar3.Q++;
                            n nVar2 = new n(rVar3, b11);
                            r27[i30] = nVar2;
                            zArr2[i30] = z15;
                            if (rVar3.W != null) {
                                nVar2.b();
                                if (!z16) {
                                    q qVar = rVar3.H[rVar3.W[b11]];
                                    z16 = (qVar.D(j10, true) || qVar.q() == 0) ? false : true;
                                }
                            }
                        }
                    }
                    i9 = i30 + 1;
                    length4 = i16;
                    tVarArr3 = tVarArr2;
                    z15 = true;
                }
                int i31 = length4;
                b5.t[] tVarArr4 = tVarArr3;
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
                        rVar3.F();
                    }
                    int[] iArr5 = iArr4;
                    rVar = rVar3;
                    i13 = i20;
                    iArr2 = iArr5;
                    iArr = iArr3;
                    rVarArr = rVarArr3;
                    i11 = i23;
                    b1VarArr3 = b1VarArr2;
                    i12 = i25;
                    iVar3 = iVar2;
                } else {
                    boolean z17 = true;
                    if (arrayList.isEmpty() || f0.a(tVar3, tVar2)) {
                        iArr = iArr3;
                        rVarArr = rVarArr3;
                        i10 = i20;
                        i11 = i23;
                        b1VarArr3 = b1VarArr2;
                        i12 = i25;
                        iVar3 = iVar2;
                        iArr2 = iArr4;
                        rVar = rVar3;
                    } else {
                        if (rVar3.e0) {
                            iArr = iArr3;
                            rVarArr = rVarArr3;
                            i10 = i20;
                            i11 = i23;
                            b1VarArr3 = b1VarArr2;
                            i12 = i25;
                            iVar3 = iVar2;
                            iArr2 = iArr4;
                            rVar = rVar3;
                        } else {
                            long j11 = j10 < 0 ? -j10 : 0L;
                            k s10 = rVar3.s();
                            b5.t tVar5 = tVar3;
                            iArr = iArr3;
                            rVarArr = rVarArr3;
                            i10 = i20;
                            i11 = i23;
                            b1VarArr3 = b1VarArr2;
                            i12 = i25;
                            iVar3 = iVar2;
                            iArr2 = iArr4;
                            rVar = rVar3;
                            tVar5.m(j10, j11, -9223372036854775807L, rVar3.A, iVar2.a(s10, j10));
                            if (tVar5.n() != iVar3.h.a(s10.d)) {
                                z17 = true;
                            } else {
                                z17 = true;
                            }
                        }
                        rVar.d0 = z17;
                        z11 = true;
                        z12 = true;
                        if (z12) {
                            i13 = i10;
                        } else {
                            rVar.G(j10, z11);
                            i13 = i10;
                            int i32 = 0;
                            while (i32 < i13) {
                                if (r27[i32] != 0) {
                                    zArr2[i32] = z17;
                                }
                                i32++;
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
                for (i14 = 0; i14 < i13; i14++) {
                    ?? r83 = r27[i14];
                    if (r83 != 0) {
                        arrayList2.add((n) r83);
                    }
                }
                rVar.e0 = true;
                i15 = 0;
                z13 = false;
                while (i15 < tVarArr.length) {
                    ?? r72 = r27[i15];
                    int i33 = i12;
                    if (iArr2[i15] == i33) {
                        r72.getClass();
                        r82 = b1VarArr3;
                        r82[i15] = r72;
                        identityHashMap.put(r72, Integer.valueOf(i33));
                        z13 = true;
                    } else {
                        r82 = b1VarArr3;
                        if (iArr[i15] == i33) {
                            d5.a.i(r72 == 0);
                        }
                    }
                    i15++;
                    b1VarArr3 = r82;
                    i12 = i33;
                }
                b1[] b1VarArr6 = b1VarArr3;
                int i34 = i12;
                int i35 = i22;
                if (!z13) {
                    rVarArr[i35] = rVar;
                    i22 = i35 + 1;
                    if (i35 == 0) {
                        iVar3.l = true;
                        if (!z16) {
                            r[] rVarArr4 = this.G;
                            if (rVarArr4.length != 0 && rVar == rVarArr4[0]) {
                            }
                        }
                        ((SparseArray) this.v.b).clear();
                        z14 = true;
                    } else {
                        iVar3.l = i34 < this.H;
                    }
                }
                i21 = i34 + 1;
                b1VarArr4 = b1VarArr6;
                iArr4 = iArr2;
                rVarArr3 = rVarArr;
                b1VarArr5 = r27;
                iArr3 = iArr;
                length4 = i31;
                tVarArr3 = tVarArr4;
                i20 = i13;
                length2 = i11;
            }
            iVar = iVar4;
            iVar2 = iVar;
            z10 = true;
            b5.t tVar22 = iVar2.q;
            boolean z162 = z10;
            b5.t tVar32 = tVar22;
            i9 = 0;
            while (i9 < length4) {
            }
            int i312 = length4;
            b5.t[] tVarArr42 = tVarArr3;
            if (rVar3.Q != 0) {
            }
            ArrayList arrayList22 = rVar.E;
            arrayList22.clear();
            while (i14 < i13) {
            }
            rVar.e0 = true;
            i15 = 0;
            z13 = false;
            while (i15 < tVarArr.length) {
            }
            b1[] b1VarArr62 = b1VarArr3;
            int i342 = i12;
            int i352 = i22;
            if (!z13) {
            }
            i21 = i342 + 1;
            b1VarArr4 = b1VarArr62;
            iArr4 = iArr2;
            rVarArr3 = rVarArr;
            b1VarArr5 = r27;
            iArr3 = iArr;
            length4 = i312;
            tVarArr3 = tVarArr42;
            i20 = i13;
            length2 = i11;
        }
        System.arraycopy(b1VarArr4, 0, b1VarArr, 0, length2);
        r[] rVarArr5 = (r[]) f0.J(i22, rVarArr3);
        this.G = rVarArr5;
        this.w.getClass();
        this.I = new android.support.v4.media.c(rVarArr5, 19);
        return j10;
    }

    @Override // j4.d1
    public final void z(long j10) {
        this.I.z(j10);
    }
}
