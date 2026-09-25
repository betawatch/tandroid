package org.telegram.ui.Components.voip;

import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class l2 implements RendererCommon.RendererEvents {
    public final /* synthetic */ n2 a;

    public l2(n2 n2Var) {
        this.a = n2Var;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        n2 n2Var = this.a;
        com.google.android.gms.internal.cast.p pVar = n2Var.R;
        if (pVar != null) {
            pVar.run();
            n2Var.R = null;
        }
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
