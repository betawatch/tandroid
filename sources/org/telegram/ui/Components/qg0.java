package org.telegram.ui.Components;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class qg0 {
    public final /* synthetic */ org.telegram.ui.ou0 a;

    public qg0(org.telegram.ui.ou0 ou0Var) {
        this.a = ou0Var;
    }

    @JavascriptInterface
    public void onPlayerError(String str) {
        AndroidUtilities.runOnUIThread(new o8(this, Integer.parseInt(str), 7));
    }

    @JavascriptInterface
    public void onPlayerLoaded() {
        AndroidUtilities.runOnUIThread(new og0(this, 0));
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
        org.telegram.ui.ou0 ou0Var = this.a;
        ou0Var.H = i11;
        String str = ou0Var.s;
        if (str != null) {
            rg0.a(ou0Var, str);
            ou0Var.s = null;
        }
    }

    @JavascriptInterface
    public void onPlayerStateChange(String str) {
        int parseInt = Integer.parseInt(str);
        org.telegram.ui.ou0 ou0Var = this.a;
        boolean z10 = ou0Var.G;
        boolean z11 = false;
        int i10 = 1;
        ou0Var.G = parseInt == 1 || parseInt == 3;
        ou0Var.b(z10);
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
        if (i10 == 3 && ou0Var.h.getVisibility() != 4) {
            AndroidUtilities.runOnUIThread(new og0(this, 1), 300L);
        }
        AndroidUtilities.runOnUIThread(new i2.i0(this, z11, i10, 1));
    }
}
