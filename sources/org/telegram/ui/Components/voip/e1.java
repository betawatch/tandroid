package org.telegram.ui.Components.voip;

import a8.fg;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
