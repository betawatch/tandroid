package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class p1 extends q1 {
    @Override // androidx.datastore.preferences.protobuf.q1
    public final boolean c(Object obj, long j3) {
        return this.a.getBoolean(obj, j3);
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public final byte d(Object obj, long j3) {
        return this.a.getByte(obj, j3);
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public final double e(Object obj, long j3) {
        return this.a.getDouble(obj, j3);
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public final float f(Object obj, long j3) {
        return this.a.getFloat(obj, j3);
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public final void k(Object obj, long j3, boolean z10) {
        this.a.putBoolean(obj, j3, z10);
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public final void l(Object obj, long j3, byte b10) {
        this.a.putByte(obj, j3, b10);
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public final void m(Object obj, long j3, double d) {
        this.a.putDouble(obj, j3, d);
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public final void n(Object obj, long j3, float f7) {
        this.a.putFloat(obj, j3, f7);
    }
}
