package org.telegram.ui.Components;

import android.webkit.JavascriptInterface;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class ue0 {
    public final /* synthetic */ org.telegram.ui.lr0 a;

    public ue0(org.telegram.ui.lr0 lr0Var) {
        this.a = lr0Var;
    }

    @JavascriptInterface
    public void onPlayerError(String str) {
        org.telegram.messenger.i0.g3(new qq(this, Integer.parseInt(str), 3));
    }

    @JavascriptInterface
    public void onPlayerLoaded() {
        org.telegram.messenger.i0.g3(new se0(this, 0));
    }

    @JavascriptInterface
    public void onPlayerNotifyBufferedPosition(float f7) {
        this.a.J = f7;
    }

    @JavascriptInterface
    public void onPlayerNotifyCurrentPosition(int i10) {
        this.a.I = i10 * 1000;
    }

    @JavascriptInterface
    public void onPlayerNotifyDuration(int i10) {
        org.telegram.ui.lr0 lr0Var = this.a;
        lr0Var.H = i10 * 1000;
        String str = lr0Var.s;
        if (str != null) {
            ve0.a(lr0Var, str);
            lr0Var.s = null;
        }
    }

    @JavascriptInterface
    public void onPlayerStateChange(String str) {
        int parseInt = Integer.parseInt(str);
        org.telegram.ui.lr0 lr0Var = this.a;
        boolean z10 = lr0Var.G;
        boolean z11 = false;
        int i10 = 1;
        lr0Var.G = parseInt == 1 || parseInt == 3;
        lr0Var.b(z10);
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
        if (i10 == 3 && lr0Var.h.getVisibility() != 4) {
            org.telegram.messenger.i0.h3(new se0(this, 1), 300L);
        }
        org.telegram.messenger.i0.g3(new i2.j0(this, z11, i10, 3));
    }
}
