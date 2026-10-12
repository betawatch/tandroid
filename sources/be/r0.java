package be;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
