package org.telegram.ui.Components.voip;

import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class i2 implements RendererCommon.RendererEvents {
    public final /* synthetic */ k2 a;

    public i2(k2 k2Var) {
        this.a = k2Var;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        k2 k2Var = this.a;
        com.google.android.gms.internal.cast.p pVar = k2Var.S;
        if (pVar != null) {
            pVar.run();
            k2Var.S = null;
        }
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
