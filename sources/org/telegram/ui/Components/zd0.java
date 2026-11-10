package org.telegram.ui.Components;

import android.webkit.JavascriptInterface;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class zd0 {
    public final /* synthetic */ org.telegram.ui.fq0 a;

    public zd0(org.telegram.ui.fq0 fq0Var) {
        this.a = fq0Var;
    }

    @JavascriptInterface
    public void onPlayerError(String str) {
        org.telegram.messenger.g0.h3(new q2(this, Integer.parseInt(str), 8));
    }

    @JavascriptInterface
    public void onPlayerLoaded() {
        org.telegram.messenger.g0.h3(new xd0(this, 0));
    }

    @JavascriptInterface
    public void onPlayerNotifyBufferedPosition(float f10) {
        this.a.J = f10;
    }

    @JavascriptInterface
    public void onPlayerNotifyCurrentPosition(int i7) {
        this.a.I = i7 * 1000;
    }

    @JavascriptInterface
    public void onPlayerNotifyDuration(int i7) {
        org.telegram.ui.fq0 fq0Var = this.a;
        fq0Var.H = i7 * 1000;
        String str = fq0Var.s;
        if (str != null) {
            ae0.a(fq0Var, str);
            fq0Var.s = null;
        }
    }

    @JavascriptInterface
    public void onPlayerStateChange(String str) {
        int parseInt = Integer.parseInt(str);
        org.telegram.ui.fq0 fq0Var = this.a;
        boolean z9 = fq0Var.G;
        boolean z10 = false;
        int i7 = 1;
        fq0Var.G = parseInt == 1 || parseInt == 3;
        fq0Var.b(z9);
        if (parseInt != 0) {
            if (parseInt == 1) {
                z10 = true;
            } else if (parseInt != 2) {
                if (parseInt == 3) {
                    z10 = true;
                    i7 = 2;
                }
            }
            i7 = 3;
        } else {
            i7 = 4;
        }
        if (i7 == 3 && fq0Var.h.getVisibility() != 4) {
            org.telegram.messenger.g0.i3(new xd0(this, 1), 300L);
        }
        org.telegram.messenger.g0.h3(new bi.c9(this, z10, i7, 4));
    }
}
