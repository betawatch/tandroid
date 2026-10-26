package org.telegram.ui;

import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class jh1 implements RendererCommon.RendererEvents {
    public final /* synthetic */ ph1 a;

    public jh1(ph1 ph1Var) {
        this.a = ph1Var;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        ph1 ph1Var = this.a;
        a8.fg fgVar = ph1Var.l1;
        if (fgVar != null) {
            fgVar.run();
            ph1Var.l1 = null;
        }
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
