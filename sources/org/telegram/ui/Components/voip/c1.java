package org.telegram.ui.Components.voip;

import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class c1 implements RendererCommon.RendererEvents {
    public final /* synthetic */ g1 a;

    public c1(g1 g1Var) {
        this.a = g1Var;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        g1 g1Var = this.a;
        af.f fVar = g1Var.U;
        if (fVar != null) {
            fVar.run();
            g1Var.U = null;
        }
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i9, int i10, int i11) {
    }
}
