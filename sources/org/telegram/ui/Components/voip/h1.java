package org.telegram.ui.Components.voip;

import a8.fg;
import org.telegram.messenger.AndroidUtilities;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
