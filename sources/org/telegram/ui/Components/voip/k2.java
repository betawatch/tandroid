package org.telegram.ui.Components.voip;

import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class k2 implements RendererCommon.RendererEvents {
    public final /* synthetic */ n2 a;

    public k2(n2 n2Var) {
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
