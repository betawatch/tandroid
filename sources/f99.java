// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class f99 {
    public static final f99 c = new f99(0, false);
    public final byte a;
    public final boolean b;

    /* JADX WARN: Multi-variable type inference failed */
    public f99(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f99.class != obj.getClass()) {
            return false;
        }
        f99 f99Var = (f99) obj;
        return this.a == f99Var.a && this.b == f99Var.b;
    }

    public final int hashCode() {
        return (this.a << 1) + (this.b ? 1 : 0);
    }
}
