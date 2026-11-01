package org.telegram.ui.Components.voip;

import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class r1 implements RendererCommon.RendererEvents {
    public final /* synthetic */ u1 a;

    public r1(u1 u1Var) {
        this.a = u1Var;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        u1 u1Var = this.a;
        com.google.android.gms.internal.cast.o oVar = u1Var.S;
        if (oVar != null) {
            oVar.run();
            u1Var.S = null;
        }
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
