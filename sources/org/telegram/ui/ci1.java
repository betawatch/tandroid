package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class ci1 implements RendererCommon.RendererEvents {
    public final /* synthetic */ mi1 a;

    public ci1(mi1 mi1Var) {
        this.a = mi1Var;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        mi1 mi1Var = this.a;
        com.google.android.gms.internal.cast.p pVar = mi1Var.l1;
        if (pVar != null) {
            pVar.run();
            mi1Var.l1 = null;
        }
        AndroidUtilities.runOnUIThread(new vz0(this, 22));
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
