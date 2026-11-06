package org.telegram.ui.Components.voip;

import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class c0 implements RendererCommon.RendererEvents {
    public final /* synthetic */ d0 a;

    public c0(d0 d0Var) {
        this.a = d0Var;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        org.telegram.messenger.g0.h3(new b0(this.a, 0));
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i7, int i10, int i11) {
        org.telegram.messenger.g0.h3(new b0(this.a, 1));
    }
}
