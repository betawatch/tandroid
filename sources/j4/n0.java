package j4;

import com.google.android.gms.internal.cast.z4;
import h3.r2;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class n0 extends k {
    public static final h3.f1 r;
    public final a[] k;
    public final r2[] l;
    public final ArrayList m;
    public final za.a n;
    public int o;
    public long[][] p;
    public z4 q;

    static {
        h3.x0 x0Var = new h3.x0();
        o8.x xVar = o8.z.b;
        o8.l0 l0Var = o8.l0.e;
        List list = Collections.EMPTY_LIST;
        o8.l0 l0Var2 = o8.l0.e;
        r = new h3.f1("MergingMediaSource", new h3.z0(x0Var), null, new h3.b1(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), h3.h1.U, h3.d1.c);
    }

    public n0(a... aVarArr) {
        za.a aVar = new za.a(10);
        this.k = aVarArr;
        this.n = aVar;
        this.m = new ArrayList(Arrays.asList(aVarArr));
        this.o = -1;
        this.l = new r2[aVarArr.length];
        this.p = new long[0][];
        new HashMap();
        o8.l.a(8, "expectedKeys");
        o8.l.a(2, "expectedValuesPerKey");
        o8.p a2 = o8.p.a();
        new o8.g0();
        if (!a2.isEmpty()) {
            throw new IllegalArgumentException();
        }
    }

    @Override // j4.a
    public final a0 b(d0 d0Var, com.google.android.exoplayer2.upstream.r rVar, long j10) {
        a[] aVarArr = this.k;
        int length = aVarArr.length;
        a0[] a0VarArr = new a0[length];
        r2[] r2VarArr = this.l;
        int b10 = r2VarArr[0].b(d0Var.a);
        for (int i9 = 0; i9 < length; i9++) {
            a0VarArr[i9] = aVarArr[i9].b(d0Var.b(r2VarArr[i9].l(b10)), rVar, j10 - this.p[b10][i9]);
        }
        return new m0(this.n, this.p[b10], a0VarArr);
    }

    @Override // j4.a
    public final h3.f1 h() {
        a[] aVarArr = this.k;
        return aVarArr.length > 0 ? aVarArr[0].h() : r;
    }

    @Override // j4.k, j4.a
    public final void j() {
        z4 z4Var = this.q;
        if (z4Var != null) {
            throw z4Var;
        }
        super.j();
    }

    @Override // j4.a
    public final void l(com.google.android.exoplayer2.upstream.y0 y0Var) {
        this.j = y0Var;
        this.i = d5.f0.k(null);
        int i9 = 0;
        while (true) {
            a[] aVarArr = this.k;
            if (i9 >= aVarArr.length) {
                return;
            }
            w(Integer.valueOf(i9), aVarArr[i9]);
            i9++;
        }
    }

    @Override // j4.a
    public final void n(a0 a0Var) {
        m0 m0Var = (m0) a0Var;
        int i9 = 0;
        while (true) {
            a[] aVarArr = this.k;
            if (i9 >= aVarArr.length) {
                return;
            }
            a aVar = aVarArr[i9];
            a0 a0Var2 = m0Var.a[i9];
            if (a0Var2 instanceof k0) {
                a0Var2 = ((k0) a0Var2).a;
            }
            aVar.n(a0Var2);
            i9++;
        }
    }

    @Override // j4.k, j4.a
    public final void p() {
        super.p();
        Arrays.fill(this.l, (Object) null);
        this.o = -1;
        this.q = null;
        ArrayList arrayList = this.m;
        arrayList.clear();
        Collections.addAll(arrayList, this.k);
    }

    @Override // j4.k
    public final d0 s(Object obj, d0 d0Var) {
        if (((Integer) obj).intValue() == 0) {
            return d0Var;
        }
        return null;
    }

    @Override // j4.k
    public final void v(Object obj, a aVar, r2 r2Var) {
        Integer num = (Integer) obj;
        if (this.q != null) {
            return;
        }
        if (this.o == -1) {
            this.o = r2Var.h();
        } else if (r2Var.h() != this.o) {
            this.q = new z4();
            return;
        }
        int length = this.p.length;
        r2[] r2VarArr = this.l;
        if (length == 0) {
            this.p = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.o, r2VarArr.length);
        }
        ArrayList arrayList = this.m;
        arrayList.remove(aVar);
        r2VarArr[num.intValue()] = r2Var;
        if (arrayList.isEmpty()) {
            m(r2VarArr[0]);
        }
    }
}
