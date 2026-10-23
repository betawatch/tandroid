package be;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
