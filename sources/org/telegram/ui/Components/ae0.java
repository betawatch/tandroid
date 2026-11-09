package org.telegram.ui.Components;

import android.webkit.JavascriptInterface;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class ae0 {
    public final /* synthetic */ org.telegram.ui.eq0 a;

    public ae0(org.telegram.ui.eq0 eq0Var) {
        this.a = eq0Var;
    }

    @JavascriptInterface
    public void onPlayerError(String str) {
        org.telegram.messenger.g0.h3(new r2(this, Integer.parseInt(str), 8));
    }

    @JavascriptInterface
    public void onPlayerLoaded() {
        org.telegram.messenger.g0.h3(new yd0(this, 0));
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
        org.telegram.ui.eq0 eq0Var = this.a;
        eq0Var.H = i7 * 1000;
        String str = eq0Var.s;
        if (str != null) {
            be0.a(eq0Var, str);
            eq0Var.s = null;
        }
    }

    @JavascriptInterface
    public void onPlayerStateChange(String str) {
        int parseInt = Integer.parseInt(str);
        org.telegram.ui.eq0 eq0Var = this.a;
        boolean z9 = eq0Var.G;
        boolean z10 = false;
        int i7 = 1;
        eq0Var.G = parseInt == 1 || parseInt == 3;
        eq0Var.b(z9);
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
        if (i7 == 3 && eq0Var.h.getVisibility() != 4) {
            org.telegram.messenger.g0.i3(new yd0(this, 1), 300L);
        }
        org.telegram.messenger.g0.h3(new bi.c9(this, z10, i7, 4));
    }
}
