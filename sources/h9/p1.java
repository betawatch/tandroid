package h9;

import a8.ka;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
        if (i7 == -1 || i7 >= q1Var.c || !ka.a(obj, q1Var.a[i7])) {
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
            if (a() == p1Var.a() && ka.a(this.a, p1Var.a)) {
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
