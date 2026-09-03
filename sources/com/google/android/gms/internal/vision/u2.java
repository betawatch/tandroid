package com.google.android.gms.internal.vision;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class u2 extends w2 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u2(Unsafe unsafe, int i10) {
        super(unsafe);
        this.b = i10;
    }

    @Override // com.google.android.gms.internal.vision.w2
    public final byte a(Object obj, long j10) {
        switch (this.b) {
            case 0:
                if (!x2.g) {
                    break;
                } else {
                    break;
                }
            default:
                if (!x2.g) {
                    break;
                } else {
                    break;
                }
        }
        return x2.o(obj, j10);
    }

    @Override // com.google.android.gms.internal.vision.w2
    public final void c(Object obj, long j10, byte b10) {
        switch (this.b) {
            case 0:
                if (!x2.g) {
                    x2.j(obj, j10, b10);
                    break;
                } else {
                    x2.i(obj, j10, b10);
                    break;
                }
            default:
                if (!x2.g) {
                    x2.j(obj, j10, b10);
                    break;
                } else {
                    x2.i(obj, j10, b10);
                    break;
                }
        }
    }

    @Override // com.google.android.gms.internal.vision.w2
    public final void d(Object obj, long j10, double d) {
        switch (this.b) {
            case 0:
                f(obj, j10, Double.doubleToLongBits(d));
                break;
            default:
                f(obj, j10, Double.doubleToLongBits(d));
                break;
        }
    }

    @Override // com.google.android.gms.internal.vision.w2
    public final void e(Object obj, long j10, float f10) {
        switch (this.b) {
            case 0:
                b(j10, obj, Float.floatToIntBits(f10));
                break;
            default:
                b(j10, obj, Float.floatToIntBits(f10));
                break;
        }
    }

    @Override // com.google.android.gms.internal.vision.w2
    public final void g(Object obj, long j10, boolean z4) {
        switch (this.b) {
            case 0:
                if (!x2.g) {
                    x2.j(obj, j10, z4 ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    x2.i(obj, j10, z4 ? (byte) 1 : (byte) 0);
                    break;
                }
            default:
                if (!x2.g) {
                    x2.j(obj, j10, z4 ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    x2.i(obj, j10, z4 ? (byte) 1 : (byte) 0);
                    break;
                }
        }
    }

    @Override // com.google.android.gms.internal.vision.w2
    public final boolean h(Object obj, long j10) {
        switch (this.b) {
            case 0:
                if (x2.g) {
                    if (x2.n(obj, j10) != 0) {
                    }
                } else if (x2.o(obj, j10) != 0) {
                }
                break;
            default:
                if (x2.g) {
                    if (x2.n(obj, j10) != 0) {
                    }
                } else if (x2.o(obj, j10) != 0) {
                }
                break;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.vision.w2
    public final float i(Object obj, long j10) {
        switch (this.b) {
        }
        return Float.intBitsToFloat(k(obj, j10));
    }

    @Override // com.google.android.gms.internal.vision.w2
    public final double j(Object obj, long j10) {
        switch (this.b) {
        }
        return Double.longBitsToDouble(l(obj, j10));
    }
}
