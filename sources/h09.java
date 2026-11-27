// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class h09 {
    public final Class a;
    public final Class b;

    public h09(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    public static h09 a(Class cls) {
        return new h09(g09.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h09.class != obj.getClass()) {
            return false;
        }
        h09 h09Var = (h09) obj;
        if (this.b.equals(h09Var.b)) {
            return this.a.equals(h09Var.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.b;
        Class cls2 = this.a;
        if (cls2 == g09.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
