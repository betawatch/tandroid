package h9;

import a8.ia;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class o1 {
    public final Object a;
    public int b;
    public final /* synthetic */ p1 c;

    public o1(p1 p1Var, int i7) {
        this.c = p1Var;
        this.a = p1Var.a[i7];
        this.b = i7;
    }

    public final int a() {
        int i7 = this.b;
        Object obj = this.a;
        p1 p1Var = this.c;
        if (i7 == -1 || i7 >= p1Var.c || !ia.a(obj, p1Var.a[i7])) {
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
            if (a() == o1Var.a() && ia.a(this.a, o1Var.a)) {
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
