// default package

import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class ekc implements RendererCommon.RendererEvents {
    public final /* synthetic */ mkc a;

    public ekc(mkc mkcVar) {
        this.a = mkcVar;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        hl.c3(new azb(this, (byte) 24));
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i, int i2, int i3) {
        hl.c3(new osa((byte) 11));
    }
}
