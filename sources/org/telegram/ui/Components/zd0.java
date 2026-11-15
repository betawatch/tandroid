package org.telegram.ui.Components;

import android.webkit.JavascriptInterface;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class zd0 {
    public final /* synthetic */ org.telegram.ui.bq0 a;

    public zd0(org.telegram.ui.bq0 bq0Var) {
        this.a = bq0Var;
    }

    @JavascriptInterface
    public void onPlayerError(String str) {
        org.telegram.messenger.g0.h3(new a2(this, Integer.parseInt(str), 11));
    }

    @JavascriptInterface
    public void onPlayerLoaded() {
        org.telegram.messenger.g0.h3(new xd0(this, 0));
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
        org.telegram.ui.bq0 bq0Var = this.a;
        bq0Var.I = i7 * 1000;
        String str = bq0Var.s;
        if (str != null) {
            ae0.a(bq0Var, str);
            bq0Var.s = null;
        }
    }

    @JavascriptInterface
    public void onPlayerStateChange(String str) {
        int parseInt = Integer.parseInt(str);
        org.telegram.ui.bq0 bq0Var = this.a;
        boolean z10 = bq0Var.H;
        boolean z11 = false;
        int i7 = 1;
        bq0Var.H = parseInt == 1 || parseInt == 3;
        bq0Var.b(z10);
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
        if (i7 == 3 && bq0Var.h.getVisibility() != 4) {
            org.telegram.messenger.g0.i3(new xd0(this, 1), 300L);
        }
        org.telegram.messenger.g0.h3(new di.t7(this, z11, i7, 4));
    }
}
