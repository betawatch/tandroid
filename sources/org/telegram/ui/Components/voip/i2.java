package org.telegram.ui.Components.voip;

import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class i2 implements RendererCommon.RendererEvents {
    public final /* synthetic */ l2 a;

    public i2(l2 l2Var) {
        this.a = l2Var;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        l2 l2Var = this.a;
        com.google.android.gms.internal.cast.p pVar = l2Var.R;
        if (pVar != null) {
            pVar.run();
            l2Var.R = null;
        }
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
