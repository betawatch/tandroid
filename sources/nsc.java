// default package

import android.view.animation.OvershootInterpolator;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nsc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ksc b;

    public /* synthetic */ nsc(ksc kscVar, byte b) {
        this.a = b;
        this.b = kscVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ksc kscVar = this.b;
        switch (b) {
            case 0:
                kscVar.animate().rotation(0.0f).setDuration(120L).start();
                break;
            default:
                kscVar.animate().scaleX(1.0f).scaleY(1.0f).setDuration(260L).setInterpolator(new OvershootInterpolator(2.0f)).start();
                break;
        }
    }
}
