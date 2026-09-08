package org.telegram.ui.Components;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class pf0 {
    public final /* synthetic */ org.telegram.ui.hu0 a;

    public pf0(org.telegram.ui.hu0 hu0Var) {
        this.a = hu0Var;
    }

    @JavascriptInterface
    public void onPlayerError(String str) {
        AndroidUtilities.runOnUIThread(new m8(this, Integer.parseInt(str), 6));
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
        org.telegram.ui.hu0 hu0Var = this.a;
        hu0Var.H = i11;
        String str = hu0Var.s;
        if (str != null) {
            qf0.a(hu0Var, str);
            hu0Var.s = null;
        }
    }

    @JavascriptInterface
    public void onPlayerStateChange(String str) {
        int parseInt = Integer.parseInt(str);
        org.telegram.ui.hu0 hu0Var = this.a;
        boolean z10 = hu0Var.G;
        boolean z11 = false;
        int i10 = 1;
        hu0Var.G = parseInt == 1 || parseInt == 3;
        hu0Var.b(z10);
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
        if (i10 == 3 && hu0Var.h.getVisibility() != 4) {
            AndroidUtilities.runOnUIThread(new nf0(this, 1), 300L);
        }
        AndroidUtilities.runOnUIThread(new i2.g0(this, z11, i10, 1));
    }
}
