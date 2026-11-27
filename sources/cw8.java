// default package

import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class cw8 implements xt6, g84, la6, pa6, xs9 {
    public static final Map l0;
    public static final ko4 m0;
    public final rx6 E;
    public final or2 F;
    public final wv8 G;
    public final wv8 H;
    public final Handler I;
    public wt6 J;
    public rl5 K;
    public yv8[] L;
    public ys9[] M;
    public bw8[] N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public u8a S;
    public zy9 T;
    public long U;
    public boolean V;
    public byte W;
    public final long X = Long.MIN_VALUE;
    public boolean Y;
    public boolean Z;
    public final Uri a;
    public boolean a0;
    public final h73 b;
    public boolean b0;
    public final pr3 c;
    public int c0;
    public final z6f d;
    public final ArrayList d0;
    public final lp e;
    public boolean e0;
    public final mr3 f;
    public long f0;
    public long g0;
    public final ew8 h;
    public boolean h0;
    public int i0;
    public boolean j0;
    public boolean k0;
    public final rx6 n;
    public final String r;
    public final long s;
    public final ko4 w;
    public final long x;
    public final rx6 y;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        l0 = DesugarCollections.unmodifiableMap(hashMap);
        jo4 jo4Var = new jo4();
        jo4Var.a = "icy";
        jo4Var.s = dg7.n("application/x-icy");
        m0 = new ko4(jo4Var);
    }

    public cw8(Uri uri, h73 h73Var, rx6 rx6Var, pr3 pr3Var, mr3 mr3Var, z6f z6fVar, lp lpVar, ew8 ew8Var, rx6 rx6Var2, String str, int i, ko4 ko4Var, long j, r99 r99Var) {
        this.a = uri;
        this.b = h73Var;
        this.c = pr3Var;
        this.f = mr3Var;
        this.d = z6fVar;
        this.e = lpVar;
        this.h = ew8Var;
        this.n = rx6Var2;
        this.r = str;
        this.s = i;
        this.w = ko4Var;
        this.y = r99Var != null ? new rx6((Object) r99Var, (byte) 5) : new rx6("ProgressiveMediaPeriod");
        this.E = rx6Var;
        this.x = j;
        this.F = new or2();
        this.G = new wv8(this, (byte) 1);
        this.H = new wv8(this, (byte) 2);
        this.I = gcc.q(null);
        this.N = new bw8[0];
        this.M = new ys9[0];
        this.L = new yv8[0];
        this.d0 = new ArrayList();
        this.g0 = -9223372036854775807L;
        this.W = (byte) 1;
    }

    public final void A() {
        zv8 zv8Var = new zv8(this, this.a, this.b, this.E, this, this.F);
        if (this.P) {
            yve.p(o());
            long j = this.X;
            if (j == Long.MIN_VALUE) {
                j = this.U;
            }
            if (j != -9223372036854775807L && this.g0 > j) {
                this.j0 = true;
                this.g0 = -9223372036854775807L;
                return;
            }
            zy9 zy9Var = this.T;
            zy9Var.getClass();
            long j2 = zy9Var.e(this.g0).a.b;
            long j3 = this.g0;
            zv8Var.h.a = j2;
            zv8Var.s = j3;
            zv8Var.r = true;
            zv8Var.y = false;
            for (ys9 ys9Var : this.M) {
                ys9Var.t = this.g0;
            }
            this.g0 = -9223372036854775807L;
        }
        this.i0 = i();
        this.y.w0(zv8Var, this, this.d.v3(this.W));
    }

    public final boolean B() {
        return this.Z || o();
    }

    @Override // g84
    public final void D() {
        this.O = true;
        this.I.post(this.G);
    }

    @Override // la6
    public final void R0(oa6 oa6Var, long j, long j2, int i) {
        zv8 zv8Var = (zv8) oa6Var;
        b2b b2bVar = zv8Var.c;
        ia6 ia6Var = new ia6(zv8Var.a, zv8Var.w, j);
        if (i != 0) {
            ia6Var.d = b2bVar.c;
            ia6Var.e = b2bVar.d;
            ia6Var.f = j2;
            ia6Var.g = b2bVar.b;
        }
        this.e.v(new ja6(ia6Var), 1, -1, null, 0, null, zv8Var.s, this.U, i);
    }

    @Override // xs9
    public final void a() {
        this.I.post(this.G);
    }

    @Override // pa6
    public final void b() {
        for (ys9 ys9Var : this.M) {
            ys9Var.G(true);
            jr3 jr3Var = ys9Var.h;
            if (jr3Var != null) {
                jr3Var.c(ys9Var.e);
                ys9Var.h = null;
                ys9Var.g = null;
            }
        }
        rx6 rx6Var = this.E;
        e84 e84Var = (e84) rx6Var.c;
        if (e84Var != null) {
            e84Var.release();
            rx6Var.c = null;
        }
        rx6Var.d = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r6v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v18, types: [j37, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v5 */
    @Override // xt6
    public final long c(e74[] e74VarArr, boolean[] zArr, at9[] at9VarArr, boolean[] zArr2, long j) {
        int i;
        ?? r9;
        ArrayList arrayList;
        boolean[] zArr3;
        u1c u1cVar;
        e74 e74Var;
        e74[] e74VarArr2 = e74VarArr;
        long j2 = j;
        g();
        u8a u8aVar = this.S;
        u1c u1cVar2 = (u1c) u8aVar.a;
        boolean[] zArr4 = (boolean[]) u8aVar.c;
        int i2 = this.c0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i = 1;
            if (i4 >= e74VarArr2.length) {
                r9 = false;
                break;
            }
            e74 e74Var2 = e74VarArr2[i4];
            if (e74Var2 != null && Objects.equals(u1cVar2.a(u1cVar2.b(e74Var2.c())).d[0].t, "application/x-itut-t35")) {
                r9 = true;
                break;
            }
            i4++;
        }
        int i5 = 0;
        while (true) {
            int length = e74VarArr2.length;
            arrayList = this.d0;
            if (i5 >= length) {
                break;
            }
            at9 at9Var = at9VarArr[i5];
            if (at9Var != null && (e74VarArr2[i5] == null || !zArr[i5] || (r9 != false && (at9Var instanceof j37)))) {
                if (at9Var instanceof j37) {
                    j37 j37Var = (j37) at9Var;
                    arrayList.remove(j37Var);
                    int i6 = j37Var.a.a;
                    yve.p(zArr4[i6]);
                    this.c0--;
                    zArr4[i6] = false;
                    int i7 = j37Var.b.a;
                    yve.p(zArr4[i7]);
                    this.c0--;
                    zArr4[i7] = false;
                } else {
                    int i8 = ((aw8) at9Var).a;
                    yve.p(zArr4[i8]);
                    this.c0--;
                    zArr4[i8] = false;
                }
                at9VarArr[i5] = null;
            }
            i5++;
        }
        boolean z = !this.Y ? j2 == 0 || this.R : i2 != 0;
        int i9 = 0;
        boolean z2 = false;
        while (i9 < e74VarArr2.length) {
            if (at9VarArr[i9] != null || (e74Var = e74VarArr2[i9]) == null) {
                zArr3 = zArr4;
                u1cVar = u1cVar2;
            } else {
                yve.p(e74Var.length() == i ? i : i3);
                yve.p(e74Var.j(i3) == 0 ? i : i3);
                int b = u1cVar2.b(e74Var.c());
                yve.p(!zArr4[b]);
                boolean z3 = i;
                this.c0++;
                zArr4[b] = z3;
                z2 |= e74Var.n().z;
                int i10 = i3;
                aw8 aw8Var = new aw8(this, b, e74Var.n().z);
                if (Build.VERSION.SDK_INT >= 37 && r9 == false && dg7.m(e74Var.n().t)) {
                    int i11 = i10;
                    while (i11 < u1cVar2.a) {
                        if (rk2.e(u1cVar2.a(i11).d[i10])) {
                            yve.p(!zArr4[i11]);
                            this.c0++;
                            zArr4[i11] = z3;
                            zArr3 = zArr4;
                            u1cVar = u1cVar2;
                            ?? j37Var2 = new j37(aw8Var, new aw8(this, i11, i10), e74Var.n());
                            arrayList.add(j37Var2);
                            aw8Var = j37Var2;
                            break;
                        }
                        i11++;
                        i10 = 0;
                    }
                }
                zArr3 = zArr4;
                u1cVar = u1cVar2;
                at9VarArr[i9] = aw8Var;
                zArr2[i9] = z3;
                if (!z) {
                    ys9 ys9Var = this.M[b];
                    z = (ys9Var.v() == 0 || ys9Var.J(j2, z3)) ? false : true;
                }
            }
            i9++;
            e74VarArr2 = e74VarArr;
            zArr4 = zArr3;
            u1cVar2 = u1cVar;
            i3 = 0;
            i = 1;
        }
        if (this.a0 || !this.Y) {
            this.a0 = z2;
        }
        if (this.c0 == 0) {
            this.h0 = false;
            this.Z = false;
            this.a0 = false;
            rx6 rx6Var = this.y;
            if (rx6Var.Z()) {
                for (ys9 ys9Var2 : this.M) {
                    ys9Var2.l();
                }
                rx6Var.u();
            } else {
                boolean z4 = false;
                this.j0 = false;
                ys9[] ys9VarArr = this.M;
                int length2 = ys9VarArr.length;
                int i12 = 0;
                while (i12 < length2) {
                    ys9VarArr[i12].G(z4);
                    i12++;
                    z4 = false;
                }
            }
        } else if (z) {
            j2 = m(j2);
            for (int i13 = 0; i13 < at9VarArr.length; i13++) {
                at9 at9Var2 = at9VarArr[i13];
                if (at9Var2 != null) {
                    zArr2[i13] = true;
                    if (at9Var2 instanceof j37) {
                        j37 j37Var3 = (j37) at9Var2;
                        j37Var3.e.clear();
                        j37Var3.h = null;
                        j37Var3.n = -9223372036854775807L;
                        j37Var3.r = false;
                        j37Var3.s = false;
                        j37Var3.d.clear();
                    }
                }
            }
        }
        this.Y = true;
        return j2;
    }

    @Override // la6
    public final ma6 c2(oa6 oa6Var, long j, long j2, IOException iOException, int i) {
        long min;
        ma6 ma6Var;
        zy9 zy9Var;
        zv8 zv8Var = (zv8) oa6Var;
        b2b b2bVar = zv8Var.c;
        ia6 ia6Var = new ia6(zv8Var.a, zv8Var.w, j);
        ia6Var.d = b2bVar.c;
        ia6Var.e = b2bVar.d;
        ia6Var.f = j2;
        ia6Var.g = b2bVar.b;
        ja6 ja6Var = new ja6(ia6Var);
        String str = gcc.a;
        this.d.getClass();
        for (Throwable th = iOException; th != null; th = th.getCause()) {
            if ((th instanceof hy7) || (th instanceof FileNotFoundException) || (th instanceof ki5) || (th instanceof qa6) || ((th instanceof k73) && ((k73) th).a == 2008)) {
                min = -9223372036854775807L;
                break;
            }
        }
        min = Math.min((i - 1) * 1000, 5000);
        if (min == -9223372036854775807L) {
            ma6Var = rx6.E;
        } else {
            int i2 = i();
            int i3 = i2 > this.i0 ? 1 : 0;
            if (this.e0 || !((zy9Var = this.T) == null || zy9Var.h() == -9223372036854775807L)) {
                this.i0 = i2;
            } else if (!this.P || B()) {
                this.Z = this.P;
                this.f0 = 0L;
                this.i0 = 0;
                for (ys9 ys9Var : this.M) {
                    ys9Var.G(false);
                }
                zv8Var.h.a = 0L;
                zv8Var.s = 0L;
                zv8Var.r = true;
                zv8Var.y = false;
            } else {
                this.h0 = true;
                ma6Var = rx6.y;
            }
            ma6Var = new ma6(i3, min);
        }
        this.e.r(ja6Var, 1, -1, null, 0, null, zv8Var.s, this.U, iOException, !ma6Var.a());
        return ma6Var;
    }

    @Override // xt6
    public final void d() {
        this.b0 = true;
    }

    @Override // i8a
    public final boolean e() {
        boolean z;
        if (this.j0 || !this.y.Z()) {
            return false;
        }
        or2 or2Var = this.F;
        synchronized (or2Var) {
            z = or2Var.b;
        }
        return z;
    }

    @Override // g84
    public final x1c e0(int i, int i2) {
        return y(new bw8(i, false));
    }

    @Override // la6
    public final void f(oa6 oa6Var, long j, long j2, boolean z) {
        zv8 zv8Var = (zv8) oa6Var;
        b2b b2bVar = zv8Var.c;
        ia6 ia6Var = new ia6(zv8Var.a, zv8Var.w, j);
        ia6Var.d = b2bVar.c;
        ia6Var.e = b2bVar.d;
        ia6Var.f = j2;
        ia6Var.g = b2bVar.b;
        ja6 ja6Var = new ja6(ia6Var);
        this.d.getClass();
        this.e.o(ja6Var, 1, -1, null, 0, null, zv8Var.s, this.U);
        if (z) {
            return;
        }
        for (ys9 ys9Var : this.M) {
            ys9Var.G(false);
        }
        if (this.c0 > 0) {
            wt6 wt6Var = this.J;
            wt6Var.getClass();
            wt6Var.f(this);
        }
    }

    @Override // la6
    public final void f0(oa6 oa6Var, long j, long j2) {
        zv8 zv8Var = (zv8) oa6Var;
        if (this.U == -9223372036854775807L && this.T != null) {
            long k = k(true);
            long j3 = k == Long.MIN_VALUE ? 0L : k + 10000;
            this.U = j3;
            this.h.v(j3, this.T, this.V);
        }
        b2b b2bVar = zv8Var.c;
        ia6 ia6Var = new ia6(zv8Var.a, zv8Var.w, j);
        ia6Var.d = b2bVar.c;
        ia6Var.e = b2bVar.d;
        ia6Var.f = j2;
        ia6Var.g = b2bVar.b;
        ja6 ja6Var = new ja6(ia6Var);
        this.d.getClass();
        this.e.q(ja6Var, 1, -1, null, 0, null, zv8Var.s, this.U);
        this.j0 = true;
        wt6 wt6Var = this.J;
        wt6Var.getClass();
        wt6Var.f(this);
    }

    public final void g() {
        yve.p(this.P);
        this.S.getClass();
        this.T.getClass();
    }

    @Override // i8a
    public final long h() {
        return t();
    }

    public final int i() {
        int i = 0;
        for (ys9 ys9Var : this.M) {
            i += ys9Var.z();
        }
        return i;
    }

    @Override // xt6
    public final long j(long j, az9 az9Var) {
        g();
        if (!this.T.c()) {
            return 0L;
        }
        yy9 e = this.T.e(j);
        return az9Var.a(j, e.a.a, e.b.a);
    }

    public final long k(boolean z) {
        int i;
        long j = Long.MIN_VALUE;
        while (i < this.M.length) {
            if (!z) {
                u8a u8aVar = this.S;
                u8aVar.getClass();
                i = ((boolean[]) u8aVar.c)[i] ? 0 : i + 1;
            }
            j = Math.max(j, this.M[i].s());
        }
        return j;
    }

    @Override // xt6
    public final void l() {
        int v3 = this.d.v3(this.W);
        rx6 rx6Var = this.y;
        IOException iOException = (IOException) rx6Var.d;
        if (iOException != null) {
            throw iOException;
        }
        na6 na6Var = (na6) rx6Var.c;
        if (na6Var != null) {
            if (v3 == Integer.MIN_VALUE) {
                v3 = na6Var.a;
            }
            IOException iOException2 = na6Var.e;
            if (iOException2 != null && na6Var.f > v3) {
                throw iOException2;
            }
        }
        if (this.j0 && !this.P) {
            throw hy7.a("Loading finished before preparation is complete.", null);
        }
    }

    @Override // xt6
    public final long m(long j) {
        int i;
        ArrayList arrayList = this.d0;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            j37 j37Var = (j37) obj;
            j37Var.e.clear();
            j37Var.h = null;
            j37Var.n = -9223372036854775807L;
            j37Var.r = false;
            j37Var.s = false;
            j37Var.d.clear();
        }
        g();
        boolean[] zArr = (boolean[]) this.S.b;
        if (!this.T.c()) {
            j = 0;
        }
        this.Z = false;
        boolean z = this.f0 == j;
        this.f0 = j;
        if (o()) {
            this.g0 = j;
            return j;
        }
        byte b = this.W;
        rx6 rx6Var = this.y;
        if (b != 7 && (this.j0 || rx6Var.Z())) {
            int length = this.M.length;
            for (int i3 = 0; i3 < length; i3++) {
                ys9 ys9Var = this.M[i3];
                if (!this.L[i3].d.get()) {
                    if (this.R) {
                        ys9Var.I(ys9Var.q);
                    } else {
                        long r = ys9Var.r();
                        if (r != Long.MIN_VALUE && j <= r && (i = ys9Var.q) == 0 && z) {
                            ys9Var.I(i);
                        } else if (ys9Var.J(j, this.j0)) {
                            continue;
                        } else if (!zArr[i3] && this.Q) {
                        }
                    }
                }
            }
            return j;
        }
        this.h0 = false;
        this.g0 = j;
        this.j0 = false;
        this.a0 = false;
        if (rx6Var.Z()) {
            for (ys9 ys9Var2 : this.M) {
                ys9Var2.l();
            }
            rx6Var.u();
            return j;
        }
        rx6Var.d = null;
        for (ys9 ys9Var3 : this.M) {
            ys9Var3.G(false);
        }
        return j;
    }

    @Override // g84
    public final void m0(zy9 zy9Var) {
        this.I.post(new hp8(this, zy9Var, (byte) 17));
    }

    @Override // xt6
    public final void n(long j) {
        if (this.R) {
            return;
        }
        g();
        if (o()) {
            return;
        }
        boolean[] zArr = (boolean[]) this.S.c;
        int length = this.M.length;
        for (int i = 0; i < length; i++) {
            this.M[i].k(j, zArr[i]);
        }
    }

    public final boolean o() {
        return this.g0 != -9223372036854775807L;
    }

    @Override // xt6
    public final long p() {
        if (!this.b0 && this.a0) {
            this.a0 = false;
            return this.f0;
        }
        if (!this.Z) {
            return -9223372036854775807L;
        }
        if (!this.j0 && i() <= this.i0) {
            return -9223372036854775807L;
        }
        this.Z = false;
        return this.f0;
    }

    @Override // xt6
    public final void q(wt6 wt6Var, long j) {
        this.J = wt6Var;
        ko4 ko4Var = this.w;
        if (ko4Var == null) {
            this.F.e();
            A();
        } else {
            e0(0, 3).g(ko4Var);
            z(new lp5(-9223372036854775807L, new long[]{0}, new long[]{0}));
            D();
            this.g0 = j;
        }
    }

    @Override // xt6
    public final u1c r() {
        g();
        return (u1c) this.S.a;
    }

    @Override // i8a
    public final boolean s(xa6 xa6Var) {
        if (this.j0) {
            return false;
        }
        rx6 rx6Var = this.y;
        if (rx6Var.U() || this.h0) {
            return false;
        }
        if ((this.P || this.w != null) && this.c0 == 0) {
            return false;
        }
        boolean e = this.F.e();
        if (rx6Var.Z()) {
            return e;
        }
        A();
        return true;
    }

    @Override // i8a
    public final long t() {
        long j;
        boolean z;
        g();
        if (this.j0 || this.c0 == 0) {
            return Long.MIN_VALUE;
        }
        if (o()) {
            return this.g0;
        }
        if (this.Q) {
            int length = this.M.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                u8a u8aVar = this.S;
                if (((boolean[]) u8aVar.b)[i] && ((boolean[]) u8aVar.c)[i]) {
                    ys9 ys9Var = this.M[i];
                    synchronized (ys9Var) {
                        z = ys9Var.z;
                    }
                    if (!z) {
                        j = Math.min(j, this.M[i].s());
                    }
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == Long.MAX_VALUE) {
            j = k(false);
        }
        return j == Long.MIN_VALUE ? this.f0 : j;
    }

    @Override // i8a
    public final void u(long j) {
        boolean z;
        if (this.c0 <= 0 || o()) {
            return;
        }
        boolean z2 = false;
        if (this.X != Long.MIN_VALUE) {
            g();
            boolean z3 = true;
            int i = 0;
            while (true) {
                ys9[] ys9VarArr = this.M;
                if (i >= ys9VarArr.length) {
                    break;
                }
                u8a u8aVar = this.S;
                if (((boolean[]) u8aVar.c)[i] && (((boolean[]) u8aVar.b)[i] || !this.Q)) {
                    ys9 ys9Var = ys9VarArr[i];
                    synchronized (ys9Var) {
                        z = ys9Var.x != -1;
                    }
                    z3 &= z;
                }
                i++;
            }
            z2 = z3;
        }
        if (z2) {
            this.j0 = true;
        }
    }

    public final void v() {
        uf7 a;
        long j = this.x;
        if (this.k0 || this.P || !this.O || this.T == null) {
            return;
        }
        boolean z = false;
        for (ys9 ys9Var : this.M) {
            if (ys9Var.y() == null) {
                return;
            }
        }
        or2 or2Var = this.F;
        synchronized (or2Var) {
            or2Var.b = false;
        }
        int length = this.M.length;
        int i = -1;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            char c = 1;
            if (i2 >= length) {
                break;
            }
            ko4 y = this.M[i2].y();
            y.getClass();
            int h = dg7.h(y.t);
            char c2 = h != 1 ? h != 2 ? h != 3 ? h != 4 ? (char) 0 : (char) 2 : (char) 1 : (char) 4 : (char) 3;
            if (i == 1) {
                c = 3;
            } else if (i == 2) {
                c = 4;
            } else if (i != 3) {
                c = i != 4 ? (char) 0 : (char) 2;
            }
            if (c2 > c) {
                i3 = i2;
                i = h;
            }
            i2++;
        }
        t1c[] t1cVarArr = new t1c[length];
        boolean[] zArr = new boolean[length];
        int i4 = 0;
        while (i4 < length) {
            ko4 y2 = this.M[i4].y();
            y2.getClass();
            String str = y2.t;
            boolean i5 = dg7.i(str);
            boolean z2 = (i5 || dg7.m(str)) ? true : z;
            zArr[i4] = z2;
            boolean z3 = z;
            this.Q |= z2;
            this.R = (j != -9223372036854775807L && length == 1 && dg7.k(str)) ? true : z3 ? 1 : 0;
            rl5 rl5Var = this.K;
            if (rl5Var != null) {
                int i6 = rl5Var.a;
                if (i5 || this.N[i4].b) {
                    uf7 uf7Var = y2.m;
                    if (uf7Var == null) {
                        sf7[] sf7VarArr = new sf7[1];
                        sf7VarArr[z3 ? 1 : 0] = rl5Var;
                        a = new uf7(sf7VarArr);
                    } else {
                        sf7[] sf7VarArr2 = new sf7[1];
                        sf7VarArr2[z3 ? 1 : 0] = rl5Var;
                        a = uf7Var.a(sf7VarArr2);
                    }
                    jo4 a2 = y2.a();
                    a2.l = a;
                    y2 = new ko4(a2);
                }
                if (i5 && y2.i == -1 && y2.j == -1 && i6 != -1) {
                    jo4 a3 = y2.a();
                    a3.i = i6;
                    y2 = new ko4(a3);
                }
            }
            int x = this.c.x(y2);
            jo4 a4 = y2.a();
            a4.W = x;
            ko4 ko4Var = new ko4(a4);
            if (i4 != i3) {
                jo4 a5 = ko4Var.a();
                a5.m = Integer.toString(i3);
                ko4Var = new ko4(a5);
            }
            String num = Integer.toString(i4);
            ko4[] ko4VarArr = new ko4[1];
            ko4VarArr[z3 ? 1 : 0] = ko4Var;
            t1cVarArr[i4] = new t1c(num, ko4VarArr);
            this.M[i4].K(this.X);
            i4++;
            z = z3 ? 1 : 0;
        }
        u1c u1cVar = new u1c(t1cVarArr);
        u8a u8aVar = new u8a();
        u8aVar.a = u1cVar;
        u8aVar.b = zArr;
        int i7 = u1cVar.a;
        u8aVar.c = new boolean[i7];
        u8aVar.d = new boolean[i7];
        this.S = u8aVar;
        if (this.R && this.U == -9223372036854775807L) {
            this.U = j;
            this.T = new xv8(this, this.T);
        }
        this.h.v(this.U, this.T, this.V);
        this.P = true;
        wt6 wt6Var = this.J;
        wt6Var.getClass();
        wt6Var.a(this);
    }

    public final void w(int i) {
        g();
        u8a u8aVar = this.S;
        boolean[] zArr = (boolean[]) u8aVar.d;
        if (zArr[i]) {
            return;
        }
        ko4 ko4Var = ((u1c) u8aVar.a).a(i).d[0];
        this.e.i(dg7.h(ko4Var.t), ko4Var, 0, null, this.f0);
        zArr[i] = true;
    }

    public final void x(int i) {
        g();
        if (this.h0) {
            if ((!this.Q || ((boolean[]) this.S.b)[i]) && !this.M[i].A(false)) {
                this.g0 = 0L;
                this.h0 = false;
                this.Z = true;
                this.f0 = 0L;
                this.i0 = 0;
                for (ys9 ys9Var : this.M) {
                    ys9Var.G(false);
                }
                wt6 wt6Var = this.J;
                wt6Var.getClass();
                wt6Var.f(this);
            }
        }
    }

    public final x1c y(bw8 bw8Var) {
        int length = this.M.length;
        for (int i = 0; i < length; i++) {
            if (bw8Var.equals(this.N[i])) {
                return this.M[i];
            }
        }
        if (this.O) {
            efd.f("ProgressiveMediaPeriod", "Extractor added new track (id=" + bw8Var.a + ") after finishing tracks.");
            return new po3();
        }
        ys9 ys9Var = new ys9(this.n, this.c, this.f);
        yv8 yv8Var = new yv8(ys9Var);
        ys9Var.f = this;
        int i2 = length + 1;
        bw8[] bw8VarArr = (bw8[]) Arrays.copyOf(this.N, i2);
        bw8VarArr[length] = bw8Var;
        String str = gcc.a;
        this.N = bw8VarArr;
        ys9[] ys9VarArr = (ys9[]) Arrays.copyOf(this.M, i2);
        ys9VarArr[length] = ys9Var;
        this.M = ys9VarArr;
        yv8[] yv8VarArr = (yv8[]) Arrays.copyOf(this.L, i2);
        yv8VarArr[length] = yv8Var;
        this.L = yv8VarArr;
        return yv8Var;
    }

    public final void z(zy9 zy9Var) {
        this.T = this.K == null ? zy9Var : new qc0(-9223372036854775807L);
        this.U = zy9Var.h();
        boolean z = !this.e0 && zy9Var.h() == -9223372036854775807L;
        this.V = z;
        this.W = z ? (byte) 7 : (byte) 1;
        if (this.P) {
            this.h.v(this.U, zy9Var, z);
        } else {
            v();
        }
    }
}
