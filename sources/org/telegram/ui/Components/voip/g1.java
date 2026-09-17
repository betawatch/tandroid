package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes3.dex */
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
        AndroidUtilities.runOnUIThread(new ig.t0(this, 24));
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
