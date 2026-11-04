package org.telegram.ui.Components.voip;

import b8.cg;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class n0 implements RendererCommon.RendererEvents {
    public final /* synthetic */ s0 a;

    public n0(s0 s0Var) {
        this.a = s0Var;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        s0 s0Var = this.a;
        cg cgVar = s0Var.Z;
        if (cgVar != null) {
            cgVar.run();
            s0Var.Z = null;
        }
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i3, int i10, int i11) {
    }
}
