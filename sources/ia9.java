// default package

import org.webrtc.RenderSynchronizer;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ia9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ RenderSynchronizer b;

    public /* synthetic */ ia9(RenderSynchronizer renderSynchronizer, byte b) {
        this.a = b;
        this.b = renderSynchronizer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        RenderSynchronizer renderSynchronizer = this.b;
        switch (b) {
            case 0:
                renderSynchronizer.lambda$registerListener$1();
                break;
            default:
                renderSynchronizer.lambda$new$0();
                break;
        }
    }
}
