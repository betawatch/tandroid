package o2;

import android.net.Uri;
import android.text.TextUtils;
import b2.s0;
import b2.t0;
import b2.v;
import b2.v0;
import b2.w;
import e2.k0;
import e2.x;
import e9.l0;
import e9.n0;
import e9.x1;
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
import v7.k7;
import v7.s6;
import v7.u6;
import v7.v6;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class j extends v2.l {
    public static final AtomicInteger c0 = new AtomicInteger();
    public final int E;
    public final g2.h F;
    public final g2.m G;
    public final b H;
    public final boolean I;
    public final boolean J;
    public final k0 K;
    public final c L;
    public final List M;
    public final b2.s N;
    public final q3.h O;
    public final x P;
    public final boolean Q;
    public final boolean R;
    public b S;
    public q T;
    public int U;
    public boolean V;
    public volatile boolean W;
    public boolean X;
    public n0 Y;
    public boolean Z;
    public long a0;
    public boolean b0;
    public final int v;
    public final int w;
    public final Uri x;
    public final boolean y;

    public j(c cVar, g2.h hVar, g2.m mVar, w wVar, boolean z10, g2.h hVar2, g2.m mVar2, boolean z11, Uri uri, List list, int i10, Object obj, long j10, long j11, long j12, int i11, boolean z12, int i12, boolean z13, boolean z14, k0 k0Var, b2.s sVar, b bVar, q3.h hVar3, x xVar, boolean z15, boolean z16, j2.j jVar) {
        super(hVar, mVar, wVar, i10, obj, j10, j11, j12);
        this.Q = z10;
        this.E = i11;
        this.a0 = z12 ? j11 - j10 : -9223372036854775807L;
        this.w = i12;
        this.G = mVar2;
        this.F = hVar2;
        this.V = mVar2 != null;
        this.R = z11;
        this.x = uri;
        this.I = z14;
        this.K = k0Var;
        this.J = z13;
        this.L = cVar;
        this.M = list;
        this.N = sVar;
        this.H = bVar;
        this.O = hVar3;
        this.P = xVar;
        this.b0 = z15;
        this.y = z16;
        l0 l0Var = n0.b;
        this.Y = x1.e;
        this.v = c0.getAndIncrement();
    }

    public static byte[] e(String str) {
        if (s6.c(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    @Override // y2.i
    public final void O() {
        this.W = true;
    }

    @Override // y2.i
    public final void a() {
        b bVar;
        this.T.getClass();
        if (this.S == null && (bVar = this.H) != null) {
            c3.q b10 = bVar.a.b();
            if ((b10 instanceof d0) || (b10 instanceof w3.h)) {
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

    @Override // v2.l
    public final boolean c() {
        throw null;
    }

    public final void d(g2.h hVar, g2.m mVar, boolean z10) {
        g2.m b10;
        boolean z11;
        long j10;
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
                    } catch (EOFException e) {
                        if ((this.d.f & 16384) == 0) {
                            throw e;
                        }
                        this.S.a.d(0L, 0L);
                        j10 = h.d;
                    }
                } catch (Throwable th2) {
                    this.U = (int) (h.d - mVar.e);
                    throw th2;
                }
            } while (this.S.a.f(h, b.f) == 0);
            j10 = h.d;
            this.U = (int) (j10 - mVar.e);
        } catch (Exception unused) {
        } catch (Throwable th3) {
            k7.a(hVar);
            throw th3;
        }
        k7.a(hVar);
    }

    public final int f(int i10) {
        u6.p(!this.b0);
        if (i10 >= this.Y.size()) {
            return 0;
        }
        return ((Integer) this.Y.get(i10)).intValue();
    }

    public final boolean g() {
        return this.a0 != -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:196:0x0098, code lost:
    
        if (((q3.m) r13).b.equals("com.apple.streaming.transportStreamTimestamp") != false) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r2v18, types: [t7.u] */
    /* JADX WARN: Type inference failed for: r2v22, types: [t7.u] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final c3.l h(g2.h hVar, g2.m mVar) {
        int i10;
        long j10;
        long j11;
        long j12;
        b bVar;
        b bVar2;
        int i11;
        k0 k0Var;
        ArrayList arrayList;
        c3.q aVar;
        boolean z10;
        oa.d dVar;
        int i12;
        List singletonList;
        int i13;
        c3.q dVar2;
        s0 s0Var;
        long j13 = this.h;
        k0 k0Var2 = this.K;
        long open = hVar.open(mVar);
        try {
            k0Var2.h(j13, this.I);
            c3.l lVar = new c3.l(hVar, mVar.e, open);
            if (this.S == null) {
                x xVar = this.P;
                lVar.f = 0;
                try {
                    xVar.K(10);
                    lVar.j(xVar.a, 0, 10, false);
                } catch (EOFException unused) {
                    j10 = -9223372036854775807L;
                }
                if (xVar.D() != 4801587) {
                    j11 = -9223372036854775807L;
                    j10 = -9223372036854775807L;
                } else {
                    xVar.O(3);
                    int z11 = xVar.z();
                    int i14 = z11 + 10;
                    byte[] bArr = xVar.a;
                    j10 = -9223372036854775807L;
                    if (i14 > bArr.length) {
                        xVar.K(i14);
                        System.arraycopy(bArr, 0, xVar.a, 0, 10);
                    }
                    lVar.j(xVar.a, 10, z11, false);
                    t0 c10 = this.O.c(z11, xVar.a);
                    if (c10 != null) {
                        s0[] s0VarArr = c10.a;
                        int length = s0VarArr.length;
                        int i15 = 0;
                        while (true) {
                            if (i15 >= length) {
                                s0Var = null;
                                break;
                            }
                            s0 s0Var2 = s0VarArr[i15];
                            if (q3.m.class.isAssignableFrom(s0Var2.getClass())) {
                                s0Var = (s0) q3.m.class.cast(s0Var2);
                            }
                            s0Var = null;
                            if (s0Var != null) {
                                break;
                            }
                            i15++;
                        }
                        q3.m mVar2 = (q3.m) s0Var;
                        if (mVar2 != null) {
                            System.arraycopy(mVar2.c, 0, xVar.a, 0, 8);
                            xVar.N(0);
                            xVar.M(8);
                            j11 = xVar.u() & 8589934591L;
                        }
                    }
                    j11 = j10;
                }
                lVar.f = 0;
                b bVar3 = this.H;
                if (bVar3 != null) {
                    c3.q qVar = bVar3.a;
                    c3.q b10 = qVar.b();
                    u6.p(!((b10 instanceof d0) || (b10 instanceof w3.h)));
                    ?? r11 = qVar.b() == qVar;
                    Class<?> cls = qVar.getClass();
                    if (r11 != true) {
                        throw new IllegalStateException(v6.a("Can't recreate wrapped extractors. Outer type: %s", cls));
                    }
                    if (qVar instanceof t) {
                        dVar2 = new t(bVar3.b.d, bVar3.c, bVar3.d, bVar3.e);
                    } else if (qVar instanceof j4.d) {
                        dVar2 = new j4.d(0);
                    } else if (qVar instanceof j4.a) {
                        dVar2 = new j4.a();
                    } else if (qVar instanceof j4.c) {
                        dVar2 = new j4.c();
                    } else {
                        if (!(qVar instanceof v3.d)) {
                            throw new IllegalStateException("Unexpected extractor type for recreation: ".concat(qVar.getClass().getSimpleName()));
                        }
                        dVar2 = new v3.d(0);
                    }
                    bVar2 = new b(dVar2, bVar3.b, bVar3.c, bVar3.d, bVar3.e);
                    j12 = j13;
                    i10 = 0;
                } else {
                    Uri uri = mVar.a;
                    Map responseHeaders = hVar.getResponseHeaders();
                    c cVar = this.L;
                    cVar.getClass();
                    w wVar = this.d;
                    int a2 = v7.d0.a(wVar.s);
                    List list = (List) responseHeaders.get("Content-Type");
                    int a10 = v7.d0.a((list == null || list.isEmpty()) ? null : (String) list.get(0));
                    int b11 = v7.d0.b(uri);
                    ArrayList arrayList2 = new ArrayList(7);
                    c.a(a2, arrayList2);
                    c.a(a10, arrayList2);
                    c.a(b11, arrayList2);
                    int i16 = 0;
                    for (int i17 = 7; i16 < i17; i17 = 7) {
                        c.a(c.d[i16], arrayList2);
                        i16++;
                    }
                    lVar.f = 0;
                    int i18 = 0;
                    c3.q qVar2 = null;
                    while (true) {
                        int size = arrayList2.size();
                        k0 k0Var3 = this.K;
                        if (i18 >= size) {
                            j12 = j13;
                            i10 = 0;
                            qVar2.getClass();
                            bVar = new b(qVar2, wVar, k0Var3, cVar.a, cVar.b);
                            break;
                        }
                        int intValue = ((Integer) arrayList2.get(i18)).intValue();
                        j12 = j13;
                        if (intValue == 0) {
                            i11 = i18;
                            k0Var = k0Var3;
                            arrayList = arrayList2;
                            aVar = new j4.a();
                        } else if (intValue == 1) {
                            i11 = i18;
                            k0Var = k0Var3;
                            arrayList = arrayList2;
                            aVar = new j4.c();
                        } else if (intValue == 2) {
                            i11 = i18;
                            k0Var = k0Var3;
                            arrayList = arrayList2;
                            aVar = new j4.d(0);
                        } else if (intValue != 7) {
                            List list2 = this.M;
                            oa.d dVar3 = z3.k.D;
                            if (intValue == 8) {
                                i11 = i18;
                                k0Var = k0Var3;
                                arrayList = arrayList2;
                                ?? r22 = cVar.a;
                                boolean z12 = cVar.b;
                                int i19 = cVar.c;
                                if (z12) {
                                    dVar = r22;
                                    i12 = 4;
                                } else {
                                    i12 = 36;
                                    dVar = dVar3;
                                }
                                aVar = new w3.h(dVar, i12 | w3.h.g(i19), k0Var, list2 != null ? list2 : x1.e, null);
                            } else if (intValue == 11) {
                                i11 = i18;
                                arrayList = arrayList2;
                                ?? r23 = cVar.a;
                                boolean z13 = cVar.b;
                                if (list2 != null) {
                                    i13 = 48;
                                    singletonList = list2;
                                } else {
                                    v vVar = new v();
                                    vVar.r = v0.n("application/cea-608");
                                    singletonList = Collections.singletonList(new w(vVar));
                                    i13 = 16;
                                }
                                String str = wVar.k;
                                if (!TextUtils.isEmpty(str)) {
                                    if (v0.b(str, MediaController.AUDIO_MIME_TYPE) == null) {
                                        i13 |= 2;
                                    }
                                    if (v0.b(str, MediaController.VIDEO_MIME_TYPE) == null) {
                                        i13 |= 4;
                                    }
                                }
                                aVar = new d0(2, !z13 ? 1 : 0, !z13 ? dVar3 : r23, k0Var3, new j4.f(i13, singletonList));
                                k0Var = k0Var3;
                            } else if (intValue != 13) {
                                i11 = i18;
                                k0Var = k0Var3;
                                arrayList = arrayList2;
                                aVar = null;
                            } else {
                                i11 = i18;
                                arrayList = arrayList2;
                                aVar = new t(wVar.d, k0Var3, cVar.a, cVar.b);
                                k0Var = k0Var3;
                            }
                        } else {
                            i11 = i18;
                            k0Var = k0Var3;
                            arrayList = arrayList2;
                            aVar = new v3.d(0, 0L);
                        }
                        aVar.getClass();
                        try {
                            z10 = aVar.a(lVar);
                            i10 = 0;
                            lVar.f = 0;
                        } catch (EOFException unused2) {
                            i10 = 0;
                            lVar.f = 0;
                            z10 = false;
                        } catch (Throwable th2) {
                            lVar.f = 0;
                            throw th2;
                        }
                        if (z10) {
                            bVar = new b(aVar, wVar, k0Var, cVar.a, cVar.b);
                            break;
                        }
                        w wVar2 = wVar;
                        if (qVar2 == null && (intValue == a2 || intValue == a10 || intValue == b11 || intValue == 11)) {
                            qVar2 = aVar;
                        }
                        wVar = wVar2;
                        arrayList2 = arrayList;
                        i18 = i11 + 1;
                        j13 = j12;
                    }
                    bVar2 = bVar;
                }
                this.S = bVar2;
                c3.q b12 = bVar2.a.b();
                if ((((b12 instanceof j4.d) || (b12 instanceof j4.a) || (b12 instanceof j4.c) || (b12 instanceof v3.d)) ? 1 : i10) != 0) {
                    q qVar3 = this.T;
                    long b13 = j11 != j10 ? k0Var2.b(j11) : j12;
                    if (qVar3.m0 != b13) {
                        qVar3.m0 = b13;
                        p[] pVarArr = qVar3.L;
                        int length2 = pVarArr.length;
                        for (int i20 = i10; i20 < length2; i20++) {
                            p pVar = pVarArr[i20];
                            if (pVar.H != b13) {
                                pVar.H = b13;
                                pVar.B = true;
                            }
                        }
                    }
                } else {
                    q qVar4 = this.T;
                    if (qVar4.m0 != 0) {
                        qVar4.m0 = 0L;
                        p[] pVarArr2 = qVar4.L;
                        int length3 = pVarArr2.length;
                        for (int i21 = i10; i21 < length3; i21++) {
                            p pVar2 = pVarArr2[i21];
                            if (pVar2.H != 0) {
                                pVar2.H = 0L;
                                pVar2.B = true;
                            }
                        }
                    }
                }
                this.T.N.clear();
                this.S.a.c(this.T);
            } else {
                i10 = 0;
            }
            q qVar5 = this.T;
            b2.s sVar = qVar5.n0;
            b2.s sVar2 = this.N;
            if (!Objects.equals(sVar, sVar2)) {
                qVar5.n0 = sVar2;
                int i22 = i10;
                while (true) {
                    p[] pVarArr3 = qVar5.L;
                    if (i22 >= pVarArr3.length) {
                        break;
                    }
                    if (qVar5.e0[i22]) {
                        p pVar3 = pVarArr3[i22];
                        pVar3.K = sVar2;
                        pVar3.B = true;
                    }
                    i22++;
                }
            }
            return lVar;
        } catch (InterruptedException unused3) {
            throw new InterruptedIOException();
        } catch (TimeoutException e) {
            throw new IOException(e);
        }
    }
}
