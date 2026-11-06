package org.telegram.ui.Components;

import android.webkit.JavascriptInterface;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class zd0 {
    public final /* synthetic */ org.telegram.ui.cq0 a;

    public zd0(org.telegram.ui.cq0 cq0Var) {
        this.a = cq0Var;
    }

    @JavascriptInterface
    public void onPlayerError(String str) {
        org.telegram.messenger.g0.h3(new r2(this, Integer.parseInt(str), 8));
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
        org.telegram.ui.cq0 cq0Var = this.a;
        cq0Var.H = i7 * 1000;
        String str = cq0Var.s;
        if (str != null) {
            ae0.a(cq0Var, str);
            cq0Var.s = null;
        }
    }

    @JavascriptInterface
    public void onPlayerStateChange(String str) {
        int parseInt = Integer.parseInt(str);
        org.telegram.ui.cq0 cq0Var = this.a;
        boolean z9 = cq0Var.G;
        boolean z10 = false;
        int i7 = 1;
        cq0Var.G = parseInt == 1 || parseInt == 3;
        cq0Var.b(z9);
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
        if (i7 == 3 && cq0Var.h.getVisibility() != 4) {
            org.telegram.messenger.g0.i3(new xd0(this, 1), 300L);
        }
        org.telegram.messenger.g0.h3(new bi.c9(this, z10, i7, 4));
    }
}
