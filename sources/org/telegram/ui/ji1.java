package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class ji1 implements RendererCommon.RendererEvents {
    public final /* synthetic */ ti1 a;

    public ji1(ti1 ti1Var) {
        this.a = ti1Var;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        ti1 ti1Var = this.a;
        com.google.android.gms.internal.cast.p pVar = ti1Var.l1;
        if (pVar != null) {
            pVar.run();
            ti1Var.l1 = null;
        }
        AndroidUtilities.runOnUIThread(new g01(this, 22));
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
