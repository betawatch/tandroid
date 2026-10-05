package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class ai1 implements RendererCommon.RendererEvents {
    public final /* synthetic */ ki1 a;

    public ai1(ki1 ki1Var) {
        this.a = ki1Var;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        ki1 ki1Var = this.a;
        com.google.android.gms.internal.cast.p pVar = ki1Var.l1;
        if (pVar != null) {
            pVar.run();
            ki1Var.l1 = null;
        }
        AndroidUtilities.runOnUIThread(new hz0(this, 24));
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
