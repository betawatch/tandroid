package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class g1 implements RendererCommon.RendererEvents {
    public final /* synthetic */ h1 a;

    public g1(h1 h1Var) {
        this.a = h1Var;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        h1 h1Var = this.a;
        h1Var.x = true;
        com.google.android.gms.internal.cast.p pVar = h1Var.Y;
        if (pVar != null) {
            pVar.run();
            h1Var.Y = null;
        }
        AndroidUtilities.runOnUIThread(new ki.u(this, 16));
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
        int i13 = (i12 / 90) % 2;
        h1 h1Var = this.a;
        if (i13 == 0) {
            h1Var.U = Float.valueOf(i11 / i10);
        } else {
            h1Var.U = Float.valueOf(i10 / i11);
        }
        AndroidUtilities.runOnUIThread(new hg.n(this, i10, i11, 11));
    }
}
