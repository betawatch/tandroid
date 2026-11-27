// default package

import android.view.animation.OvershootInterpolator;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
