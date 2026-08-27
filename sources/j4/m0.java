package j4;

import com.google.android.gms.internal.cast.x4;
import h3.s2;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class m0 extends j {
    public static final h3.f1 r;
    public final a[] k;
    public final s2[] l;
    public final ArrayList m;
    public final za.b n;
    public int o;
    public long[][] p;
    public x4 q;

    static {
        h3.x0 x0Var = new h3.x0();
        p8.x xVar = p8.z.b;
        p8.l0 l0Var = p8.l0.e;
        List list = Collections.EMPTY_LIST;
        p8.l0 l0Var2 = p8.l0.e;
        r = new h3.f1("MergingMediaSource", new h3.z0(x0Var), null, new h3.b1(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), h3.h1.U, h3.d1.c);
    }

    public m0(a... aVarArr) {
        za.b bVar = new za.b(9);
        this.k = aVarArr;
        this.n = bVar;
        this.m = new ArrayList(Arrays.asList(aVarArr));
        this.o = -1;
        this.l = new s2[aVarArr.length];
        this.p = new long[0][];
        new HashMap();
        p8.l.a(8, "expectedKeys");
        p8.l.a(2, "expectedValuesPerKey");
        p8.p a2 = p8.p.a();
        new p8.g0();
        if (!a2.isEmpty()) {
            throw new IllegalArgumentException();
        }
    }

    @Override // j4.a
    public final z b(c0 c0Var, com.google.android.exoplayer2.upstream.r rVar, long j10) {
        a[] aVarArr = this.k;
        int length = aVarArr.length;
        z[] zVarArr = new z[length];
        s2[] s2VarArr = this.l;
        int b10 = s2VarArr[0].b(c0Var.a);
        for (int i10 = 0; i10 < length; i10++) {
            zVarArr[i10] = aVarArr[i10].b(c0Var.b(s2VarArr[i10].l(b10)), rVar, j10 - this.p[b10][i10]);
        }
        return new l0(this.n, this.p[b10], zVarArr);
    }

    @Override // j4.a
    public final h3.f1 h() {
        a[] aVarArr = this.k;
        return aVarArr.length > 0 ? aVarArr[0].h() : r;
    }

    @Override // j4.j, j4.a
    public final void j() {
        x4 x4Var = this.q;
        if (x4Var != null) {
            throw x4Var;
        }
        super.j();
    }

    @Override // j4.a
    public final void l(com.google.android.exoplayer2.upstream.y0 y0Var) {
        this.j = y0Var;
        this.i = d5.g0.k(null);
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

    @Override // j4.a
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

    @Override // j4.j, j4.a
    public final void p() {
        super.p();
        Arrays.fill(this.l, (Object) null);
        this.o = -1;
        this.q = null;
        ArrayList arrayList = this.m;
        arrayList.clear();
        Collections.addAll(arrayList, this.k);
    }

    @Override // j4.j
    public final c0 s(Object obj, c0 c0Var) {
        if (((Integer) obj).intValue() == 0) {
            return c0Var;
        }
        return null;
    }

    @Override // j4.j
    public final void v(Object obj, a aVar, s2 s2Var) {
        Integer num = (Integer) obj;
        if (this.q != null) {
            return;
        }
        if (this.o == -1) {
            this.o = s2Var.h();
        } else if (s2Var.h() != this.o) {
            this.q = new x4();
            return;
        }
        int length = this.p.length;
        s2[] s2VarArr = this.l;
        if (length == 0) {
            this.p = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.o, s2VarArr.length);
        }
        ArrayList arrayList = this.m;
        arrayList.remove(aVar);
        s2VarArr[num.intValue()] = s2Var;
        if (arrayList.isEmpty()) {
            m(s2VarArr[0]);
        }
    }
}
