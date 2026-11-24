// default package

import android.view.animation.OvershootInterpolator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class dqc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ aqc b;

    public /* synthetic */ dqc(aqc aqcVar, byte b) {
        this.a = b;
        this.b = aqcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        aqc aqcVar = this.b;
        switch (b) {
            case 0:
                aqcVar.animate().rotation(0.0f).setDuration(120L).start();
                break;
            default:
                aqcVar.animate().scaleX(1.0f).scaleY(1.0f).setDuration(260L).setInterpolator(new OvershootInterpolator(2.0f)).start();
                break;
        }
    }
}
