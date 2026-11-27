// default package

import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class ab5 implements RendererCommon.RendererEvents {
    public final /* synthetic */ bb5 a;

    public ab5(bb5 bb5Var) {
        this.a = bb5Var;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        hl.c3(new ea5(this.a, (byte) 2));
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i, int i2, int i3) {
        hl.c3(new ea5(this.a, (byte) 2));
    }
}
