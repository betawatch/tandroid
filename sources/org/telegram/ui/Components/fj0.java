package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.text.TextUtils;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueuePoolBackground;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public class fj0 extends hj0 {
    public volatile RLottieNative U0;
    public boolean V0;
    public boolean W0;
    public volatile boolean X0;
    public boolean Y0;
    public final int Z0;
    public int a1;

    public fj0(String str, int i10, int i11) {
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

    @Override // org.telegram.ui.Components.hj0
    public int B(Bitmap bitmap, boolean z10) {
        RLottieNative rLottieNative;
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
        return rLottieNative.c(this.b0, bitmap, z10) < 0 ? 2 : 1;
    }

    @Override // org.telegram.ui.Components.hj0
    public void C(boolean z10) {
        this.l0 = false;
        this.m0 = true;
        n();
        l();
        if (this.Y0 || this.V0) {
            this.W0 = true;
            return;
        }
        if (this.Q != null || this.z0) {
            this.W = true;
            return;
        }
        D(z10);
        xf.e eVar = this.D0;
        if (eVar != null) {
            RandomAccessFile randomAccessFile = eVar.s;
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                eVar.s = null;
            }
            eVar.r = true;
            this.D0 = null;
        }
        E();
    }

    @Override // org.telegram.ui.Components.hj0
    public final void D(boolean z10) {
        RLottieNative rLottieNative = this.n0;
        RLottieNative rLottieNative2 = this.U0;
        this.n0 = null;
        this.U0 = null;
        if (rLottieNative == null && rLottieNative2 == null) {
            return;
        }
        hy hyVar = new hy(25, rLottieNative, rLottieNative2);
        if (z10) {
            DispatchQueuePoolBackground.execute(hyVar);
        } else {
            Utilities.globalQueue.postRunnable(hyVar);
        }
    }

    @Override // org.telegram.ui.Components.hj0
    public void i() {
        int i10 = this.K;
        if (i10 != 1) {
            if (i10 == 2) {
                int i11 = this.b0 + 1;
                if (i11 < this.a1) {
                    this.b0 = i11;
                    return;
                } else {
                    this.O = true;
                    this.N++;
                    return;
                }
            }
            return;
        }
        int i12 = this.b0 + 1;
        int i13 = this.Z0;
        if (i13 == -1) {
            i13 = this.e[0];
        }
        if (i12 < i13) {
            this.b0 = i12;
            return;
        }
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

    @Override // org.telegram.ui.Components.hj0
    public int j() {
        if (this.m0) {
            return 3;
        }
        return (this.n0 == null || (this.K == 2 && this.U0 == null)) ? 2 : 1;
    }

    @Override // org.telegram.ui.Components.hj0
    public void p() {
        if (this.W) {
            n();
            if (this.Q == null && this.n0 != null) {
                D(true);
            }
        }
        if (this.n0 == null && this.U0 == null && this.D0 == null) {
            E();
            return;
        }
        this.U = true;
        if (!v()) {
            stop();
        }
        if (this.l0) {
            I();
        }
    }

    @Override // org.telegram.ui.Components.hj0
    public final boolean w() {
        return this.Y0;
    }

    @Override // org.telegram.ui.Components.hj0
    public final boolean z() {
        return false;
    }
}
