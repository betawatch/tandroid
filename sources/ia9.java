// default package

import org.webrtc.RenderSynchronizer;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
