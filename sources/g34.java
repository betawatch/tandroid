// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class g34 implements ep5 {
    public final boolean a;

    public g34(boolean z) {
        this.a = z;
    }

    @Override // ep5
    public final ul7 b() {
        return null;
    }

    @Override // ep5
    public final boolean isActive() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.a ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
