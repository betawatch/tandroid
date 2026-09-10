package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class h1 implements RendererCommon.RendererEvents {
    public final /* synthetic */ i1 a;

    public h1(i1 i1Var) {
        this.a = i1Var;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        i1 i1Var = this.a;
        i1Var.x = true;
        com.google.android.gms.internal.cast.p pVar = i1Var.Y;
        if (pVar != null) {
            pVar.run();
            i1Var.Y = null;
        }
        AndroidUtilities.runOnUIThread(new x(this, 3));
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
        AndroidUtilities.runOnUIThread(new fg.n(this, i10, i11, 11));
    }
}
