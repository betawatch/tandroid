package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class eh1 implements RendererCommon.RendererEvents {
    public final /* synthetic */ oh1 a;

    public eh1(oh1 oh1Var) {
        this.a = oh1Var;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        oh1 oh1Var = this.a;
        com.google.android.gms.internal.cast.p pVar = oh1Var.l1;
        if (pVar != null) {
            pVar.run();
            oh1Var.l1 = null;
        }
        AndroidUtilities.runOnUIThread(new my0(this, 24));
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
