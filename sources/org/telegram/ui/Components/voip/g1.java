package org.telegram.ui.Components.voip;

import oh.t3;
import org.telegram.messenger.AndroidUtilities;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class g1 implements RendererCommon.RendererEvents {
    public final /* synthetic */ h1 a;

    public g1(h1 h1Var) {
        this.a = h1Var;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        h1 h1Var = this.a;
        h1Var.x = true;
        c2.p pVar = h1Var.V;
        if (pVar != null) {
            pVar.run();
            h1Var.V = null;
        }
        AndroidUtilities.runOnUIThread(new t3(this, 21));
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
        int i13 = (i12 / 90) % 2;
        h1 h1Var = this.a;
        if (i13 == 0) {
            h1Var.R = Float.valueOf(i11 / i10);
        } else {
            h1Var.R = Float.valueOf(i10 / i11);
        }
        AndroidUtilities.runOnUIThread(new j3.v(this, i10, i11, 10));
    }
}
