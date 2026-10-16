package org.telegram.ui.Components.voip;

import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class d1 implements RendererCommon.RendererEvents {
    public final /* synthetic */ h1 a;

    public d1(h1 h1Var) {
        this.a = h1Var;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        h1 h1Var = this.a;
        com.google.android.gms.internal.cast.p pVar = h1Var.Y;
        if (pVar != null) {
            pVar.run();
            h1Var.Y = null;
        }
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
