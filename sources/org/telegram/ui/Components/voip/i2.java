package org.telegram.ui.Components.voip;

import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes4.dex */
public final class i2 implements RendererCommon.RendererEvents {
    public final /* synthetic */ k2 a;

    public i2(k2 k2Var) {
        this.a = k2Var;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        k2 k2Var = this.a;
        com.google.android.gms.internal.cast.p pVar = k2Var.S;
        if (pVar != null) {
            pVar.run();
            k2Var.S = null;
        }
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
