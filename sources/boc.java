// default package

import android.view.animation.OvershootInterpolator;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
