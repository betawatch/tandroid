package org.telegram.ui.Components.voip;

import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class o0 implements RendererCommon.RendererEvents {
    public final /* synthetic */ s0 a;

    public o0(s0 s0Var) {
        this.a = s0Var;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        s0 s0Var = this.a;
        com.google.android.gms.internal.cast.o oVar = s0Var.Y;
        if (oVar != null) {
            oVar.run();
            s0Var.Y = null;
        }
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
