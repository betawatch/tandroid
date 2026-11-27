// default package

import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class dkc implements RendererCommon.RendererEvents {
    public final /* synthetic */ mkc a;

    public dkc(mkc mkcVar) {
        this.a = mkcVar;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        hl.c3(new azb(this, (byte) 23));
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i, int i2, int i3) {
    }
}
