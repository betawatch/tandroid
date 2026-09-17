package org.telegram.ui.Components.voip;

import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes3.dex */
public final class h2 implements RendererCommon.RendererEvents {
    public final /* synthetic */ k2 a;

    public h2(k2 k2Var) {
        this.a = k2Var;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        k2 k2Var = this.a;
        com.google.android.gms.internal.cast.p pVar = k2Var.R;
        if (pVar != null) {
            pVar.run();
            k2Var.R = null;
        }
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
