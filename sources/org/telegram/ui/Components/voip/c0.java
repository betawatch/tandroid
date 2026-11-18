package org.telegram.ui.Components.voip;

import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class c0 implements RendererCommon.RendererEvents {
    public final /* synthetic */ d0 a;

    public c0(d0 d0Var) {
        this.a = d0Var;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        org.telegram.messenger.g0.g3(new b0(this.a, 0));
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i7, int i10, int i11) {
        org.telegram.messenger.g0.g3(new b0(this.a, 1));
    }
}
