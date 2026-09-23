package e2;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final class o {
    public final Object a;
    public b2.p b = new b2.p();
    public boolean c;
    public boolean d;

    public o(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((o) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
