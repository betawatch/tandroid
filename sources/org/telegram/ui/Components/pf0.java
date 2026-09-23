package org.telegram.ui.Components;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class pf0 {
    public final /* synthetic */ org.telegram.ui.bu0 a;

    public pf0(org.telegram.ui.bu0 bu0Var) {
        this.a = bu0Var;
    }

    @JavascriptInterface
    public void onPlayerError(String str) {
        AndroidUtilities.runOnUIThread(new kd(this, Integer.parseInt(str), 5));
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
        org.telegram.ui.bu0 bu0Var = this.a;
        bu0Var.H = i11;
        String str = bu0Var.s;
        if (str != null) {
            qf0.a(bu0Var, str);
            bu0Var.s = null;
        }
    }

    @JavascriptInterface
    public void onPlayerStateChange(String str) {
        int parseInt = Integer.parseInt(str);
        org.telegram.ui.bu0 bu0Var = this.a;
        boolean z10 = bu0Var.G;
        boolean z11 = false;
        int i10 = 1;
        bu0Var.G = parseInt == 1 || parseInt == 3;
        bu0Var.b(z10);
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
        if (i10 == 3 && bu0Var.h.getVisibility() != 4) {
            AndroidUtilities.runOnUIThread(new nf0(this, 1), 300L);
        }
        AndroidUtilities.runOnUIThread(new i2.g0(this, z11, i10, 1));
    }
}
