package org.telegram.ui.Components;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class wf0 {
    public final /* synthetic */ org.telegram.ui.ut0 a;

    public wf0(org.telegram.ui.ut0 ut0Var) {
        this.a = ut0Var;
    }

    @JavascriptInterface
    public void onPlayerError(String str) {
        AndroidUtilities.runOnUIThread(new im(this, Integer.parseInt(str), 3));
    }

    @JavascriptInterface
    public void onPlayerLoaded() {
        AndroidUtilities.runOnUIThread(new uf0(this, 0));
    }

    @JavascriptInterface
    public void onPlayerNotifyBufferedPosition(float f10) {
        this.a.G = f10;
    }

    @JavascriptInterface
    public void onPlayerNotifyCurrentPosition(int i10) {
        this.a.F = i10 * MediaDataController.MAX_STYLE_RUNS_COUNT;
    }

    @JavascriptInterface
    public void onPlayerNotifyDuration(int i10) {
        int i11 = i10 * MediaDataController.MAX_STYLE_RUNS_COUNT;
        org.telegram.ui.ut0 ut0Var = this.a;
        ut0Var.E = i11;
        String str = ut0Var.s;
        if (str != null) {
            xf0.a(ut0Var, str);
            ut0Var.s = null;
        }
    }

    @JavascriptInterface
    public void onPlayerStateChange(String str) {
        int parseInt = Integer.parseInt(str);
        org.telegram.ui.ut0 ut0Var = this.a;
        boolean z4 = ut0Var.D;
        boolean z10 = false;
        int i10 = 1;
        ut0Var.D = parseInt == 1 || parseInt == 3;
        ut0Var.b(z4);
        if (parseInt != 0) {
            if (parseInt == 1) {
                z10 = true;
            } else if (parseInt != 2) {
                if (parseInt == 3) {
                    z10 = true;
                    i10 = 2;
                }
            }
            i10 = 3;
        } else {
            i10 = 4;
        }
        if (i10 == 3 && ut0Var.h.getVisibility() != 4) {
            AndroidUtilities.runOnUIThread(new uf0(this, 1), 300L);
        }
        AndroidUtilities.runOnUIThread(new mh.n6(this, z10, i10, 1));
    }
}
