package ce;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
