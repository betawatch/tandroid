package org.telegram.ui.Components.voip;

import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class f1 implements RendererCommon.RendererEvents {
    public final /* synthetic */ j1 a;

    public f1(j1 j1Var) {
        this.a = j1Var;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        j1 j1Var = this.a;
        com.google.android.gms.internal.cast.p pVar = j1Var.Y;
        if (pVar != null) {
            pVar.run();
            j1Var.Y = null;
        }
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
