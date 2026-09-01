package androidx.datastore.preferences.protobuf;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class p1 extends r1 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p1(Unsafe unsafe, int i10) {
        super(unsafe);
        this.b = i10;
    }

    @Override // androidx.datastore.preferences.protobuf.r1
    public final boolean c(Object obj, long j10) {
        switch (this.b) {
            case 0:
                if (s1.h) {
                    if (s1.g(obj, j10) != 0) {
                    }
                } else if (s1.h(obj, j10) != 0) {
                }
                break;
            default:
                if (s1.h) {
                    if (s1.g(obj, j10) != 0) {
                    }
                } else if (s1.h(obj, j10) != 0) {
                }
                break;
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.r1
    public final byte d(Object obj, long j10) {
        switch (this.b) {
            case 0:
                if (!s1.h) {
                    break;
                } else {
                    break;
                }
            default:
                if (!s1.h) {
                    break;
                } else {
                    break;
                }
        }
        return s1.h(obj, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.r1
    public final double e(Object obj, long j10) {
        switch (this.b) {
        }
        return Double.longBitsToDouble(h(obj, j10));
    }

    @Override // androidx.datastore.preferences.protobuf.r1
    public final float f(Object obj, long j10) {
        switch (this.b) {
        }
        return Float.intBitsToFloat(g(obj, j10));
    }

    @Override // androidx.datastore.preferences.protobuf.r1
    public final void k(Object obj, long j10, boolean z4) {
        switch (this.b) {
            case 0:
                if (!s1.h) {
                    s1.l(obj, j10, z4 ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    s1.k(obj, j10, z4 ? (byte) 1 : (byte) 0);
                    break;
                }
            default:
                if (!s1.h) {
                    s1.l(obj, j10, z4 ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    s1.k(obj, j10, z4 ? (byte) 1 : (byte) 0);
                    break;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.r1
    public final void l(Object obj, long j10, byte b10) {
        switch (this.b) {
            case 0:
                if (!s1.h) {
                    s1.l(obj, j10, b10);
                    break;
                } else {
                    s1.k(obj, j10, b10);
                    break;
                }
            default:
                if (!s1.h) {
                    s1.l(obj, j10, b10);
                    break;
                } else {
                    s1.k(obj, j10, b10);
                    break;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.r1
    public final void m(Object obj, long j10, double d) {
        switch (this.b) {
            case 0:
                p(obj, j10, Double.doubleToLongBits(d));
                break;
            default:
                p(obj, j10, Double.doubleToLongBits(d));
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.r1
    public final void n(Object obj, long j10, float f10) {
        switch (this.b) {
            case 0:
                o(j10, obj, Float.floatToIntBits(f10));
                break;
            default:
                o(j10, obj, Float.floatToIntBits(f10));
                break;
        }
    }
}
