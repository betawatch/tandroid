package androidx.datastore.preferences.protobuf;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class k1 extends m1 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k1(Unsafe unsafe, int i3) {
        super(unsafe);
        this.b = i3;
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final boolean c(Object obj, long j10) {
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
        return n1.c(obj, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final double d(Object obj, long j10) {
        switch (this.b) {
        }
        return Double.longBitsToDouble(g(obj, j10));
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final float e(Object obj, long j10) {
        switch (this.b) {
        }
        return Float.intBitsToFloat(f(obj, j10));
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final void j(Object obj, long j10, boolean z10) {
        switch (this.b) {
            case 0:
                if (!n1.g) {
                    n1.l(obj, j10, z10 ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    n1.k(obj, j10, z10 ? (byte) 1 : (byte) 0);
                    break;
                }
            default:
                if (!n1.g) {
                    n1.l(obj, j10, z10 ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    n1.k(obj, j10, z10 ? (byte) 1 : (byte) 0);
                    break;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final void k(Object obj, long j10, byte b10) {
        switch (this.b) {
            case 0:
                if (!n1.g) {
                    n1.l(obj, j10, b10);
                    break;
                } else {
                    n1.k(obj, j10, b10);
                    break;
                }
            default:
                if (!n1.g) {
                    n1.l(obj, j10, b10);
                    break;
                } else {
                    n1.k(obj, j10, b10);
                    break;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final void l(Object obj, long j10, double d) {
        switch (this.b) {
            case 0:
                o(obj, j10, Double.doubleToLongBits(d));
                break;
            default:
                o(obj, j10, Double.doubleToLongBits(d));
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final void m(Object obj, long j10, float f10) {
        switch (this.b) {
            case 0:
                n(j10, obj, Float.floatToIntBits(f10));
                break;
            default:
                n(j10, obj, Float.floatToIntBits(f10));
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
