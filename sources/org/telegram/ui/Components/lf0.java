package org.telegram.ui.Components;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class lf0 {
    public final /* synthetic */ org.telegram.ui.et0 a;

    public lf0(org.telegram.ui.et0 et0Var) {
        this.a = et0Var;
    }

    @JavascriptInterface
    public void onPlayerError(String str) {
        AndroidUtilities.runOnUIThread(new i8(this, Integer.parseInt(str), 6));
    }

    @JavascriptInterface
    public void onPlayerLoaded() {
        AndroidUtilities.runOnUIThread(new jf0(this, 0));
    }

    @JavascriptInterface
    public void onPlayerNotifyBufferedPosition(float f9) {
        this.a.F = f9;
    }

    @JavascriptInterface
    public void onPlayerNotifyCurrentPosition(int i10) {
        this.a.E = i10 * MediaDataController.MAX_STYLE_RUNS_COUNT;
    }

    @JavascriptInterface
    public void onPlayerNotifyDuration(int i10) {
        int i11 = i10 * MediaDataController.MAX_STYLE_RUNS_COUNT;
        org.telegram.ui.et0 et0Var = this.a;
        et0Var.D = i11;
        String str = et0Var.s;
        if (str != null) {
            mf0.a(et0Var, str);
            et0Var.s = null;
        }
    }

    @JavascriptInterface
    public void onPlayerStateChange(String str) {
        int parseInt = Integer.parseInt(str);
        org.telegram.ui.et0 et0Var = this.a;
        boolean z10 = et0Var.C;
        boolean z11 = false;
        int i10 = 1;
        et0Var.C = parseInt == 1 || parseInt == 3;
        et0Var.b(z10);
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
        if (i10 == 3 && et0Var.h.getVisibility() != 4) {
            AndroidUtilities.runOnUIThread(new jf0(this, 1), 300L);
        }
        AndroidUtilities.runOnUIThread(new jh.n6(this, z11, i10, 1));
    }
}
