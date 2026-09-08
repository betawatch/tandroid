package o2;

import android.net.Uri;
import android.text.TextUtils;
import b2.o0;
import b2.p0;
import b2.r0;
import e2.b0;
import e2.v;
import e9.a1;
import e9.g0;
import e9.i0;
import j$.util.Objects;
import j4.d0;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.MediaController;
import v7.m7;
import v7.r6;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class j extends v2.k {
    public static final AtomicInteger c0 = new AtomicInteger();
    public final int E;
    public final g2.h F;
    public final g2.m G;
    public final b H;
    public final boolean I;
    public final boolean J;
    public final b0 K;
    public final c L;
    public final List M;
    public final b2.o N;
    public final q3.i O;
    public final v P;
    public final boolean Q;
    public final boolean R;
    public b S;
    public q T;
    public int U;
    public boolean V;
    public volatile boolean W;
    public boolean X;
    public i0 Y;
    public boolean Z;
    public long a0;
    public boolean b0;
    public final int v;
    public final int w;
    public final Uri x;
    public final boolean y;

    public j(c cVar, g2.h hVar, g2.m mVar, b2.s sVar, boolean z10, g2.h hVar2, g2.m mVar2, boolean z11, Uri uri, List list, int i10, Object obj, long j3, long j10, long j11, int i11, boolean z12, int i12, boolean z13, boolean z14, b0 b0Var, b2.o oVar, b bVar, q3.i iVar, v vVar, boolean z15, boolean z16, j2.k kVar) {
        super(hVar, mVar, sVar, i10, obj, j3, j10, j11);
        this.Q = z10;
        this.E = i11;
        this.a0 = z12 ? j10 - j3 : -9223372036854775807L;
        this.w = i12;
        this.G = mVar2;
        this.F = hVar2;
        this.V = mVar2 != null;
        this.R = z11;
        this.x = uri;
        this.I = z14;
        this.K = b0Var;
        this.J = z13;
        this.L = cVar;
        this.M = list;
        this.N = oVar;
        this.H = bVar;
        this.O = iVar;
        this.P = vVar;
        this.b0 = z15;
        this.y = z16;
        g0 g0Var = i0.b;
        this.Y = a1.e;
        this.v = c0.getAndIncrement();
    }

    public static byte[] e(String str) {
        if (r6.b(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    @Override // y2.j
    public final void W() {
        this.W = true;
    }

    @Override // y2.j
    public final void a() {
        b bVar;
        this.T.getClass();
        if (this.S == null && (bVar = this.H) != null) {
            c3.o c10 = bVar.a.c();
            if ((c10 instanceof d0) || (c10 instanceof w3.h)) {
                this.S = this.H;
                this.V = false;
            }
        }
        g2.m mVar = this.G;
        g2.h hVar = this.F;
        if (this.V) {
            hVar.getClass();
            mVar.getClass();
            d(hVar, mVar, this.R);
            this.U = 0;
            this.V = false;
        }
        if (this.W) {
            return;
        }
        if (!this.J) {
            d(this.r, this.b, this.Q);
        }
        this.X = !this.W;
    }

    @Override // v2.k
    public final boolean c() {
        throw null;
    }

    public final void d(g2.h hVar, g2.m mVar, boolean z10) {
        g2.m b10;
        boolean z11;
        long j3;
        if (z10) {
            z11 = this.U != 0;
            b10 = mVar;
        } else {
            b10 = mVar.b(this.U);
            z11 = false;
        }
        try {
            c3.l h = h(hVar, b10);
            if (z11) {
                h.i(this.U, false);
            }
            do {
                try {
                    try {
                        if (this.W) {
                            break;
                        }
                    } catch (EOFException e7) {
                        if ((this.d.f & 16384) == 0) {
                            throw e7;
                        }
                        this.S.a.h(0L, 0L);
                        j3 = h.d;
                    }
                } catch (Throwable th2) {
                    this.U = (int) (h.d - mVar.e);
                    throw th2;
                }
            } while (this.S.a.m(h, b.f) == 0);
            j3 = h.d;
            this.U = (int) (j3 - mVar.e);
        } catch (Exception unused) {
        } catch (Throwable th3) {
            m7.a(hVar);
            throw th3;
        }
        m7.a(hVar);
    }

    public final int f(int i10) {
        e2.d.g(!this.b0);
        if (i10 >= this.Y.size()) {
            return 0;
        }
        return ((Integer) this.Y.get(i10)).intValue();
    }

    public final boolean g() {
        return this.a0 != -9223372036854775807L;
    }

    public final c3.l h(g2.h hVar, g2.m mVar) {
        long j3;
        long j10;
        long j11;
        b bVar;
        int i10;
        b0 b0Var;
        ArrayList arrayList;
        c3.o aVar;
        boolean z10;
        z3.k kVar;
        boolean z11;
        z3.k kVar2;
        List singletonList;
        int i11;
        c3.o dVar;
        long j12 = this.h;
        b0 b0Var2 = this.K;
        long open = hVar.open(mVar);
        try {
            b0Var2.h(j12, this.I);
            c3.l lVar = new c3.l(hVar, mVar.e, open);
            if (this.S == null) {
                v vVar = this.P;
                lVar.f = 0;
                try {
                    vVar.G(10);
                    lVar.j(vVar.a, 0, 10, false);
                } catch (EOFException unused) {
                    j3 = -9223372036854775807L;
                }
                if (vVar.A() != 4801587) {
                    j10 = -9223372036854775807L;
                    j3 = -9223372036854775807L;
                } else {
                    vVar.K(3);
                    int w10 = vVar.w();
                    int i12 = w10 + 10;
                    byte[] bArr = vVar.a;
                    j3 = -9223372036854775807L;
                    if (i12 > bArr.length) {
                        vVar.G(i12);
                        System.arraycopy(bArr, 0, vVar.a, 0, 10);
                    }
                    lVar.j(vVar.a, 10, w10, false);
                    p0 c10 = this.O.c(w10, vVar.a);
                    if (c10 != null) {
                        for (o0 o0Var : c10.a) {
                            if (o0Var instanceof q3.n) {
                                q3.n nVar = (q3.n) o0Var;
                                if ("com.apple.streaming.transportStreamTimestamp".equals(nVar.b)) {
                                    System.arraycopy(nVar.c, 0, vVar.a, 0, 8);
                                    vVar.J(0);
                                    vVar.I(8);
                                    j10 = vVar.r() & 8589934591L;
                                    break;
                                }
                            }
                        }
                    }
                    j10 = j3;
                }
                lVar.f = 0;
                b bVar2 = this.H;
                if (bVar2 == null) {
                    Uri uri = mVar.a;
                    Map responseHeaders = hVar.getResponseHeaders();
                    c cVar = this.L;
                    cVar.getClass();
                    b2.s sVar = this.d;
                    int a2 = v7.g0.a(sVar.r);
                    List list = (List) responseHeaders.get("Content-Type");
                    int a10 = v7.g0.a((list == null || list.isEmpty()) ? null : (String) list.get(0));
                    int b10 = v7.g0.b(uri);
                    ArrayList arrayList2 = new ArrayList(7);
                    c.a(a2, arrayList2);
                    c.a(a10, arrayList2);
                    c.a(b10, arrayList2);
                    int i13 = 0;
                    for (int i14 = 7; i13 < i14; i14 = 7) {
                        c.a(c.c[i13], arrayList2);
                        i13++;
                    }
                    lVar.f = 0;
                    int i15 = 0;
                    c3.o oVar = null;
                    while (true) {
                        int size = arrayList2.size();
                        b0 b0Var3 = this.K;
                        if (i15 >= size) {
                            j11 = j12;
                            oVar.getClass();
                            bVar = new b(oVar, sVar, b0Var3, cVar.a, cVar.b);
                            break;
                        }
                        int intValue = ((Integer) arrayList2.get(i15)).intValue();
                        j11 = j12;
                        if (intValue == 0) {
                            i10 = i15;
                            b0Var = b0Var3;
                            arrayList = arrayList2;
                            aVar = new j4.a();
                        } else if (intValue == 1) {
                            i10 = i15;
                            b0Var = b0Var3;
                            arrayList = arrayList2;
                            aVar = new j4.c();
                        } else if (intValue == 2) {
                            i10 = i15;
                            b0Var = b0Var3;
                            arrayList = arrayList2;
                            aVar = new j4.d(0);
                        } else if (intValue != 7) {
                            List list2 = this.M;
                            z3.k kVar3 = z3.k.D;
                            if (intValue == 8) {
                                i10 = i15;
                                b0Var = b0Var3;
                                arrayList = arrayList2;
                                z3.k kVar4 = cVar.a;
                                boolean z12 = cVar.b;
                                p0 p0Var = sVar.l;
                                if (p0Var != null) {
                                    int i16 = 0;
                                    z3.k kVar5 = kVar4;
                                    while (true) {
                                        o0[] o0VarArr = p0Var.a;
                                        kVar = kVar5;
                                        if (i16 >= o0VarArr.length) {
                                            break;
                                        }
                                        o0 o0Var2 = o0VarArr[i16];
                                        if (o0Var2 instanceof s) {
                                            z11 = !((s) o0Var2).c.isEmpty();
                                            break;
                                        }
                                        i16++;
                                        kVar5 = kVar;
                                    }
                                } else {
                                    kVar = kVar4;
                                }
                                z11 = false;
                                int i17 = z11 ? 4 : 0;
                                if (z12) {
                                    kVar2 = kVar;
                                } else {
                                    i17 |= 32;
                                    kVar2 = kVar3;
                                }
                                aVar = new w3.h(kVar2, i17, b0Var, list2 != null ? list2 : a1.e, null);
                            } else if (intValue == 11) {
                                i10 = i15;
                                arrayList = arrayList2;
                                z3.k kVar6 = cVar.a;
                                boolean z13 = cVar.b;
                                if (list2 != null) {
                                    singletonList = list2;
                                    i11 = 48;
                                } else {
                                    b2.r rVar = new b2.r();
                                    rVar.q = r0.n("application/cea-608");
                                    singletonList = Collections.singletonList(new b2.s(rVar));
                                    i11 = 16;
                                }
                                String str = sVar.k;
                                if (!TextUtils.isEmpty(str)) {
                                    if (r0.b(str, MediaController.AUDIO_MIME_TYPE) == null) {
                                        i11 |= 2;
                                    }
                                    if (r0.b(str, MediaController.VIDEO_MIME_TYPE) == null) {
                                        i11 |= 4;
                                    }
                                }
                                aVar = new d0(2, !z13 ? 1 : 0, !z13 ? kVar3 : kVar6, b0Var3, new j4.f(i11, singletonList));
                                b0Var = b0Var3;
                            } else if (intValue != 13) {
                                i10 = i15;
                                b0Var = b0Var3;
                                arrayList = arrayList2;
                                aVar = null;
                            } else {
                                i10 = i15;
                                arrayList = arrayList2;
                                aVar = new t(sVar.d, b0Var3, cVar.a, cVar.b);
                                b0Var = b0Var3;
                            }
                        } else {
                            i10 = i15;
                            b0Var = b0Var3;
                            arrayList = arrayList2;
                            aVar = new v3.d(0, 0L);
                        }
                        aVar.getClass();
                        try {
                            z10 = aVar.b(lVar);
                            lVar.f = 0;
                        } catch (EOFException unused2) {
                            lVar.f = 0;
                            z10 = false;
                        } catch (Throwable th2) {
                            lVar.f = 0;
                            throw th2;
                        }
                        if (z10) {
                            bVar = new b(aVar, sVar, b0Var, cVar.a, cVar.b);
                            break;
                        }
                        b2.s sVar2 = sVar;
                        if (oVar == null && (intValue == a2 || intValue == a10 || intValue == b10 || intValue == 11)) {
                            oVar = aVar;
                        }
                        i15 = i10 + 1;
                        sVar = sVar2;
                        j12 = j11;
                        arrayList2 = arrayList;
                    }
                } else {
                    c3.o oVar2 = bVar2.a;
                    c3.o c11 = oVar2.c();
                    e2.d.g(!((c11 instanceof d0) || (c11 instanceof w3.h)));
                    e2.d.f("Can't recreate wrapped extractors. Outer type: " + oVar2.getClass(), oVar2.c() == oVar2);
                    if (oVar2 instanceof t) {
                        dVar = new t(bVar2.b.d, bVar2.c, bVar2.d, bVar2.e);
                    } else if (oVar2 instanceof j4.d) {
                        dVar = new j4.d(0);
                    } else if (oVar2 instanceof j4.a) {
                        dVar = new j4.a();
                    } else if (oVar2 instanceof j4.c) {
                        dVar = new j4.c();
                    } else {
                        if (!(oVar2 instanceof v3.d)) {
                            throw new IllegalStateException("Unexpected extractor type for recreation: ".concat(oVar2.getClass().getSimpleName()));
                        }
                        dVar = new v3.d(0);
                    }
                    bVar = new b(dVar, bVar2.b, bVar2.c, bVar2.d, bVar2.e);
                    j11 = j12;
                }
                b bVar3 = bVar;
                this.S = bVar3;
                c3.o c12 = bVar3.a.c();
                if ((c12 instanceof j4.d) || (c12 instanceof j4.a) || (c12 instanceof j4.c) || (c12 instanceof v3.d)) {
                    q qVar = this.T;
                    long b11 = j10 != j3 ? b0Var2.b(j10) : j11;
                    if (qVar.l0 != b11) {
                        qVar.l0 = b11;
                        for (p pVar : qVar.L) {
                            if (pVar.F != b11) {
                                pVar.F = b11;
                                pVar.z = true;
                            }
                        }
                    }
                } else {
                    q qVar2 = this.T;
                    if (qVar2.l0 != 0) {
                        qVar2.l0 = 0L;
                        for (p pVar2 : qVar2.L) {
                            if (pVar2.F != 0) {
                                pVar2.F = 0L;
                                pVar2.z = true;
                            }
                        }
                    }
                }
                this.T.N.clear();
                this.S.a.g(this.T);
            }
            q qVar3 = this.T;
            b2.o oVar3 = qVar3.m0;
            b2.o oVar4 = this.N;
            if (!Objects.equals(oVar3, oVar4)) {
                qVar3.m0 = oVar4;
                int i18 = 0;
                while (true) {
                    p[] pVarArr = qVar3.L;
                    if (i18 >= pVarArr.length) {
                        break;
                    }
                    if (qVar3.e0[i18]) {
                        p pVar3 = pVarArr[i18];
                        pVar3.I = oVar4;
                        pVar3.z = true;
                    }
                    i18++;
                }
            }
            return lVar;
        } catch (InterruptedException unused3) {
            throw new InterruptedIOException();
        } catch (TimeoutException e7) {
            throw new IOException(e7);
        }
    }
}
