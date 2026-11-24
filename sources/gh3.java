// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class gh3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hh3 b;

    public /* synthetic */ gh3(hh3 hh3Var, byte b) {
        this.a = b;
        this.b = hh3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        hh3 hh3Var = this.b;
        switch (b) {
            case 0:
                aj3 aj3Var = hh3Var.c0;
                ValueAnimator valueAnimator = aj3Var.k0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                aj3Var.l0 = null;
                break;
            default:
                hh3Var.x = false;
                hh3Var.invalidate();
                break;
        }
    }
}
