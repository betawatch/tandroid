package org.telegram.ui.Components.voip;

import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class k2 implements RendererCommon.RendererEvents {
    public final /* synthetic */ m2 a;

    public k2(m2 m2Var) {
        this.a = m2Var;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        m2 m2Var = this.a;
        com.google.android.gms.internal.cast.p pVar = m2Var.R;
        if (pVar != null) {
            pVar.run();
            m2Var.R = null;
        }
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
