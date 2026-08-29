package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class q1 extends r1 {
    @Override // androidx.datastore.preferences.protobuf.r1
    public final boolean c(Object obj, long j10) {
        return this.a.getBoolean(obj, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.r1
    public final byte d(Object obj, long j10) {
        return this.a.getByte(obj, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.r1
    public final double e(Object obj, long j10) {
        return this.a.getDouble(obj, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.r1
    public final float f(Object obj, long j10) {
        return this.a.getFloat(obj, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.r1
    public final void k(Object obj, long j10, boolean z10) {
        this.a.putBoolean(obj, j10, z10);
    }

    @Override // androidx.datastore.preferences.protobuf.r1
    public final void l(Object obj, long j10, byte b10) {
        this.a.putByte(obj, j10, b10);
    }

    @Override // androidx.datastore.preferences.protobuf.r1
    public final void m(Object obj, long j10, double d) {
        this.a.putDouble(obj, j10, d);
    }

    @Override // androidx.datastore.preferences.protobuf.r1
    public final void n(Object obj, long j10, float f9) {
        this.a.putFloat(obj, j10, f9);
    }
}
