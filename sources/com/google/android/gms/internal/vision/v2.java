package com.google.android.gms.internal.vision;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class v2 extends x2 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v2(Unsafe unsafe, int i10) {
        super(unsafe);
        this.b = i10;
    }

    @Override // com.google.android.gms.internal.vision.x2
    public final byte a(Object obj, long j3) {
        switch (this.b) {
            case 0:
                if (!y2.g) {
                    break;
                } else {
                    break;
                }
            default:
                if (!y2.g) {
                    break;
                } else {
                    break;
                }
        }
        return y2.o(obj, j3);
    }

    @Override // com.google.android.gms.internal.vision.x2
    public final void c(Object obj, long j3, byte b10) {
        switch (this.b) {
            case 0:
                if (!y2.g) {
                    y2.j(obj, j3, b10);
                    break;
                } else {
                    y2.i(obj, j3, b10);
                    break;
                }
            default:
                if (!y2.g) {
                    y2.j(obj, j3, b10);
                    break;
                } else {
                    y2.i(obj, j3, b10);
                    break;
                }
        }
    }

    @Override // com.google.android.gms.internal.vision.x2
    public final void d(Object obj, long j3, double d) {
        switch (this.b) {
            case 0:
                f(obj, j3, Double.doubleToLongBits(d));
                break;
            default:
                f(obj, j3, Double.doubleToLongBits(d));
                break;
        }
    }

    @Override // com.google.android.gms.internal.vision.x2
    public final void e(Object obj, long j3, float f7) {
        switch (this.b) {
            case 0:
                b(j3, obj, Float.floatToIntBits(f7));
                break;
            default:
                b(j3, obj, Float.floatToIntBits(f7));
                break;
        }
    }

    @Override // com.google.android.gms.internal.vision.x2
    public final void g(Object obj, long j3, boolean z10) {
        switch (this.b) {
            case 0:
                if (!y2.g) {
                    y2.j(obj, j3, z10 ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    y2.i(obj, j3, z10 ? (byte) 1 : (byte) 0);
                    break;
                }
            default:
                if (!y2.g) {
                    y2.j(obj, j3, z10 ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    y2.i(obj, j3, z10 ? (byte) 1 : (byte) 0);
                    break;
                }
        }
    }

    @Override // com.google.android.gms.internal.vision.x2
    public final boolean h(Object obj, long j3) {
        switch (this.b) {
            case 0:
                if (y2.g) {
                    if (y2.n(obj, j3) != 0) {
                    }
                } else if (y2.o(obj, j3) != 0) {
                }
                break;
            default:
                if (y2.g) {
                    if (y2.n(obj, j3) != 0) {
                    }
                } else if (y2.o(obj, j3) != 0) {
                }
                break;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.vision.x2
    public final float i(Object obj, long j3) {
        switch (this.b) {
        }
        return Float.intBitsToFloat(k(obj, j3));
    }

    @Override // com.google.android.gms.internal.vision.x2
    public final double j(Object obj, long j3) {
        switch (this.b) {
        }
        return Double.longBitsToDouble(l(obj, j3));
    }
}
