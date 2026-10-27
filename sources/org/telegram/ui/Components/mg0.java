package org.telegram.ui.Components;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class mg0 {
    public final /* synthetic */ org.telegram.ui.xt0 a;

    public mg0(org.telegram.ui.xt0 xt0Var) {
        this.a = xt0Var;
    }

    @JavascriptInterface
    public void onPlayerError(String str) {
        AndroidUtilities.runOnUIThread(new h2(this, Integer.parseInt(str), 9));
    }

    @JavascriptInterface
    public void onPlayerLoaded() {
        AndroidUtilities.runOnUIThread(new kg0(this, 0));
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
        org.telegram.ui.xt0 xt0Var = this.a;
        xt0Var.H = i11;
        String str = xt0Var.s;
        if (str != null) {
            ng0.a(xt0Var, str);
            xt0Var.s = null;
        }
    }

    @JavascriptInterface
    public void onPlayerStateChange(String str) {
        int parseInt = Integer.parseInt(str);
        org.telegram.ui.xt0 xt0Var = this.a;
        boolean z10 = xt0Var.G;
        boolean z11 = false;
        int i10 = 1;
        xt0Var.G = parseInt == 1 || parseInt == 3;
        xt0Var.b(z10);
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
        if (i10 == 3 && xt0Var.h.getVisibility() != 4) {
            AndroidUtilities.runOnUIThread(new kg0(this, 1), 300L);
        }
        AndroidUtilities.runOnUIThread(new bi.u8(this, z11, i10, 2));
    }
}
