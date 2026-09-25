package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class j1 implements RendererCommon.RendererEvents {
    public final /* synthetic */ k1 a;

    public j1(k1 k1Var) {
        this.a = k1Var;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        k1 k1Var = this.a;
        k1Var.x = true;
        com.google.android.gms.internal.cast.p pVar = k1Var.Y;
        if (pVar != null) {
            pVar.run();
            k1Var.Y = null;
        }
        AndroidUtilities.runOnUIThread(new i2.h0(this, 22));
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
        int i13 = (i12 / 90) % 2;
        k1 k1Var = this.a;
        if (i13 == 0) {
            k1Var.U = Float.valueOf(i11 / i10);
        } else {
            k1Var.U = Float.valueOf(i10 / i11);
        }
        AndroidUtilities.runOnUIThread(new gg.n(this, i10, i11, 11));
    }
}
