package org.telegram.ui;

import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class lh1 implements RendererCommon.RendererEvents {
    public final /* synthetic */ rh1 a;

    public lh1(rh1 rh1Var) {
        this.a = rh1Var;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        rh1 rh1Var = this.a;
        a8.fg fgVar = rh1Var.l1;
        if (fgVar != null) {
            fgVar.run();
            rh1Var.l1 = null;
        }
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
