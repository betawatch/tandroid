package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.text.TextUtils;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueuePoolBackground;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public class ej0 extends hj0 {
    public volatile RLottieNative R0;
    public boolean S0;
    public boolean T0;
    public volatile boolean U0;
    public boolean V0;
    public final int W0;
    public int X0;

    public ej0(String str, int i10, int i11) {
        super(i10, i11);
        String readRes;
        this.W0 = -1;
        this.H = 1;
        if ("🎲".equals(str)) {
            readRes = AndroidUtilities.readRes(R.raw.diceloop);
            this.W0 = 60;
        } else {
            readRes = "🎯".equals(str) ? AndroidUtilities.readRes(R.raw.dartloop) : null;
        }
        getPaint().setFlags(2);
        if (TextUtils.isEmpty(readRes)) {
            return;
        }
        this.k0 = RLottieNative.b(readRes, this.e, null, null);
    }

    @Override // org.telegram.ui.Components.hj0
    public void A(boolean z4) {
        this.i0 = false;
        this.j0 = true;
        l();
        j();
        if (this.V0 || this.S0) {
            this.T0 = true;
            return;
        }
        if (this.N != null || this.w0) {
            this.T = true;
            return;
        }
        B(z4);
        lf.g gVar = this.A0;
        if (gVar != null) {
            RandomAccessFile randomAccessFile = gVar.s;
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                } catch (IOException e6) {
                    e6.printStackTrace();
                }
                gVar.s = null;
            }
            gVar.r = true;
            this.A0 = null;
        }
        C();
    }

    @Override // org.telegram.ui.Components.hj0
    public final void B(boolean z4) {
        RLottieNative rLottieNative = this.k0;
        RLottieNative rLottieNative2 = this.R0;
        this.k0 = null;
        this.R0 = null;
        if (rLottieNative == null && rLottieNative2 == null) {
            return;
        }
        b90 b90Var = new b90(8, rLottieNative, rLottieNative2);
        if (z4) {
            DispatchQueuePoolBackground.execute(b90Var);
        } else {
            Utilities.globalQueue.postRunnable(b90Var);
        }
    }

    @Override // org.telegram.ui.Components.hj0
    public void n() {
        if (this.T) {
            l();
            if (this.N == null && this.k0 != null) {
                B(true);
            }
        }
        if (this.k0 == null && this.R0 == null && this.A0 == null) {
            C();
            return;
        }
        this.R = true;
        if (!t()) {
            stop();
        }
        if (this.i0) {
            G();
        }
    }

    @Override // org.telegram.ui.Components.hj0
    public final boolean u() {
        return this.V0;
    }

    @Override // org.telegram.ui.Components.hj0
    public final boolean x() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // org.telegram.ui.Components.hj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int z() {
        boolean z4;
        RLottieNative rLottieNative;
        if (this.j0) {
            return 3;
        }
        if (this.k0 != null && (this.H != 2 || this.R0 != null)) {
            if (this.Q == null) {
                try {
                    this.Q = Bitmap.createBitmap(this.b, this.c, Bitmap.Config.ARGB_8888);
                    z4 = false;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
                if (this.Q != null) {
                    try {
                        int i10 = this.H;
                        if (i10 == 1) {
                            rLottieNative = this.k0;
                        } else if (i10 == 2) {
                            rLottieNative = this.R0;
                            if (this.U0) {
                                this.Y = this.X0 - 1;
                            }
                        } else {
                            rLottieNative = this.k0;
                        }
                        if (rLottieNative.c(this.Y, this.Q, z4) >= 0) {
                            this.P = this.Q;
                            int i11 = this.H;
                            if (i11 == 1) {
                                int i12 = this.Y + 1;
                                int i13 = this.W0;
                                if (i13 == -1) {
                                    i13 = this.e[0];
                                }
                                if (i12 < i13) {
                                    this.Y = i12;
                                } else {
                                    this.Y = 0;
                                    this.L = false;
                                    if (this.R0 != null) {
                                        this.H = 2;
                                    }
                                    if (this.y) {
                                        this.x = null;
                                        this.y = false;
                                    }
                                }
                            } else if (i11 == 2) {
                                int i14 = this.Y + 1;
                                if (i14 < this.X0) {
                                    this.Y = i14;
                                } else {
                                    this.L = true;
                                    this.K++;
                                }
                            }
                        }
                    } catch (Exception e6) {
                        FileLog.e(e6);
                    }
                }
                return 1;
            }
            z4 = true;
            if (this.Q != null) {
            }
            return 1;
        }
        return 2;
    }
}
