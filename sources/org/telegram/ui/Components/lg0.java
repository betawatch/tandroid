package org.telegram.ui.Components;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class lg0 {
    public final /* synthetic */ org.telegram.ui.vt0 a;

    public lg0(org.telegram.ui.vt0 vt0Var) {
        this.a = vt0Var;
    }

    @JavascriptInterface
    public void onPlayerError(String str) {
        AndroidUtilities.runOnUIThread(new h2(this, Integer.parseInt(str), 9));
    }

    @JavascriptInterface
    public void onPlayerLoaded() {
        AndroidUtilities.runOnUIThread(new jg0(this, 0));
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
        org.telegram.ui.vt0 vt0Var = this.a;
        vt0Var.H = i11;
        String str = vt0Var.s;
        if (str != null) {
            mg0.a(vt0Var, str);
            vt0Var.s = null;
        }
    }

    @JavascriptInterface
    public void onPlayerStateChange(String str) {
        int parseInt = Integer.parseInt(str);
        org.telegram.ui.vt0 vt0Var = this.a;
        boolean z10 = vt0Var.G;
        boolean z11 = false;
        int i10 = 1;
        vt0Var.G = parseInt == 1 || parseInt == 3;
        vt0Var.b(z10);
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
        if (i10 == 3 && vt0Var.h.getVisibility() != 4) {
            AndroidUtilities.runOnUIThread(new jg0(this, 1), 300L);
        }
        AndroidUtilities.runOnUIThread(new bi.u8(this, z11, i10, 2));
    }
}
