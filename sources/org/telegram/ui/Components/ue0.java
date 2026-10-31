package org.telegram.ui.Components;

import android.webkit.JavascriptInterface;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ue0 {
    public final /* synthetic */ org.telegram.ui.mr0 a;

    public ue0(org.telegram.ui.mr0 mr0Var) {
        this.a = mr0Var;
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
        org.telegram.ui.mr0 mr0Var = this.a;
        mr0Var.H = i10 * 1000;
        String str = mr0Var.s;
        if (str != null) {
            ve0.a(mr0Var, str);
            mr0Var.s = null;
        }
    }

    @JavascriptInterface
    public void onPlayerStateChange(String str) {
        int parseInt = Integer.parseInt(str);
        org.telegram.ui.mr0 mr0Var = this.a;
        boolean z10 = mr0Var.G;
        boolean z11 = false;
        int i10 = 1;
        mr0Var.G = parseInt == 1 || parseInt == 3;
        mr0Var.b(z10);
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
        if (i10 == 3 && mr0Var.h.getVisibility() != 4) {
            org.telegram.messenger.i0.h3(new se0(this, 1), 300L);
        }
        org.telegram.messenger.i0.g3(new i2.j0(this, z11, i10, 3));
    }
}
