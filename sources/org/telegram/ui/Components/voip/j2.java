package org.telegram.ui.Components.voip;

import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class j2 implements RendererCommon.RendererEvents {
    public final /* synthetic */ l2 a;

    public j2(l2 l2Var) {
        this.a = l2Var;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        l2 l2Var = this.a;
        af.f fVar = l2Var.N;
        if (fVar != null) {
            fVar.run();
            l2Var.N = null;
        }
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i9, int i10, int i11) {
    }
}
