// default package

import android.webkit.JavascriptInterface;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ac8 {
    public final /* synthetic */ ya8 a;

    public ac8(ya8 ya8Var) {
        this.a = ya8Var;
    }

    @JavascriptInterface
    public void onPlayerError(String str) {
        gm.c3(new ge7((Object) this, Integer.parseInt(str), (byte) 6));
    }

    @JavascriptInterface
    public void onPlayerLoaded() {
        gm.c3(new yb8(this, (byte) 0));
    }

    @JavascriptInterface
    public void onPlayerNotifyBufferedPosition(float f) {
        this.a.K = f;
    }

    @JavascriptInterface
    public void onPlayerNotifyCurrentPosition(int i) {
        this.a.J = i * 1000;
    }

    @JavascriptInterface
    public void onPlayerNotifyDuration(int i) {
        ya8 ya8Var = this.a;
        ya8Var.I = i * 1000;
        String str = ya8Var.s;
        if (str != null) {
            ya8Var.g(str);
            ya8Var.s = null;
        }
    }

    @JavascriptInterface
    public void onPlayerStateChange(String str) {
        int i;
        int parseInt = Integer.parseInt(str);
        ya8 ya8Var = this.a;
        boolean z = ya8Var.H;
        boolean z2 = false;
        byte b = 1;
        ya8Var.H = parseInt == 1 || parseInt == 3;
        ya8Var.a(z);
        if (parseInt != 0) {
            if (parseInt != 1) {
                i = 2;
                if (parseInt == 2) {
                    i = 3;
                } else if (parseInt != 3) {
                    i = 1;
                }
            } else {
                i = 3;
            }
            z2 = true;
        } else {
            i = 4;
        }
        if (i == 3 && ya8Var.h.getVisibility() != 4) {
            gm.d3(new yb8(this, b), 300L);
        }
        gm.c3(new sr6(this, z2, i, b));
    }
}
