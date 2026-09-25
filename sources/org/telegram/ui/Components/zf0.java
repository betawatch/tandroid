package org.telegram.ui.Components;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class zf0 {
    public final /* synthetic */ org.telegram.ui.au0 a;

    public zf0(org.telegram.ui.au0 au0Var) {
        this.a = au0Var;
    }

    @JavascriptInterface
    public void onPlayerError(String str) {
        AndroidUtilities.runOnUIThread(new ld(this, Integer.parseInt(str), 5));
    }

    @JavascriptInterface
    public void onPlayerLoaded() {
        AndroidUtilities.runOnUIThread(new xf0(this, 0));
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
        org.telegram.ui.au0 au0Var = this.a;
        au0Var.H = i11;
        String str = au0Var.s;
        if (str != null) {
            ag0.a(au0Var, str);
            au0Var.s = null;
        }
    }

    @JavascriptInterface
    public void onPlayerStateChange(String str) {
        int parseInt = Integer.parseInt(str);
        org.telegram.ui.au0 au0Var = this.a;
        boolean z10 = au0Var.G;
        boolean z11 = false;
        int i10 = 1;
        au0Var.G = parseInt == 1 || parseInt == 3;
        au0Var.b(z10);
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
        if (i10 == 3 && au0Var.h.getVisibility() != 4) {
            AndroidUtilities.runOnUIThread(new xf0(this, 1), 300L);
        }
        AndroidUtilities.runOnUIThread(new i2.g0(this, z11, i10, 1));
    }
}
