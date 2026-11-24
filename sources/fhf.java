// default package

import sun.misc.Unsafe;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class fhf extends c6c {
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fhf(Unsafe unsafe, byte b) {
        super(unsafe);
        this.b = b;
    }

    @Override // c6c
    public final double k(Object obj, long j) {
        byte b = this.b;
        Unsafe unsafe = this.a;
        switch (b) {
        }
        return Double.longBitsToDouble(unsafe.getLong(obj, j));
    }

    @Override // c6c
    public final float p(Object obj, long j) {
        byte b = this.b;
        Unsafe unsafe = this.a;
        switch (b) {
        }
        return Float.intBitsToFloat(unsafe.getInt(obj, j));
    }

    @Override // c6c
    public final void s(Object obj, long j, boolean z) {
        switch (this.b) {
            case 0:
                if (!ghf.g) {
                    ghf.d(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    ghf.c(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                }
            default:
                if (!ghf.g) {
                    ghf.d(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    ghf.c(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                }
        }
    }

    @Override // c6c
    public final void u(Object obj, long j, byte b) {
        switch (this.b) {
            case 0:
                if (!ghf.g) {
                    ghf.d(obj, j, b);
                    break;
                } else {
                    ghf.c(obj, j, b);
                    break;
                }
            default:
                if (!ghf.g) {
                    ghf.d(obj, j, b);
                    break;
                } else {
                    ghf.c(obj, j, b);
                    break;
                }
        }
    }

    @Override // c6c
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

    @Override // c6c
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

    @Override // c6c
    public final boolean x(Object obj, long j) {
        switch (this.b) {
            case 0:
                if (!ghf.g) {
                    break;
                } else {
                    break;
                }
            default:
                if (!ghf.g) {
                    break;
                } else {
                    break;
                }
        }
        return ghf.k(obj, j);
    }
}
