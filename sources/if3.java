// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class if3 {
    public final yy8 a;
    public final byte b;
    public final byte c;

    /* JADX WARN: Multi-variable type inference failed */
    public if3(yy8 yy8Var, int i, int i2) {
        kte.a(yy8Var, "Null dependency anInterface.");
        this.a = yy8Var;
        this.b = i;
        this.c = i2;
    }

    public static if3 a(yy8 yy8Var) {
        return new if3(yy8Var, 1, 0);
    }

    public static if3 b(Class cls) {
        return new if3(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof if3)) {
            return false;
        }
        if3 if3Var = (if3) obj;
        return this.a.equals(if3Var.a) && this.b == if3Var.b && this.c == if3Var.c;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.a);
        sb.append(", type=");
        byte b = this.b;
        sb.append(b == 1 ? "required" : b == 0 ? "optional" : "set");
        sb.append(", injection=");
        byte b2 = this.c;
        if (b2 == 0) {
            str = "direct";
        } else if (b2 == 1) {
            str = "provider";
        } else {
            if (b2 != 2) {
                bh7.j(hg9.j(b2, "Unsupported injection: "));
                return null;
            }
            str = "deferred";
        }
        return b10.j(sb, str, "}");
    }

    public if3(int i, int i2, Class cls) {
        this(yy8.a(cls), i, i2);
    }
}
