package oe;

import a8.ab;
import c8.tc;
import c8.v9;
import gb.h0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public class m implements me.d, b {
    public final String a;
    public final e b;
    public final int c;
    public int d = -1;
    public final String[] e;
    public final List[] f;
    public final boolean[] g;
    public Object h;
    public final Object i;
    public final Object j;
    public final Object k;

    public m(String str, e eVar, int i7) {
        this.a = str;
        this.b = eVar;
        this.c = i7;
        String[] strArr = new String[i7];
        final int i10 = 0;
        for (int i11 = 0; i11 < i7; i11++) {
            strArr[i11] = "[UNINITIALIZED]";
        }
        this.e = strArr;
        int i12 = this.c;
        this.f = new List[i12];
        this.g = new boolean[i12];
        this.h = hd.o.a;
        gd.d[] dVarArr = gd.d.a;
        this.i = ab.a(new rd.a(this) { // from class: oe.l
            public final /* synthetic */ m b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r1v0, types: [gd.c, java.lang.Object] */
            @Override // rd.a
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return this.b.b.c();
                    default:
                        m mVar = this.b;
                        me.d[] typeParams = (me.d[]) mVar.j.getValue();
                        kotlin.jvm.internal.j.e(typeParams, "typeParams");
                        int hashCode = (mVar.a().hashCode() * 31) + Arrays.hashCode(typeParams);
                        int f10 = mVar.f();
                        int i13 = 1;
                        while (true) {
                            int i14 = 0;
                            if (f10 > 0) {
                                int i15 = f10 - 1;
                                int i16 = i13 * 31;
                                String a10 = mVar.i(mVar.f() - f10).a();
                                if (a10 != null) {
                                    i14 = a10.hashCode();
                                }
                                i13 = i16 + i14;
                                f10 = i15;
                            } else {
                                int f11 = mVar.f();
                                int i17 = 1;
                                while (true) {
                                    if (!(f11 > 0)) {
                                        return Integer.valueOf((((hashCode * 31) + i13) * 31) + i17);
                                    }
                                    int i18 = f11 - 1;
                                    int i19 = i17 * 31;
                                    v9 e10 = mVar.i(mVar.f() - f11).e();
                                    i17 = i19 + (e10 != null ? e10.hashCode() : 0);
                                    f11 = i18;
                                }
                            }
                        }
                }
            }
        });
        this.j = ab.a(new h0(this));
        final int i13 = 1;
        this.k = ab.a(new rd.a(this) { // from class: oe.l
            public final /* synthetic */ m b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r1v0, types: [gd.c, java.lang.Object] */
            @Override // rd.a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return this.b.b.c();
                    default:
                        m mVar = this.b;
                        me.d[] typeParams = (me.d[]) mVar.j.getValue();
                        kotlin.jvm.internal.j.e(typeParams, "typeParams");
                        int hashCode = (mVar.a().hashCode() * 31) + Arrays.hashCode(typeParams);
                        int f10 = mVar.f();
                        int i132 = 1;
                        while (true) {
                            int i14 = 0;
                            if (f10 > 0) {
                                int i15 = f10 - 1;
                                int i16 = i132 * 31;
                                String a10 = mVar.i(mVar.f() - f10).a();
                                if (a10 != null) {
                                    i14 = a10.hashCode();
                                }
                                i132 = i16 + i14;
                                f10 = i15;
                            } else {
                                int f11 = mVar.f();
                                int i17 = 1;
                                while (true) {
                                    if (!(f11 > 0)) {
                                        return Integer.valueOf((((hashCode * 31) + i132) * 31) + i17);
                                    }
                                    int i18 = f11 - 1;
                                    int i19 = i17 * 31;
                                    v9 e10 = mVar.i(mVar.f() - f11).e();
                                    i17 = i19 + (e10 != null ? e10.hashCode() : 0);
                                    f11 = i18;
                                }
                            }
                        }
                }
            }
        });
    }

    @Override // me.d
    public final String a() {
        return this.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // oe.b
    public final Set b() {
        return this.h.keySet();
    }

    @Override // me.d
    public final boolean c() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    @Override // me.d
    public final int d(String name) {
        kotlin.jvm.internal.j.e(name, "name");
        Integer num = (Integer) this.h.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // me.d
    public final v9 e() {
        return me.f.b;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [gd.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [gd.c, java.lang.Object] */
    public boolean equals(Object obj) {
        int i7;
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            me.d dVar = (me.d) obj;
            if (this.a.equals(dVar.a()) && Arrays.equals((me.d[]) this.j.getValue(), (me.d[]) ((m) obj).j.getValue())) {
                int f10 = dVar.f();
                int i10 = this.c;
                if (i10 == f10) {
                    for (0; i7 < i10; i7 + 1) {
                        i7 = (kotlin.jvm.internal.j.a(i(i7).a(), dVar.i(i7).a()) && kotlin.jvm.internal.j.a(i(i7).e(), dVar.i(i7).e())) ? i7 + 1 : 0;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // me.d
    public final int f() {
        return this.c;
    }

    @Override // me.d
    public final String g(int i7) {
        return this.e[i7];
    }

    @Override // me.d
    public final List getAnnotations() {
        return hd.n.a;
    }

    @Override // me.d
    public final List h(int i7) {
        List list = this.f[i7];
        return list == null ? hd.n.a : list;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [gd.c, java.lang.Object] */
    public int hashCode() {
        return ((Number) this.k.getValue()).intValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [gd.c, java.lang.Object] */
    @Override // me.d
    public final me.d i(int i7) {
        return ((ke.a[]) this.i.getValue())[i7].d();
    }

    @Override // me.d
    public boolean isInline() {
        return false;
    }

    @Override // me.d
    public final boolean j(int i7) {
        return this.g[i7];
    }

    public final void k(String str, boolean z9) {
        int i7 = this.d + 1;
        this.d = i7;
        String[] strArr = this.e;
        strArr[i7] = str;
        this.g[i7] = z9;
        this.f[i7] = null;
        if (i7 == this.c - 1) {
            HashMap hashMap = new HashMap();
            int length = strArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                hashMap.put(strArr[i10], Integer.valueOf(i10));
            }
            this.h = hashMap;
        }
    }

    public final String toString() {
        return hd.f.g(tc.a(0, this.c), ", ", this.a.concat("("), ")", new c1.b(this, 6), 24);
    }
}
