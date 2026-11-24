// default package

import sun.misc.Unsafe;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class f0f extends c6c {
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0f(Unsafe unsafe, byte b) {
        super(unsafe);
        this.b = b;
    }

    @Override // c6c
    public final byte j(Object obj, long j) {
        switch (this.b) {
            case 0:
                if (!i0f.g) {
                    break;
                } else {
                    break;
                }
            default:
                if (!i0f.g) {
                    break;
                } else {
                    break;
                }
        }
        return i0f.o(obj, j);
    }

    @Override // c6c
    public final void l(long j, Object obj, byte b) {
        switch (this.b) {
            case 0:
                if (!i0f.g) {
                    i0f.j(obj, j, b);
                    break;
                } else {
                    i0f.h(j, obj, b);
                    break;
                }
            default:
                if (!i0f.g) {
                    i0f.j(obj, j, b);
                    break;
                } else {
                    i0f.h(j, obj, b);
                    break;
                }
        }
    }

    @Override // c6c
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

    @Override // c6c
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

    @Override // c6c
    public final void o(Object obj, long j, boolean z) {
        switch (this.b) {
            case 0:
                if (!i0f.g) {
                    i0f.j(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    i0f.h(j, obj, z ? (byte) 1 : (byte) 0);
                    break;
                }
            default:
                if (!i0f.g) {
                    i0f.j(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    i0f.h(j, obj, z ? (byte) 1 : (byte) 0);
                    break;
                }
        }
    }

    @Override // c6c
    public final boolean q(Object obj, long j) {
        switch (this.b) {
            case 0:
                if (i0f.g) {
                    if (i0f.n(obj, j) == 0) {
                    }
                } else if (i0f.o(obj, j) == 0) {
                }
                break;
            default:
                if (i0f.g) {
                    if (i0f.n(obj, j) == 0) {
                    }
                } else if (i0f.o(obj, j) == 0) {
                }
                break;
        }
        return true;
    }

    @Override // c6c
    public final float r(Object obj, long j) {
        switch (this.b) {
        }
        return Float.intBitsToFloat(this.a.getInt(obj, j));
    }

    @Override // c6c
    public final double t(Object obj, long j) {
        switch (this.b) {
        }
        return Double.longBitsToDouble(this.a.getLong(obj, j));
    }
}
