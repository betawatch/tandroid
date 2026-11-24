// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class agd extends sfd {
    public final pw8 a;

    public agd(pw8 pw8Var) {
        this.a = pw8Var;
    }

    @Override // sfd
    public final Object a() {
        return this.a;
    }

    @Override // sfd
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof agd) {
            return this.a.equals(((agd) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + 1502476572;
    }

    public final String toString() {
        return kt6.o("Optional.of(", this.a.toString(), ")");
    }
}
