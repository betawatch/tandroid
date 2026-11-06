package org.telegram.ui.Components;

import android.graphics.Bitmap;
import java.lang.ref.WeakReference;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class zt0 extends xg0 {
    public int b1;
    public int c1;
    public int d1;
    public Bitmap e1;
    public final RLottieNative[] f1;
    public final int[] g1;
    public final int[] h1;
    public final RLottieNative[] i1;
    public final int[] j1;
    public final int[] k1;
    public boolean l1;

    public zt0(String str, int i7, int i10) {
        super(str, i7, i10);
        this.f1 = new RLottieNative[5];
        this.g1 = new int[5];
        this.h1 = new int[5];
        this.i1 = new RLottieNative[3];
        this.j1 = new int[3];
        this.k1 = new int[3];
    }

    public static int X(int i7) {
        if (i7 == 0) {
            return 1;
        }
        if (i7 != 1) {
            return i7 != 2 ? 4 : 3;
        }
        return 2;
    }

    @Override // org.telegram.ui.Components.xg0, org.telegram.ui.Components.zg0
    public final int B(Bitmap bitmap, boolean z9) {
        if (this.e1 == null) {
            try {
                this.e1 = Bitmap.createBitmap(this.b, this.c, Bitmap.Config.ARGB_8888);
            } catch (Throwable th2) {
                org.telegram.messenger.a8.g(th2, true);
                return 2;
            }
        }
        int i7 = -1;
        if (this.J == 1) {
            int i10 = 0;
            while (true) {
                RLottieNative[] rLottieNativeArr = this.f1;
                if (i10 >= rLottieNativeArr.length) {
                    break;
                }
                i7 = rLottieNativeArr[i10].c(this.h1[i10], this.e1, i10 == 0);
                if (i10 != 0) {
                    int[] iArr = this.h1;
                    int i11 = iArr[i10] + 1;
                    if (i11 < this.g1[i10]) {
                        iArr[i10] = i11;
                    } else if (i10 != 4) {
                        iArr[i10] = 0;
                        this.N = false;
                        if (this.U0 != null) {
                            this.J = 2;
                        }
                    }
                }
                i10++;
            }
        } else {
            if (this.X0) {
                int i12 = 0;
                while (true) {
                    int[] iArr2 = this.k1;
                    if (i12 >= iArr2.length) {
                        break;
                    }
                    iArr2[i12] = this.j1[i12] - 1;
                    i12++;
                }
            }
            if (this.l1) {
                int[] iArr3 = this.h1;
                int i13 = iArr3[0] + 1;
                if (i13 < this.g1[0]) {
                    iArr3[0] = i13;
                } else {
                    iArr3[0] = -1;
                }
            }
            this.f1[0].c(Math.max(this.h1[0], 0), this.e1, true);
            int i14 = 0;
            while (true) {
                RLottieNative[] rLottieNativeArr2 = this.i1;
                if (i14 >= rLottieNativeArr2.length) {
                    break;
                }
                RLottieNative rLottieNative = rLottieNativeArr2[i14];
                int i15 = this.k1[i14];
                if (i15 < 0) {
                    i15 = this.j1[i14] - 1;
                }
                rLottieNative.c(i15, this.e1, false);
                if (!this.N) {
                    int[] iArr4 = this.k1;
                    int i16 = iArr4[i14] + 1;
                    if (i16 < this.j1[i14]) {
                        iArr4[i14] = i16;
                    } else {
                        iArr4[i14] = -1;
                    }
                }
                i14++;
            }
            int c10 = this.f1[4].c(this.h1[4], this.e1, false);
            int[] iArr5 = this.h1;
            int i17 = iArr5[4] + 1;
            if (i17 < this.g1[4]) {
                iArr5[4] = i17;
            }
            int[] iArr6 = this.k1;
            if (iArr6[0] == -1 && iArr6[1] == -1 && iArr6[2] == -1) {
                this.N = true;
                this.M++;
            }
            int i18 = this.b1;
            int i19 = this.d1;
            if (i18 != i19 || i19 != this.c1) {
                this.h1[0] = -1;
            } else if (this.k1[0] == this.j1[0] - 100) {
                this.l1 = true;
                if (i18 == 5) {
                    WeakReference weakReference = this.H;
                    Runnable runnable = weakReference == null ? null : (Runnable) weakReference.get();
                    if (runnable != null) {
                        org.telegram.messenger.g0.h3(runnable);
                    }
                }
            }
            i7 = c10;
        }
        if (i7 < 0) {
            return 2;
        }
        Utilities.copyBitmaps(this.e1, bitmap);
        return 1;
    }

    @Override // org.telegram.ui.Components.xg0, org.telegram.ui.Components.zg0
    public final void C(boolean z9) {
        this.k0 = false;
        this.l0 = true;
        n();
        l();
        if (this.Y0 || this.V0) {
            this.W0 = true;
        } else if (this.P != null) {
            this.V = true;
        } else {
            W(true);
            E();
        }
    }

    public final void W(boolean z9) {
        int i7 = 0;
        int i10 = 0;
        while (true) {
            RLottieNative[] rLottieNativeArr = this.f1;
            if (i10 >= rLottieNativeArr.length) {
                break;
            }
            RLottieNative rLottieNative = rLottieNativeArr[i10];
            if (rLottieNative != null) {
                if (z9 && rLottieNative == this.m0) {
                    this.m0 = null;
                }
                this.f1[i10].d();
                this.f1[i10] = null;
            }
            i10++;
        }
        while (true) {
            RLottieNative[] rLottieNativeArr2 = this.i1;
            if (i7 >= rLottieNativeArr2.length) {
                return;
            }
            RLottieNative rLottieNative2 = rLottieNativeArr2[i7];
            if (rLottieNative2 != null) {
                if (z9 && rLottieNative2 == this.U0) {
                    this.U0 = null;
                }
                this.i1[i7].d();
                this.i1[i7] = null;
            }
            i7++;
        }
    }

    @Override // org.telegram.ui.Components.xg0, org.telegram.ui.Components.zg0
    public final int j() {
        if (this.l0) {
            return 3;
        }
        return (this.m0 == null || (this.J == 2 && this.U0 == null)) ? 2 : 1;
    }

    @Override // org.telegram.ui.Components.xg0, org.telegram.ui.Components.zg0
    public final void p() {
        if (this.V) {
            n();
            if (this.P == null) {
                W(false);
            }
        }
        if (this.m0 == null && this.U0 == null) {
            E();
            return;
        }
        this.T = true;
        if (!v()) {
            stop();
        }
        I();
    }

    @Override // org.telegram.ui.Components.xg0, org.telegram.ui.Components.zg0
    public final void i() {
    }
}
