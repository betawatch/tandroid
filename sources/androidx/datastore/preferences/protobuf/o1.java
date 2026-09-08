package androidx.datastore.preferences.protobuf;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class o1 extends q1 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o1(Unsafe unsafe, int i10) {
        super(unsafe);
        this.b = i10;
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public final boolean c(Object obj, long j3) {
        switch (this.b) {
            case 0:
                if (r1.h) {
                    if (r1.g(obj, j3) != 0) {
                    }
                } else if (r1.h(obj, j3) != 0) {
                }
                break;
            default:
                if (r1.h) {
                    if (r1.g(obj, j3) != 0) {
                    }
                } else if (r1.h(obj, j3) != 0) {
                }
                break;
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public final byte d(Object obj, long j3) {
        switch (this.b) {
            case 0:
                if (!r1.h) {
                    break;
                } else {
                    break;
                }
            default:
                if (!r1.h) {
                    break;
                } else {
                    break;
                }
        }
        return r1.h(obj, j3);
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public final double e(Object obj, long j3) {
        switch (this.b) {
        }
        return Double.longBitsToDouble(h(obj, j3));
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public final float f(Object obj, long j3) {
        switch (this.b) {
        }
        return Float.intBitsToFloat(g(obj, j3));
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public final void k(Object obj, long j3, boolean z10) {
        switch (this.b) {
            case 0:
                if (!r1.h) {
                    r1.l(obj, j3, z10 ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    r1.k(obj, j3, z10 ? (byte) 1 : (byte) 0);
                    break;
                }
            default:
                if (!r1.h) {
                    r1.l(obj, j3, z10 ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    r1.k(obj, j3, z10 ? (byte) 1 : (byte) 0);
                    break;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public final void l(Object obj, long j3, byte b10) {
        switch (this.b) {
            case 0:
                if (!r1.h) {
                    r1.l(obj, j3, b10);
                    break;
                } else {
                    r1.k(obj, j3, b10);
                    break;
                }
            default:
                if (!r1.h) {
                    r1.l(obj, j3, b10);
                    break;
                } else {
                    r1.k(obj, j3, b10);
                    break;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public final void m(Object obj, long j3, double d) {
        switch (this.b) {
            case 0:
                p(obj, j3, Double.doubleToLongBits(d));
                break;
            default:
                p(obj, j3, Double.doubleToLongBits(d));
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public final void n(Object obj, long j3, float f7) {
        switch (this.b) {
            case 0:
                o(j3, obj, Float.floatToIntBits(f7));
                break;
            default:
                o(j3, obj, Float.floatToIntBits(f7));
                break;
        }
    }
}
