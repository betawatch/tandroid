package org.telegram.ui.Components;

import android.graphics.Bitmap;
import java.lang.ref.WeakReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class wv0 extends vi0 {
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

    public wv0(String str, int i10, int i11) {
        super(str, i10, i11);
        this.f1 = new RLottieNative[5];
        this.g1 = new int[5];
        this.h1 = new int[5];
        this.i1 = new RLottieNative[3];
        this.j1 = new int[3];
        this.k1 = new int[3];
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

    @Override // org.telegram.ui.Components.vi0, org.telegram.ui.Components.xi0
    public final void A(boolean z10) {
        this.l0 = false;
        this.m0 = true;
        l();
        j();
        if (this.Y0 || this.V0) {
            this.W0 = true;
        } else if (this.Q != null) {
            this.W = true;
        } else {
            T(true);
            C();
        }
    }

    public final void T(boolean z10) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            RLottieNative[] rLottieNativeArr = this.f1;
            if (i11 >= rLottieNativeArr.length) {
                break;
            }
            RLottieNative rLottieNative = rLottieNativeArr[i11];
            if (rLottieNative != null) {
                if (z10 && rLottieNative == this.n0) {
                    this.n0 = null;
                }
                this.f1[i11].d();
                this.f1[i11] = null;
            }
            i11++;
        }
        while (true) {
            RLottieNative[] rLottieNativeArr2 = this.i1;
            if (i10 >= rLottieNativeArr2.length) {
                return;
            }
            RLottieNative rLottieNative2 = rLottieNativeArr2[i10];
            if (rLottieNative2 != null) {
                if (z10 && rLottieNative2 == this.U0) {
                    this.U0 = null;
                }
                this.i1[i10].d();
                this.i1[i10] = null;
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.vi0, org.telegram.ui.Components.xi0
    public final void n() {
        if (this.W) {
            l();
            if (this.Q == null) {
                T(false);
            }
        }
        if (this.n0 == null && this.U0 == null) {
            C();
            return;
        }
        this.U = true;
        if (!t()) {
            stop();
        }
        G();
    }

    @Override // org.telegram.ui.Components.vi0, org.telegram.ui.Components.xi0
    public final int z() {
        if (this.m0) {
            return 3;
        }
        if (this.n0 != null && (this.K != 2 || this.U0 != null)) {
            if (this.e1 == null) {
                try {
                    this.e1 = Bitmap.createBitmap(this.b, this.c, Bitmap.Config.ARGB_8888);
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            }
            if (this.T == null) {
                try {
                    this.T = Bitmap.createBitmap(this.b, this.c, Bitmap.Config.ARGB_8888);
                } catch (Throwable th3) {
                    FileLog.e(th3);
                }
            }
            if (this.T != null && this.e1 != null) {
                try {
                    int i10 = -1;
                    if (this.K == 1) {
                        int i11 = 0;
                        while (true) {
                            RLottieNative[] rLottieNativeArr = this.f1;
                            if (i11 >= rLottieNativeArr.length) {
                                break;
                            }
                            i10 = rLottieNativeArr[i11].c(this.h1[i11], this.e1, i11 == 0);
                            if (i11 != 0) {
                                int[] iArr = this.h1;
                                int i12 = iArr[i11] + 1;
                                if (i12 < this.g1[i11]) {
                                    iArr[i11] = i12;
                                } else if (i11 != 4) {
                                    iArr[i11] = 0;
                                    this.O = false;
                                    if (this.U0 != null) {
                                        this.K = 2;
                                    }
                                }
                            }
                            i11++;
                        }
                    } else {
                        if (this.X0) {
                            int i13 = 0;
                            while (true) {
                                int[] iArr2 = this.k1;
                                if (i13 >= iArr2.length) {
                                    break;
                                }
                                iArr2[i13] = this.j1[i13] - 1;
                                i13++;
                            }
                        }
                        if (this.l1) {
                            int[] iArr3 = this.h1;
                            int i14 = iArr3[0] + 1;
                            if (i14 < this.g1[0]) {
                                iArr3[0] = i14;
                            } else {
                                iArr3[0] = -1;
                            }
                        }
                        this.f1[0].c(Math.max(this.h1[0], 0), this.e1, true);
                        int i15 = 0;
                        while (true) {
                            RLottieNative[] rLottieNativeArr2 = this.i1;
                            if (i15 >= rLottieNativeArr2.length) {
                                break;
                            }
                            RLottieNative rLottieNative = rLottieNativeArr2[i15];
                            int i16 = this.k1[i15];
                            if (i16 < 0) {
                                i16 = this.j1[i15] - 1;
                            }
                            rLottieNative.c(i16, this.e1, false);
                            if (!this.O) {
                                int[] iArr4 = this.k1;
                                int i17 = iArr4[i15] + 1;
                                if (i17 < this.j1[i15]) {
                                    iArr4[i15] = i17;
                                } else {
                                    iArr4[i15] = -1;
                                }
                            }
                            i15++;
                        }
                        int c10 = this.f1[4].c(this.h1[4], this.e1, false);
                        int[] iArr5 = this.h1;
                        int i18 = iArr5[4] + 1;
                        if (i18 < this.g1[4]) {
                            iArr5[4] = i18;
                        }
                        int[] iArr6 = this.k1;
                        if (iArr6[0] == -1 && iArr6[1] == -1 && iArr6[2] == -1) {
                            this.O = true;
                            this.N++;
                        }
                        int i19 = this.b1;
                        int i20 = this.d1;
                        if (i19 != i20 || i20 != this.c1) {
                            this.h1[0] = -1;
                        } else if (this.k1[0] == this.j1[0] - 100) {
                            this.l1 = true;
                            if (i19 == 5) {
                                WeakReference weakReference = this.H;
                                Runnable runnable = weakReference == null ? null : (Runnable) weakReference.get();
                                if (runnable != null) {
                                    AndroidUtilities.runOnUIThread(runnable);
                                }
                            }
                        }
                        i10 = c10;
                    }
                    if (i10 >= 0) {
                        Utilities.copyBitmaps(this.e1, this.T);
                        this.S = this.T;
                    }
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
            return 1;
        }
        return 2;
    }
}
