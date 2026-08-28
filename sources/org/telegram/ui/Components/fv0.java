package org.telegram.ui.Components;

import android.graphics.Bitmap;
import java.lang.ref.WeakReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class fv0 extends ii0 {
    public int X0;
    public int Y0;
    public int Z0;
    public Bitmap a1;
    public final RLottieNative[] b1;
    public final int[] c1;
    public final int[] d1;
    public final RLottieNative[] e1;
    public final int[] f1;
    public final int[] g1;
    public boolean h1;

    public fv0(String str, int i9, int i10) {
        super(str, i9, i10);
        this.b1 = new RLottieNative[5];
        this.c1 = new int[5];
        this.d1 = new int[5];
        this.e1 = new RLottieNative[3];
        this.f1 = new int[3];
        this.g1 = new int[3];
    }

    public static int U(int i9) {
        if (i9 == 0) {
            return 1;
        }
        if (i9 != 1) {
            return i9 != 2 ? 4 : 3;
        }
        return 2;
    }

    @Override // org.telegram.ui.Components.ii0, org.telegram.ui.Components.mi0
    public final void A(boolean z10) {
        this.h0 = false;
        this.i0 = true;
        l();
        j();
        if (this.U0 || this.R0) {
            this.S0 = true;
        } else if (this.M != null) {
            this.S = true;
        } else {
            T(true);
            C();
        }
    }

    public final void T(boolean z10) {
        int i9 = 0;
        int i10 = 0;
        while (true) {
            RLottieNative[] rLottieNativeArr = this.b1;
            if (i10 >= rLottieNativeArr.length) {
                break;
            }
            RLottieNative rLottieNative = rLottieNativeArr[i10];
            if (rLottieNative != null) {
                if (z10 && rLottieNative == this.j0) {
                    this.j0 = null;
                }
                this.b1[i10].d();
                this.b1[i10] = null;
            }
            i10++;
        }
        while (true) {
            RLottieNative[] rLottieNativeArr2 = this.e1;
            if (i9 >= rLottieNativeArr2.length) {
                return;
            }
            RLottieNative rLottieNative2 = rLottieNativeArr2[i9];
            if (rLottieNative2 != null) {
                if (z10 && rLottieNative2 == this.Q0) {
                    this.Q0 = null;
                }
                this.e1[i9].d();
                this.e1[i9] = null;
            }
            i9++;
        }
    }

    @Override // org.telegram.ui.Components.ii0, org.telegram.ui.Components.mi0
    public final void n() {
        if (this.S) {
            l();
            if (this.M == null) {
                T(false);
            }
        }
        if (this.j0 == null && this.Q0 == null) {
            C();
            return;
        }
        this.Q = true;
        if (!t()) {
            stop();
        }
        G();
    }

    @Override // org.telegram.ui.Components.ii0, org.telegram.ui.Components.mi0
    public final int z() {
        if (this.i0) {
            return 3;
        }
        if (this.j0 != null && (this.G != 2 || this.Q0 != null)) {
            if (this.a1 == null) {
                try {
                    this.a1 = Bitmap.createBitmap(this.b, this.c, Bitmap.Config.ARGB_8888);
                } catch (Throwable th) {
                    FileLog.e(th);
                }
            }
            if (this.P == null) {
                try {
                    this.P = Bitmap.createBitmap(this.b, this.c, Bitmap.Config.ARGB_8888);
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            }
            if (this.P != null && this.a1 != null) {
                try {
                    int i9 = -1;
                    if (this.G == 1) {
                        int i10 = 0;
                        while (true) {
                            RLottieNative[] rLottieNativeArr = this.b1;
                            if (i10 >= rLottieNativeArr.length) {
                                break;
                            }
                            i9 = rLottieNativeArr[i10].c(this.d1[i10], this.a1, i10 == 0);
                            if (i10 != 0) {
                                int[] iArr = this.d1;
                                int i11 = iArr[i10] + 1;
                                if (i11 < this.c1[i10]) {
                                    iArr[i10] = i11;
                                } else if (i10 != 4) {
                                    iArr[i10] = 0;
                                    this.K = false;
                                    if (this.Q0 != null) {
                                        this.G = 2;
                                    }
                                }
                            }
                            i10++;
                        }
                    } else {
                        if (this.T0) {
                            int i12 = 0;
                            while (true) {
                                int[] iArr2 = this.g1;
                                if (i12 >= iArr2.length) {
                                    break;
                                }
                                iArr2[i12] = this.f1[i12] - 1;
                                i12++;
                            }
                        }
                        if (this.h1) {
                            int[] iArr3 = this.d1;
                            int i13 = iArr3[0] + 1;
                            if (i13 < this.c1[0]) {
                                iArr3[0] = i13;
                            } else {
                                iArr3[0] = -1;
                            }
                        }
                        this.b1[0].c(Math.max(this.d1[0], 0), this.a1, true);
                        int i14 = 0;
                        while (true) {
                            RLottieNative[] rLottieNativeArr2 = this.e1;
                            if (i14 >= rLottieNativeArr2.length) {
                                break;
                            }
                            RLottieNative rLottieNative = rLottieNativeArr2[i14];
                            int i15 = this.g1[i14];
                            if (i15 < 0) {
                                i15 = this.f1[i14] - 1;
                            }
                            rLottieNative.c(i15, this.a1, false);
                            if (!this.K) {
                                int[] iArr4 = this.g1;
                                int i16 = iArr4[i14] + 1;
                                if (i16 < this.f1[i14]) {
                                    iArr4[i14] = i16;
                                } else {
                                    iArr4[i14] = -1;
                                }
                            }
                            i14++;
                        }
                        int c10 = this.b1[4].c(this.d1[4], this.a1, false);
                        int[] iArr5 = this.d1;
                        int i17 = iArr5[4] + 1;
                        if (i17 < this.c1[4]) {
                            iArr5[4] = i17;
                        }
                        int[] iArr6 = this.g1;
                        if (iArr6[0] == -1 && iArr6[1] == -1 && iArr6[2] == -1) {
                            this.K = true;
                            this.J++;
                        }
                        int i18 = this.X0;
                        int i19 = this.Z0;
                        if (i18 != i19 || i19 != this.Y0) {
                            this.d1[0] = -1;
                        } else if (this.g1[0] == this.f1[0] - 100) {
                            this.h1 = true;
                            if (i18 == 5) {
                                WeakReference weakReference = this.D;
                                Runnable runnable = weakReference == null ? null : (Runnable) weakReference.get();
                                if (runnable != null) {
                                    AndroidUtilities.runOnUIThread(runnable);
                                }
                            }
                        }
                        i9 = c10;
                    }
                    if (i9 >= 0) {
                        Utilities.copyBitmaps(this.a1, this.P);
                        this.O = this.P;
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
            return 1;
        }
        return 2;
    }
}
