package org.telegram.ui.Components.voip;

import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class j2 implements RendererCommon.RendererEvents {
    public final /* synthetic */ m2 a;

    public j2(m2 m2Var) {
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
