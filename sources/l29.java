// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class l29 extends ja {
    public final k39 c;

    public l29(int i, k39 k39Var) {
        super(i, false);
        this.c = k39Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l29.class == obj.getClass()) {
            l29 l29Var = (l29) obj;
            int i = this.a;
            int i2 = l29Var.a;
            if (i == i2 && (i == 0 || i == 3)) {
                k39 k39Var = this.c;
                return k39Var != null && k39Var.equals(l29Var.c);
            }
            if (i == i2) {
                return true;
            }
        }
        return false;
    }
}
