package f9;

import a8.xb;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class o1 {
    public final Object a;
    public int b;
    public final /* synthetic */ p1 c;

    public o1(p1 p1Var, int i10) {
        this.c = p1Var;
        this.a = p1Var.a[i10];
        this.b = i10;
    }

    public final int a() {
        int i10 = this.b;
        Object obj = this.a;
        p1 p1Var = this.c;
        if (i10 == -1 || i10 >= p1Var.c || !xb.a(obj, p1Var.a[i10])) {
            this.b = p1Var.c(obj);
        }
        int i11 = this.b;
        if (i11 == -1) {
            return 0;
        }
        return p1Var.b[i11];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o1) {
            o1 o1Var = (o1) obj;
            if (a() == o1Var.a() && xb.a(this.a, o1Var.a)) {
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
