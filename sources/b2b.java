// default package

import org.telegram.ui.StickersActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class b2b implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ StickersActivity b;

    public /* synthetic */ b2b(StickersActivity stickersActivity, byte b) {
        this.a = b;
        this.b = stickersActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        StickersActivity stickersActivity = this.b;
        switch (b) {
            case 0:
                stickersActivity.p0();
                break;
            default:
                stickersActivity.n--;
                break;
        }
    }
}
