package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class ji1 implements RendererCommon.RendererEvents {
    public final /* synthetic */ ui1 a;

    public ji1(ui1 ui1Var) {
        this.a = ui1Var;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        AndroidUtilities.runOnUIThread(new f01(this, 21));
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
