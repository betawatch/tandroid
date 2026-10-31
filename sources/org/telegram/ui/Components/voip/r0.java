package org.telegram.ui.Components.voip;

import org.telegram.ui.ActionBar.w5;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class r0 implements RendererCommon.RendererEvents {
    public final /* synthetic */ s0 a;

    public r0(s0 s0Var) {
        this.a = s0Var;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        s0 s0Var = this.a;
        s0Var.y = true;
        com.google.android.gms.internal.cast.o oVar = s0Var.Y;
        if (oVar != null) {
            oVar.run();
            s0Var.Y = null;
        }
        org.telegram.messenger.i0.g3(new w5(this, 6));
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
        int i13 = (i12 / 90) % 2;
        s0 s0Var = this.a;
        if (i13 == 0) {
            s0Var.U = Float.valueOf(i11 / i10);
        } else {
            s0Var.U = Float.valueOf(i10 / i11);
        }
        org.telegram.messenger.i0.g3(new i2.u(this, i10, i11, 13));
    }
}
