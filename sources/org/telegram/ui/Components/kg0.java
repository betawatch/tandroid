package org.telegram.ui.Components;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class kg0 {
    public final /* synthetic */ org.telegram.ui.ot0 a;

    public kg0(org.telegram.ui.ot0 ot0Var) {
        this.a = ot0Var;
    }

    @JavascriptInterface
    public void onPlayerError(String str) {
        AndroidUtilities.runOnUIThread(new e2(this, Integer.parseInt(str), 9));
    }

    @JavascriptInterface
    public void onPlayerLoaded() {
        AndroidUtilities.runOnUIThread(new ig0(this, 0));
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
        org.telegram.ui.ot0 ot0Var = this.a;
        ot0Var.H = i11;
        String str = ot0Var.s;
        if (str != null) {
            lg0.a(ot0Var, str);
            ot0Var.s = null;
        }
    }

    @JavascriptInterface
    public void onPlayerStateChange(String str) {
        int parseInt = Integer.parseInt(str);
        org.telegram.ui.ot0 ot0Var = this.a;
        boolean z10 = ot0Var.G;
        boolean z11 = false;
        int i10 = 1;
        ot0Var.G = parseInt == 1 || parseInt == 3;
        ot0Var.b(z10);
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
        if (i10 == 3 && ot0Var.h.getVisibility() != 4) {
            AndroidUtilities.runOnUIThread(new ig0(this, 1), 300L);
        }
        AndroidUtilities.runOnUIThread(new ai.z8(this, z11, i10, 2));
    }
}
