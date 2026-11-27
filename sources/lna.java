// default package

import android.graphics.Bitmap;
import java.lang.ref.WeakReference;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.RLottieNative;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class lna extends a29 {
    public int c1;
    public int d1;
    public int e1;
    public Bitmap f1;
    public final RLottieNative[] g1;
    public final int[] h1;
    public final int[] i1;
    public final RLottieNative[] j1;
    public final int[] k1;
    public final int[] l1;
    public boolean m1;

    public lna(String str, int i, int i2) {
        super(str, i, i2);
        this.g1 = new RLottieNative[5];
        this.h1 = new int[5];
        this.i1 = new int[5];
        this.j1 = new RLottieNative[3];
        this.k1 = new int[3];
        this.l1 = new int[3];
    }

    public static int S(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 4 : 3;
        }
        return 2;
    }

    public final void R(boolean z) {
        int i = 0;
        int i2 = 0;
        while (true) {
            RLottieNative[] rLottieNativeArr = this.g1;
            if (i2 >= rLottieNativeArr.length) {
                break;
            }
            RLottieNative rLottieNative = rLottieNativeArr[i2];
            if (rLottieNative != null) {
                if (z && rLottieNative == this.n0) {
                    this.n0 = null;
                }
                this.g1[i2].d();
                this.g1[i2] = null;
            }
            i2++;
        }
        while (true) {
            RLottieNative[] rLottieNativeArr2 = this.j1;
            if (i >= rLottieNativeArr2.length) {
                return;
            }
            RLottieNative rLottieNative2 = rLottieNativeArr2[i];
            if (rLottieNative2 != null) {
                if (z && rLottieNative2 == this.V0) {
                    this.V0 = null;
                }
                this.j1[i].d();
                this.j1[i] = null;
            }
            i++;
        }
    }

    @Override // a29, b29
    public final int e() {
        if (this.m0) {
            return 3;
        }
        return (this.n0 == null || (this.K == 2 && this.V0 == null)) ? 2 : 1;
    }

    @Override // a29, b29
    public final void k() {
        if (this.W) {
            i();
            if (this.Q == null) {
                R(false);
            }
        }
        if (this.n0 == null && this.V0 == null) {
            z();
            return;
        }
        this.U = true;
        if (!q()) {
            stop();
        }
        D();
    }

    @Override // a29, b29
    public final int w(Bitmap bitmap, boolean z) {
        if (this.f1 == null) {
            try {
                this.f1 = Bitmap.createBitmap(this.b, this.c, Bitmap.Config.ARGB_8888);
            } catch (Throwable th) {
                cc4.g(th, true);
                return 2;
            }
        }
        int i = -1;
        if (this.K == 1) {
            int i2 = 0;
            while (true) {
                RLottieNative[] rLottieNativeArr = this.g1;
                if (i2 >= rLottieNativeArr.length) {
                    break;
                }
                i = rLottieNativeArr[i2].c(this.i1[i2], this.f1, i2 == 0);
                if (i2 != 0) {
                    int[] iArr = this.i1;
                    int i3 = iArr[i2] + 1;
                    if (i3 < this.h1[i2]) {
                        iArr[i2] = i3;
                    } else if (i2 != 4) {
                        iArr[i2] = 0;
                        this.O = false;
                        if (this.V0 != null) {
                            this.K = (byte) 2;
                        }
                    }
                }
                i2++;
            }
        } else {
            if (this.Y0) {
                int i4 = 0;
                while (true) {
                    int[] iArr2 = this.l1;
                    if (i4 >= iArr2.length) {
                        break;
                    }
                    iArr2[i4] = this.k1[i4] - 1;
                    i4++;
                }
            }
            if (this.m1) {
                int[] iArr3 = this.i1;
                int i5 = iArr3[0] + 1;
                if (i5 < this.h1[0]) {
                    iArr3[0] = i5;
                } else {
                    iArr3[0] = -1;
                }
            }
            this.g1[0].c(Math.max(this.i1[0], 0), this.f1, true);
            int i6 = 0;
            while (true) {
                RLottieNative[] rLottieNativeArr2 = this.j1;
                if (i6 >= rLottieNativeArr2.length) {
                    break;
                }
                RLottieNative rLottieNative = rLottieNativeArr2[i6];
                int i7 = this.l1[i6];
                if (i7 < 0) {
                    i7 = this.k1[i6] - 1;
                }
                rLottieNative.c(i7, this.f1, false);
                if (!this.O) {
                    int[] iArr4 = this.l1;
                    int i8 = iArr4[i6] + 1;
                    if (i8 < this.k1[i6]) {
                        iArr4[i6] = i8;
                    } else {
                        iArr4[i6] = -1;
                    }
                }
                i6++;
            }
            int c = this.g1[4].c(this.i1[4], this.f1, false);
            int[] iArr5 = this.i1;
            int i9 = iArr5[4] + 1;
            if (i9 < this.h1[4]) {
                iArr5[4] = i9;
            }
            int[] iArr6 = this.l1;
            if (iArr6[0] == -1 && iArr6[1] == -1 && iArr6[2] == -1) {
                this.O = true;
                this.N++;
            }
            int i10 = this.c1;
            int i11 = this.e1;
            if (i10 != i11 || i11 != this.d1) {
                this.i1[0] = -1;
            } else if (this.l1[0] == this.k1[0] - 100) {
                this.m1 = true;
                if (i10 == 5) {
                    WeakReference weakReference = this.I;
                    Runnable runnable = weakReference == null ? null : (Runnable) weakReference.get();
                    if (runnable != null) {
                        hl.c3(runnable);
                    }
                }
            }
            i = c;
        }
        if (i < 0) {
            return 2;
        }
        Utilities.copyBitmaps(this.f1, bitmap);
        return 1;
    }

    @Override // a29, b29
    public final void x(boolean z) {
        this.l0 = false;
        this.m0 = true;
        i();
        g();
        if (this.Z0 || this.W0) {
            this.X0 = true;
        } else if (this.Q != null) {
            this.W = true;
        } else {
            R(true);
            z();
        }
    }

    @Override // a29, b29
    public final void d() {
    }
}
