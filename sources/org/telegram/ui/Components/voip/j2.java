package org.telegram.ui.Components.voip;

import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class j2 implements RendererCommon.RendererEvents {
    public final /* synthetic */ m2 a;

    public j2(m2 m2Var) {
        this.a = m2Var;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        m2 m2Var = this.a;
        com.google.android.gms.internal.cast.p pVar = m2Var.R;
        if (pVar != null) {
            pVar.run();
            m2Var.R = null;
        }
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
