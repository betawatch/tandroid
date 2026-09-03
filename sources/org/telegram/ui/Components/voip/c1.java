package org.telegram.ui.Components.voip;

import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class c1 implements RendererCommon.RendererEvents {
    public final /* synthetic */ g1 a;

    public c1(g1 g1Var) {
        this.a = g1Var;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        g1 g1Var = this.a;
        c2.p pVar = g1Var.V;
        if (pVar != null) {
            pVar.run();
            g1Var.V = null;
        }
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
