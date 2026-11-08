package androidx.datastore.preferences.protobuf;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class k1 extends m1 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k1(Unsafe unsafe, int i7) {
        super(unsafe);
        this.b = i7;
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final boolean c(Object obj, long j3) {
        switch (this.b) {
            case 0:
                if (!n1.g) {
                    break;
                } else {
                    break;
                }
            default:
                if (!n1.g) {
                    break;
                } else {
                    break;
                }
        }
        return n1.c(obj, j3);
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final double d(Object obj, long j3) {
        switch (this.b) {
        }
        return Double.longBitsToDouble(g(obj, j3));
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final float e(Object obj, long j3) {
        switch (this.b) {
        }
        return Float.intBitsToFloat(f(obj, j3));
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final void j(Object obj, long j3, boolean z9) {
        switch (this.b) {
            case 0:
                if (!n1.g) {
                    n1.l(obj, j3, z9 ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    n1.k(obj, j3, z9 ? (byte) 1 : (byte) 0);
                    break;
                }
            default:
                if (!n1.g) {
                    n1.l(obj, j3, z9 ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    n1.k(obj, j3, z9 ? (byte) 1 : (byte) 0);
                    break;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final void k(Object obj, long j3, byte b10) {
        switch (this.b) {
            case 0:
                if (!n1.g) {
                    n1.l(obj, j3, b10);
                    break;
                } else {
                    n1.k(obj, j3, b10);
                    break;
                }
            default:
                if (!n1.g) {
                    n1.l(obj, j3, b10);
                    break;
                } else {
                    n1.k(obj, j3, b10);
                    break;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final void l(Object obj, long j3, double d) {
        switch (this.b) {
            case 0:
                o(obj, j3, Double.doubleToLongBits(d));
                break;
            default:
                o(obj, j3, Double.doubleToLongBits(d));
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final void m(Object obj, long j3, float f10) {
        switch (this.b) {
            case 0:
                n(j3, obj, Float.floatToIntBits(f10));
                break;
            default:
                n(j3, obj, Float.floatToIntBits(f10));
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final boolean r() {
        switch (this.b) {
        }
        return false;
    }
}
