package com.google.android.gms.internal.clearcut;

import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class h1 extends j1 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h1(Unsafe unsafe, int i10) {
        super(unsafe);
        this.b = i10;
    }

    @Override // com.google.android.gms.internal.clearcut.j1
    public final void c(Object obj, long j10, double d) {
        switch (this.b) {
            case 0:
                e(obj, j10, Double.doubleToLongBits(d));
                break;
            default:
                e(obj, j10, Double.doubleToLongBits(d));
                break;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.j1
    public final void d(Object obj, long j10, float f10) {
        switch (this.b) {
            case 0:
                b(j10, obj, Float.floatToIntBits(f10));
                break;
            default:
                b(j10, obj, Float.floatToIntBits(f10));
                break;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.j1
    public final void f(Object obj, long j10, boolean z4) {
        switch (this.b) {
            case 0:
                if (!k1.h) {
                    k1.e(obj, j10, z4 ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    k1.c(obj, j10, z4 ? (byte) 1 : (byte) 0);
                    break;
                }
            default:
                if (!k1.h) {
                    k1.e(obj, j10, z4 ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    k1.c(obj, j10, z4 ? (byte) 1 : (byte) 0);
                    break;
                }
        }
    }

    @Override // com.google.android.gms.internal.clearcut.j1
    public final boolean i(Object obj, long j10) {
        switch (this.b) {
            case 0:
                if (k1.h) {
                    if (k1.l(obj, j10) != 0) {
                    }
                } else if (k1.m(obj, j10) != 0) {
                }
                break;
            default:
                if (k1.h) {
                    if (k1.l(obj, j10) != 0) {
                    }
                } else if (k1.m(obj, j10) != 0) {
                }
                break;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.clearcut.j1
    public final float j(Object obj, long j10) {
        switch (this.b) {
        }
        return Float.intBitsToFloat(g(obj, j10));
    }

    @Override // com.google.android.gms.internal.clearcut.j1
    public final double k(Object obj, long j10) {
        switch (this.b) {
        }
        return Double.longBitsToDouble(h(obj, j10));
    }

    @Override // com.google.android.gms.internal.clearcut.j1
    public final byte l(Object obj, long j10) {
        switch (this.b) {
            case 0:
                if (!k1.h) {
                    break;
                } else {
                    break;
                }
            default:
                if (!k1.h) {
                    break;
                } else {
                    break;
                }
        }
        return k1.m(obj, j10);
    }
}
