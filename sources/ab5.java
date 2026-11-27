// default package

import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
