package org.telegram.ui.Components.voip;

import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class k2 implements RendererCommon.RendererEvents {
    public final /* synthetic */ n2 a;

    public k2(n2 n2Var) {
        this.a = n2Var;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        n2 n2Var = this.a;
        c2.p pVar = n2Var.O;
        if (pVar != null) {
            pVar.run();
            n2Var.O = null;
        }
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
