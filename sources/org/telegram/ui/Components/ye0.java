package org.telegram.ui.Components;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ye0 {
    public final /* synthetic */ org.telegram.ui.gt0 a;

    public ye0(org.telegram.ui.gt0 gt0Var) {
        this.a = gt0Var;
    }

    @JavascriptInterface
    public void onPlayerError(String str) {
        AndroidUtilities.runOnUIThread(new qd(this, Integer.parseInt(str), 4));
    }

    @JavascriptInterface
    public void onPlayerLoaded() {
        AndroidUtilities.runOnUIThread(new we0(this, 0));
    }

    @JavascriptInterface
    public void onPlayerNotifyBufferedPosition(float f10) {
        this.a.F = f10;
    }

    @JavascriptInterface
    public void onPlayerNotifyCurrentPosition(int i9) {
        this.a.E = i9 * MediaDataController.MAX_STYLE_RUNS_COUNT;
    }

    @JavascriptInterface
    public void onPlayerNotifyDuration(int i9) {
        int i10 = i9 * MediaDataController.MAX_STYLE_RUNS_COUNT;
        org.telegram.ui.gt0 gt0Var = this.a;
        gt0Var.D = i10;
        String str = gt0Var.s;
        if (str != null) {
            ze0.a(gt0Var, str);
            gt0Var.s = null;
        }
    }

    @JavascriptInterface
    public void onPlayerStateChange(String str) {
        int parseInt = Integer.parseInt(str);
        org.telegram.ui.gt0 gt0Var = this.a;
        boolean z10 = gt0Var.C;
        boolean z11 = false;
        int i9 = 1;
        gt0Var.C = parseInt == 1 || parseInt == 3;
        gt0Var.b(z10);
        if (parseInt != 0) {
            if (parseInt == 1) {
                z11 = true;
            } else if (parseInt != 2) {
                if (parseInt == 3) {
                    z11 = true;
                    i9 = 2;
                }
            }
            i9 = 3;
        } else {
            i9 = 4;
        }
        if (i9 == 3 && gt0Var.h.getVisibility() != 4) {
            AndroidUtilities.runOnUIThread(new we0(this, 1), 300L);
        }
        AndroidUtilities.runOnUIThread(new gh.q6(this, z11, i9, 1));
    }
}
