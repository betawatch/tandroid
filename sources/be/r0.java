package be;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final class r0 implements b1 {
    public final boolean a;

    public r0(boolean z10) {
        this.a = z10;
    }

    @Override // be.b1
    public final w1 c() {
        return null;
    }

    @Override // be.b1
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
