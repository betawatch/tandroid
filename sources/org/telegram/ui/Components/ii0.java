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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class ii0 extends mi0 {
    public volatile RLottieNative Q0;
    public boolean R0;
    public boolean S0;
    public volatile boolean T0;
    public boolean U0;
    public final int V0;
    public int W0;

    public ii0(String str, int i9, int i10) {
        super(i9, i10);
        String readRes;
        this.V0 = -1;
        this.G = 1;
        if ("🎲".equals(str)) {
            readRes = AndroidUtilities.readRes(R.raw.diceloop);
            this.V0 = 60;
        } else {
            readRes = "🎯".equals(str) ? AndroidUtilities.readRes(R.raw.dartloop) : null;
        }
        getPaint().setFlags(2);
        if (TextUtils.isEmpty(readRes)) {
            return;
        }
        this.j0 = RLottieNative.b(readRes, "dice", this.e, null, null);
    }

    @Override // org.telegram.ui.Components.mi0
    public void A(boolean z10) {
        this.h0 = false;
        this.i0 = true;
        l();
        j();
        if (this.U0 || this.R0) {
            this.S0 = true;
            return;
        }
        if (this.M != null || this.v0) {
            this.S = true;
            return;
        }
        B(z10);
        ff.h hVar = this.z0;
        if (hVar != null) {
            RandomAccessFile randomAccessFile = hVar.s;
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                } catch (IOException e10) {
                    e10.printStackTrace();
                }
                hVar.s = null;
            }
            hVar.r = true;
            this.z0 = null;
        }
        C();
    }

    @Override // org.telegram.ui.Components.mi0
    public final void B(boolean z10) {
        RLottieNative rLottieNative = this.j0;
        RLottieNative rLottieNative2 = this.Q0;
        this.j0 = null;
        this.Q0 = null;
        if (rLottieNative == null && rLottieNative2 == null) {
            return;
        }
        jg0 jg0Var = new jg0(4, rLottieNative, rLottieNative2);
        if (z10) {
            DispatchQueuePoolBackground.execute(jg0Var);
        } else {
            Utilities.globalQueue.postRunnable(jg0Var);
        }
    }

    @Override // org.telegram.ui.Components.mi0
    public void n() {
        if (this.S) {
            l();
            if (this.M == null && this.j0 != null) {
                B(true);
            }
        }
        if (this.j0 == null && this.Q0 == null && this.z0 == null) {
            C();
            return;
        }
        this.Q = true;
        if (!t()) {
            stop();
        }
        if (this.h0) {
            G();
        }
    }

    @Override // org.telegram.ui.Components.mi0
    public final boolean u() {
        return this.U0;
    }

    @Override // org.telegram.ui.Components.mi0
    public final boolean x() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // org.telegram.ui.Components.mi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int z() {
        boolean z10;
        RLottieNative rLottieNative;
        if (this.i0) {
            return 3;
        }
        if (this.j0 != null && (this.G != 2 || this.Q0 != null)) {
            if (this.P == null) {
                try {
                    this.P = Bitmap.createBitmap(this.b, this.c, Bitmap.Config.ARGB_8888);
                    z10 = false;
                } catch (Throwable th) {
                    FileLog.e(th);
                }
                if (this.P != null) {
                    try {
                        int i9 = this.G;
                        if (i9 == 1) {
                            rLottieNative = this.j0;
                        } else if (i9 == 2) {
                            rLottieNative = this.Q0;
                            if (this.T0) {
                                this.X = this.W0 - 1;
                            }
                        } else {
                            rLottieNative = this.j0;
                        }
                        if (rLottieNative.c(this.X, this.P, z10) >= 0) {
                            this.O = this.P;
                            int i10 = this.G;
                            if (i10 == 1) {
                                int i11 = this.X + 1;
                                int i12 = this.V0;
                                if (i12 == -1) {
                                    i12 = this.e[0];
                                }
                                if (i11 < i12) {
                                    this.X = i11;
                                } else {
                                    this.X = 0;
                                    this.K = false;
                                    if (this.Q0 != null) {
                                        this.G = 2;
                                    }
                                    if (this.y) {
                                        this.x = null;
                                        this.y = false;
                                    }
                                }
                            } else if (i10 == 2) {
                                int i13 = this.X + 1;
                                if (i13 < this.W0) {
                                    this.X = i13;
                                } else {
                                    this.K = true;
                                    this.J++;
                                }
                            }
                        }
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
                return 1;
            }
            z10 = true;
            if (this.P != null) {
            }
            return 1;
        }
        return 2;
    }
}
