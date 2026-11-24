// default package

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class gd8 implements w4a, p71 {
    public final String a;
    public final gs4 b;
    public final byte c;
    public int d = -1;
    public final String[] e;
    public final List[] f;
    public final boolean[] g;
    public Map h;
    public final d06 i;
    public final d06 j;
    public final d06 k;

    /* JADX WARN: Multi-variable type inference failed */
    public gd8(String str, gs4 gs4Var, int i) {
        this.a = str;
        this.b = gs4Var;
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
        this.h = d24.a;
        this.i = cne.a(new op4(this) { // from class: ed8
            public final /* synthetic */ gd8 b;

            {
                this.b = this;
            }

            @Override // op4
            public final Object invoke() {
                byte b2 = b;
                gd8 gd8Var = this.b;
                switch (b2) {
                    case 0:
                        return gd8Var.b.a();
                    default:
                        w4a[] w4aVarArr = (w4a[]) gd8Var.j.getValue();
                        w4aVarArr.getClass();
                        int hashCode = (gd8Var.a().hashCode() * 31) + Arrays.hashCode(w4aVarArr);
                        int f = gd8Var.f();
                        int i4 = 1;
                        while (true) {
                            int i5 = 0;
                            if (f > 0) {
                                int i6 = f - 1;
                                int i7 = i4 * 31;
                                String a = gd8Var.i(gd8Var.f() - f).a();
                                if (a != null) {
                                    i5 = a.hashCode();
                                }
                                i4 = i7 + i5;
                                f = i6;
                            } else {
                                int f2 = gd8Var.f();
                                int i8 = 1;
                                while (true) {
                                    if (!(f2 > 0)) {
                                        return Integer.valueOf((((hashCode * 31) + i4) * 31) + i8);
                                    }
                                    int i9 = f2 - 1;
                                    int i10 = i8 * 31;
                                    vte e = gd8Var.i(gd8Var.f() - f2).e();
                                    i8 = i10 + (e != null ? e.hashCode() : 0);
                                    f2 = i9;
                                }
                            }
                        }
                }
            }
        });
        this.j = cne.a(new fd8(this));
        final byte b2 = 1;
        this.k = cne.a(new op4(this) { // from class: ed8
            public final /* synthetic */ gd8 b;

            {
                this.b = this;
            }

            @Override // op4
            public final Object invoke() {
                byte b22 = b2;
                gd8 gd8Var = this.b;
                switch (b22) {
                    case 0:
                        return gd8Var.b.a();
                    default:
                        w4a[] w4aVarArr = (w4a[]) gd8Var.j.getValue();
                        w4aVarArr.getClass();
                        int hashCode = (gd8Var.a().hashCode() * 31) + Arrays.hashCode(w4aVarArr);
                        int f = gd8Var.f();
                        int i4 = 1;
                        while (true) {
                            int i5 = 0;
                            if (f > 0) {
                                int i6 = f - 1;
                                int i7 = i4 * 31;
                                String a = gd8Var.i(gd8Var.f() - f).a();
                                if (a != null) {
                                    i5 = a.hashCode();
                                }
                                i4 = i7 + i5;
                                f = i6;
                            } else {
                                int f2 = gd8Var.f();
                                int i8 = 1;
                                while (true) {
                                    if (!(f2 > 0)) {
                                        return Integer.valueOf((((hashCode * 31) + i4) * 31) + i8);
                                    }
                                    int i9 = f2 - 1;
                                    int i10 = i8 * 31;
                                    vte e = gd8Var.i(gd8Var.f() - f2).e();
                                    i8 = i10 + (e != null ? e.hashCode() : 0);
                                    f2 = i9;
                                }
                            }
                        }
                }
            }
        });
    }

    @Override // w4a
    public final String a() {
        return this.a;
    }

    @Override // p71
    public final Set b() {
        return this.h.keySet();
    }

    @Override // w4a
    public final boolean c() {
        return false;
    }

    @Override // w4a
    public final int d(String str) {
        str.getClass();
        Integer num = (Integer) this.h.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // w4a
    public final vte e() {
        return v9b.b;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj instanceof gd8) {
            w4a w4aVar = (w4a) obj;
            if (this.a.equals(w4aVar.a()) && Arrays.equals((w4a[]) this.j.getValue(), (w4a[]) ((gd8) obj).j.getValue())) {
                int f = w4aVar.f();
                byte b = this.c;
                if (b == f) {
                    for (0; i < b; i + 1) {
                        i = (rp5.a(i(i).a(), w4aVar.i(i).a()) && rp5.a(i(i).e(), w4aVar.i(i).e())) ? i + 1 : 0;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // w4a
    public final int f() {
        return this.c;
    }

    @Override // w4a
    public final String g(int i) {
        return this.e[i];
    }

    @Override // w4a
    public final List getAnnotations() {
        return c24.a;
    }

    @Override // w4a
    public final List h(int i) {
        List list = this.f[i];
        return list == null ? c24.a : list;
    }

    public final int hashCode() {
        return ((Number) this.k.getValue()).intValue();
    }

    @Override // w4a
    public final w4a i(int i) {
        return ((cv5[]) this.i.getValue())[i].d();
    }

    @Override // w4a
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
        return yk2.f(ise.a(0, this.c), ", ", this.a.concat("("), ")", new z1((Object) this, (byte) 7), 24);
    }
}
