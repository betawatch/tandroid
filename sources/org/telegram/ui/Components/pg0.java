package org.telegram.ui.Components;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class pg0 {
    public final /* synthetic */ org.telegram.ui.pu0 a;

    public pg0(org.telegram.ui.pu0 pu0Var) {
        this.a = pu0Var;
    }

    @JavascriptInterface
    public void onPlayerError(String str) {
        AndroidUtilities.runOnUIThread(new o8(this, Integer.parseInt(str), 7));
    }

    @JavascriptInterface
    public void onPlayerLoaded() {
        AndroidUtilities.runOnUIThread(new ng0(this, 0));
    }

    @JavascriptInterface
    public void onPlayerNotifyBufferedPosition(float f7) {
        this.a.J = f7;
    }

    @JavascriptInterface
    public void onPlayerNotifyCurrentPosition(int i10) {
        this.a.I = i10 * MediaDataController.MAX_STYLE_RUNS_COUNT;
    }

    @JavascriptInterface
    public void onPlayerNotifyDuration(int i10) {
        int i11 = i10 * MediaDataController.MAX_STYLE_RUNS_COUNT;
        org.telegram.ui.pu0 pu0Var = this.a;
        pu0Var.H = i11;
        String str = pu0Var.s;
        if (str != null) {
            qg0.a(pu0Var, str);
            pu0Var.s = null;
        }
    }

    @JavascriptInterface
    public void onPlayerStateChange(String str) {
        int parseInt = Integer.parseInt(str);
        org.telegram.ui.pu0 pu0Var = this.a;
        boolean z10 = pu0Var.G;
        boolean z11 = false;
        int i10 = 1;
        pu0Var.G = parseInt == 1 || parseInt == 3;
        pu0Var.b(z10);
        if (parseInt != 0) {
            if (parseInt == 1) {
                z11 = true;
            } else if (parseInt != 2) {
                if (parseInt == 3) {
                    z11 = true;
                    i10 = 2;
                }
            }
            i10 = 3;
        } else {
            i10 = 4;
        }
        if (i10 == 3 && pu0Var.h.getVisibility() != 4) {
            AndroidUtilities.runOnUIThread(new ng0(this, 1), 300L);
        }
        AndroidUtilities.runOnUIThread(new i2.i0(this, z11, i10, 1));
    }
}
