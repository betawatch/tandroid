package org.telegram.ui.Components.voip;

import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class k2 implements RendererCommon.RendererEvents {
    public final /* synthetic */ n2 a;

    public k2(n2 n2Var) {
        this.a = n2Var;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        n2 n2Var = this.a;
        com.google.android.gms.internal.cast.p pVar = n2Var.R;
        if (pVar != null) {
            pVar.run();
            n2Var.R = null;
        }
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
