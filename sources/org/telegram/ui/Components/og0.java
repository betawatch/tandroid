package org.telegram.ui.Components;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class og0 {
    public final /* synthetic */ org.telegram.ui.rt0 a;

    public og0(org.telegram.ui.rt0 rt0Var) {
        this.a = rt0Var;
    }

    @JavascriptInterface
    public void onPlayerError(String str) {
        AndroidUtilities.runOnUIThread(new d2(this, Integer.parseInt(str), 9));
    }

    @JavascriptInterface
    public void onPlayerLoaded() {
        AndroidUtilities.runOnUIThread(new mg0(this, 0));
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
        org.telegram.ui.rt0 rt0Var = this.a;
        rt0Var.H = i11;
        String str = rt0Var.s;
        if (str != null) {
            pg0.a(rt0Var, str);
            rt0Var.s = null;
        }
    }

    @JavascriptInterface
    public void onPlayerStateChange(String str) {
        int parseInt = Integer.parseInt(str);
        org.telegram.ui.rt0 rt0Var = this.a;
        boolean z10 = rt0Var.G;
        boolean z11 = false;
        int i10 = 1;
        rt0Var.G = parseInt == 1 || parseInt == 3;
        rt0Var.b(z10);
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
        if (i10 == 3 && rt0Var.h.getVisibility() != 4) {
            AndroidUtilities.runOnUIThread(new mg0(this, 1), 300L);
        }
        AndroidUtilities.runOnUIThread(new ai.z8(this, z11, i10, 2));
    }
}
