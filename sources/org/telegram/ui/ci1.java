package org.telegram.ui;

import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ci1 implements RendererCommon.RendererEvents {
    public final /* synthetic */ ii1 a;

    public ci1(ii1 ii1Var) {
        this.a = ii1Var;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        ii1 ii1Var = this.a;
        c2.p pVar = ii1Var.i1;
        if (pVar != null) {
            pVar.run();
            ii1Var.i1 = null;
        }
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
