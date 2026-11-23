package org.telegram.ui.Components;

import android.graphics.Bitmap;
import java.lang.ref.WeakReference;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ku0 extends lh0 {
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

    public ku0(String str, int i7, int i10) {
        super(str, i7, i10);
        this.g1 = new RLottieNative[5];
        this.h1 = new int[5];
        this.i1 = new int[5];
        this.j1 = new RLottieNative[3];
        this.k1 = new int[3];
        this.l1 = new int[3];
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

    @Override // org.telegram.ui.Components.lh0, org.telegram.ui.Components.nh0
    public final int B(Bitmap bitmap, boolean z10) {
        if (this.f1 == null) {
            try {
                this.f1 = Bitmap.createBitmap(this.b, this.c, Bitmap.Config.ARGB_8888);
            } catch (Throwable th2) {
                org.telegram.messenger.a8.g(th2, true);
                return 2;
            }
        }
        int i7 = -1;
        if (this.K == 1) {
            int i10 = 0;
            while (true) {
                RLottieNative[] rLottieNativeArr = this.g1;
                if (i10 >= rLottieNativeArr.length) {
                    break;
                }
                i7 = rLottieNativeArr[i10].c(this.i1[i10], this.f1, i10 == 0);
                if (i10 != 0) {
                    int[] iArr = this.i1;
                    int i11 = iArr[i10] + 1;
                    if (i11 < this.h1[i10]) {
                        iArr[i10] = i11;
                    } else if (i10 != 4) {
                        iArr[i10] = 0;
                        this.O = false;
                        if (this.V0 != null) {
                            this.K = 2;
                        }
                    }
                }
                i10++;
            }
        } else {
            if (this.Y0) {
                int i12 = 0;
                while (true) {
                    int[] iArr2 = this.l1;
                    if (i12 >= iArr2.length) {
                        break;
                    }
                    iArr2[i12] = this.k1[i12] - 1;
                    i12++;
                }
            }
            if (this.m1) {
                int[] iArr3 = this.i1;
                int i13 = iArr3[0] + 1;
                if (i13 < this.h1[0]) {
                    iArr3[0] = i13;
                } else {
                    iArr3[0] = -1;
                }
            }
            this.g1[0].c(Math.max(this.i1[0], 0), this.f1, true);
            int i14 = 0;
            while (true) {
                RLottieNative[] rLottieNativeArr2 = this.j1;
                if (i14 >= rLottieNativeArr2.length) {
                    break;
                }
                RLottieNative rLottieNative = rLottieNativeArr2[i14];
                int i15 = this.l1[i14];
                if (i15 < 0) {
                    i15 = this.k1[i14] - 1;
                }
                rLottieNative.c(i15, this.f1, false);
                if (!this.O) {
                    int[] iArr4 = this.l1;
                    int i16 = iArr4[i14] + 1;
                    if (i16 < this.k1[i14]) {
                        iArr4[i14] = i16;
                    } else {
                        iArr4[i14] = -1;
                    }
                }
                i14++;
            }
            int c10 = this.g1[4].c(this.i1[4], this.f1, false);
            int[] iArr5 = this.i1;
            int i17 = iArr5[4] + 1;
            if (i17 < this.h1[4]) {
                iArr5[4] = i17;
            }
            int[] iArr6 = this.l1;
            if (iArr6[0] == -1 && iArr6[1] == -1 && iArr6[2] == -1) {
                this.O = true;
                this.N++;
            }
            int i18 = this.c1;
            int i19 = this.e1;
            if (i18 != i19 || i19 != this.d1) {
                this.i1[0] = -1;
            } else if (this.l1[0] == this.k1[0] - 100) {
                this.m1 = true;
                if (i18 == 5) {
                    WeakReference weakReference = this.I;
                    Runnable runnable = weakReference == null ? null : (Runnable) weakReference.get();
                    if (runnable != null) {
                        org.telegram.messenger.g0.g3(runnable);
                    }
                }
            }
            i7 = c10;
        }
        if (i7 < 0) {
            return 2;
        }
        Utilities.copyBitmaps(this.f1, bitmap);
        return 1;
    }

    @Override // org.telegram.ui.Components.lh0, org.telegram.ui.Components.nh0
    public final void C(boolean z10) {
        this.l0 = false;
        this.m0 = true;
        n();
        l();
        if (this.Z0 || this.W0) {
            this.X0 = true;
        } else if (this.Q != null) {
            this.W = true;
        } else {
            W(true);
            E();
        }
    }

    public final void W(boolean z10) {
        int i7 = 0;
        int i10 = 0;
        while (true) {
            RLottieNative[] rLottieNativeArr = this.g1;
            if (i10 >= rLottieNativeArr.length) {
                break;
            }
            RLottieNative rLottieNative = rLottieNativeArr[i10];
            if (rLottieNative != null) {
                if (z10 && rLottieNative == this.n0) {
                    this.n0 = null;
                }
                this.g1[i10].d();
                this.g1[i10] = null;
            }
            i10++;
        }
        while (true) {
            RLottieNative[] rLottieNativeArr2 = this.j1;
            if (i7 >= rLottieNativeArr2.length) {
                return;
            }
            RLottieNative rLottieNative2 = rLottieNativeArr2[i7];
            if (rLottieNative2 != null) {
                if (z10 && rLottieNative2 == this.V0) {
                    this.V0 = null;
                }
                this.j1[i7].d();
                this.j1[i7] = null;
            }
            i7++;
        }
    }

    @Override // org.telegram.ui.Components.lh0, org.telegram.ui.Components.nh0
    public final int j() {
        if (this.m0) {
            return 3;
        }
        return (this.n0 == null || (this.K == 2 && this.V0 == null)) ? 2 : 1;
    }

    @Override // org.telegram.ui.Components.lh0, org.telegram.ui.Components.nh0
    public final void p() {
        if (this.W) {
            n();
            if (this.Q == null) {
                W(false);
            }
        }
        if (this.n0 == null && this.V0 == null) {
            E();
            return;
        }
        this.U = true;
        if (!v()) {
            stop();
        }
        I();
    }

    @Override // org.telegram.ui.Components.lh0, org.telegram.ui.Components.nh0
    public final void i() {
    }
}
