package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.text.TextUtils;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueuePoolBackground;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public class gj0 extends ij0 {
    public volatile RLottieNative U0;
    public boolean V0;
    public boolean W0;
    public volatile boolean X0;
    public boolean Y0;
    public final int Z0;
    public int a1;

    public gj0(String str, int i10, int i11) {
        super(i10, i11);
        String readRes;
        this.Z0 = -1;
        this.J = 1;
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
        this.m0 = RLottieNative.b(readRes, this.e, null, null);
    }

    @Override // org.telegram.ui.Components.ij0
    public int B(Bitmap bitmap, boolean z10) {
        RLottieNative rLottieNative;
        int i10 = this.J;
        if (i10 == 1) {
            rLottieNative = this.m0;
        } else if (i10 == 2) {
            rLottieNative = this.U0;
            if (this.X0) {
                this.a0 = this.a1 - 1;
            }
        } else {
            rLottieNative = this.m0;
        }
        return rLottieNative.c(this.a0, bitmap, z10) < 0 ? 2 : 1;
    }

    @Override // org.telegram.ui.Components.ij0
    public void C(boolean z10) {
        this.k0 = false;
        this.l0 = true;
        n();
        l();
        if (this.Y0 || this.V0) {
            this.W0 = true;
            return;
        }
        if (this.P != null || this.x0) {
            this.V = true;
            return;
        }
        D(z10);
        yf.e eVar = this.B0;
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
            this.B0 = null;
        }
        E();
    }

    @Override // org.telegram.ui.Components.ij0
    public final void D(boolean z10) {
        RLottieNative rLottieNative = this.m0;
        RLottieNative rLottieNative2 = this.U0;
        this.m0 = null;
        this.U0 = null;
        if (rLottieNative == null && rLottieNative2 == null) {
            return;
        }
        vw vwVar = new vw(27, rLottieNative, rLottieNative2);
        if (z10) {
            DispatchQueuePoolBackground.execute(vwVar);
        } else {
            Utilities.globalQueue.postRunnable(vwVar);
        }
    }

    @Override // org.telegram.ui.Components.ij0
    public void i() {
        int i10 = this.J;
        if (i10 != 1) {
            if (i10 == 2) {
                int i11 = this.a0 + 1;
                if (i11 < this.a1) {
                    this.a0 = i11;
                    return;
                } else {
                    this.N = true;
                    this.M++;
                    return;
                }
            }
            return;
        }
        int i12 = this.a0 + 1;
        int i13 = this.Z0;
        if (i13 == -1) {
            i13 = this.e[0];
        }
        if (i12 < i13) {
            this.a0 = i12;
            return;
        }
        this.a0 = 0;
        this.N = false;
        if (this.U0 != null) {
            this.J = 2;
        }
        if (this.y) {
            this.x = null;
            this.y = false;
        }
    }

    @Override // org.telegram.ui.Components.ij0
    public int j() {
        if (this.l0) {
            return 3;
        }
        return (this.m0 == null || (this.J == 2 && this.U0 == null)) ? 2 : 1;
    }

    @Override // org.telegram.ui.Components.ij0
    public void p() {
        if (this.V) {
            n();
            if (this.P == null && this.m0 != null) {
                D(true);
            }
        }
        if (this.m0 == null && this.U0 == null && this.B0 == null) {
            E();
            return;
        }
        this.T = true;
        if (!v()) {
            stop();
        }
        if (this.k0) {
            I();
        }
    }

    @Override // org.telegram.ui.Components.ij0
    public final boolean w() {
        return this.Y0;
    }

    @Override // org.telegram.ui.Components.ij0
    public final boolean z() {
        return false;
    }
}
