package org.telegram.ui.Components;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class cf0 {
    public final /* synthetic */ org.telegram.ui.ht0 a;

    public cf0(org.telegram.ui.ht0 ht0Var) {
        this.a = ht0Var;
    }

    @JavascriptInterface
    public void onPlayerError(String str) {
        AndroidUtilities.runOnUIThread(new xl(this, Integer.parseInt(str), 3));
    }

    @JavascriptInterface
    public void onPlayerLoaded() {
        AndroidUtilities.runOnUIThread(new af0(this, 0));
    }

    @JavascriptInterface
    public void onPlayerNotifyBufferedPosition(float f10) {
        this.a.F = f10;
    }

    @JavascriptInterface
    public void onPlayerNotifyCurrentPosition(int i10) {
        this.a.E = i10 * MediaDataController.MAX_STYLE_RUNS_COUNT;
    }

    @JavascriptInterface
    public void onPlayerNotifyDuration(int i10) {
        int i11 = i10 * MediaDataController.MAX_STYLE_RUNS_COUNT;
        org.telegram.ui.ht0 ht0Var = this.a;
        ht0Var.D = i11;
        String str = ht0Var.s;
        if (str != null) {
            df0.a(ht0Var, str);
            ht0Var.s = null;
        }
    }

    @JavascriptInterface
    public void onPlayerStateChange(String str) {
        int parseInt = Integer.parseInt(str);
        org.telegram.ui.ht0 ht0Var = this.a;
        boolean z10 = ht0Var.C;
        boolean z11 = false;
        int i10 = 1;
        ht0Var.C = parseInt == 1 || parseInt == 3;
        ht0Var.b(z10);
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
        if (i10 == 3 && ht0Var.h.getVisibility() != 4) {
            AndroidUtilities.runOnUIThread(new af0(this, 1), 300L);
        }
        AndroidUtilities.runOnUIThread(new hh.p6(this, z11, i10, 1));
    }
}
