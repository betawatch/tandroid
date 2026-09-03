package ld;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
