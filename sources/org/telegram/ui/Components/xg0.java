package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.text.TextUtils;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public class xg0 extends zg0 {
    public volatile RLottieNative U0;
    public boolean V0;
    public boolean W0;
    public volatile boolean X0;
    public boolean Y0;
    public final int Z0;
    public int a1;

    public xg0(String str, int i7, int i10) {
        super(i7, i10);
        String y22;
        this.Z0 = -1;
        this.J = 1;
        if ("🎲".equals(str)) {
            y22 = org.telegram.messenger.g0.y2(null, R.raw.diceloop);
            this.Z0 = 60;
        } else {
            y22 = "🎯".equals(str) ? org.telegram.messenger.g0.y2(null, R.raw.dartloop) : null;
        }
        getPaint().setFlags(2);
        if (TextUtils.isEmpty(y22)) {
            return;
        }
        this.m0 = RLottieNative.b(y22, this.e, null, null);
    }

    @Override // org.telegram.ui.Components.zg0
    public int B(Bitmap bitmap, boolean z9) {
        RLottieNative rLottieNative;
        int i7 = this.J;
        if (i7 == 1) {
            rLottieNative = this.m0;
        } else if (i7 == 2) {
            rLottieNative = this.U0;
            if (this.X0) {
                this.a0 = this.a1 - 1;
            }
        } else {
            rLottieNative = this.m0;
        }
        return rLottieNative.c(this.a0, bitmap, z9) < 0 ? 2 : 1;
    }

    @Override // org.telegram.ui.Components.zg0
    public void C(boolean z9) {
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
        D(z9);
        bg.i iVar = this.B0;
        if (iVar != null) {
            RandomAccessFile randomAccessFile = iVar.s;
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                } catch (IOException e10) {
                    e10.printStackTrace();
                }
                iVar.s = null;
            }
            iVar.r = true;
            this.B0 = null;
        }
        E();
    }

    @Override // org.telegram.ui.Components.zg0
    public final void D(boolean z9) {
        RLottieNative rLottieNative = this.m0;
        RLottieNative rLottieNative2 = this.U0;
        this.m0 = null;
        this.U0 = null;
        if (rLottieNative == null && rLottieNative2 == null) {
            return;
        }
        r80 r80Var = new r80(6, rLottieNative, rLottieNative2);
        if (z9) {
            org.telegram.messenger.r5.a(r80Var);
        } else {
            Utilities.e.c(r80Var);
        }
    }

    @Override // org.telegram.ui.Components.zg0
    public void i() {
        int i7 = this.J;
        if (i7 != 1) {
            if (i7 == 2) {
                int i10 = this.a0 + 1;
                if (i10 < this.a1) {
                    this.a0 = i10;
                    return;
                } else {
                    this.N = true;
                    this.M++;
                    return;
                }
            }
            return;
        }
        int i11 = this.a0 + 1;
        int i12 = this.Z0;
        if (i12 == -1) {
            i12 = this.e[0];
        }
        if (i11 < i12) {
            this.a0 = i11;
            return;
        }
        this.a0 = 0;
        this.N = false;
        if (this.U0 != null) {
            this.J = 2;
        }
        if (this.D) {
            this.y = null;
            this.D = false;
        }
    }

    @Override // org.telegram.ui.Components.zg0
    public int j() {
        if (this.l0) {
            return 3;
        }
        return (this.m0 == null || (this.J == 2 && this.U0 == null)) ? 2 : 1;
    }

    @Override // org.telegram.ui.Components.zg0
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

    @Override // org.telegram.ui.Components.zg0
    public final boolean w() {
        return this.Y0;
    }

    @Override // org.telegram.ui.Components.zg0
    public final boolean z() {
        return false;
    }
}
