package o4;

import android.net.Uri;
import android.text.TextUtils;
import d5.f0;
import d5.g0;
import d5.z;
import h3.s0;
import h3.t0;
import h7.d0;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import p8.l0;
import p8.x;
import w3.c0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class k extends l4.k {
    public static final AtomicInteger X = new AtomicInteger();
    public final int A;
    public final com.google.android.exoplayer2.upstream.m B;
    public final com.google.android.exoplayer2.upstream.q C;
    public final b D;
    public final boolean E;
    public final boolean F;
    public final f0 G;
    public final j H;
    public final List I;
    public final l3.d J;
    public final e4.i K;
    public final z L;
    public final boolean M;
    public final boolean N;
    public b O;
    public r P;
    public int Q;
    public boolean R;
    public volatile boolean S;
    public boolean T;
    public p8.z U;
    public boolean V;
    public boolean W;
    public final int v;
    public final int w;
    public final Uri x;
    public final boolean y;

    public k(j jVar, com.google.android.exoplayer2.upstream.m mVar, com.google.android.exoplayer2.upstream.q qVar, t0 t0Var, boolean z10, com.google.android.exoplayer2.upstream.m mVar2, com.google.android.exoplayer2.upstream.q qVar2, boolean z11, Uri uri, List list, int i10, Object obj, long j10, long j11, long j12, int i11, boolean z12, int i12, boolean z13, boolean z14, f0 f0Var, l3.d dVar, b bVar, e4.i iVar, z zVar, boolean z15, i3.k kVar) {
        super(mVar, qVar, t0Var, i10, obj, j10, j11, j12);
        this.M = z10;
        this.A = i11;
        this.W = z12;
        this.w = i12;
        this.C = qVar2;
        this.B = mVar2;
        this.R = qVar2 != null;
        this.N = z11;
        this.x = uri;
        this.E = z14;
        this.G = f0Var;
        this.F = z13;
        this.H = jVar;
        this.I = list;
        this.J = dVar;
        this.D = bVar;
        this.K = iVar;
        this.L = zVar;
        this.y = z15;
        x xVar = p8.z.b;
        this.U = l0.e;
        this.v = X.getAndIncrement();
    }

    public static byte[] e(String str) {
        if (d0.b(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    @Override // com.google.android.exoplayer2.upstream.n0
    public final void a() {
        b bVar;
        this.P.getClass();
        if (this.O == null && (bVar = this.D) != null) {
            m3.k kVar = bVar.a;
            if ((kVar instanceof c0) || (kVar instanceof u3.i)) {
                this.O = bVar;
                this.R = false;
            }
        }
        com.google.android.exoplayer2.upstream.q qVar = this.C;
        com.google.android.exoplayer2.upstream.m mVar = this.B;
        if (this.R) {
            mVar.getClass();
            qVar.getClass();
            d(mVar, qVar, this.N);
            this.Q = 0;
            this.R = false;
        }
        if (this.S) {
            return;
        }
        if (!this.F) {
            d(this.r, this.b, this.M);
        }
        this.T = !this.S;
    }

    @Override // l4.k
    public final boolean c() {
        throw null;
    }

    public final void d(com.google.android.exoplayer2.upstream.m mVar, com.google.android.exoplayer2.upstream.q qVar, boolean z10) {
        com.google.android.exoplayer2.upstream.q a2;
        long j10;
        if (z10) {
            r0 = this.Q != 0;
            a2 = qVar;
        } else {
            a2 = qVar.a(this.Q);
        }
        try {
            try {
                m3.h g10 = g(mVar, a2);
                if (r0) {
                    g10.t(this.Q);
                }
                while (!this.S && this.O.a.b(g10, b.d) == 0) {
                    try {
                        try {
                        } catch (EOFException e9) {
                            if ((this.d.e & 16384) == 0) {
                                throw e9;
                            }
                            this.O.a.g(0L, 0L);
                            j10 = g10.d;
                        }
                    } catch (Throwable th) {
                        this.Q = (int) (g10.d - qVar.e);
                        throw th;
                    }
                }
                j10 = g10.d;
                this.Q = (int) (j10 - qVar.e);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        } finally {
            g7.l0.a(mVar);
        }
    }

    public final int f(int i10) {
        d5.a.i(!this.y);
        if (i10 >= this.U.size()) {
            return 0;
        }
        return ((Integer) this.U.get(i10)).intValue();
    }

    public final m3.h g(com.google.android.exoplayer2.upstream.m mVar, com.google.android.exoplayer2.upstream.q qVar) {
        int i10;
        int i11;
        long j10;
        long j11;
        b bVar;
        b bVar2;
        int i12;
        ArrayList arrayList;
        List list;
        m3.k aVar;
        boolean z10;
        boolean z11;
        List singletonList;
        int i13;
        m3.k dVar;
        long open = mVar.open(qVar);
        try {
            f0 f0Var = this.G;
            boolean z12 = this.E;
            long j12 = this.h;
            synchronized (f0Var) {
                try {
                    i10 = 1;
                    i11 = 0;
                    d5.a.i(f0Var.a == 9223372036854775806L);
                    if (f0Var.b == -9223372036854775807L) {
                        if (z12) {
                            f0Var.d.set(Long.valueOf(j12));
                        } else {
                            while (f0Var.b == -9223372036854775807L) {
                                f0Var.wait();
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            m3.h hVar = new m3.h(mVar, qVar.e, open);
            if (this.O == null) {
                z zVar = this.L;
                hVar.f = 0;
                try {
                    zVar.z(10);
                    hVar.g(zVar.a, 0, 10, false);
                    if (zVar.t() == 4801587) {
                        zVar.D(3);
                        int q6 = zVar.q();
                        int i14 = q6 + 10;
                        byte[] bArr = zVar.a;
                        if (i14 > bArr.length) {
                            zVar.z(i14);
                            System.arraycopy(bArr, 0, zVar.a, 0, 10);
                        }
                        hVar.g(zVar.a, 10, q6, false);
                        z3.c c10 = this.K.c(q6, zVar.a);
                        if (c10 != null) {
                            for (z3.b bVar3 : c10.a) {
                                if (bVar3 instanceof e4.m) {
                                    e4.m mVar2 = (e4.m) bVar3;
                                    if ("com.apple.streaming.transportStreamTimestamp".equals(mVar2.b)) {
                                        System.arraycopy(mVar2.c, 0, zVar.a, 0, 8);
                                        zVar.C(0);
                                        zVar.B(8);
                                        j10 = zVar.l() & 8589934591L;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                } catch (EOFException unused) {
                }
                j10 = -9223372036854775807L;
                hVar.f = 0;
                b bVar4 = this.D;
                if (bVar4 != null) {
                    f0 f0Var2 = bVar4.c;
                    t0 t0Var = bVar4.b;
                    m3.k kVar = bVar4.a;
                    d5.a.i(!((kVar instanceof c0) || (kVar instanceof u3.i)));
                    m3.k kVar2 = bVar4.a;
                    if (kVar2 instanceof v) {
                        dVar = new v(t0Var.c, f0Var2);
                    } else if (kVar2 instanceof w3.d) {
                        dVar = new w3.d(0);
                    } else if (kVar2 instanceof w3.a) {
                        dVar = new w3.a();
                    } else if (kVar2 instanceof w3.c) {
                        dVar = new w3.c();
                    } else {
                        if (!(kVar2 instanceof t3.d)) {
                            throw new IllegalStateException("Unexpected extractor type for recreation: ".concat(kVar2.getClass().getSimpleName()));
                        }
                        dVar = new t3.d(0);
                    }
                    bVar2 = new b(dVar, t0Var, f0Var2);
                    j11 = -9223372036854775807L;
                } else {
                    j jVar = this.H;
                    Uri uri = qVar.a;
                    t0 t0Var2 = this.d;
                    List list2 = this.I;
                    f0 f0Var3 = this.G;
                    j11 = -9223372036854775807L;
                    Map responseHeaders = mVar.getResponseHeaders();
                    ((c) jVar).getClass();
                    int w10 = d5.a.w(t0Var2.B);
                    List list3 = (List) responseHeaders.get("Content-Type");
                    int w11 = d5.a.w((list3 == null || list3.isEmpty()) ? null : (String) list3.get(0));
                    int x8 = d5.a.x(uri);
                    int[] iArr = c.b;
                    ArrayList arrayList2 = new ArrayList(7);
                    c.a(w10, arrayList2);
                    c.a(w11, arrayList2);
                    c.a(x8, arrayList2);
                    int i15 = 0;
                    for (int i16 = 7; i15 < i16; i16 = 7) {
                        c.a(iArr[i15], arrayList2);
                        i15++;
                    }
                    hVar.f = 0;
                    int i17 = 0;
                    m3.k kVar3 = null;
                    while (true) {
                        if (i17 >= arrayList2.size()) {
                            kVar3.getClass();
                            bVar = new b(kVar3, t0Var2, f0Var3);
                            break;
                        }
                        int intValue = ((Integer) arrayList2.get(i17)).intValue();
                        if (intValue == 0) {
                            i12 = i17;
                            arrayList = arrayList2;
                            list = list2;
                            aVar = new w3.a();
                        } else if (intValue == i10) {
                            i12 = i17;
                            arrayList = arrayList2;
                            list = list2;
                            aVar = new w3.c();
                        } else if (intValue == 2) {
                            i12 = i17;
                            arrayList = arrayList2;
                            list = list2;
                            aVar = new w3.d(0);
                        } else if (intValue != 7) {
                            if (intValue == 8) {
                                i12 = i17;
                                arrayList = arrayList2;
                                z3.c cVar = t0Var2.s;
                                if (cVar != null) {
                                    int i18 = 0;
                                    while (true) {
                                        z3.b[] bVarArr = cVar.a;
                                        z3.c cVar2 = cVar;
                                        if (i18 >= bVarArr.length) {
                                            break;
                                        }
                                        z3.b bVar5 = bVarArr[i18];
                                        if (bVar5 instanceof u) {
                                            z11 = !((u) bVar5).c.isEmpty();
                                            break;
                                        }
                                        i18++;
                                        cVar = cVar2;
                                    }
                                }
                                z11 = false;
                                aVar = new u3.i(z11 ? 4 : 0, f0Var3, list2 != null ? list2 : Collections.EMPTY_LIST, null);
                            } else if (intValue == 11) {
                                if (list2 != null) {
                                    i13 = 48;
                                    singletonList = list2;
                                } else {
                                    s0 s0Var = new s0();
                                    s0Var.o = "application/cea-608";
                                    singletonList = Collections.singletonList(new t0(s0Var));
                                    i13 = 16;
                                }
                                i12 = i17;
                                String str = t0Var2.r;
                                if (TextUtils.isEmpty(str)) {
                                    arrayList = arrayList2;
                                } else {
                                    arrayList = arrayList2;
                                    if (d5.q.a(str, MediaController.AUDIO_MIME_TYPE) == null) {
                                        i13 |= 2;
                                    }
                                    if (d5.q.a(str, MediaController.VIDEO_MIME_TYPE) == null) {
                                        i13 |= 4;
                                    }
                                }
                                aVar = new c0(2, f0Var3, new o0.i(i13, singletonList));
                            } else if (intValue != 13) {
                                i12 = i17;
                                arrayList = arrayList2;
                                list = list2;
                                aVar = null;
                            } else {
                                aVar = new v(t0Var2.c, f0Var3);
                                i12 = i17;
                                arrayList = arrayList2;
                            }
                            list = list2;
                        } else {
                            i12 = i17;
                            arrayList = arrayList2;
                            list = list2;
                            aVar = new t3.d(0, 0L);
                        }
                        aVar.getClass();
                        try {
                            z10 = aVar.f(hVar);
                            i11 = 0;
                            hVar.f = 0;
                        } catch (EOFException unused2) {
                            i11 = 0;
                            hVar.f = 0;
                            z10 = false;
                        } catch (Throwable th2) {
                            hVar.f = 0;
                            throw th2;
                        }
                        if (z10) {
                            bVar = new b(aVar, t0Var2, f0Var3);
                            break;
                        }
                        if (kVar3 == null && (intValue == w10 || intValue == w11 || intValue == x8 || intValue == 11)) {
                            kVar3 = aVar;
                        }
                        list2 = list;
                        i17 = i12 + 1;
                        arrayList2 = arrayList;
                        i10 = 1;
                    }
                    bVar2 = bVar;
                }
                this.O = bVar2;
                m3.k kVar4 = bVar2.a;
                if ((kVar4 instanceof w3.d) || (kVar4 instanceof w3.a) || (kVar4 instanceof w3.c) || (kVar4 instanceof t3.d)) {
                    r rVar = this.P;
                    long b10 = j10 != j11 ? this.G.b(j10) : this.h;
                    if (rVar.h0 != b10) {
                        rVar.h0 = b10;
                        for (q qVar2 : rVar.H) {
                            if (qVar2.F != b10) {
                                qVar2.F = b10;
                                qVar2.z = true;
                            }
                        }
                    }
                } else {
                    r rVar2 = this.P;
                    if (rVar2.h0 != 0) {
                        rVar2.h0 = 0L;
                        for (q qVar3 : rVar2.H) {
                            if (qVar3.F != 0) {
                                qVar3.F = 0L;
                                qVar3.z = true;
                            }
                        }
                    }
                }
                this.P.J.clear();
                this.O.a.c(this.P);
            }
            r rVar3 = this.P;
            l3.d dVar2 = this.J;
            if (!g0.a(rVar3.i0, dVar2)) {
                rVar3.i0 = dVar2;
                while (true) {
                    q[] qVarArr = rVar3.H;
                    if (i11 >= qVarArr.length) {
                        break;
                    }
                    if (rVar3.a0[i11]) {
                        q qVar4 = qVarArr[i11];
                        qVar4.I = dVar2;
                        qVar4.z = true;
                    }
                    i11++;
                }
            }
            return hVar;
        } catch (InterruptedException unused3) {
            throw new InterruptedIOException();
        }
    }

    @Override // com.google.android.exoplayer2.upstream.n0
    public final void l() {
        this.S = true;
    }
}
