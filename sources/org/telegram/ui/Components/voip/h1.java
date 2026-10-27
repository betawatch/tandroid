package org.telegram.ui.Components.voip;

import a8.fg;
import org.telegram.messenger.AndroidUtilities;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class h1 implements RendererCommon.RendererEvents {
    public final /* synthetic */ i1 a;

    public h1(i1 i1Var) {
        this.a = i1Var;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        i1 i1Var = this.a;
        i1Var.x = true;
        fg fgVar = i1Var.Y;
        if (fgVar != null) {
            fgVar.run();
            i1Var.Y = null;
        }
        AndroidUtilities.runOnUIThread(new k2.c(this, 19));
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
        int i13 = (i12 / 90) % 2;
        i1 i1Var = this.a;
        if (i13 == 0) {
            i1Var.U = Float.valueOf(i11 / i10);
        } else {
            i1Var.U = Float.valueOf(i10 / i11);
        }
        AndroidUtilities.runOnUIThread(new i2.v(this, i10, i11, 11));
    }
}
