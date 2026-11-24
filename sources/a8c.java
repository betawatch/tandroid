// default package

import sun.misc.Unsafe;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class a8c extends c8c {
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a8c(Unsafe unsafe, byte b) {
        super(unsafe);
        this.b = b;
    }

    @Override // c8c
    public final boolean a(Object obj, long j) {
        switch (this.b) {
            case 0:
                if (d8c.g) {
                    break;
                } else if (((byte) ((d8c.f(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & nm7.d4)) != 0) {
                }
                break;
            default:
                if (d8c.g) {
                    break;
                } else if (((byte) ((d8c.f(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & nm7.d4)) != 0) {
                }
                break;
        }
        return d8c.e(obj, j);
    }

    @Override // c8c
    public final double b(Object obj, long j) {
        switch (this.b) {
        }
        return Double.longBitsToDouble(this.a.getLong(obj, j));
    }

    @Override // c8c
    public final float c(Object obj, long j) {
        switch (this.b) {
        }
        return Float.intBitsToFloat(this.a.getInt(obj, j));
    }

    @Override // c8c
    public final void d(Object obj, long j, boolean z) {
        switch (this.b) {
            case 0:
                if (!d8c.g) {
                    d8c.l(j, obj, z ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    d8c.k(j, obj, z ? (byte) 1 : (byte) 0);
                    break;
                }
            default:
                if (!d8c.g) {
                    d8c.l(j, obj, z ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    d8c.k(j, obj, z ? (byte) 1 : (byte) 0);
                    break;
                }
        }
    }

    @Override // c8c
    public final void e(long j, Object obj, byte b) {
        switch (this.b) {
            case 0:
                if (!d8c.g) {
                    d8c.l(j, obj, b);
                    break;
                } else {
                    d8c.k(j, obj, b);
                    break;
                }
            default:
                if (!d8c.g) {
                    d8c.l(j, obj, b);
                    break;
                } else {
                    d8c.k(j, obj, b);
                    break;
                }
        }
    }

    @Override // c8c
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

    @Override // c8c
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

    @Override // c8c
    public final boolean i() {
        byte b = this.b;
        return false;
    }
}
