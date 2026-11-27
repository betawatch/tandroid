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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class i63 extends rg0 {
    public final HashMap A;
    public po5 B;
    public wb6 C;
    public final Uri D;
    public h73 E;
    public rx6 F;
    public v2c G;
    public IOException H;
    public Handler I;
    public z53 J;
    public boolean K;
    public long L;
    public long M;
    public long N;
    public int O;
    public long P;
    public int Q;
    public ft6 R;
    public at6 S;
    public final boolean i;
    public final f73 j;
    public final qx6 k;
    public final rg7 l;
    public final pr3 m;
    public final z6f n;
    public final u8a o;
    public final short p;
    public final int q;
    public final lp r;
    public final iy7 s;
    public final ri6 t;
    public final Object u;
    public final SparseArray v;
    public final e63 w;
    public final e63 x;
    public final wz4 y;
    public final ra6 z;

    static {
        gt6.a("media3.exoplayer.dash");
    }

    /* JADX WARN: Type inference failed for: r2v10, types: [e63] */
    /* JADX WARN: Type inference failed for: r2v9, types: [e63] */
    /* JADX WARN: Type inference failed for: r3v1, types: [int, short] */
    public i63(ft6 ft6Var, f73 f73Var, iy7 iy7Var, qx6 qx6Var, rg7 rg7Var, pr3 pr3Var, z6f z6fVar, long j, long j2) {
        this.R = ft6Var;
        this.S = ft6Var.c;
        Uri uri = ft6Var.b.a;
        this.D = uri;
        this.J = null;
        this.j = f73Var;
        this.s = iy7Var;
        this.k = qx6Var;
        this.m = pr3Var;
        this.n = z6fVar;
        this.p = (int) j;
        this.q = (int) j2;
        this.l = rg7Var;
        this.o = new u8a((byte) 3);
        final byte b = 0;
        this.i = false;
        this.r = b(null);
        this.u = new Object();
        this.B = po5.u(new wb6(uri));
        this.A = new HashMap();
        this.v = new SparseArray();
        this.y = new wz4(this);
        this.P = -9223372036854775807L;
        this.N = -9223372036854775807L;
        this.t = new ri6(this, (byte) 23);
        this.z = new z8d(this, (byte) 25);
        this.w = new Runnable(this) { // from class: e63
            public final /* synthetic */ i63 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b2 = b;
                i63 i63Var = this.b;
                switch (b2) {
                    case 0:
                        i63Var.D();
                        break;
                    default:
                        try {
                            i63Var.z(false);
                            break;
                        } catch (Exception e) {
                            i63Var.H = new IOException(e);
                        }
                }
            }
        };
        final byte b2 = 1;
        this.x = new Runnable(this) { // from class: e63
            public final /* synthetic */ i63 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b22 = b2;
                i63 i63Var = this.b;
                switch (b22) {
                    case 0:
                        i63Var.D();
                        break;
                    default:
                        try {
                            i63Var.z(false);
                            break;
                        } catch (Exception e) {
                            i63Var.H = new IOException(e);
                        }
                }
            }
        };
    }

    public static boolean v(v68 v68Var) {
        List list = v68Var.c;
        for (int i = 0; i < list.size(); i++) {
            int i2 = ((fa) list.get(i)).b;
            if (i2 == 1 || i2 == 2) {
                return true;
            }
        }
        return false;
    }

    public final void A(j5 j5Var, iy7 iy7Var) {
        h73 h73Var = this.E;
        Uri parse = Uri.parse(j5Var.c);
        Map map = Collections.EMPTY_MAP;
        yve.l(parse, "The uri must be set.");
        this.F.w0(new jy7(h73Var, new n73(parse, 1, null, map, 0L, -1L, null, 1), 5, iy7Var), new f63(this), 1);
    }

    public final wb6 B() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = this.A;
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            if (((Long) ((Map.Entry) it.next()).getValue()).longValue() <= elapsedRealtime) {
                it.remove();
            }
        }
        wb6 wb6Var = this.C;
        if (wb6Var != null && !hashMap.containsKey(wb6Var.b)) {
            for (int i = 0; i < this.B.size(); i++) {
                wb6 wb6Var2 = (wb6) this.B.get(i);
                if (wb6Var2.b.equals(this.C.b)) {
                    this.C = wb6Var2;
                    return wb6Var2;
                }
            }
        }
        wb6 wb6Var3 = (wb6) this.B.get(0);
        wb6Var3.getClass();
        long j = Long.MAX_VALUE;
        for (int i2 = 0; i2 < this.B.size(); i2++) {
            wb6 wb6Var4 = (wb6) this.B.get(i2);
            Long l = (Long) hashMap.get(wb6Var4.b);
            if (l == null) {
                this.C = wb6Var4;
                return wb6Var4;
            }
            if (l.longValue() < j) {
                j = l.longValue();
                wb6Var3 = wb6Var4;
            }
        }
        this.C = wb6Var3;
        return wb6Var3;
    }

    public final synchronized void C(at6 at6Var) {
        this.S = at6Var;
    }

    public final void D() {
        wb6 B;
        this.I.removeCallbacks(this.w);
        if (this.F.U()) {
            return;
        }
        if (this.F.Z()) {
            this.K = true;
            return;
        }
        synchronized (this.u) {
            B = B();
        }
        Uri uri = B.a;
        this.K = false;
        Map map = Collections.EMPTY_MAP;
        yve.l(uri, "The uri must be set.");
        jy7 jy7Var = new jy7(this.E, new n73(uri, 1, null, map, 0L, -1L, null, 1), 4, this.s);
        ri6 ri6Var = this.t;
        this.n.getClass();
        this.F.w0(jy7Var, ri6Var, 3);
    }

    @Override // rg0
    public final boolean a(ft6 ft6Var) {
        bt6 bt6Var = i().b;
        bt6Var.getClass();
        bt6 bt6Var2 = ft6Var.b;
        return bt6Var2 != null && bt6Var2.a.equals(bt6Var.a) && bt6Var2.e.equals(bt6Var.e) && Objects.equals(bt6Var2.c, bt6Var.c);
    }

    @Override // rg0
    public final xt6 c(vz6 vz6Var, rx6 rx6Var, long j) {
        int intValue = ((Integer) vz6Var.a).intValue() - this.Q;
        lp b = b(vz6Var);
        mr3 mr3Var = new mr3(this.d.c, 0, vz6Var);
        int i = this.Q + intValue;
        z53 z53Var = this.J;
        v2c v2cVar = this.G;
        long j2 = this.N;
        ig8 ig8Var = this.g;
        ig8Var.getClass();
        d63 d63Var = new d63(i, z53Var, this.o, intValue, this.k, v2cVar, this.m, mr3Var, this.n, b, j2, this.z, rx6Var, this.l, this.y, ig8Var);
        this.v.put(i, d63Var);
        return d63Var;
    }

    @Override // rg0
    public final synchronized ft6 i() {
        return this.R;
    }

    @Override // rg0
    public final void k() {
        this.z.g();
    }

    @Override // rg0
    public final void m(v2c v2cVar) {
        this.G = v2cVar;
        Looper myLooper = Looper.myLooper();
        ig8 ig8Var = this.g;
        ig8Var.getClass();
        pr3 pr3Var = this.m;
        pr3Var.w(myLooper, ig8Var);
        pr3Var.a();
        if (this.i) {
            z(false);
            return;
        }
        this.E = this.j.createDataSource();
        this.F = new rx6("DashMediaSource");
        this.I = gcc.q(null);
        D();
    }

    @Override // rg0
    public final void o(xt6 xt6Var) {
        d63 d63Var = (d63) xt6Var;
        gg8 gg8Var = d63Var.y;
        gg8Var.r = true;
        gg8Var.d.removeCallbacksAndMessages(null);
        for (wh2 wh2Var : d63Var.I) {
            wh2Var.C(d63Var);
        }
        d63Var.H = null;
        this.v.remove(d63Var.a);
    }

    @Override // rg0
    public final void q() {
        this.K = false;
        this.E = null;
        rx6 rx6Var = this.F;
        if (rx6Var != null) {
            rx6Var.g0(null);
            this.F = null;
        }
        C(i().c);
        this.L = 0L;
        this.M = 0L;
        synchronized (this.u) {
            this.B = po5.u(new wb6(this.D));
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
        u8a u8aVar = this.o;
        ((HashMap) u8aVar.a).clear();
        ((HashMap) u8aVar.b).clear();
        ((HashMap) u8aVar.c).clear();
        this.m.release();
    }

    @Override // rg0
    public final synchronized void t(ft6 ft6Var) {
        this.R = ft6Var;
        this.S = ft6Var.c;
    }

    public final synchronized at6 u() {
        return this.S;
    }

    public final void w() {
        boolean z;
        rx6 rx6Var = this.F;
        f63 f63Var = new f63(this);
        synchronized (rhd.b) {
            z = rhd.c;
        }
        if (z) {
            f63Var.a();
            return;
        }
        if (rx6Var == null) {
            rx6Var = new rx6("SntpClient");
        }
        rx6Var.w0(new qf5((byte) 26), new k09(f63Var, (byte) 11), 1);
    }

    public final void x(jy7 jy7Var, long j, long j2) {
        ia6 ia6Var = new ia6(jy7Var.a, jy7Var.b, j);
        b2b b2bVar = jy7Var.d;
        ia6Var.d = b2bVar.c;
        ia6Var.e = b2bVar.d;
        ia6Var.f = j2;
        ia6Var.g = b2bVar.b;
        ja6 ja6Var = new ja6(ia6Var);
        this.n.getClass();
        this.r.o(ja6Var, jy7Var.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void y(IOException iOException) {
        efd.d("DashMediaSource", "Failed to resolve time offset.", iOException);
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
        v68 v68Var;
        long j;
        long j2;
        i63 i63Var;
        long j3;
        boolean z2;
        long j4;
        z53 z53Var;
        boolean z3;
        long j5;
        long j6;
        v68 v68Var2;
        long j7;
        int i;
        long j8;
        at6 at6Var;
        float f;
        long j9;
        float f2;
        long j10;
        SparseArray sparseArray;
        int i2;
        boolean z4;
        SparseArray sparseArray2;
        wh2[] wh2VarArr;
        e63 e63Var = this.x;
        long j11 = this.q;
        SparseArray sparseArray3 = this.v;
        boolean z5 = false;
        int i3 = 0;
        while (i3 < sparseArray3.size()) {
            int keyAt = sparseArray3.keyAt(i3);
            if (keyAt >= this.Q) {
                d63 d63Var = (d63) sparseArray3.valueAt(i3);
                z53 z53Var2 = this.J;
                int i4 = keyAt - this.Q;
                d63Var.L = z53Var2;
                d63Var.M = i4;
                gg8 gg8Var = d63Var.y;
                gg8Var.n = z5;
                gg8Var.f = z53Var2;
                Iterator it = gg8Var.e.entrySet().iterator();
                while (it.hasNext()) {
                    int i5 = i3;
                    if (((Long) ((Map.Entry) it.next()).getKey()).longValue() < gg8Var.f.h) {
                        it.remove();
                    }
                    i3 = i5;
                }
                i2 = i3;
                wh2[] wh2VarArr2 = d63Var.I;
                if (wh2VarArr2 != null) {
                    int length = wh2VarArr2.length;
                    int i6 = 0;
                    while (i6 < length) {
                        pa3 pa3Var = wh2VarArr2[i6].e;
                        na3[] na3VarArr = pa3Var.h;
                        try {
                            pa3Var.j = z53Var2;
                            pa3Var.k = i4;
                            long d = z53Var2.d(i4);
                            ArrayList a = pa3Var.a();
                            sparseArray2 = sparseArray3;
                            wh2VarArr = wh2VarArr2;
                            int i7 = 0;
                            while (i7 < na3VarArr.length) {
                                try {
                                    na3[] na3VarArr2 = na3VarArr;
                                    na3VarArr2[i7] = na3VarArr2[i7].a(d, (ub9) a.get(pa3Var.i.j(i7)));
                                    i7++;
                                    na3VarArr = na3VarArr2;
                                } catch (kh0 e) {
                                    e = e;
                                    pa3Var.l = e;
                                    i6++;
                                    sparseArray3 = sparseArray2;
                                    wh2VarArr2 = wh2VarArr;
                                }
                            }
                        } catch (kh0 e2) {
                            e = e2;
                            sparseArray2 = sparseArray3;
                            wh2VarArr = wh2VarArr2;
                        }
                        i6++;
                        sparseArray3 = sparseArray2;
                        wh2VarArr2 = wh2VarArr;
                    }
                    sparseArray = sparseArray3;
                    z4 = true;
                    d63Var.H.f(d63Var);
                } else {
                    sparseArray = sparseArray3;
                    z4 = true;
                }
                d63Var.N = z53Var2.b(i4).d;
                for (h54 h54Var : d63Var.J) {
                    Iterator it2 = d63Var.N.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            i54 i54Var = (i54) it2.next();
                            if (i54Var.a().equals(h54Var.e.a())) {
                                h54Var.b(i54Var, (z53Var2.d && i4 == z53Var2.l.size() + (-1)) ? z4 : false);
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
        v68 b = this.J.b(0);
        int size = this.J.l.size() - 1;
        v68 b2 = this.J.b(size);
        long d2 = this.J.d(size);
        long T = gcc.T(gcc.E(this.N));
        long d3 = this.J.d(0);
        long j12 = b.b;
        List list = b.c;
        long T2 = gcc.T(j12);
        boolean v = v(b);
        int i9 = 0;
        while (true) {
            v68Var = b;
            if (i9 >= list.size()) {
                j = 0;
                break;
            }
            fa faVar = (fa) list.get(i9);
            j = 0;
            List list2 = faVar.c;
            int i10 = faVar.b;
            boolean z6 = (i10 == i8 || i10 == 2) ? false : true;
            if ((!v || !z6) && !list2.isEmpty()) {
                j63 b3 = ((ub9) list2.get(0)).b();
                if (b3 == null || b3.a0(d3, T) == 0) {
                    break;
                } else {
                    T2 = Math.max(T2, b3.f(b3.r(d3, T)) + T2);
                }
            }
            i9++;
            i8 = 1;
            b = v68Var;
        }
        long j13 = b2.b;
        List list3 = b2.c;
        long T3 = gcc.T(j13);
        boolean v2 = v(b2);
        long j14 = Long.MAX_VALUE;
        int i11 = 0;
        while (true) {
            if (i11 >= list3.size()) {
                j2 = T2;
                i63Var = this;
                j3 = j14;
                break;
            }
            fa faVar2 = (fa) list3.get(i11);
            long j15 = T3;
            List list4 = faVar2.c;
            int i12 = faVar2.b;
            boolean z7 = (i12 == 1 || i12 == 2) ? false : true;
            if ((v2 && z7) || list4.isEmpty()) {
                j10 = T2;
            } else {
                j63 b4 = ((ub9) list4.get(0)).b();
                if (b4 == null) {
                    j3 = j15 + d2;
                    i63Var = this;
                    j2 = T2;
                    break;
                }
                long a0 = b4.a0(d2, T);
                if (a0 == j) {
                    i63Var = this;
                    j2 = T2;
                    j3 = j15;
                    break;
                } else {
                    j10 = T2;
                    long r = (b4.r(d2, T) + a0) - 1;
                    j14 = Math.min(j14, b4.j(r, d2) + b4.f(r) + j15);
                }
            }
            i11++;
            T3 = j15;
            T2 = j10;
        }
        if (i63Var.J.d) {
            for (int i13 = 0; i13 < list3.size(); i13++) {
                j63 b5 = ((ub9) ((fa) list3.get(i13)).c.get(0)).b();
                if (b5 != null && !b5.R()) {
                }
            }
            z2 = true;
            if (z2) {
                long j16 = i63Var.J.f;
                if (j16 != -9223372036854775807L) {
                    j4 = Math.max(j2, j3 - gcc.T(j16));
                    long j17 = j3 - j4;
                    z53Var = i63Var.J;
                    if (z53Var.d) {
                        yve.p(z53Var.a != -9223372036854775807L);
                        long T4 = (T - gcc.T(i63Var.J.a)) - j4;
                        at6 at6Var2 = i63Var.i().c;
                        long i0 = gcc.i0(T4);
                        j5 = -9223372036854775807L;
                        long j18 = at6Var2.c;
                        if (j18 != -9223372036854775807L) {
                            j8 = Math.min(i0, j18);
                        } else {
                            zs6 zs6Var = i63Var.J.j;
                            if (zs6Var != null) {
                                long j19 = zs6Var.c;
                                if (j19 != -9223372036854775807L) {
                                    j8 = Math.min(i0, j19);
                                }
                            }
                            j8 = i0;
                        }
                        long i02 = gcc.i0(T4 - j17);
                        if (i02 < j && j8 > j) {
                            i02 = j;
                        }
                        boolean z8 = z2;
                        long j20 = i63Var.J.c;
                        if (j20 != -9223372036854775807L) {
                            i02 = Math.min(i02 + j20, i0);
                        }
                        long j21 = i02;
                        long j22 = at6Var2.b;
                        if (j22 != -9223372036854775807L) {
                            j21 = gcc.j(j22, j21, i0);
                        } else {
                            zs6 zs6Var2 = i63Var.J.j;
                            if (zs6Var2 != null) {
                                long j23 = zs6Var2.b;
                                if (j23 != -9223372036854775807L) {
                                    j21 = gcc.j(j23, j21, i0);
                                }
                            }
                        }
                        long j24 = j21;
                        long j25 = j24 > j8 ? j24 : j8;
                        synchronized (this) {
                            at6Var = i63Var.S;
                        }
                        long j26 = at6Var.a;
                        if (j26 == -9223372036854775807L) {
                            z53 z53Var3 = i63Var.J;
                            zs6 zs6Var3 = z53Var3.j;
                            if (zs6Var3 != null) {
                                long j27 = zs6Var3.a;
                                if (j27 != -9223372036854775807L) {
                                    j26 = j27;
                                }
                            }
                            j26 = z53Var3.g;
                            if (j26 == -9223372036854775807L) {
                                j26 = i63Var.p;
                            }
                        }
                        if (j26 < j24) {
                            j26 = j24;
                        }
                        if (j26 > j25) {
                            j26 = gcc.j(gcc.i0(T4 - Math.min(j11, j17 / 2)), j24, j25);
                        }
                        long j28 = j25;
                        float f3 = at6Var2.d;
                        if (f3 == -3.4028235E38f) {
                            zs6 zs6Var4 = i63Var.J.j;
                            f3 = zs6Var4 != null ? zs6Var4.d : -3.4028235E38f;
                        }
                        float f4 = at6Var2.e;
                        if (f4 == -3.4028235E38f) {
                            zs6 zs6Var5 = i63Var.J.j;
                            f4 = zs6Var5 != null ? zs6Var5.e : -3.4028235E38f;
                        }
                        if (f3 == -3.4028235E38f && f4 == -3.4028235E38f) {
                            f = f4;
                            zs6 zs6Var6 = i63Var.J.j;
                            j9 = T4;
                            z3 = z8;
                            if (zs6Var6 == null || zs6Var6.a == -9223372036854775807L) {
                                f3 = 1.0f;
                                f2 = 1.0f;
                                zs6 zs6Var7 = new zs6();
                                zs6Var7.a = j26;
                                zs6Var7.b = j24;
                                zs6Var7.c = j28;
                                zs6Var7.d = f3;
                                zs6Var7.e = f2;
                                i63Var.C(new at6(zs6Var7));
                                long i03 = gcc.i0(j4) + i63Var.J.a;
                                long T5 = j9 - gcc.T(i63Var.u().a);
                                long min = Math.min(j11, j17 / 2);
                                j7 = T5 >= min ? min : T5;
                                j6 = i03;
                                v68Var2 = v68Var;
                            }
                        } else {
                            f = f4;
                            j9 = T4;
                            z3 = z8;
                        }
                        f2 = f;
                        zs6 zs6Var72 = new zs6();
                        zs6Var72.a = j26;
                        zs6Var72.b = j24;
                        zs6Var72.c = j28;
                        zs6Var72.d = f3;
                        zs6Var72.e = f2;
                        i63Var.C(new at6(zs6Var72));
                        long i032 = gcc.i0(j4) + i63Var.J.a;
                        long T52 = j9 - gcc.T(i63Var.u().a);
                        long min2 = Math.min(j11, j17 / 2);
                        if (T52 >= min2) {
                        }
                        j6 = i032;
                        v68Var2 = v68Var;
                    } else {
                        z3 = z2;
                        j5 = -9223372036854775807L;
                        j6 = -9223372036854775807L;
                        v68Var2 = v68Var;
                        j7 = j;
                    }
                    long T6 = j4 - gcc.T(v68Var2.b);
                    z53 z53Var4 = i63Var.J;
                    i63Var.n(new g63(z53Var4.a, j6, i63Var.N, i63Var.Q, T6, j17, j7, z53Var4, i63Var.i(), i63Var.J.d ? i63Var.u() : null));
                    if (i63Var.i) {
                        return;
                    }
                    i63Var.I.removeCallbacks(e63Var);
                    if (z3) {
                        Handler handler = i63Var.I;
                        z53 z53Var5 = i63Var.J;
                        long E = gcc.E(i63Var.N);
                        int size2 = z53Var5.l.size() - 1;
                        v68 b6 = z53Var5.b(size2);
                        long j29 = b6.b;
                        List list5 = b6.c;
                        long T7 = gcc.T(j29);
                        long d4 = z53Var5.d(size2);
                        long T8 = gcc.T(E);
                        long T9 = gcc.T(z53Var5.a);
                        long T10 = gcc.T(z53Var5.e);
                        if (T10 == j5 || T10 >= 5000000) {
                            T10 = 5000000;
                        }
                        int i14 = 0;
                        while (i14 < list5.size()) {
                            List list6 = ((fa) list5.get(i14)).c;
                            if (list6.isEmpty()) {
                                i = i14;
                            } else {
                                i = i14;
                                j63 b7 = ((ub9) list6.get(0)).b();
                                if (b7 != null) {
                                    long v3 = (b7.v(d4, T8) + (T9 + T7)) - T8;
                                    if (v3 > j && (v3 < T10 - 100000 || (v3 > T10 && v3 < T10 + 100000))) {
                                        T10 = v3;
                                    }
                                }
                            }
                            i14 = i + 1;
                        }
                        handler.postDelayed(e63Var, qse.b(T10, 1000L, RoundingMode.CEILING));
                    }
                    if (i63Var.K) {
                        i63Var.D();
                        return;
                    }
                    if (z) {
                        z53 z53Var6 = i63Var.J;
                        if (z53Var6.d) {
                            long j30 = z53Var6.e;
                            if (j30 != j5) {
                                if (j30 == j) {
                                    j30 = 5000;
                                }
                                i63Var.I.postDelayed(i63Var.w, Math.max(j, (i63Var.L + j30) - SystemClock.elapsedRealtime()));
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
            z53Var = i63Var.J;
            if (z53Var.d) {
            }
            long T62 = j4 - gcc.T(v68Var2.b);
            z53 z53Var42 = i63Var.J;
            i63Var.n(new g63(z53Var42.a, j6, i63Var.N, i63Var.Q, T62, j172, j7, z53Var42, i63Var.i(), i63Var.J.d ? i63Var.u() : null));
            if (i63Var.i) {
            }
        }
        z2 = false;
        if (z2) {
        }
        j4 = j2;
        long j1722 = j3 - j4;
        z53Var = i63Var.J;
        if (z53Var.d) {
        }
        long T622 = j4 - gcc.T(v68Var2.b);
        z53 z53Var422 = i63Var.J;
        i63Var.n(new g63(z53Var422.a, j6, i63Var.N, i63Var.Q, T622, j1722, j7, z53Var422, i63Var.i(), i63Var.J.d ? i63Var.u() : null));
        if (i63Var.i) {
        }
    }
}
