// default package

import sun.misc.Unsafe;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class a6c extends c6c {
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a6c(Unsafe unsafe, byte b) {
        super(unsafe);
        this.b = b;
    }

    @Override // c6c
    public final boolean a(Object obj, long j) {
        switch (this.b) {
            case 0:
                if (d6c.g) {
                    break;
                } else if (((byte) ((d6c.f(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & kk7.d4)) != 0) {
                }
                break;
            default:
                if (d6c.g) {
                    break;
                } else if (((byte) ((d6c.f(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & kk7.d4)) != 0) {
                }
                break;
        }
        return d6c.e(obj, j);
    }

    @Override // c6c
    public final double b(Object obj, long j) {
        switch (this.b) {
        }
        return Double.longBitsToDouble(this.a.getLong(obj, j));
    }

    @Override // c6c
    public final float c(Object obj, long j) {
        switch (this.b) {
        }
        return Float.intBitsToFloat(this.a.getInt(obj, j));
    }

    @Override // c6c
    public final void d(Object obj, long j, boolean z) {
        switch (this.b) {
            case 0:
                if (!d6c.g) {
                    d6c.l(j, obj, z ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    d6c.k(j, obj, z ? (byte) 1 : (byte) 0);
                    break;
                }
            default:
                if (!d6c.g) {
                    d6c.l(j, obj, z ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    d6c.k(j, obj, z ? (byte) 1 : (byte) 0);
                    break;
                }
        }
    }

    @Override // c6c
    public final void e(long j, Object obj, byte b) {
        switch (this.b) {
            case 0:
                if (!d6c.g) {
                    d6c.l(j, obj, b);
                    break;
                } else {
                    d6c.k(j, obj, b);
                    break;
                }
            default:
                if (!d6c.g) {
                    d6c.l(j, obj, b);
                    break;
                } else {
                    d6c.k(j, obj, b);
                    break;
                }
        }
    }

    @Override // c6c
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

    @Override // c6c
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

    @Override // c6c
    public final boolean i() {
        byte b = this.b;
        return false;
    }
}
