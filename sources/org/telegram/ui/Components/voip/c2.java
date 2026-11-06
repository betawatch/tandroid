package org.telegram.ui.Components.voip;

import org.telegram.ui.Components.l10;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class c2 implements RendererCommon.RendererEvents {
    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i7, int i10, int i11) {
        org.telegram.messenger.g0.h3(new l10(13));
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
    }
}
