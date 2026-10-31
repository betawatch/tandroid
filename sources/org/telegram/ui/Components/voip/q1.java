package org.telegram.ui.Components.voip;

import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class q1 implements RendererCommon.RendererEvents {
    public final /* synthetic */ t1 a;

    public q1(t1 t1Var) {
        this.a = t1Var;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        t1 t1Var = this.a;
        com.google.android.gms.internal.cast.o oVar = t1Var.S;
        if (oVar != null) {
            oVar.run();
            t1Var.S = null;
        }
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
