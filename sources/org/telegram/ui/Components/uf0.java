package org.telegram.ui.Components;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class uf0 {
    public final /* synthetic */ org.telegram.ui.nt0 a;

    public uf0(org.telegram.ui.nt0 nt0Var) {
        this.a = nt0Var;
    }

    @JavascriptInterface
    public void onPlayerError(String str) {
        AndroidUtilities.runOnUIThread(new hm(this, Integer.parseInt(str), 3));
    }

    @JavascriptInterface
    public void onPlayerLoaded() {
        AndroidUtilities.runOnUIThread(new sf0(this, 0));
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
        org.telegram.ui.nt0 nt0Var = this.a;
        nt0Var.E = i11;
        String str = nt0Var.s;
        if (str != null) {
            vf0.a(nt0Var, str);
            nt0Var.s = null;
        }
    }

    @JavascriptInterface
    public void onPlayerStateChange(String str) {
        int parseInt = Integer.parseInt(str);
        org.telegram.ui.nt0 nt0Var = this.a;
        boolean z4 = nt0Var.D;
        boolean z10 = false;
        int i10 = 1;
        nt0Var.D = parseInt == 1 || parseInt == 3;
        nt0Var.b(z4);
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
        if (i10 == 3 && nt0Var.h.getVisibility() != 4) {
            AndroidUtilities.runOnUIThread(new sf0(this, 1), 300L);
        }
        AndroidUtilities.runOnUIThread(new lh.n6(this, z10, i10, 1));
    }
}
