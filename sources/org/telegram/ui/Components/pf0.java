package org.telegram.ui.Components;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class pf0 {
    public final /* synthetic */ org.telegram.ui.ku0 a;

    public pf0(org.telegram.ui.ku0 ku0Var) {
        this.a = ku0Var;
    }

    @JavascriptInterface
    public void onPlayerError(String str) {
        AndroidUtilities.runOnUIThread(new id(this, Integer.parseInt(str), 5));
    }

    @JavascriptInterface
    public void onPlayerLoaded() {
        AndroidUtilities.runOnUIThread(new nf0(this, 0));
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
        org.telegram.ui.ku0 ku0Var = this.a;
        ku0Var.H = i11;
        String str = ku0Var.s;
        if (str != null) {
            qf0.a(ku0Var, str);
            ku0Var.s = null;
        }
    }

    @JavascriptInterface
    public void onPlayerStateChange(String str) {
        int parseInt = Integer.parseInt(str);
        org.telegram.ui.ku0 ku0Var = this.a;
        boolean z10 = ku0Var.G;
        boolean z11 = false;
        int i10 = 1;
        ku0Var.G = parseInt == 1 || parseInt == 3;
        ku0Var.b(z10);
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
        if (i10 == 3 && ku0Var.h.getVisibility() != 4) {
            AndroidUtilities.runOnUIThread(new nf0(this, 1), 300L);
        }
        AndroidUtilities.runOnUIThread(new i2.f0(this, z11, i10, 1));
    }
}
