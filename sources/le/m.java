package le;

import b8.hb;
import b8.jd;
import db.g0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class m implements je.d, b {
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

    public m(String str, e eVar, int i3) {
        this.a = str;
        this.b = eVar;
        this.c = i3;
        String[] strArr = new String[i3];
        final int i10 = 0;
        for (int i11 = 0; i11 < i3; i11++) {
            strArr[i11] = "[UNINITIALIZED]";
        }
        this.e = strArr;
        int i12 = this.c;
        this.f = new List[i12];
        this.g = new boolean[i12];
        this.h = ed.p.a;
        dd.d[] dVarArr = dd.d.a;
        this.i = hb.a(new od.a(this) { // from class: le.l
            public final /* synthetic */ m b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r1v0, types: [dd.c, java.lang.Object] */
            @Override // od.a
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return this.b.b.b();
                    default:
                        m mVar = this.b;
                        je.d[] typeParams = (je.d[]) mVar.j.getValue();
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
                                    jd e10 = mVar.i(mVar.f() - f11).e();
                                    i17 = i19 + (e10 != null ? e10.hashCode() : 0);
                                    f11 = i18;
                                }
                            }
                        }
                }
            }
        });
        this.j = hb.a(new g0(this));
        final int i13 = 1;
        this.k = hb.a(new od.a(this) { // from class: le.l
            public final /* synthetic */ m b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r1v0, types: [dd.c, java.lang.Object] */
            @Override // od.a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return this.b.b.b();
                    default:
                        m mVar = this.b;
                        je.d[] typeParams = (je.d[]) mVar.j.getValue();
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
                                    jd e10 = mVar.i(mVar.f() - f11).e();
                                    i17 = i19 + (e10 != null ? e10.hashCode() : 0);
                                    f11 = i18;
                                }
                            }
                        }
                }
            }
        });
    }

    @Override // je.d
    public final String a() {
        return this.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // le.b
    public final Set b() {
        return this.h.keySet();
    }

    @Override // je.d
    public final boolean c() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    @Override // je.d
    public final int d(String name) {
        kotlin.jvm.internal.j.e(name, "name");
        Integer num = (Integer) this.h.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // je.d
    public final jd e() {
        return je.f.b;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [dd.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [dd.c, java.lang.Object] */
    public boolean equals(Object obj) {
        int i3;
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            je.d dVar = (je.d) obj;
            if (this.a.equals(dVar.a()) && Arrays.equals((je.d[]) this.j.getValue(), (je.d[]) ((m) obj).j.getValue())) {
                int f10 = dVar.f();
                int i10 = this.c;
                if (i10 == f10) {
                    for (0; i3 < i10; i3 + 1) {
                        i3 = (kotlin.jvm.internal.j.a(i(i3).a(), dVar.i(i3).a()) && kotlin.jvm.internal.j.a(i(i3).e(), dVar.i(i3).e())) ? i3 + 1 : 0;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // je.d
    public final int f() {
        return this.c;
    }

    @Override // je.d
    public final String g(int i3) {
        return this.e[i3];
    }

    @Override // je.d
    public final List getAnnotations() {
        return ed.o.a;
    }

    @Override // je.d
    public final List h(int i3) {
        List list = this.f[i3];
        return list == null ? ed.o.a : list;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [dd.c, java.lang.Object] */
    public int hashCode() {
        return ((Number) this.k.getValue()).intValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [dd.c, java.lang.Object] */
    @Override // je.d
    public final je.d i(int i3) {
        return ((he.a[]) this.i.getValue())[i3].d();
    }

    @Override // je.d
    public boolean isInline() {
        return false;
    }

    @Override // je.d
    public final boolean j(int i3) {
        return this.g[i3];
    }

    public final void k(String str, boolean z10) {
        int i3 = this.d + 1;
        this.d = i3;
        String[] strArr = this.e;
        strArr[i3] = str;
        this.g[i3] = z10;
        this.f[i3] = null;
        if (i3 == this.c - 1) {
            HashMap hashMap = new HashMap();
            int length = strArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                hashMap.put(strArr[i10], Integer.valueOf(i10));
            }
            this.h = hashMap;
        }
    }

    public final String toString() {
        return ed.g.g(x7.n.a(0, this.c), ", ", this.a.concat("("), ")", new c1.b(this, 6), 24);
    }
}
