// default package

import android.view.animation.OvershootInterpolator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class boc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ync b;

    public /* synthetic */ boc(ync yncVar, byte b) {
        this.a = b;
        this.b = yncVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ync yncVar = this.b;
        switch (b) {
            case 0:
                yncVar.animate().rotation(0.0f).setDuration(120L).start();
                break;
            default:
                yncVar.animate().scaleX(1.0f).scaleY(1.0f).setDuration(260L).setInterpolator(new OvershootInterpolator(2.0f)).start();
                break;
        }
    }
}
