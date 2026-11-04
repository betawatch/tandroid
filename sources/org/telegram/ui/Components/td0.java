package org.telegram.ui.Components;

import android.webkit.JavascriptInterface;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class td0 {
    public final /* synthetic */ org.telegram.ui.tp0 a;

    public td0(org.telegram.ui.tp0 tp0Var) {
        this.a = tp0Var;
    }

    @JavascriptInterface
    public void onPlayerError(String str) {
        org.telegram.messenger.g0.h3(new o2(this, Integer.parseInt(str), 8));
    }

    @JavascriptInterface
    public void onPlayerLoaded() {
        org.telegram.messenger.g0.h3(new rd0(this, 0));
    }

    @JavascriptInterface
    public void onPlayerNotifyBufferedPosition(float f10) {
        this.a.K = f10;
    }

    @JavascriptInterface
    public void onPlayerNotifyCurrentPosition(int i3) {
        this.a.J = i3 * 1000;
    }

    @JavascriptInterface
    public void onPlayerNotifyDuration(int i3) {
        org.telegram.ui.tp0 tp0Var = this.a;
        tp0Var.I = i3 * 1000;
        String str = tp0Var.s;
        if (str != null) {
            ud0.a(tp0Var, str);
            tp0Var.s = null;
        }
    }

    @JavascriptInterface
    public void onPlayerStateChange(String str) {
        int parseInt = Integer.parseInt(str);
        org.telegram.ui.tp0 tp0Var = this.a;
        boolean z10 = tp0Var.H;
        boolean z11 = false;
        int i3 = 1;
        tp0Var.H = parseInt == 1 || parseInt == 3;
        tp0Var.b(z10);
        if (parseInt != 0) {
            if (parseInt == 1) {
                z11 = true;
            } else if (parseInt != 2) {
                if (parseInt == 3) {
                    z11 = true;
                    i3 = 2;
                }
            }
            i3 = 3;
        } else {
            i3 = 4;
        }
        if (i3 == 3 && tp0Var.h.getVisibility() != 4) {
            org.telegram.messenger.g0.i3(new rd0(this, 1), 300L);
        }
        org.telegram.messenger.g0.h3(new ci.c8(this, z11, i3, 4));
    }
}
