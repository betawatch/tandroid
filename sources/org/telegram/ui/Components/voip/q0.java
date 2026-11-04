package org.telegram.ui.Components.voip;

import b8.cg;
import org.telegram.ui.ActionBar.d4;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class q0 implements RendererCommon.RendererEvents {
    public final /* synthetic */ s0 a;

    public q0(s0 s0Var) {
        this.a = s0Var;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        s0 s0Var = this.a;
        s0Var.y = true;
        cg cgVar = s0Var.Z;
        if (cgVar != null) {
            cgVar.run();
            s0Var.Z = null;
        }
        org.telegram.messenger.g0.h3(new d4(this, 10));
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i3, int i10, int i11) {
        int i12 = (i11 / 90) % 2;
        s0 s0Var = this.a;
        if (i12 == 0) {
            s0Var.V = Float.valueOf(i10 / i3);
        } else {
            s0Var.V = Float.valueOf(i3 / i10);
        }
        org.telegram.messenger.g0.h3(new k2.u(this, i3, i10, 14));
    }
}
