package org.telegram.ui.Components;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class cg0 {
    public final /* synthetic */ org.telegram.ui.du0 a;

    public cg0(org.telegram.ui.du0 du0Var) {
        this.a = du0Var;
    }

    @JavascriptInterface
    public void onPlayerError(String str) {
        AndroidUtilities.runOnUIThread(new ld(this, Integer.parseInt(str), 5));
    }

    @JavascriptInterface
    public void onPlayerLoaded() {
        AndroidUtilities.runOnUIThread(new ag0(this, 0));
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
        org.telegram.ui.du0 du0Var = this.a;
        du0Var.H = i11;
        String str = du0Var.s;
        if (str != null) {
            dg0.a(du0Var, str);
            du0Var.s = null;
        }
    }

    @JavascriptInterface
    public void onPlayerStateChange(String str) {
        int parseInt = Integer.parseInt(str);
        org.telegram.ui.du0 du0Var = this.a;
        boolean z10 = du0Var.G;
        boolean z11 = false;
        int i10 = 1;
        du0Var.G = parseInt == 1 || parseInt == 3;
        du0Var.b(z10);
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
        if (i10 == 3 && du0Var.h.getVisibility() != 4) {
            AndroidUtilities.runOnUIThread(new ag0(this, 1), 300L);
        }
        AndroidUtilities.runOnUIThread(new i2.g0(this, z11, i10, 1));
    }
}
