// default package

import sun.misc.Unsafe;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class h2f extends c8c {
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h2f(Unsafe unsafe, byte b) {
        super(unsafe);
        this.b = b;
    }

    @Override // c8c
    public final byte j(Object obj, long j) {
        switch (this.b) {
            case 0:
                if (!k2f.g) {
                    break;
                } else {
                    break;
                }
            default:
                if (!k2f.g) {
                    break;
                } else {
                    break;
                }
        }
        return k2f.o(obj, j);
    }

    @Override // c8c
    public final void l(long j, Object obj, byte b) {
        switch (this.b) {
            case 0:
                if (!k2f.g) {
                    k2f.j(obj, j, b);
                    break;
                } else {
                    k2f.h(j, obj, b);
                    break;
                }
            default:
                if (!k2f.g) {
                    k2f.j(obj, j, b);
                    break;
                } else {
                    k2f.h(j, obj, b);
                    break;
                }
        }
    }

    @Override // c8c
    public final void m(Object obj, long j, double d) {
        switch (this.b) {
            case 0:
                this.a.putLong(obj, j, Double.doubleToLongBits(d));
                break;
            default:
                this.a.putLong(obj, j, Double.doubleToLongBits(d));
                break;
        }
    }

    @Override // c8c
    public final void n(Object obj, long j, float f) {
        switch (this.b) {
            case 0:
                this.a.putInt(obj, j, Float.floatToIntBits(f));
                break;
            default:
                this.a.putInt(obj, j, Float.floatToIntBits(f));
                break;
        }
    }

    @Override // c8c
    public final void o(Object obj, long j, boolean z) {
        switch (this.b) {
            case 0:
                if (!k2f.g) {
                    k2f.j(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    k2f.h(j, obj, z ? (byte) 1 : (byte) 0);
                    break;
                }
            default:
                if (!k2f.g) {
                    k2f.j(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    k2f.h(j, obj, z ? (byte) 1 : (byte) 0);
                    break;
                }
        }
    }

    @Override // c8c
    public final boolean q(Object obj, long j) {
        switch (this.b) {
            case 0:
                if (k2f.g) {
                    if (k2f.n(obj, j) == 0) {
                    }
                } else if (k2f.o(obj, j) == 0) {
                }
                break;
            default:
                if (k2f.g) {
                    if (k2f.n(obj, j) == 0) {
                    }
                } else if (k2f.o(obj, j) == 0) {
                }
                break;
        }
        return true;
    }

    @Override // c8c
    public final float r(Object obj, long j) {
        switch (this.b) {
        }
        return Float.intBitsToFloat(this.a.getInt(obj, j));
    }

    @Override // c8c
    public final double t(Object obj, long j) {
        switch (this.b) {
        }
        return Double.longBitsToDouble(this.a.getLong(obj, j));
    }
}
