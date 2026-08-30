package org.telegram.ui.Components;

import android.graphics.Bitmap;
import java.lang.ref.WeakReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class yv0 extends cj0 {
    public int Y0;
    public int Z0;
    public int a1;
    public Bitmap b1;
    public final RLottieNative[] c1;
    public final int[] d1;
    public final int[] e1;
    public final RLottieNative[] f1;
    public final int[] g1;
    public final int[] h1;
    public boolean i1;

    public yv0(String str, int i10, int i11) {
        super(str, i10, i11);
        this.c1 = new RLottieNative[5];
        this.d1 = new int[5];
        this.e1 = new int[5];
        this.f1 = new RLottieNative[3];
        this.g1 = new int[3];
        this.h1 = new int[3];
    }

    public static int U(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 != 1) {
            return i10 != 2 ? 4 : 3;
        }
        return 2;
    }

    @Override // org.telegram.ui.Components.cj0, org.telegram.ui.Components.gj0
    public final void A(boolean z4) {
        this.i0 = false;
        this.j0 = true;
        l();
        j();
        if (this.V0 || this.S0) {
            this.T0 = true;
        } else if (this.N != null) {
            this.T = true;
        } else {
            T(true);
            C();
        }
    }

    public final void T(boolean z4) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            RLottieNative[] rLottieNativeArr = this.c1;
            if (i11 >= rLottieNativeArr.length) {
                break;
            }
            RLottieNative rLottieNative = rLottieNativeArr[i11];
            if (rLottieNative != null) {
                if (z4 && rLottieNative == this.k0) {
                    this.k0 = null;
                }
                this.c1[i11].d();
                this.c1[i11] = null;
            }
            i11++;
        }
        while (true) {
            RLottieNative[] rLottieNativeArr2 = this.f1;
            if (i10 >= rLottieNativeArr2.length) {
                return;
            }
            RLottieNative rLottieNative2 = rLottieNativeArr2[i10];
            if (rLottieNative2 != null) {
                if (z4 && rLottieNative2 == this.R0) {
                    this.R0 = null;
                }
                this.f1[i10].d();
                this.f1[i10] = null;
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.cj0, org.telegram.ui.Components.gj0
    public final void n() {
        if (this.T) {
            l();
            if (this.N == null) {
                T(false);
            }
        }
        if (this.k0 == null && this.R0 == null) {
            C();
            return;
        }
        this.R = true;
        if (!t()) {
            stop();
        }
        G();
    }

    @Override // org.telegram.ui.Components.cj0, org.telegram.ui.Components.gj0
    public final int z() {
        if (this.j0) {
            return 3;
        }
        if (this.k0 != null && (this.H != 2 || this.R0 != null)) {
            if (this.b1 == null) {
                try {
                    this.b1 = Bitmap.createBitmap(this.b, this.c, Bitmap.Config.ARGB_8888);
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            }
            if (this.Q == null) {
                try {
                    this.Q = Bitmap.createBitmap(this.b, this.c, Bitmap.Config.ARGB_8888);
                } catch (Throwable th3) {
                    FileLog.e(th3);
                }
            }
            if (this.Q != null && this.b1 != null) {
                try {
                    int i10 = -1;
                    if (this.H == 1) {
                        int i11 = 0;
                        while (true) {
                            RLottieNative[] rLottieNativeArr = this.c1;
                            if (i11 >= rLottieNativeArr.length) {
                                break;
                            }
                            i10 = rLottieNativeArr[i11].c(this.e1[i11], this.b1, i11 == 0);
                            if (i11 != 0) {
                                int[] iArr = this.e1;
                                int i12 = iArr[i11] + 1;
                                if (i12 < this.d1[i11]) {
                                    iArr[i11] = i12;
                                } else if (i11 != 4) {
                                    iArr[i11] = 0;
                                    this.L = false;
                                    if (this.R0 != null) {
                                        this.H = 2;
                                    }
                                }
                            }
                            i11++;
                        }
                    } else {
                        if (this.U0) {
                            int i13 = 0;
                            while (true) {
                                int[] iArr2 = this.h1;
                                if (i13 >= iArr2.length) {
                                    break;
                                }
                                iArr2[i13] = this.g1[i13] - 1;
                                i13++;
                            }
                        }
                        if (this.i1) {
                            int[] iArr3 = this.e1;
                            int i14 = iArr3[0] + 1;
                            if (i14 < this.d1[0]) {
                                iArr3[0] = i14;
                            } else {
                                iArr3[0] = -1;
                            }
                        }
                        this.c1[0].c(Math.max(this.e1[0], 0), this.b1, true);
                        int i15 = 0;
                        while (true) {
                            RLottieNative[] rLottieNativeArr2 = this.f1;
                            if (i15 >= rLottieNativeArr2.length) {
                                break;
                            }
                            RLottieNative rLottieNative = rLottieNativeArr2[i15];
                            int i16 = this.h1[i15];
                            if (i16 < 0) {
                                i16 = this.g1[i15] - 1;
                            }
                            rLottieNative.c(i16, this.b1, false);
                            if (!this.L) {
                                int[] iArr4 = this.h1;
                                int i17 = iArr4[i15] + 1;
                                if (i17 < this.g1[i15]) {
                                    iArr4[i15] = i17;
                                } else {
                                    iArr4[i15] = -1;
                                }
                            }
                            i15++;
                        }
                        int c3 = this.c1[4].c(this.e1[4], this.b1, false);
                        int[] iArr5 = this.e1;
                        int i18 = iArr5[4] + 1;
                        if (i18 < this.d1[4]) {
                            iArr5[4] = i18;
                        }
                        int[] iArr6 = this.h1;
                        if (iArr6[0] == -1 && iArr6[1] == -1 && iArr6[2] == -1) {
                            this.L = true;
                            this.K++;
                        }
                        int i19 = this.Y0;
                        int i20 = this.a1;
                        if (i19 != i20 || i20 != this.Z0) {
                            this.e1[0] = -1;
                        } else if (this.h1[0] == this.g1[0] - 100) {
                            this.i1 = true;
                            if (i19 == 5) {
                                WeakReference weakReference = this.E;
                                Runnable runnable = weakReference == null ? null : (Runnable) weakReference.get();
                                if (runnable != null) {
                                    AndroidUtilities.runOnUIThread(runnable);
                                }
                            }
                        }
                        i10 = c3;
                    }
                    if (i10 >= 0) {
                        Utilities.copyBitmaps(this.b1, this.Q);
                        this.P = this.Q;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            return 1;
        }
        return 2;
    }
}
