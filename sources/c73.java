// default package

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import j$.util.Objects;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class c73 extends rh0 {
    public final HashMap A;
    public mo5 B;
    public rb6 C;
    public final Uri D;
    public a83 E;
    public mx6 F;
    public w0c G;
    public IOException H;
    public Handler I;
    public t63 J;
    public boolean K;
    public long L;
    public long M;
    public long N;
    public int O;
    public long P;
    public int Q;
    public bt6 R;
    public ws6 S;
    public final boolean i;
    public final y73 j;
    public final hi2 k;
    public final kg7 l;
    public final is3 m;
    public final k4f n;
    public final e7a o;
    public final short p;
    public final int q;
    public final kq r;
    public final cx7 s;
    public final ni6 t;
    public final Object u;
    public final SparseArray v;
    public final y63 w;
    public final y63 x;
    public final sz4 y;
    public final ma6 z;

    static {
        ct6.a("media3.exoplayer.dash");
    }

    /* JADX WARN: Type inference failed for: r2v10, types: [y63] */
    /* JADX WARN: Type inference failed for: r2v9, types: [y63] */
    /* JADX WARN: Type inference failed for: r3v1, types: [int, short] */
    public c73(bt6 bt6Var, y73 y73Var, cx7 cx7Var, hi2 hi2Var, kg7 kg7Var, is3 is3Var, k4f k4fVar, long j, long j2) {
        this.R = bt6Var;
        this.S = bt6Var.c;
        Uri uri = bt6Var.b.a;
        this.D = uri;
        this.J = null;
        this.j = y73Var;
        this.s = cx7Var;
        this.k = hi2Var;
        this.m = is3Var;
        this.n = k4fVar;
        this.p = (int) j;
        this.q = (int) j2;
        this.l = kg7Var;
        this.o = new e7a((byte) 3);
        final byte b = 0;
        this.i = false;
        this.r = b(null);
        this.u = new Object();
        this.B = mo5.u(new rb6(uri));
        this.A = new HashMap();
        this.v = new SparseArray();
        this.y = new sz4(this);
        this.P = -9223372036854775807L;
        this.N = -9223372036854775807L;
        this.t = new ni6(this, (byte) 23);
        this.z = new k6d(this, (byte) 24);
        this.w = new Runnable(this) { // from class: y63
            public final /* synthetic */ c73 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b2 = b;
                c73 c73Var = this.b;
                switch (b2) {
                    case 0:
                        c73Var.D();
                        break;
                    default:
                        try {
                            c73Var.z(false);
                            break;
                        } catch (Exception e) {
                            c73Var.H = new IOException(e);
                        }
                }
            }
        };
        final byte b2 = 1;
        this.x = new Runnable(this) { // from class: y63
            public final /* synthetic */ c73 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b22 = b2;
                c73 c73Var = this.b;
                switch (b22) {
                    case 0:
                        c73Var.D();
                        break;
                    default:
                        try {
                            c73Var.z(false);
                            break;
                        } catch (Exception e) {
                            c73Var.H = new IOException(e);
                        }
                }
            }
        };
    }

    public static boolean v(h58 h58Var) {
        List list = h58Var.c;
        for (int i = 0; i < list.size(); i++) {
            int i2 = ((ea) list.get(i)).b;
            if (i2 == 1 || i2 == 2) {
                return true;
            }
        }
        return false;
    }

    public final void A(s13 s13Var, cx7 cx7Var) {
        a83 a83Var = this.E;
        Uri parse = Uri.parse(s13Var.c);
        Map map = Collections.EMPTY_MAP;
        jte.l(parse, "The uri must be set.");
        this.F.v0(new dx7(a83Var, new g83(parse, 1, null, map, 0L, -1L, null, 1), 5, cx7Var), new z63(this), 1);
    }

    public final rb6 B() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = this.A;
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            if (((Long) ((Map.Entry) it.next()).getValue()).longValue() <= elapsedRealtime) {
                it.remove();
            }
        }
        rb6 rb6Var = this.C;
        if (rb6Var != null && !hashMap.containsKey(rb6Var.b)) {
            for (int i = 0; i < this.B.size(); i++) {
                rb6 rb6Var2 = (rb6) this.B.get(i);
                if (rb6Var2.b.equals(this.C.b)) {
                    this.C = rb6Var2;
                    return rb6Var2;
                }
            }
        }
        rb6 rb6Var3 = (rb6) this.B.get(0);
        rb6Var3.getClass();
        long j = Long.MAX_VALUE;
        for (int i2 = 0; i2 < this.B.size(); i2++) {
            rb6 rb6Var4 = (rb6) this.B.get(i2);
            Long l = (Long) hashMap.get(rb6Var4.b);
            if (l == null) {
                this.C = rb6Var4;
                return rb6Var4;
            }
            if (l.longValue() < j) {
                j = l.longValue();
                rb6Var3 = rb6Var4;
            }
        }
        this.C = rb6Var3;
        return rb6Var3;
    }

    public final synchronized void C(ws6 ws6Var) {
        this.S = ws6Var;
    }

    public final void D() {
        rb6 B;
        this.I.removeCallbacks(this.w);
        if (this.F.U()) {
            return;
        }
        if (this.F.Y()) {
            this.K = true;
            return;
        }
        synchronized (this.u) {
            B = B();
        }
        Uri uri = B.a;
        this.K = false;
        Map map = Collections.EMPTY_MAP;
        jte.l(uri, "The uri must be set.");
        dx7 dx7Var = new dx7(this.E, new g83(uri, 1, null, map, 0L, -1L, null, 1), 4, this.s);
        ni6 ni6Var = this.t;
        this.n.getClass();
        this.F.v0(dx7Var, ni6Var, 3);
    }

    @Override // rh0
    public final boolean a(bt6 bt6Var) {
        xs6 xs6Var = i().b;
        xs6Var.getClass();
        xs6 xs6Var2 = bt6Var.b;
        return xs6Var2 != null && xs6Var2.a.equals(xs6Var.a) && xs6Var2.e.equals(xs6Var.e) && Objects.equals(xs6Var2.c, xs6Var.c);
    }

    @Override // rh0
    public final tt6 c(rz6 rz6Var, mx6 mx6Var, long j) {
        int intValue = ((Integer) rz6Var.a).intValue() - this.Q;
        kq b = b(rz6Var);
        fs3 fs3Var = new fs3(this.d.c, 0, rz6Var);
        int i = this.Q + intValue;
        t63 t63Var = this.J;
        w0c w0cVar = this.G;
        long j2 = this.N;
        we8 we8Var = this.g;
        we8Var.getClass();
        x63 x63Var = new x63(i, t63Var, this.o, intValue, this.k, w0cVar, this.m, fs3Var, this.n, b, j2, this.z, mx6Var, this.l, this.y, we8Var);
        this.v.put(i, x63Var);
        return x63Var;
    }

    @Override // rh0
    public final synchronized bt6 i() {
        return this.R;
    }

    @Override // rh0
    public final void k() {
        this.z.d();
    }

    @Override // rh0
    public final void m(w0c w0cVar) {
        this.G = w0cVar;
        Looper myLooper = Looper.myLooper();
        we8 we8Var = this.g;
        we8Var.getClass();
        is3 is3Var = this.m;
        is3Var.w(myLooper, we8Var);
        is3Var.a();
        if (this.i) {
            z(false);
            return;
        }
        this.E = this.j.createDataSource();
        this.F = new mx6("DashMediaSource");
        this.I = hac.q(null);
        D();
    }

    @Override // rh0
    public final void o(tt6 tt6Var) {
        x63 x63Var = (x63) tt6Var;
        ue8 ue8Var = x63Var.y;
        ue8Var.r = true;
        ue8Var.d.removeCallbacksAndMessages(null);
        for (si2 si2Var : x63Var.I) {
            si2Var.C(x63Var);
        }
        x63Var.H = null;
        this.v.remove(x63Var.a);
    }

    @Override // rh0
    public final void q() {
        this.K = false;
        this.E = null;
        mx6 mx6Var = this.F;
        if (mx6Var != null) {
            mx6Var.e0(null);
            this.F = null;
        }
        C(i().c);
        this.L = 0L;
        this.M = 0L;
        synchronized (this.u) {
            this.B = mo5.u(new rb6(this.D));
            this.A.clear();
            this.C = null;
        }
        this.H = null;
        Handler handler = this.I;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.I = null;
        }
        this.N = -9223372036854775807L;
        this.O = 0;
        this.P = -9223372036854775807L;
        this.v.clear();
        e7a e7aVar = this.o;
        ((HashMap) e7aVar.a).clear();
        ((HashMap) e7aVar.b).clear();
        ((HashMap) e7aVar.c).clear();
        this.m.release();
    }

    @Override // rh0
    public final synchronized void t(bt6 bt6Var) {
        this.R = bt6Var;
        this.S = bt6Var.c;
    }

    public final synchronized ws6 u() {
        return this.S;
    }

    public final void w() {
        boolean z;
        mx6 mx6Var = this.F;
        z63 z63Var = new z63(this);
        synchronized (afd.b) {
            z = afd.c;
        }
        if (z) {
            z63Var.a();
            return;
        }
        if (mx6Var == null) {
            mx6Var = new mx6("SntpClient");
        }
        mx6Var.v0(new nf5((byte) 26), new oo8(z63Var, (byte) 14), 1);
    }

    public final void x(dx7 dx7Var, long j, long j2) {
        da6 da6Var = new da6(dx7Var.a, dx7Var.b, j);
        c0b c0bVar = dx7Var.d;
        da6Var.d = c0bVar.c;
        da6Var.e = c0bVar.d;
        da6Var.f = j2;
        da6Var.g = c0bVar.b;
        ea6 ea6Var = new ea6(da6Var);
        this.n.getClass();
        this.r.o(ea6Var, dx7Var.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void y(IOException iOException) {
        ncd.d("DashMediaSource", "Failed to resolve time offset.", iOException);
        this.N = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        z(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x0191, code lost:
    
        r14 = r14;
     */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:253:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x03e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z(boolean z) {
        h58 h58Var;
        long j;
        long j2;
        c73 c73Var;
        long j3;
        boolean z2;
        long j4;
        t63 t63Var;
        boolean z3;
        long j5;
        long j6;
        h58 h58Var2;
        long j7;
        int i;
        long j8;
        ws6 ws6Var;
        float f;
        long j9;
        float f2;
        long j10;
        SparseArray sparseArray;
        int i2;
        boolean z4;
        SparseArray sparseArray2;
        si2[] si2VarArr;
        y63 y63Var = this.x;
        long j11 = this.q;
        SparseArray sparseArray3 = this.v;
        boolean z5 = false;
        int i3 = 0;
        while (i3 < sparseArray3.size()) {
            int keyAt = sparseArray3.keyAt(i3);
            if (keyAt >= this.Q) {
                x63 x63Var = (x63) sparseArray3.valueAt(i3);
                t63 t63Var2 = this.J;
                int i4 = keyAt - this.Q;
                x63Var.L = t63Var2;
                x63Var.M = i4;
                ue8 ue8Var = x63Var.y;
                ue8Var.n = z5;
                ue8Var.f = t63Var2;
                Iterator it = ue8Var.e.entrySet().iterator();
                while (it.hasNext()) {
                    int i5 = i3;
                    if (((Long) ((Map.Entry) it.next()).getKey()).longValue() < ue8Var.f.h) {
                        it.remove();
                    }
                    i3 = i5;
                }
                i2 = i3;
                si2[] si2VarArr2 = x63Var.I;
                if (si2VarArr2 != null) {
                    int length = si2VarArr2.length;
                    int i6 = 0;
                    while (i6 < length) {
                        ib3 ib3Var = si2VarArr2[i6].e;
                        gb3[] gb3VarArr = ib3Var.h;
                        try {
                            ib3Var.j = t63Var2;
                            ib3Var.k = i4;
                            long d = t63Var2.d(i4);
                            ArrayList a = ib3Var.a();
                            sparseArray2 = sparseArray3;
                            si2VarArr = si2VarArr2;
                            int i7 = 0;
                            while (i7 < gb3VarArr.length) {
                                try {
                                    gb3[] gb3VarArr2 = gb3VarArr;
                                    gb3VarArr2[i7] = gb3VarArr2[i7].a(d, (ka9) a.get(ib3Var.i.k(i7)));
                                    i7++;
                                    gb3VarArr = gb3VarArr2;
                                } catch (ji0 e) {
                                    e = e;
                                    ib3Var.l = e;
                                    i6++;
                                    sparseArray3 = sparseArray2;
                                    si2VarArr2 = si2VarArr;
                                }
                            }
                        } catch (ji0 e2) {
                            e = e2;
                            sparseArray2 = sparseArray3;
                            si2VarArr = si2VarArr2;
                        }
                        i6++;
                        sparseArray3 = sparseArray2;
                        si2VarArr2 = si2VarArr;
                    }
                    sparseArray = sparseArray3;
                    z4 = true;
                    x63Var.H.b(x63Var);
                } else {
                    sparseArray = sparseArray3;
                    z4 = true;
                }
                x63Var.N = t63Var2.b(i4).d;
                for (w54 w54Var : x63Var.J) {
                    Iterator it2 = x63Var.N.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            x54 x54Var = (x54) it2.next();
                            if (x54Var.a().equals(w54Var.e.a())) {
                                w54Var.b(x54Var, (t63Var2.d && i4 == t63Var2.l.size() + (-1)) ? z4 : false);
                            }
                        }
                    }
                }
            } else {
                sparseArray = sparseArray3;
                i2 = i3;
            }
            i3 = i2 + 1;
            sparseArray3 = sparseArray;
            z5 = false;
        }
        int i8 = 1;
        h58 b = this.J.b(0);
        int size = this.J.l.size() - 1;
        h58 b2 = this.J.b(size);
        long d2 = this.J.d(size);
        long T = hac.T(hac.E(this.N));
        long d3 = this.J.d(0);
        long j12 = b.b;
        List list = b.c;
        long T2 = hac.T(j12);
        boolean v = v(b);
        int i9 = 0;
        while (true) {
            h58Var = b;
            if (i9 >= list.size()) {
                j = 0;
                break;
            }
            ea eaVar = (ea) list.get(i9);
            j = 0;
            List list2 = eaVar.c;
            int i10 = eaVar.b;
            boolean z6 = (i10 == i8 || i10 == 2) ? false : true;
            if ((!v || !z6) && !list2.isEmpty()) {
                d73 b3 = ((ka9) list2.get(0)).b();
                if (b3 == null || b3.e0(d3, T) == 0) {
                    break;
                } else {
                    T2 = Math.max(T2, b3.e(b3.m(d3, T)) + T2);
                }
            }
            i9++;
            i8 = 1;
            b = h58Var;
        }
        long j13 = b2.b;
        List list3 = b2.c;
        long T3 = hac.T(j13);
        boolean v2 = v(b2);
        long j14 = Long.MAX_VALUE;
        int i11 = 0;
        while (true) {
            if (i11 >= list3.size()) {
                j2 = T2;
                c73Var = this;
                j3 = j14;
                break;
            }
            ea eaVar2 = (ea) list3.get(i11);
            long j15 = T3;
            List list4 = eaVar2.c;
            int i12 = eaVar2.b;
            boolean z7 = (i12 == 1 || i12 == 2) ? false : true;
            if ((v2 && z7) || list4.isEmpty()) {
                j10 = T2;
            } else {
                d73 b4 = ((ka9) list4.get(0)).b();
                if (b4 == null) {
                    j3 = j15 + d2;
                    c73Var = this;
                    j2 = T2;
                    break;
                }
                long e0 = b4.e0(d2, T);
                if (e0 == j) {
                    c73Var = this;
                    j2 = T2;
                    j3 = j15;
                    break;
                } else {
                    j10 = T2;
                    long m = (b4.m(d2, T) + e0) - 1;
                    j14 = Math.min(j14, b4.j(m, d2) + b4.e(m) + j15);
                }
            }
            i11++;
            T3 = j15;
            T2 = j10;
        }
        if (c73Var.J.d) {
            for (int i13 = 0; i13 < list3.size(); i13++) {
                d73 b5 = ((ka9) ((ea) list3.get(i13)).c.get(0)).b();
                if (b5 != null && !b5.T()) {
                }
            }
            z2 = true;
            if (z2) {
                long j16 = c73Var.J.f;
                if (j16 != -9223372036854775807L) {
                    j4 = Math.max(j2, j3 - hac.T(j16));
                    long j17 = j3 - j4;
                    t63Var = c73Var.J;
                    if (t63Var.d) {
                        jte.p(t63Var.a != -9223372036854775807L);
                        long T4 = (T - hac.T(c73Var.J.a)) - j4;
                        ws6 ws6Var2 = c73Var.i().c;
                        long i0 = hac.i0(T4);
                        j5 = -9223372036854775807L;
                        long j18 = ws6Var2.c;
                        if (j18 != -9223372036854775807L) {
                            j8 = Math.min(i0, j18);
                        } else {
                            vs6 vs6Var = c73Var.J.j;
                            if (vs6Var != null) {
                                long j19 = vs6Var.c;
                                if (j19 != -9223372036854775807L) {
                                    j8 = Math.min(i0, j19);
                                }
                            }
                            j8 = i0;
                        }
                        long i02 = hac.i0(T4 - j17);
                        if (i02 < j && j8 > j) {
                            i02 = j;
                        }
                        boolean z8 = z2;
                        long j20 = c73Var.J.c;
                        if (j20 != -9223372036854775807L) {
                            i02 = Math.min(i02 + j20, i0);
                        }
                        long j21 = i02;
                        long j22 = ws6Var2.b;
                        if (j22 != -9223372036854775807L) {
                            j21 = hac.j(j22, j21, i0);
                        } else {
                            vs6 vs6Var2 = c73Var.J.j;
                            if (vs6Var2 != null) {
                                long j23 = vs6Var2.b;
                                if (j23 != -9223372036854775807L) {
                                    j21 = hac.j(j23, j21, i0);
                                }
                            }
                        }
                        long j24 = j21;
                        long j25 = j24 > j8 ? j24 : j8;
                        synchronized (this) {
                            ws6Var = c73Var.S;
                        }
                        long j26 = ws6Var.a;
                        if (j26 == -9223372036854775807L) {
                            t63 t63Var3 = c73Var.J;
                            vs6 vs6Var3 = t63Var3.j;
                            if (vs6Var3 != null) {
                                long j27 = vs6Var3.a;
                                if (j27 != -9223372036854775807L) {
                                    j26 = j27;
                                }
                            }
                            j26 = t63Var3.g;
                            if (j26 == -9223372036854775807L) {
                                j26 = c73Var.p;
                            }
                        }
                        if (j26 < j24) {
                            j26 = j24;
                        }
                        if (j26 > j25) {
                            j26 = hac.j(hac.i0(T4 - Math.min(j11, j17 / 2)), j24, j25);
                        }
                        long j28 = j25;
                        float f3 = ws6Var2.d;
                        if (f3 == -3.4028235E38f) {
                            vs6 vs6Var4 = c73Var.J.j;
                            f3 = vs6Var4 != null ? vs6Var4.d : -3.4028235E38f;
                        }
                        float f4 = ws6Var2.e;
                        if (f4 == -3.4028235E38f) {
                            vs6 vs6Var5 = c73Var.J.j;
                            f4 = vs6Var5 != null ? vs6Var5.e : -3.4028235E38f;
                        }
                        if (f3 == -3.4028235E38f && f4 == -3.4028235E38f) {
                            f = f4;
                            vs6 vs6Var6 = c73Var.J.j;
                            j9 = T4;
                            z3 = z8;
                            if (vs6Var6 == null || vs6Var6.a == -9223372036854775807L) {
                                f3 = 1.0f;
                                f2 = 1.0f;
                                vs6 vs6Var7 = new vs6();
                                vs6Var7.a = j26;
                                vs6Var7.b = j24;
                                vs6Var7.c = j28;
                                vs6Var7.d = f3;
                                vs6Var7.e = f2;
                                c73Var.C(new ws6(vs6Var7));
                                long i03 = hac.i0(j4) + c73Var.J.a;
                                long T5 = j9 - hac.T(c73Var.u().a);
                                long min = Math.min(j11, j17 / 2);
                                j7 = T5 >= min ? min : T5;
                                j6 = i03;
                                h58Var2 = h58Var;
                            }
                        } else {
                            f = f4;
                            j9 = T4;
                            z3 = z8;
                        }
                        f2 = f;
                        vs6 vs6Var72 = new vs6();
                        vs6Var72.a = j26;
                        vs6Var72.b = j24;
                        vs6Var72.c = j28;
                        vs6Var72.d = f3;
                        vs6Var72.e = f2;
                        c73Var.C(new ws6(vs6Var72));
                        long i032 = hac.i0(j4) + c73Var.J.a;
                        long T52 = j9 - hac.T(c73Var.u().a);
                        long min2 = Math.min(j11, j17 / 2);
                        if (T52 >= min2) {
                        }
                        j6 = i032;
                        h58Var2 = h58Var;
                    } else {
                        z3 = z2;
                        j5 = -9223372036854775807L;
                        j6 = -9223372036854775807L;
                        h58Var2 = h58Var;
                        j7 = j;
                    }
                    long T6 = j4 - hac.T(h58Var2.b);
                    t63 t63Var4 = c73Var.J;
                    c73Var.n(new a73(t63Var4.a, j6, c73Var.N, c73Var.Q, T6, j17, j7, t63Var4, c73Var.i(), c73Var.J.d ? c73Var.u() : null));
                    if (c73Var.i) {
                        return;
                    }
                    c73Var.I.removeCallbacks(y63Var);
                    if (z3) {
                        Handler handler = c73Var.I;
                        t63 t63Var5 = c73Var.J;
                        long E = hac.E(c73Var.N);
                        int size2 = t63Var5.l.size() - 1;
                        h58 b6 = t63Var5.b(size2);
                        long j29 = b6.b;
                        List list5 = b6.c;
                        long T7 = hac.T(j29);
                        long d4 = t63Var5.d(size2);
                        long T8 = hac.T(E);
                        long T9 = hac.T(t63Var5.a);
                        long T10 = hac.T(t63Var5.e);
                        if (T10 == j5 || T10 >= 5000000) {
                            T10 = 5000000;
                        }
                        int i14 = 0;
                        while (i14 < list5.size()) {
                            List list6 = ((ea) list5.get(i14)).c;
                            if (list6.isEmpty()) {
                                i = i14;
                            } else {
                                i = i14;
                                d73 b7 = ((ka9) list6.get(0)).b();
                                if (b7 != null) {
                                    long u = (b7.u(d4, T8) + (T9 + T7)) - T8;
                                    if (u > j && (u < T10 - 100000 || (u > T10 && u < T10 + 100000))) {
                                        T10 = u;
                                    }
                                }
                            }
                            i14 = i + 1;
                        }
                        handler.postDelayed(y63Var, bqe.b(T10, 1000L, RoundingMode.CEILING));
                    }
                    if (c73Var.K) {
                        c73Var.D();
                        return;
                    }
                    if (z) {
                        t63 t63Var6 = c73Var.J;
                        if (t63Var6.d) {
                            long j30 = t63Var6.e;
                            if (j30 != j5) {
                                if (j30 == j) {
                                    j30 = 5000;
                                }
                                c73Var.I.postDelayed(c73Var.w, Math.max(j, (c73Var.L + j30) - SystemClock.elapsedRealtime()));
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            j4 = j2;
            long j172 = j3 - j4;
            t63Var = c73Var.J;
            if (t63Var.d) {
            }
            long T62 = j4 - hac.T(h58Var2.b);
            t63 t63Var42 = c73Var.J;
            c73Var.n(new a73(t63Var42.a, j6, c73Var.N, c73Var.Q, T62, j172, j7, t63Var42, c73Var.i(), c73Var.J.d ? c73Var.u() : null));
            if (c73Var.i) {
            }
        }
        z2 = false;
        if (z2) {
        }
        j4 = j2;
        long j1722 = j3 - j4;
        t63Var = c73Var.J;
        if (t63Var.d) {
        }
        long T622 = j4 - hac.T(h58Var2.b);
        t63 t63Var422 = c73Var.J;
        c73Var.n(new a73(t63Var422.a, j6, c73Var.N, c73Var.Q, T622, j1722, j7, t63Var422, c73Var.i(), c73Var.J.d ? c73Var.u() : null));
        if (c73Var.i) {
        }
    }
}
