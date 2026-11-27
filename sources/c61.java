// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class c61 extends ka {
    public final u51 c;

    public c61(int i, u51 u51Var) {
        super(i, false);
        this.c = u51Var;
    }

    public final boolean equals(Object obj) {
        u51 u51Var;
        if (this == obj) {
            return true;
        }
        if (obj == null || c61.class != obj.getClass()) {
            return false;
        }
        c61 c61Var = (c61) obj;
        if (this.a != c61Var.a) {
            return false;
        }
        u51 u51Var2 = this.c;
        return u51Var2 == null || (u51Var = c61Var.c) == null || u51Var2.a == u51Var.a;
    }
}
