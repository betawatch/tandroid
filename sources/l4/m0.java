package l4;

import com.google.android.gms.internal.cast.z4;
import j3.r2;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class m0 extends j {
    public static final j3.f1 r;
    public final a[] k;
    public final r2[] l;
    public final ArrayList m;
    public final bb.a n;
    public int o;
    public long[][] p;
    public z4 q;

    static {
        j3.x0 x0Var = new j3.x0();
        q8.x xVar = q8.z.b;
        q8.l0 l0Var = q8.l0.e;
        List list = Collections.EMPTY_LIST;
        q8.l0 l0Var2 = q8.l0.e;
        r = new j3.f1("MergingMediaSource", new j3.z0(x0Var), null, new j3.b1(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), j3.h1.U, j3.d1.c);
    }

    public m0(a... aVarArr) {
        bb.a aVar = new bb.a(12);
        this.k = aVarArr;
        this.n = aVar;
        this.m = new ArrayList(Arrays.asList(aVarArr));
        this.o = -1;
        this.l = new r2[aVarArr.length];
        this.p = new long[0][];
        new HashMap();
        q8.l.a(8, "expectedKeys");
        q8.l.a(2, "expectedValuesPerKey");
        q8.p a2 = q8.p.a();
        new q8.g0();
        if (!a2.isEmpty()) {
            throw new IllegalArgumentException();
        }
    }

    @Override // l4.a
    public final z b(c0 c0Var, com.google.android.exoplayer2.upstream.r rVar, long j10) {
        a[] aVarArr = this.k;
        int length = aVarArr.length;
        z[] zVarArr = new z[length];
        r2[] r2VarArr = this.l;
        int b10 = r2VarArr[0].b(c0Var.a);
        for (int i10 = 0; i10 < length; i10++) {
            zVarArr[i10] = aVarArr[i10].b(c0Var.b(r2VarArr[i10].l(b10)), rVar, j10 - this.p[b10][i10]);
        }
        return new l0(this.n, this.p[b10], zVarArr);
    }

    @Override // l4.a
    public final j3.f1 h() {
        a[] aVarArr = this.k;
        return aVarArr.length > 0 ? aVarArr[0].h() : r;
    }

    @Override // l4.j, l4.a
    public final void j() {
        z4 z4Var = this.q;
        if (z4Var != null) {
            throw z4Var;
        }
        super.j();
    }

    @Override // l4.a
    public final void l(com.google.android.exoplayer2.upstream.y0 y0Var) {
        this.j = y0Var;
        this.i = f5.d0.k(null);
        int i10 = 0;
        while (true) {
            a[] aVarArr = this.k;
            if (i10 >= aVarArr.length) {
                return;
            }
            w(Integer.valueOf(i10), aVarArr[i10]);
            i10++;
        }
    }

    @Override // l4.a
    public final void n(z zVar) {
        l0 l0Var = (l0) zVar;
        int i10 = 0;
        while (true) {
            a[] aVarArr = this.k;
            if (i10 >= aVarArr.length) {
                return;
            }
            a aVar = aVarArr[i10];
            z zVar2 = l0Var.a[i10];
            if (zVar2 instanceof j0) {
                zVar2 = ((j0) zVar2).a;
            }
            aVar.n(zVar2);
            i10++;
        }
    }

    @Override // l4.j, l4.a
    public final void p() {
        super.p();
        Arrays.fill(this.l, (Object) null);
        this.o = -1;
        this.q = null;
        ArrayList arrayList = this.m;
        arrayList.clear();
        Collections.addAll(arrayList, this.k);
    }

    @Override // l4.j
    public final c0 s(Object obj, c0 c0Var) {
        if (((Integer) obj).intValue() == 0) {
            return c0Var;
        }
        return null;
    }

    @Override // l4.j
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
