// default package

import sun.misc.Unsafe;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class aac extends cac {
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aac(Unsafe unsafe, byte b) {
        super(unsafe);
        this.b = b;
    }

    @Override // cac
    public final boolean a(long j, Object obj) {
        switch (this.b) {
            case 0:
                if (dac.g) {
                    break;
                } else if (((byte) ((dac.f((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & jn7.d4)) != 0) {
                }
                break;
            default:
                if (dac.g) {
                    break;
                } else if (((byte) ((dac.f((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & jn7.d4)) != 0) {
                }
                break;
        }
        return dac.e(j, obj);
    }

    @Override // cac
    public final double b(long j, Object obj) {
        switch (this.b) {
        }
        return Double.longBitsToDouble(this.a.getLong(obj, j));
    }

    @Override // cac
    public final float c(long j, Object obj) {
        switch (this.b) {
        }
        return Float.intBitsToFloat(this.a.getInt(obj, j));
    }

    @Override // cac
    public final void d(Object obj, long j, boolean z) {
        switch (this.b) {
            case 0:
                if (!dac.g) {
                    dac.l(j, obj, z ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    dac.k(j, obj, z ? (byte) 1 : (byte) 0);
                    break;
                }
            default:
                if (!dac.g) {
                    dac.l(j, obj, z ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    dac.k(j, obj, z ? (byte) 1 : (byte) 0);
                    break;
                }
        }
    }

    @Override // cac
    public final void e(long j, Object obj, byte b) {
        switch (this.b) {
            case 0:
                if (!dac.g) {
                    dac.l(j, obj, b);
                    break;
                } else {
                    dac.k(j, obj, b);
                    break;
                }
            default:
                if (!dac.g) {
                    dac.l(j, obj, b);
                    break;
                } else {
                    dac.k(j, obj, b);
                    break;
                }
        }
    }

    @Override // cac
    public final void f(Object obj, long j, double d) {
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
    public final void g(Object obj, long j, float f) {
        switch (this.b) {
            case 0:
                this.a.putInt(obj, j, Float.floatToIntBits(f));
                break;
            default:
                this.a.putInt(obj, j, Float.floatToIntBits(f));
                break;
        }
    }

    @Override // cac
    public final boolean i() {
        byte b = this.b;
        return false;
    }
}
