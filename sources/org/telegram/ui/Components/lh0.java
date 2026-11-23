package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.text.TextUtils;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public class lh0 extends nh0 {
    public volatile RLottieNative V0;
    public boolean W0;
    public boolean X0;
    public volatile boolean Y0;
    public boolean Z0;
    public final int a1;
    public int b1;

    public lh0(String str, int i7, int i10) {
        super(i7, i10);
        String y22;
        this.a1 = -1;
        this.K = 1;
        if ("🎲".equals(str)) {
            y22 = org.telegram.messenger.g0.y2(null, R.raw.diceloop);
            this.a1 = 60;
        } else {
            y22 = "🎯".equals(str) ? org.telegram.messenger.g0.y2(null, R.raw.dartloop) : null;
        }
        getPaint().setFlags(2);
        if (TextUtils.isEmpty(y22)) {
            return;
        }
        this.n0 = RLottieNative.b(y22, this.e, null, null);
    }

    @Override // org.telegram.ui.Components.nh0
    public int B(Bitmap bitmap, boolean z10) {
        RLottieNative rLottieNative;
        int i7 = this.K;
        if (i7 == 1) {
            rLottieNative = this.n0;
        } else if (i7 == 2) {
            rLottieNative = this.V0;
            if (this.Y0) {
                this.b0 = this.b1 - 1;
            }
        } else {
            rLottieNative = this.n0;
        }
        return rLottieNative.c(this.b0, bitmap, z10) < 0 ? 2 : 1;
    }

    @Override // org.telegram.ui.Components.nh0
    public void C(boolean z10) {
        this.l0 = false;
        this.m0 = true;
        n();
        l();
        if (this.Z0 || this.W0) {
            this.X0 = true;
            return;
        }
        if (this.Q != null || this.y0) {
            this.W = true;
            return;
        }
        D(z10);
        bg.i iVar = this.C0;
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
            this.C0 = null;
        }
        E();
    }

    @Override // org.telegram.ui.Components.nh0
    public final void D(boolean z10) {
        RLottieNative rLottieNative = this.n0;
        RLottieNative rLottieNative2 = this.V0;
        this.n0 = null;
        this.V0 = null;
        if (rLottieNative == null && rLottieNative2 == null) {
            return;
        }
        bt btVar = new bt(29, rLottieNative, rLottieNative2);
        if (z10) {
            org.telegram.messenger.s5.a(btVar);
        } else {
            Utilities.e.c(btVar);
        }
    }

    @Override // org.telegram.ui.Components.nh0
    public void i() {
        int i7 = this.K;
        if (i7 != 1) {
            if (i7 == 2) {
                int i10 = this.b0 + 1;
                if (i10 < this.b1) {
                    this.b0 = i10;
                    return;
                } else {
                    this.O = true;
                    this.N++;
                    return;
                }
            }
            return;
        }
        int i11 = this.b0 + 1;
        int i12 = this.a1;
        if (i12 == -1) {
            i12 = this.e[0];
        }
        if (i11 < i12) {
            this.b0 = i11;
            return;
        }
        this.b0 = 0;
        this.O = false;
        if (this.V0 != null) {
            this.K = 2;
        }
        if (this.E) {
            this.y = null;
            this.E = false;
        }
    }

    @Override // org.telegram.ui.Components.nh0
    public int j() {
        if (this.m0) {
            return 3;
        }
        return (this.n0 == null || (this.K == 2 && this.V0 == null)) ? 2 : 1;
    }

    @Override // org.telegram.ui.Components.nh0
    public void p() {
        if (this.W) {
            n();
            if (this.Q == null && this.n0 != null) {
                D(true);
            }
        }
        if (this.n0 == null && this.V0 == null && this.C0 == null) {
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

    @Override // org.telegram.ui.Components.nh0
    public final boolean w() {
        return this.Z0;
    }

    @Override // org.telegram.ui.Components.nh0
    public final boolean z() {
        return false;
    }
}
