package org.telegram.ui;

import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ih1 implements RendererCommon.RendererEvents {
    public final /* synthetic */ oh1 a;

    public ih1(oh1 oh1Var) {
        this.a = oh1Var;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        oh1 oh1Var = this.a;
        c2.p pVar = oh1Var.h1;
        if (pVar != null) {
            pVar.run();
            oh1Var.h1 = null;
        }
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
