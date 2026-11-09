package com.google.android.gms.internal.vision;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class u2 extends w2 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u2(Unsafe unsafe, int i7) {
        super(unsafe);
        this.b = i7;
    }

    @Override // com.google.android.gms.internal.vision.w2
    public final byte a(Object obj, long j3) {
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
        return x2.o(obj, j3);
    }

    @Override // com.google.android.gms.internal.vision.w2
    public final void c(Object obj, long j3, byte b10) {
        switch (this.b) {
            case 0:
                if (!x2.g) {
                    x2.j(obj, j3, b10);
                    break;
                } else {
                    x2.i(obj, j3, b10);
                    break;
                }
            default:
                if (!x2.g) {
                    x2.j(obj, j3, b10);
                    break;
                } else {
                    x2.i(obj, j3, b10);
                    break;
                }
        }
    }

    @Override // com.google.android.gms.internal.vision.w2
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

    @Override // com.google.android.gms.internal.vision.w2
    public final void e(Object obj, long j3, float f10) {
        switch (this.b) {
            case 0:
                b(j3, obj, Float.floatToIntBits(f10));
                break;
            default:
                b(j3, obj, Float.floatToIntBits(f10));
                break;
        }
    }

    @Override // com.google.android.gms.internal.vision.w2
    public final void g(Object obj, long j3, boolean z9) {
        switch (this.b) {
            case 0:
                if (!x2.g) {
                    x2.j(obj, j3, z9 ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    x2.i(obj, j3, z9 ? (byte) 1 : (byte) 0);
                    break;
                }
            default:
                if (!x2.g) {
                    x2.j(obj, j3, z9 ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    x2.i(obj, j3, z9 ? (byte) 1 : (byte) 0);
                    break;
                }
        }
    }

    @Override // com.google.android.gms.internal.vision.w2
    public final boolean h(Object obj, long j3) {
        switch (this.b) {
            case 0:
                if (x2.g) {
                    if (x2.n(obj, j3) == 0) {
                    }
                } else if (x2.o(obj, j3) == 0) {
                }
                break;
            default:
                if (x2.g) {
                    if (x2.n(obj, j3) == 0) {
                    }
                } else if (x2.o(obj, j3) == 0) {
                }
                break;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.vision.w2
    public final float i(Object obj, long j3) {
        switch (this.b) {
        }
        return Float.intBitsToFloat(k(obj, j3));
    }

    @Override // com.google.android.gms.internal.vision.w2
    public final double j(Object obj, long j3) {
        switch (this.b) {
        }
        return Double.longBitsToDouble(l(obj, j3));
    }
}
