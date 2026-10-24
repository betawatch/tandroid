package org.telegram.ui;

import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class ih1 implements RendererCommon.RendererEvents {
    public final /* synthetic */ oh1 a;

    public ih1(oh1 oh1Var) {
        this.a = oh1Var;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        oh1 oh1Var = this.a;
        com.google.android.gms.internal.cast.p pVar = oh1Var.l1;
        if (pVar != null) {
            pVar.run();
            oh1Var.l1 = null;
        }
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
