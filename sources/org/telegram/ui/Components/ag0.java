package org.telegram.ui.Components;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class ag0 {
    public final /* synthetic */ org.telegram.ui.iu0 a;

    public ag0(org.telegram.ui.iu0 iu0Var) {
        this.a = iu0Var;
    }

    @JavascriptInterface
    public void onPlayerError(String str) {
        AndroidUtilities.runOnUIThread(new kd(this, Integer.parseInt(str), 5));
    }

    @JavascriptInterface
    public void onPlayerLoaded() {
        AndroidUtilities.runOnUIThread(new yf0(this, 0));
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
        org.telegram.ui.iu0 iu0Var = this.a;
        iu0Var.H = i11;
        String str = iu0Var.s;
        if (str != null) {
            bg0.a(iu0Var, str);
            iu0Var.s = null;
        }
    }

    @JavascriptInterface
    public void onPlayerStateChange(String str) {
        int parseInt = Integer.parseInt(str);
        org.telegram.ui.iu0 iu0Var = this.a;
        boolean z10 = iu0Var.G;
        boolean z11 = false;
        int i10 = 1;
        iu0Var.G = parseInt == 1 || parseInt == 3;
        iu0Var.b(z10);
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
        if (i10 == 3 && iu0Var.h.getVisibility() != 4) {
            AndroidUtilities.runOnUIThread(new yf0(this, 1), 300L);
        }
        AndroidUtilities.runOnUIThread(new i2.f0(this, z11, i10, 1));
    }
}
