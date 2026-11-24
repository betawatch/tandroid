// default package

import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class aic implements RendererCommon.RendererEvents {
    public final /* synthetic */ iic a;

    public aic(iic iicVar) {
        this.a = iicVar;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        gm.c3(new f8c(this, (byte) 15));
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i, int i2, int i3) {
        gm.c3(new e1b((byte) 8));
    }
}
