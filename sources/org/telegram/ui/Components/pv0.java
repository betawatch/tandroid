package org.telegram.ui.Components;

import android.graphics.Bitmap;
import java.lang.ref.WeakReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class pv0 extends ti0 {
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

    public pv0(String str, int i10, int i11) {
        super(str, i10, i11);
        this.b1 = new RLottieNative[5];
        this.c1 = new int[5];
        this.d1 = new int[5];
        this.e1 = new RLottieNative[3];
        this.f1 = new int[3];
        this.g1 = new int[3];
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

    @Override // org.telegram.ui.Components.ti0, org.telegram.ui.Components.xi0
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
        int i10 = 0;
        int i11 = 0;
        while (true) {
            RLottieNative[] rLottieNativeArr = this.b1;
            if (i11 >= rLottieNativeArr.length) {
                break;
            }
            RLottieNative rLottieNative = rLottieNativeArr[i11];
            if (rLottieNative != null) {
                if (z10 && rLottieNative == this.j0) {
                    this.j0 = null;
                }
                this.b1[i11].d();
                this.b1[i11] = null;
            }
            i11++;
        }
        while (true) {
            RLottieNative[] rLottieNativeArr2 = this.e1;
            if (i10 >= rLottieNativeArr2.length) {
                return;
            }
            RLottieNative rLottieNative2 = rLottieNativeArr2[i10];
            if (rLottieNative2 != null) {
                if (z10 && rLottieNative2 == this.Q0) {
                    this.Q0 = null;
                }
                this.e1[i10].d();
                this.e1[i10] = null;
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.ti0, org.telegram.ui.Components.xi0
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

    @Override // org.telegram.ui.Components.ti0, org.telegram.ui.Components.xi0
    public final int z() {
        if (this.i0) {
            return 3;
        }
        if (this.j0 != null && (this.G != 2 || this.Q0 != null)) {
            if (this.a1 == null) {
                try {
                    this.a1 = Bitmap.createBitmap(this.b, this.c, Bitmap.Config.ARGB_8888);
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            }
            if (this.P == null) {
                try {
                    this.P = Bitmap.createBitmap(this.b, this.c, Bitmap.Config.ARGB_8888);
                } catch (Throwable th3) {
                    FileLog.e(th3);
                }
            }
            if (this.P != null && this.a1 != null) {
                try {
                    int i10 = -1;
                    if (this.G == 1) {
                        int i11 = 0;
                        while (true) {
                            RLottieNative[] rLottieNativeArr = this.b1;
                            if (i11 >= rLottieNativeArr.length) {
                                break;
                            }
                            i10 = rLottieNativeArr[i11].c(this.d1[i11], this.a1, i11 == 0);
                            if (i11 != 0) {
                                int[] iArr = this.d1;
                                int i12 = iArr[i11] + 1;
                                if (i12 < this.c1[i11]) {
                                    iArr[i11] = i12;
                                } else if (i11 != 4) {
                                    iArr[i11] = 0;
                                    this.K = false;
                                    if (this.Q0 != null) {
                                        this.G = 2;
                                    }
                                }
                            }
                            i11++;
                        }
                    } else {
                        if (this.T0) {
                            int i13 = 0;
                            while (true) {
                                int[] iArr2 = this.g1;
                                if (i13 >= iArr2.length) {
                                    break;
                                }
                                iArr2[i13] = this.f1[i13] - 1;
                                i13++;
                            }
                        }
                        if (this.h1) {
                            int[] iArr3 = this.d1;
                            int i14 = iArr3[0] + 1;
                            if (i14 < this.c1[0]) {
                                iArr3[0] = i14;
                            } else {
                                iArr3[0] = -1;
                            }
                        }
                        this.b1[0].c(Math.max(this.d1[0], 0), this.a1, true);
                        int i15 = 0;
                        while (true) {
                            RLottieNative[] rLottieNativeArr2 = this.e1;
                            if (i15 >= rLottieNativeArr2.length) {
                                break;
                            }
                            RLottieNative rLottieNative = rLottieNativeArr2[i15];
                            int i16 = this.g1[i15];
                            if (i16 < 0) {
                                i16 = this.f1[i15] - 1;
                            }
                            rLottieNative.c(i16, this.a1, false);
                            if (!this.K) {
                                int[] iArr4 = this.g1;
                                int i17 = iArr4[i15] + 1;
                                if (i17 < this.f1[i15]) {
                                    iArr4[i15] = i17;
                                } else {
                                    iArr4[i15] = -1;
                                }
                            }
                            i15++;
                        }
                        int c3 = this.b1[4].c(this.d1[4], this.a1, false);
                        int[] iArr5 = this.d1;
                        int i18 = iArr5[4] + 1;
                        if (i18 < this.c1[4]) {
                            iArr5[4] = i18;
                        }
                        int[] iArr6 = this.g1;
                        if (iArr6[0] == -1 && iArr6[1] == -1 && iArr6[2] == -1) {
                            this.K = true;
                            this.J++;
                        }
                        int i19 = this.X0;
                        int i20 = this.Z0;
                        if (i19 != i20 || i20 != this.Y0) {
                            this.d1[0] = -1;
                        } else if (this.g1[0] == this.f1[0] - 100) {
                            this.h1 = true;
                            if (i19 == 5) {
                                WeakReference weakReference = this.D;
                                Runnable runnable = weakReference == null ? null : (Runnable) weakReference.get();
                                if (runnable != null) {
                                    AndroidUtilities.runOnUIThread(runnable);
                                }
                            }
                        }
                        i10 = c3;
                    }
                    if (i10 >= 0) {
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
