package org.telegram.ui.Components.voip;

import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class j2 implements RendererCommon.RendererEvents {
    public final /* synthetic */ l2 a;

    public j2(l2 l2Var) {
        this.a = l2Var;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        l2 l2Var = this.a;
        bf.e eVar = l2Var.N;
        if (eVar != null) {
            eVar.run();
            l2Var.N = null;
        }
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
