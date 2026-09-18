package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class i1 implements RendererCommon.RendererEvents {
    public final /* synthetic */ j1 a;

    public i1(j1 j1Var) {
        this.a = j1Var;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        j1 j1Var = this.a;
        j1Var.x = true;
        com.google.android.gms.internal.cast.p pVar = j1Var.Y;
        if (pVar != null) {
            pVar.run();
            j1Var.Y = null;
        }
        AndroidUtilities.runOnUIThread(new i2.g0(this, 21));
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
        int i13 = (i12 / 90) % 2;
        j1 j1Var = this.a;
        if (i13 == 0) {
            j1Var.U = Float.valueOf(i11 / i10);
        } else {
            j1Var.U = Float.valueOf(i10 / i11);
        }
        AndroidUtilities.runOnUIThread(new gg.n(this, i10, i11, 11));
    }
}
