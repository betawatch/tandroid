package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class f1 implements RendererCommon.RendererEvents {
    public final /* synthetic */ g1 a;

    public f1(g1 g1Var) {
        this.a = g1Var;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        g1 g1Var = this.a;
        g1Var.x = true;
        bf.e eVar = g1Var.U;
        if (eVar != null) {
            eVar.run();
            g1Var.U = null;
        }
        AndroidUtilities.runOnUIThread(new nh.f0(this, 14));
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
        int i13 = (i12 / 90) % 2;
        g1 g1Var = this.a;
        if (i13 == 0) {
            g1Var.Q = Float.valueOf(i11 / i10);
        } else {
            g1Var.Q = Float.valueOf(i10 / i11);
        }
        AndroidUtilities.runOnUIThread(new h3.z(this, i10, i11, 10));
    }
}
