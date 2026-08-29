package org.telegram.ui.Components.voip;

import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class m2 implements RendererCommon.RendererEvents {
    public final /* synthetic */ o2 a;

    public m2(o2 o2Var) {
        this.a = o2Var;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        o2 o2Var = this.a;
        c2.p pVar = o2Var.N;
        if (pVar != null) {
            pVar.run();
            o2Var.N = null;
        }
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
