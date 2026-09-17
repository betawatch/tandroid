package org.telegram.ui.Components.voip;

import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class i2 implements RendererCommon.RendererEvents {
    public final /* synthetic */ k2 a;

    public i2(k2 k2Var) {
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
