package org.telegram.ui.Components.voip;

import a8.fg;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class e1 implements RendererCommon.RendererEvents {
    public final /* synthetic */ i1 a;

    public e1(i1 i1Var) {
        this.a = i1Var;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        i1 i1Var = this.a;
        fg fgVar = i1Var.Y;
        if (fgVar != null) {
            fgVar.run();
            i1Var.Y = null;
        }
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
