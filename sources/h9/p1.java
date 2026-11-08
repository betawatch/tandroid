package h9;

import a8.ha;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class p1 {
    public final Object a;
    public int b;
    public final /* synthetic */ q1 c;

    public p1(q1 q1Var, int i7) {
        this.c = q1Var;
        this.a = q1Var.a[i7];
        this.b = i7;
    }

    public final int a() {
        int i7 = this.b;
        Object obj = this.a;
        q1 q1Var = this.c;
        if (i7 == -1 || i7 >= q1Var.c || !ha.a(obj, q1Var.a[i7])) {
            this.b = q1Var.c(obj);
        }
        int i10 = this.b;
        if (i10 == -1) {
            return 0;
        }
        return q1Var.b[i10];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p1) {
            p1 p1Var = (p1) obj;
            if (a() == p1Var.a() && ha.a(this.a, p1Var.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        return (obj == null ? 0 : obj.hashCode()) ^ a();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int a10 = a();
        if (a10 == 1) {
            return valueOf;
        }
        return valueOf + " x " + a10;
    }
}
