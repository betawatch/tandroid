package org.telegram.ui.Components.voip;

import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class g1 implements RendererCommon.RendererEvents {
    public final /* synthetic */ k1 a;

    public g1(k1 k1Var) {
        this.a = k1Var;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        k1 k1Var = this.a;
        com.google.android.gms.internal.cast.p pVar = k1Var.Y;
        if (pVar != null) {
            pVar.run();
            k1Var.Y = null;
        }
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
