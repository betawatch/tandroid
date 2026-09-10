package org.telegram.ui.Components;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class yf0 {
    public final /* synthetic */ org.telegram.ui.hu0 a;

    public yf0(org.telegram.ui.hu0 hu0Var) {
        this.a = hu0Var;
    }

    @JavascriptInterface
    public void onPlayerError(String str) {
        AndroidUtilities.runOnUIThread(new zd(this, Integer.parseInt(str), 4));
    }

    @JavascriptInterface
    public void onPlayerLoaded() {
        AndroidUtilities.runOnUIThread(new wf0(this, 0));
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
            zf0.a(hu0Var, str);
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
            AndroidUtilities.runOnUIThread(new wf0(this, 1), 300L);
        }
        AndroidUtilities.runOnUIThread(new i2.f0(this, z11, i10, 1));
    }
}
