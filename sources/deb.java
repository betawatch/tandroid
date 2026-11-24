// default package

import org.webrtc.SurfaceTextureHelper;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class deb implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ SurfaceTextureHelper b;

    public /* synthetic */ deb(SurfaceTextureHelper surfaceTextureHelper, byte b) {
        this.a = b;
        this.b = surfaceTextureHelper;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        SurfaceTextureHelper surfaceTextureHelper = this.b;
        switch (b) {
            case 0:
                surfaceTextureHelper.lambda$stopListening$1();
                break;
            case 1:
                surfaceTextureHelper.lambda$dispose$6();
                break;
            case 2:
                surfaceTextureHelper.lambda$returnTextureFrame$5();
                break;
            default:
                surfaceTextureHelper.lambda$forceFrame$3();
                break;
        }
    }
}
