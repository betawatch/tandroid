package g9;

import b8.yb;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class o1 {
    public final Object a;
    public int b;
    public final /* synthetic */ p1 c;

    public o1(p1 p1Var, int i3) {
        this.c = p1Var;
        this.a = p1Var.a[i3];
        this.b = i3;
    }

    public final int a() {
        int i3 = this.b;
        Object obj = this.a;
        p1 p1Var = this.c;
        if (i3 == -1 || i3 >= p1Var.c || !yb.a(obj, p1Var.a[i3])) {
            this.b = p1Var.c(obj);
        }
        int i10 = this.b;
        if (i10 == -1) {
            return 0;
        }
        return p1Var.b[i10];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o1) {
            o1 o1Var = (o1) obj;
            if (a() == o1Var.a() && yb.a(this.a, o1Var.a)) {
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
