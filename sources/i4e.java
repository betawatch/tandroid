// default package

import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class i4e extends cac {
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i4e(Unsafe unsafe, byte b) {
        super(unsafe);
        this.b = b;
    }

    @Override // cac
    public final double A(Object obj, long j) {
        switch (this.b) {
        }
        return Double.longBitsToDouble(this.a.getLong(obj, j));
    }

    @Override // cac
    public final byte B(long j, Object obj) {
        switch (this.b) {
            case 0:
                if (!k4e.h) {
                    break;
                } else {
                    break;
                }
            default:
                if (!k4e.h) {
                    break;
                } else {
                    break;
                }
        }
        return k4e.n(j, obj);
    }

    @Override // cac
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

    @Override // cac
    public final void n(Object obj, long j, float f) {
        byte b = this.b;
        int floatToIntBits = Float.floatToIntBits(f);
        switch (b) {
            case 0:
                this.a.putInt(obj, j, floatToIntBits);
                break;
            default:
                this.a.putInt(obj, j, floatToIntBits);
                break;
        }
    }

    @Override // cac
    public final void o(Object obj, long j, boolean z) {
        switch (this.b) {
            case 0:
                if (!k4e.h) {
                    k4e.e(j, obj, z ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    k4e.b(j, obj, z ? (byte) 1 : (byte) 0);
                    break;
                }
            default:
                if (!k4e.h) {
                    k4e.e(j, obj, z ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    k4e.b(j, obj, z ? (byte) 1 : (byte) 0);
                    break;
                }
        }
    }

    @Override // cac
    public final boolean y(long j, Object obj) {
        switch (this.b) {
            case 0:
                if (k4e.h) {
                    if (k4e.m(j, obj) == 0) {
                    }
                } else if (k4e.n(j, obj) == 0) {
                }
                break;
            default:
                if (k4e.h) {
                    if (k4e.m(j, obj) == 0) {
                    }
                } else if (k4e.n(j, obj) == 0) {
                }
                break;
        }
        return true;
    }

    @Override // cac
    public final float z(long j, Object obj) {
        switch (this.b) {
        }
        return Float.intBitsToFloat(this.a.getInt(obj, j));
    }
}
