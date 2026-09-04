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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public class vi0 extends xi0 {
    public volatile RLottieNative U0;
    public boolean V0;
    public boolean W0;
    public volatile boolean X0;
    public boolean Y0;
    public final int Z0;
    public int a1;

    public vi0(String str, int i10, int i11) {
        super(i10, i11);
        String readRes;
        this.Z0 = -1;
        this.K = 1;
        if ("🎲".equals(str)) {
            readRes = AndroidUtilities.readRes(R.raw.diceloop);
            this.Z0 = 60;
        } else {
            readRes = "🎯".equals(str) ? AndroidUtilities.readRes(R.raw.dartloop) : null;
        }
        getPaint().setFlags(2);
        if (TextUtils.isEmpty(readRes)) {
            return;
        }
        this.n0 = RLottieNative.b(readRes, this.e, null, null);
    }

    @Override // org.telegram.ui.Components.xi0
    public void A(boolean z10) {
        this.l0 = false;
        this.m0 = true;
        l();
        j();
        if (this.Y0 || this.V0) {
            this.W0 = true;
            return;
        }
        if (this.Q != null || this.z0) {
            this.W = true;
            return;
        }
        B(z10);
        yf.e eVar = this.D0;
        if (eVar != null) {
            RandomAccessFile randomAccessFile = eVar.s;
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                } catch (IOException e7) {
                    e7.printStackTrace();
                }
                eVar.s = null;
            }
            eVar.r = true;
            this.D0 = null;
        }
        C();
    }

    @Override // org.telegram.ui.Components.xi0
    public final void B(boolean z10) {
        RLottieNative rLottieNative = this.n0;
        RLottieNative rLottieNative2 = this.U0;
        this.n0 = null;
        this.U0 = null;
        if (rLottieNative == null && rLottieNative2 == null) {
            return;
        }
        zu zuVar = new zu(28, rLottieNative, rLottieNative2);
        if (z10) {
            DispatchQueuePoolBackground.execute(zuVar);
        } else {
            Utilities.globalQueue.postRunnable(zuVar);
        }
    }

    @Override // org.telegram.ui.Components.xi0
    public void n() {
        if (this.W) {
            l();
            if (this.Q == null && this.n0 != null) {
                B(true);
            }
        }
        if (this.n0 == null && this.U0 == null && this.D0 == null) {
            C();
            return;
        }
        this.U = true;
        if (!t()) {
            stop();
        }
        if (this.l0) {
            G();
        }
    }

    @Override // org.telegram.ui.Components.xi0
    public final boolean u() {
        return this.Y0;
    }

    @Override // org.telegram.ui.Components.xi0
    public final boolean x() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // org.telegram.ui.Components.xi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int z() {
        boolean z10;
        RLottieNative rLottieNative;
        if (this.m0) {
            return 3;
        }
        if (this.n0 != null && (this.K != 2 || this.U0 != null)) {
            if (this.T == null) {
                try {
                    this.T = Bitmap.createBitmap(this.b, this.c, Bitmap.Config.ARGB_8888);
                    z10 = false;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
                if (this.T != null) {
                    try {
                        int i10 = this.K;
                        if (i10 == 1) {
                            rLottieNative = this.n0;
                        } else if (i10 == 2) {
                            rLottieNative = this.U0;
                            if (this.X0) {
                                this.b0 = this.a1 - 1;
                            }
                        } else {
                            rLottieNative = this.n0;
                        }
                        if (rLottieNative.c(this.b0, this.T, z10) >= 0) {
                            this.S = this.T;
                            int i11 = this.K;
                            if (i11 == 1) {
                                int i12 = this.b0 + 1;
                                int i13 = this.Z0;
                                if (i13 == -1) {
                                    i13 = this.e[0];
                                }
                                if (i12 < i13) {
                                    this.b0 = i12;
                                } else {
                                    this.b0 = 0;
                                    this.O = false;
                                    if (this.U0 != null) {
                                        this.K = 2;
                                    }
                                    if (this.y) {
                                        this.x = null;
                                        this.y = false;
                                    }
                                }
                            } else if (i11 == 2) {
                                int i14 = this.b0 + 1;
                                if (i14 < this.a1) {
                                    this.b0 = i14;
                                } else {
                                    this.O = true;
                                    this.N++;
                                }
                            }
                        }
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                }
                return 1;
            }
            z10 = true;
            if (this.T != null) {
            }
            return 1;
        }
        return 2;
    }
}
