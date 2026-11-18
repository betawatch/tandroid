package org.telegram.ui.Components;

import android.webkit.JavascriptInterface;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class je0 {
    public final /* synthetic */ org.telegram.ui.dq0 a;

    public je0(org.telegram.ui.dq0 dq0Var) {
        this.a = dq0Var;
    }

    @JavascriptInterface
    public void onPlayerError(String str) {
        org.telegram.messenger.g0.g3(new org.telegram.ui.ii(this, Integer.parseInt(str), 14));
    }

    @JavascriptInterface
    public void onPlayerLoaded() {
        org.telegram.messenger.g0.g3(new he0(this, 0));
    }

    @JavascriptInterface
    public void onPlayerNotifyBufferedPosition(float f10) {
        this.a.K = f10;
    }

    @JavascriptInterface
    public void onPlayerNotifyCurrentPosition(int i7) {
        this.a.J = i7 * 1000;
    }

    @JavascriptInterface
    public void onPlayerNotifyDuration(int i7) {
        org.telegram.ui.dq0 dq0Var = this.a;
        dq0Var.I = i7 * 1000;
        String str = dq0Var.s;
        if (str != null) {
            ke0.a(dq0Var, str);
            dq0Var.s = null;
        }
    }

    @JavascriptInterface
    public void onPlayerStateChange(String str) {
        int parseInt = Integer.parseInt(str);
        org.telegram.ui.dq0 dq0Var = this.a;
        boolean z10 = dq0Var.H;
        boolean z11 = false;
        int i7 = 1;
        dq0Var.H = parseInt == 1 || parseInt == 3;
        dq0Var.b(z10);
        if (parseInt != 0) {
            if (parseInt == 1) {
                z11 = true;
            } else if (parseInt != 2) {
                if (parseInt == 3) {
                    z11 = true;
                    i7 = 2;
                }
            }
            i7 = 3;
        } else {
            i7 = 4;
        }
        if (i7 == 3 && dq0Var.h.getVisibility() != 4) {
            org.telegram.messenger.g0.h3(new he0(this, 1), 300L);
        }
        org.telegram.messenger.g0.g3(new di.x7(this, z11, i7, 4));
    }
}
