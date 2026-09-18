package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class ii1 implements RendererCommon.RendererEvents {
    public final /* synthetic */ si1 a;

    public ii1(si1 si1Var) {
        this.a = si1Var;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        si1 si1Var = this.a;
        com.google.android.gms.internal.cast.p pVar = si1Var.l1;
        if (pVar != null) {
            pVar.run();
            si1Var.l1 = null;
        }
        AndroidUtilities.runOnUIThread(new e01(this, 22));
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
