// default package

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class if8 implements y6a, x81 {
    public final String a;
    public final hu4 b;
    public final byte c;
    public int d = -1;
    public final String[] e;
    public final List[] f;
    public final boolean[] g;
    public Map h;
    public final d26 i;
    public final d26 j;
    public final d26 k;

    /* JADX WARN: Multi-variable type inference failed */
    public if8(String str, hu4 hu4Var, int i) {
        this.a = str;
        this.b = hu4Var;
        this.c = i;
        String[] strArr = new String[i];
        final byte b = 0;
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = "[UNINITIALIZED]";
        }
        this.e = strArr;
        int i3 = this.c;
        this.f = new List[i3];
        this.g = new boolean[i3];
        this.h = o34.a;
        this.i = fpe.a(new pr4(this) { // from class: gf8
            public final /* synthetic */ if8 b;

            {
                this.b = this;
            }

            @Override // pr4
            public final Object invoke() {
                byte b2 = b;
                if8 if8Var = this.b;
                switch (b2) {
                    case 0:
                        return if8Var.b.a();
                    default:
                        y6a[] y6aVarArr = (y6a[]) if8Var.j.getValue();
                        y6aVarArr.getClass();
                        int hashCode = (if8Var.a().hashCode() * 31) + Arrays.hashCode(y6aVarArr);
                        int f = if8Var.f();
                        int i4 = 1;
                        while (true) {
                            int i5 = 0;
                            if (f > 0) {
                                int i6 = f - 1;
                                int i7 = i4 * 31;
                                String a = if8Var.i(if8Var.f() - f).a();
                                if (a != null) {
                                    i5 = a.hashCode();
                                }
                                i4 = i7 + i5;
                                f = i6;
                            } else {
                                int f2 = if8Var.f();
                                int i8 = 1;
                                while (true) {
                                    if (!(f2 > 0)) {
                                        return Integer.valueOf((((hashCode * 31) + i4) * 31) + i8);
                                    }
                                    int i9 = f2 - 1;
                                    int i10 = i8 * 31;
                                    yve e = if8Var.i(if8Var.f() - f2).e();
                                    i8 = i10 + (e != null ? e.hashCode() : 0);
                                    f2 = i9;
                                }
                            }
                        }
                }
            }
        });
        this.j = fpe.a(new hf8(this));
        final byte b2 = 1;
        this.k = fpe.a(new pr4(this) { // from class: gf8
            public final /* synthetic */ if8 b;

            {
                this.b = this;
            }

            @Override // pr4
            public final Object invoke() {
                byte b22 = b2;
                if8 if8Var = this.b;
                switch (b22) {
                    case 0:
                        return if8Var.b.a();
                    default:
                        y6a[] y6aVarArr = (y6a[]) if8Var.j.getValue();
                        y6aVarArr.getClass();
                        int hashCode = (if8Var.a().hashCode() * 31) + Arrays.hashCode(y6aVarArr);
                        int f = if8Var.f();
                        int i4 = 1;
                        while (true) {
                            int i5 = 0;
                            if (f > 0) {
                                int i6 = f - 1;
                                int i7 = i4 * 31;
                                String a = if8Var.i(if8Var.f() - f).a();
                                if (a != null) {
                                    i5 = a.hashCode();
                                }
                                i4 = i7 + i5;
                                f = i6;
                            } else {
                                int f2 = if8Var.f();
                                int i8 = 1;
                                while (true) {
                                    if (!(f2 > 0)) {
                                        return Integer.valueOf((((hashCode * 31) + i4) * 31) + i8);
                                    }
                                    int i9 = f2 - 1;
                                    int i10 = i8 * 31;
                                    yve e = if8Var.i(if8Var.f() - f2).e();
                                    i8 = i10 + (e != null ? e.hashCode() : 0);
                                    f2 = i9;
                                }
                            }
                        }
                }
            }
        });
    }

    @Override // y6a
    public final String a() {
        return this.a;
    }

    @Override // x81
    public final Set b() {
        return this.h.keySet();
    }

    @Override // y6a
    public final boolean c() {
        return false;
    }

    @Override // y6a
    public final int d(String str) {
        str.getClass();
        Integer num = (Integer) this.h.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // y6a
    public final yve e() {
        return xbb.b;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj instanceof if8) {
            y6a y6aVar = (y6a) obj;
            if (this.a.equals(y6aVar.a()) && Arrays.equals((y6a[]) this.j.getValue(), (y6a[]) ((if8) obj).j.getValue())) {
                int f = y6aVar.f();
                byte b = this.c;
                if (b == f) {
                    for (0; i < b; i + 1) {
                        i = (rr5.a(i(i).a(), y6aVar.i(i).a()) && rr5.a(i(i).e(), y6aVar.i(i).e())) ? i + 1 : 0;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // y6a
    public final int f() {
        return this.c;
    }

    @Override // y6a
    public final String g(int i) {
        return this.e[i];
    }

    @Override // y6a
    public final List getAnnotations() {
        return n34.a;
    }

    @Override // y6a
    public final List h(int i) {
        List list = this.f[i];
        return list == null ? n34.a : list;
    }

    public final int hashCode() {
        return ((Number) this.k.getValue()).intValue();
    }

    @Override // y6a
    public final y6a i(int i) {
        return ((cx5[]) this.i.getValue())[i].d();
    }

    @Override // y6a
    public final boolean isInline() {
        return false;
    }

    public final void j(String str, boolean z) {
        int i = this.d + 1;
        this.d = i;
        String[] strArr = this.e;
        strArr[i] = str;
        this.g[i] = z;
        this.f[i] = null;
        if (i == this.c - 1) {
            HashMap hashMap = new HashMap();
            int length = strArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                hashMap.put(strArr[i2], Integer.valueOf(i2));
            }
            this.h = hashMap;
        }
    }

    public final String toString() {
        return km2.f(lue.a(0, this.c), ", ", this.a.concat("("), ")", new z1((Object) this, (byte) 7), 24);
    }
}
