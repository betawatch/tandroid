package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
