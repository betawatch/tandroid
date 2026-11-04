package org.telegram.ui.Components.voip;

import b8.cg;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class s1 implements RendererCommon.RendererEvents {
    public final /* synthetic */ u1 a;

    public s1(u1 u1Var) {
        this.a = u1Var;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        u1 u1Var = this.a;
        cg cgVar = u1Var.T;
        if (cgVar != null) {
            cgVar.run();
            u1Var.T = null;
        }
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i3, int i10, int i11) {
    }
}
