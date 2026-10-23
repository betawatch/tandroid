package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes.dex */
public final class p1 extends q1 {
    @Override // androidx.datastore.preferences.protobuf.q1
    public final boolean c(Object obj, long j10) {
        return this.a.getBoolean(obj, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public final byte d(Object obj, long j10) {
        return this.a.getByte(obj, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public final double e(Object obj, long j10) {
        return this.a.getDouble(obj, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public final float f(Object obj, long j10) {
        return this.a.getFloat(obj, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public final void k(Object obj, long j10, boolean z10) {
        this.a.putBoolean(obj, j10, z10);
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public final void l(Object obj, long j10, byte b10) {
        this.a.putByte(obj, j10, b10);
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public final void m(Object obj, long j10, double d) {
        this.a.putDouble(obj, j10, d);
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public final void n(Object obj, long j10, float f7) {
        this.a.putFloat(obj, j10, f7);
    }
}
