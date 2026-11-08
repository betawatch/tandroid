package org.telegram.ui.Components.voip;

import org.telegram.ui.Components.vs;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class c2 implements RendererCommon.RendererEvents {
    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i7, int i10, int i11) {
        org.telegram.messenger.g0.h3(new vs(15));
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
    }
}
