package ld;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class q0 implements a1 {
    public final boolean a;

    public q0(boolean z4) {
        this.a = z4;
    }

    @Override // ld.a1
    public final v1 c() {
        return null;
    }

    @Override // ld.a1
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
