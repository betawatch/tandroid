package ce;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class r0 implements b1 {
    public final boolean a;

    public r0(boolean z10) {
        this.a = z10;
    }

    @Override // ce.b1
    public final w1 c() {
        return null;
    }

    @Override // ce.b1
    public final boolean isActive() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Empty{");
        sb2.append(this.a ? "Active" : "New");
        sb2.append('}');
        return sb2.toString();
    }
}
