// default package

import sun.misc.Unsafe;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class gjf extends c8c {
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gjf(Unsafe unsafe, byte b) {
        super(unsafe);
        this.b = b;
    }

    @Override // c8c
    public final double k(Object obj, long j) {
        byte b = this.b;
        Unsafe unsafe = this.a;
        switch (b) {
        }
        return Double.longBitsToDouble(unsafe.getLong(obj, j));
    }

    @Override // c8c
    public final float p(Object obj, long j) {
        byte b = this.b;
        Unsafe unsafe = this.a;
        switch (b) {
        }
        return Float.intBitsToFloat(unsafe.getInt(obj, j));
    }

    @Override // c8c
    public final void s(Object obj, long j, boolean z) {
        switch (this.b) {
            case 0:
                if (!hjf.g) {
                    hjf.d(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    hjf.c(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                }
            default:
                if (!hjf.g) {
                    hjf.d(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    hjf.c(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                }
        }
    }

    @Override // c8c
    public final void u(Object obj, long j, byte b) {
        switch (this.b) {
            case 0:
                if (!hjf.g) {
                    hjf.d(obj, j, b);
                    break;
                } else {
                    hjf.c(obj, j, b);
                    break;
                }
            default:
                if (!hjf.g) {
                    hjf.d(obj, j, b);
                    break;
                } else {
                    hjf.c(obj, j, b);
                    break;
                }
        }
    }

    @Override // c8c
    public final void v(Object obj, long j, double d) {
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
    public final void w(Object obj, long j, float f) {
        byte b = this.b;
        Unsafe unsafe = this.a;
        switch (b) {
            case 0:
                unsafe.putInt(obj, j, Float.floatToIntBits(f));
                break;
            default:
                unsafe.putInt(obj, j, Float.floatToIntBits(f));
                break;
        }
    }

    @Override // c8c
    public final boolean x(Object obj, long j) {
        switch (this.b) {
            case 0:
                if (!hjf.g) {
                    break;
                } else {
                    break;
                }
            default:
                if (!hjf.g) {
                    break;
                } else {
                    break;
                }
        }
        return hjf.k(obj, j);
    }
}
