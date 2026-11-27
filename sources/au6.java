// default package

import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class au6 {
    public final ea3 c;
    public final xgb d;
    public final lu3 e;
    public long f;
    public int g;
    public boolean h;
    public yt6 i;
    public final yt6[] j;
    public final yt6[] k;
    public yt6 l;
    public yt6 m;
    public int n;
    public Object o;
    public long p;
    public final xrb a = new xrb();
    public final zrb b = new zrb();
    public ArrayList q = new ArrayList();

    public au6(ea3 ea3Var, xgb xgbVar, lu3 lu3Var, int i) {
        this.c = ea3Var;
        this.d = xgbVar;
        this.e = lu3Var;
        this.j = new yt6[i];
        this.k = new yt6[i];
    }

    public static boolean m(yt6[] yt6VarArr, long[] jArr, yt6 yt6Var, long j) {
        for (int i = 0; i < yt6VarArr.length; i++) {
            yt6 yt6Var2 = yt6VarArr[i];
            if (yt6Var2 != null) {
                yt6 yt6Var3 = yt6Var;
                do {
                    yt6Var3 = yt6Var3.m;
                    if (yt6Var3 == null) {
                        if (yt6Var2 == yt6Var) {
                            long j2 = jArr[i];
                            if (j2 == Long.MIN_VALUE || j2 >= j) {
                                return true;
                            }
                        } else {
                            continue;
                        }
                    }
                } while (yt6Var3 != yt6Var2);
                return true;
            }
        }
        return false;
    }

    public static vz6 t(asb asbVar, Object obj, long j, long j2, zrb zrbVar, xrb xrbVar) {
        asbVar.g(obj, xrbVar);
        asbVar.n(xrbVar.c, zrbVar);
        asbVar.b(obj);
        int i = ea.c.a;
        if (i != 0) {
            if (i == 1) {
                xrbVar.f(0);
            }
            xrbVar.g(0);
        }
        asbVar.g(obj, xrbVar);
        int c = xrbVar.c(j);
        return c == -1 ? new vz6(obj, j2, xrbVar.b(j)) : new vz6(obj, c, xrbVar.e(c), j2, -1);
    }

    public final yt6 a() {
        yt6 yt6Var;
        if (this.i == null) {
            return null;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            yt6[] yt6VarArr = this.j;
            if (i2 >= yt6VarArr.length) {
                break;
            }
            if (this.i.equals(yt6VarArr[i2])) {
                yt6VarArr[i2] = this.i.m;
            }
            i2++;
        }
        this.i.getClass();
        while (true) {
            yt6[] yt6VarArr2 = this.k;
            int length = yt6VarArr2.length;
            yt6Var = this.i;
            if (i >= length) {
                break;
            }
            if (yt6Var.equals(yt6VarArr2[i])) {
                yt6VarArr2[i] = this.i.m;
            }
            i++;
        }
        yt6Var.getClass();
        this.i.i();
        int i3 = this.n - 1;
        this.n = i3;
        if (i3 == 0) {
            this.l = null;
            yt6 yt6Var2 = this.i;
            this.o = yt6Var2.b;
            this.p = yt6Var2.g.a.d;
        }
        this.i = this.i.m;
        q();
        return this.i;
    }

    public final void b() {
        if (this.n == 0) {
            return;
        }
        yt6 yt6Var = this.i;
        yt6Var.getClass();
        this.o = yt6Var.b;
        this.p = yt6Var.g.a.d;
        while (yt6Var != null) {
            yt6Var.i();
            yt6Var = yt6Var.m;
        }
        this.i = null;
        this.l = null;
        Arrays.fill(this.j, (Object) null);
        Arrays.fill(this.k, (Object) null);
        this.n = 0;
        q();
    }

    public final yt6 c() {
        yt6 yt6Var = this.i;
        while (yt6Var != null) {
            for (yt6 yt6Var2 : this.k) {
                if (yt6Var == yt6Var2) {
                    return yt6Var;
                }
            }
            yt6Var = yt6Var.m;
        }
        return yt6Var;
    }

    public final yt6 d() {
        yt6 yt6Var = this.i;
        while (yt6Var != null) {
            for (yt6 yt6Var2 : this.j) {
                if (yt6Var == yt6Var2) {
                    return yt6Var;
                }
            }
            yt6Var = yt6Var.m;
        }
        return yt6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zt6 e(asb asbVar, yt6 yt6Var, long j) {
        asb asbVar2;
        ea eaVar;
        zt6 zt6Var;
        vz6 vz6Var;
        asb asbVar3;
        Object obj;
        xrb xrbVar;
        long j2;
        long j3;
        zrb zrbVar;
        long j4;
        long j5;
        Pair j6;
        long v;
        zt6 zt6Var2 = yt6Var.g;
        long j7 = (yt6Var.p + zt6Var2.e) - j;
        long j8 = 0;
        long j9 = -9223372036854775807L;
        if (!zt6Var2.g) {
            vz6 vz6Var2 = zt6Var2.a;
            Object obj2 = vz6Var2.a;
            int i = vz6Var2.e;
            xrb xrbVar2 = this.a;
            asbVar.g(obj2, xrbVar2);
            if (!vz6Var2.c()) {
                if (i != -1) {
                    xrbVar2.f(i);
                }
                int e = xrbVar2.e(i);
                xrbVar2.g(i);
                ea eaVar2 = ea.c;
                if (e != eaVar2.a(i).a) {
                    return i(asbVar, vz6Var2.a, vz6Var2.e, e, zt6Var2.e, vz6Var2.d);
                }
                asbVar.g(obj2, xrbVar2);
                xrbVar2.d(i);
                eaVar2.a(i).getClass();
                return j(asbVar, vz6Var2.a, 0L, -9223372036854775807L, zt6Var2.e, vz6Var2.d);
            }
            int i2 = vz6Var2.b;
            ea eaVar3 = ea.c;
            int i3 = eaVar3.a(i2).a;
            if (i3 != -1) {
                int a = eaVar3.a(i2).a(vz6Var2.c);
                if (a < i3) {
                    return i(asbVar, vz6Var2.a, i2, a, zt6Var2.d, vz6Var2.d);
                }
                long j10 = zt6Var2.d;
                if (j10 == -9223372036854775807L) {
                    int i4 = xrbVar2.c;
                    long j11 = xrbVar2.d;
                    zrb zrbVar2 = this.b;
                    if (j11 == -9223372036854775807L) {
                        asbVar.n(i4, zrbVar2);
                        if (zrbVar2.h && !zrbVar2.j) {
                            j9 = Math.max(0L, j7);
                        }
                    }
                    asbVar2 = asbVar;
                    eaVar = eaVar3;
                    long j12 = j9;
                    Pair j13 = asbVar2.j(zrbVar2, xrbVar2, xrbVar2.c, -9223372036854775807L, j12);
                    if (j13 != null) {
                        j9 = j12;
                        j10 = ((Long) j13.second).longValue();
                    }
                } else {
                    asbVar2 = asbVar;
                    eaVar = eaVar3;
                }
                int i5 = vz6Var2.b;
                asbVar2.g(obj2, xrbVar2);
                xrbVar2.d(i5);
                eaVar.a(i5).getClass();
                return j(asbVar2, vz6Var2.a, Math.max(0L, j10), j9, zt6Var2.d, vz6Var2.d);
            }
            return null;
        }
        zt6 zt6Var3 = yt6Var.g;
        vz6 vz6Var3 = zt6Var3.a;
        long j14 = zt6Var3.d;
        int b = asbVar.b(vz6Var3.a);
        int i6 = this.g;
        boolean z = this.h;
        xrb xrbVar3 = this.a;
        zrb zrbVar3 = this.b;
        int d = asbVar.d(b, xrbVar3, zrbVar3, i6, z);
        if (d != -1) {
            int i7 = asbVar.f(d, xrbVar3, true).c;
            Object obj3 = xrbVar3.b;
            obj3.getClass();
            long j15 = vz6Var3.d;
            zt6Var = null;
            if (asbVar.m(i7, zrbVar3, 0L).m == d) {
                int i8 = xrbVar3.c;
                if (xrbVar3.d == -9223372036854775807L) {
                    asbVar.n(i8, zrbVar3);
                    if (zrbVar3.h && !zrbVar3.j) {
                        j5 = Math.max(0L, j7);
                        vz6Var = vz6Var3;
                        long j16 = j5;
                        j6 = asbVar.j(zrbVar3, xrbVar3, i7, -9223372036854775807L, j16);
                        if (j6 != null) {
                            Object obj4 = j6.first;
                            long longValue = ((Long) j6.second).longValue();
                            yt6 yt6Var2 = yt6Var.m;
                            if (yt6Var2 == null || !yt6Var2.b.equals(obj4)) {
                                v = v(obj4);
                                if (v == -1) {
                                    v = this.f;
                                    this.f = 1 + v;
                                }
                            } else {
                                v = yt6Var2.g.a.d;
                            }
                            asbVar3 = asbVar;
                            j3 = j16;
                            zrbVar = zrbVar3;
                            xrbVar = xrbVar3;
                            obj = obj4;
                            j2 = v;
                            j4 = longValue;
                            j8 = -9223372036854775807L;
                        }
                    }
                }
                j5 = -9223372036854775807L;
                vz6Var = vz6Var3;
                long j162 = j5;
                j6 = asbVar.j(zrbVar3, xrbVar3, i7, -9223372036854775807L, j162);
                if (j6 != null) {
                }
            } else {
                vz6Var = vz6Var3;
                asbVar3 = asbVar;
                obj = obj3;
                xrbVar = xrbVar3;
                j2 = j15;
                j3 = -9223372036854775807L;
                zrbVar = zrbVar3;
                j4 = 0;
            }
            vz6 t = t(asbVar3, obj, j4, j2, zrbVar, xrbVar);
            long j17 = j4;
            xrb xrbVar4 = xrbVar;
            if (j8 != -9223372036854775807L && j14 != -9223372036854775807L) {
                asbVar3.g(vz6Var.a, xrbVar4).getClass();
                if (ea.c.a > 0) {
                    xrbVar4.g(0);
                }
            }
            return h(asbVar3, t, j8, j17, j3);
        }
        zt6Var = null;
        return zt6Var;
    }

    public final yt6 f() {
        yt6[] yt6VarArr = this.j;
        if (yt6VarArr.length == 0) {
            return null;
        }
        yt6 yt6Var = yt6VarArr[0];
        for (yt6 yt6Var2 = this.i; yt6Var2 != null; yt6Var2 = yt6Var2.m) {
            int length = yt6VarArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (yt6Var2 == yt6VarArr[i]) {
                    yt6Var = yt6Var2;
                    break;
                }
                i++;
            }
        }
        return yt6Var;
    }

    public final long g(asb asbVar, vz6 vz6Var) {
        Object obj = vz6Var.a;
        xrb xrbVar = this.a;
        asbVar.g(obj, xrbVar);
        if (vz6Var.c()) {
            return xrbVar.a(vz6Var.b, vz6Var.c);
        }
        int i = vz6Var.e;
        if (i == -1) {
            return xrbVar.d;
        }
        xrbVar.d(i);
        return 0L;
    }

    public final zt6 h(asb asbVar, vz6 vz6Var, long j, long j2, long j3) {
        asbVar.g(vz6Var.a, this.a);
        boolean c = vz6Var.c();
        Object obj = vz6Var.a;
        return c ? i(asbVar, obj, vz6Var.b, vz6Var.c, j, vz6Var.d) : j(asbVar, obj, j2, j3, j, vz6Var.d);
    }

    public final zt6 i(asb asbVar, Object obj, int i, int i2, long j, long j2) {
        vz6 vz6Var = new vz6(obj, i, i2, j2, -1);
        xrb xrbVar = this.a;
        long a = asbVar.g(obj, xrbVar).a(i, i2);
        if (i2 == xrbVar.e(i)) {
            ea eaVar = ea.c;
        }
        xrbVar.g(i);
        long j3 = 0;
        if (a != -9223372036854775807L && 0 >= a) {
            j3 = Math.max(0L, a - 1);
        }
        return new zt6(vz6Var, j3, -9223372036854775807L, j, a, false, false, false, false);
    }

    public final zt6 j(asb asbVar, Object obj, long j, long j2, long j3, long j4) {
        xrb xrbVar = this.a;
        asbVar.g(obj, xrbVar);
        int b = xrbVar.b(j);
        if (b != -1) {
            xrbVar.g(b);
            xrbVar.g(b);
        }
        vz6 vz6Var = new vz6(obj, j4, b);
        boolean z = !vz6Var.c() && b == -1;
        boolean o = o(asbVar, vz6Var);
        boolean n = n(asbVar, vz6Var, z);
        long g = g(asbVar, vz6Var);
        return new zt6(vz6Var, (g == -9223372036854775807L || j < g) ? j : Math.max(0L, g - 1), j2, j3, g, false, z, o, n);
    }

    public final yt6 k(int i) {
        return this.k[i];
    }

    public final zt6 l(asb asbVar, zt6 zt6Var) {
        vz6 vz6Var = zt6Var.a;
        int i = vz6Var.e;
        boolean z = !vz6Var.c() && i == -1;
        boolean o = o(asbVar, vz6Var);
        boolean n = n(asbVar, vz6Var, z);
        long g = g(asbVar, vz6Var);
        Object obj = vz6Var.a;
        xrb xrbVar = this.a;
        asbVar.g(obj, xrbVar);
        if (vz6Var.c()) {
            xrbVar.g(vz6Var.b);
        } else if (i != -1) {
            xrbVar.g(i);
        }
        return new zt6(vz6Var, zt6Var.b, zt6Var.c, zt6Var.d, g, false, z, o, n);
    }

    public final boolean n(asb asbVar, vz6 vz6Var, boolean z) {
        int b = asbVar.b(vz6Var.a);
        xrb xrbVar = this.a;
        int i = asbVar.f(b, xrbVar, false).c;
        zrb zrbVar = this.b;
        return !asbVar.m(i, zrbVar, 0L).h && asbVar.d(b, xrbVar, zrbVar, this.g, this.h) == -1 && z;
    }

    public final boolean o(asb asbVar, vz6 vz6Var) {
        boolean z = !vz6Var.c() && vz6Var.e == -1;
        Object obj = vz6Var.a;
        if (z) {
            if (asbVar.m(asbVar.g(obj, this.a).c, this.b, 0L).n == asbVar.b(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void p() {
        yt6 yt6Var = this.m;
        if (yt6Var == null || yt6Var.h()) {
            this.m = null;
            for (int i = 0; i < this.q.size(); i++) {
                yt6 yt6Var2 = (yt6) this.q.get(i);
                if (!yt6Var2.h()) {
                    this.m = yt6Var2;
                    return;
                }
            }
        }
    }

    public final void q() {
        yt6 yt6Var;
        mo5 p = po5.p();
        for (yt6 yt6Var2 = this.i; yt6Var2 != null; yt6Var2 = yt6Var2.m) {
            p.c(yt6Var2.g.a);
        }
        yt6[] yt6VarArr = this.j;
        this.d.e(new yg6(this, p, (yt6VarArr.length == 0 || (yt6Var = yt6VarArr[0]) == null) ? null : yt6Var.g.a, (byte) 9));
    }

    public final void r(long j) {
        yt6 yt6Var = this.l;
        if (yt6Var != null) {
            yve.p(yt6Var.m == null);
            if (yt6Var.e) {
                yt6Var.a.u(j - yt6Var.p);
            }
        }
    }

    public final int s(yt6 yt6Var) {
        yt6[] yt6VarArr;
        yt6[] yt6VarArr2;
        yt6Var.getClass();
        if (yt6Var == this.l) {
            return 0;
        }
        this.l = yt6Var;
        int i = 0;
        while (true) {
            yt6Var = yt6Var.m;
            if (yt6Var == null) {
                break;
            }
            int i2 = 0;
            while (true) {
                yt6VarArr = this.j;
                int length = yt6VarArr.length;
                yt6VarArr2 = this.k;
                if (i2 >= length) {
                    break;
                }
                if (yt6Var == yt6VarArr[i2]) {
                    yt6 yt6Var2 = this.i;
                    yt6VarArr[i2] = yt6Var2;
                    yt6VarArr2[i2] = yt6Var2;
                    i = 3;
                }
                i2++;
            }
            for (int i3 = 0; i3 < yt6VarArr2.length; i3++) {
                if (yt6Var == yt6VarArr2[i3]) {
                    yt6VarArr2[i3] = yt6VarArr[i3];
                    i |= 2;
                }
            }
            yt6Var.i();
            this.n--;
        }
        yt6 yt6Var3 = this.l;
        yt6Var3.getClass();
        if (yt6Var3.m != null) {
            yt6Var3.b();
            yt6Var3.m = null;
            yt6Var3.c();
        }
        q();
        return i;
    }

    public final vz6 u(nf8 nf8Var, asb asbVar, Object obj, long j, boolean z, boolean z2) {
        long v;
        int b;
        xrb xrbVar = this.a;
        int i = asbVar.g(obj, xrbVar).c;
        Object obj2 = this.o;
        boolean z3 = false;
        if (obj2 == null || (b = asbVar.b(obj2)) == -1 || asbVar.f(b, xrbVar, false).c != i) {
            yt6 yt6Var = this.i;
            while (true) {
                if (yt6Var == null) {
                    yt6 yt6Var2 = this.i;
                    while (true) {
                        if (yt6Var2 != null) {
                            int b2 = asbVar.b(yt6Var2.b);
                            if (b2 != -1 && asbVar.f(b2, xrbVar, false).c == i) {
                                v = yt6Var2.g.a.d;
                                break;
                            }
                            yt6Var2 = yt6Var2.m;
                        } else {
                            v = v(obj);
                            if (v == -1) {
                                v = this.f;
                                this.f = 1 + v;
                                if (this.i == null) {
                                    this.o = obj;
                                    this.p = v;
                                }
                            }
                        }
                    }
                } else {
                    if (yt6Var.b.equals(obj)) {
                        v = yt6Var.g.a.d;
                        break;
                    }
                    yt6Var = yt6Var.m;
                }
            }
        } else {
            v = this.p;
        }
        zrb zrbVar = this.b;
        if (!z && !z2) {
            vz6 vz6Var = nf8Var.b;
            long j2 = v;
            vz6 t = t(asbVar, obj, j, j2, zrbVar, xrbVar);
            if (vz6Var.c() && vz6Var.equals(t)) {
                return vz6Var;
            }
            asbVar.g(obj, xrbVar);
            return new vz6(obj, j2, xrbVar.b(j));
        }
        Object obj3 = obj;
        long j3 = v;
        asbVar.g(obj3, xrbVar);
        asbVar.n(xrbVar.c, zrbVar);
        int b3 = asbVar.b(obj);
        boolean z4 = false;
        while (b3 >= zrbVar.m) {
            asbVar.f(b3, xrbVar, true);
            boolean z5 = ea.c.a <= 0 ? z3 : true;
            z4 |= z5;
            zrb zrbVar2 = zrbVar;
            if (xrbVar.c(xrbVar.d) != -1) {
                obj3 = xrbVar.b;
                obj3.getClass();
            }
            if (z4 && (!z5 || xrbVar.d != 0)) {
                zrbVar = zrbVar2;
                break;
            }
            b3--;
            z3 = false;
            zrbVar = zrbVar2;
        }
        vz6 t2 = t(asbVar, obj3, j, j3, zrbVar, xrbVar);
        Object obj4 = t2.a;
        int i2 = t2.b;
        if (i2 != -1 && !z) {
            asbVar.g(obj4, xrbVar);
            ea.c.a(i2).getClass();
            if (0 != j) {
                return new vz6(obj4, t2.d, xrbVar.b(j));
            }
        }
        return t2;
    }

    public final long v(Object obj) {
        for (int i = 0; i < this.q.size(); i++) {
            yt6 yt6Var = (yt6) this.q.get(i);
            if (yt6Var.b.equals(obj)) {
                return yt6Var.g.a.d;
            }
        }
        return -1L;
    }

    public final int w(asb asbVar) {
        asb asbVar2;
        yt6 yt6Var;
        yt6 yt6Var2 = this.i;
        if (yt6Var2 == null) {
            return 0;
        }
        int b = asbVar.b(yt6Var2.b);
        while (true) {
            asbVar2 = asbVar;
            b = asbVar2.d(b, this.a, this.b, this.g, this.h);
            while (true) {
                yt6Var = yt6Var2.m;
                if (yt6Var == null || yt6Var2.g.g) {
                    break;
                }
                yt6Var2 = yt6Var;
            }
            if (b == -1 || yt6Var == null || asbVar2.b(yt6Var.b) != b) {
                break;
            }
            yt6Var2 = yt6Var;
            asbVar = asbVar2;
        }
        int s = s(yt6Var2);
        yt6Var2.g = l(asbVar2, yt6Var2.g);
        return s;
    }

    public final int x(asb asbVar, long j, long[] jArr, long[] jArr2) {
        long j2;
        int i;
        zt6 b;
        yt6 yt6Var = null;
        for (yt6 yt6Var2 = this.i; yt6Var2 != null; yt6Var2 = yt6Var2.m) {
            zt6 zt6Var = yt6Var2.g;
            vz6 vz6Var = zt6Var.a;
            if (yt6Var != null) {
                zt6 e = e(asbVar, yt6Var, j);
                if (e != null) {
                    long j3 = e.b;
                    long j4 = zt6Var.c;
                    j2 = -9223372036854775807L;
                    long j5 = zt6Var.b;
                    i = 0;
                    if (vz6Var.equals(e.a)) {
                        if (j5 == j3) {
                            b = e;
                        } else if (j4 != -9223372036854775807L) {
                            long j6 = e.c;
                            if (j6 != -9223372036854775807L) {
                                if (Math.abs((j3 - j6) - (j5 - j4)) < 5000000) {
                                    b = e.b(j5, j4);
                                }
                            }
                        }
                    }
                }
                return s(yt6Var);
            }
            b = l(asbVar, zt6Var);
            j2 = -9223372036854775807L;
            i = 0;
            long j7 = zt6Var.d;
            long j8 = zt6Var.e;
            zt6 a = b.a(j7);
            yt6Var2.g = a;
            long j9 = b.e;
            if (j8 != j9) {
                long j10 = j9 == j2 ? Long.MAX_VALUE : j9 + yt6Var2.p;
                int i2 = (a.f || !m(this.j, jArr, yt6Var2, j10)) ? i : 1;
                boolean m = m(this.k, jArr2, yt6Var2, j10);
                int s = s(yt6Var2);
                if (s != 0) {
                    return s;
                }
                int i3 = (i2 == 0 || (j8 == j2 && vz6Var.e == -1)) ? i : 1;
                return m ? i3 | 2 : i3;
            }
            yt6Var = yt6Var2;
        }
        return 0;
    }
}
