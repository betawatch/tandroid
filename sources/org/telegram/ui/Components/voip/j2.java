package org.telegram.ui.Components.voip;

import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class j2 implements RendererCommon.RendererEvents {
    public final /* synthetic */ m2 a;

    public j2(m2 m2Var) {
        this.a = m2Var;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        m2 m2Var = this.a;
        c2.p pVar = m2Var.O;
        if (pVar != null) {
            pVar.run();
            m2Var.O = null;
        }
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
