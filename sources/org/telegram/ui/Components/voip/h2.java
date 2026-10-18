package org.telegram.ui.Components.voip;

import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class h2 implements RendererCommon.RendererEvents {
    public final /* synthetic */ k2 a;

    public h2(k2 k2Var) {
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
