package e9;

import v7.t6;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final class t1 {
    public final Object a;
    public int b;
    public final /* synthetic */ u1 c;

    public t1(u1 u1Var, int i10) {
        this.c = u1Var;
        this.a = u1Var.a[i10];
        this.b = i10;
    }

    public final int a() {
        int i10 = this.b;
        Object obj = this.a;
        u1 u1Var = this.c;
        if (i10 == -1 || i10 >= u1Var.c || !t6.a(obj, u1Var.a[i10])) {
            this.b = u1Var.c(obj);
        }
        int i11 = this.b;
        if (i11 == -1) {
            return 0;
        }
        return u1Var.b[i11];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t1) {
            t1 t1Var = (t1) obj;
            if (a() == t1Var.a() && t6.a(this.a, t1Var.a)) {
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
        int a2 = a();
        if (a2 == 1) {
            return valueOf;
        }
        return valueOf + " x " + a2;
    }
}
