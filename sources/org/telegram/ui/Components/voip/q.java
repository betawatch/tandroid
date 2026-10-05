package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class q implements RendererCommon.RendererEvents {
    public final /* synthetic */ u a;

    public q(u uVar) {
        this.a = uVar;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        int i10 = 0;
        while (true) {
            u uVar = this.a;
            if (i10 >= uVar.m0.size()) {
                uVar.m0.clear();
                return;
            } else {
                AndroidUtilities.cancelRunOnUIThread((Runnable) uVar.m0.get(i10));
                ((Runnable) uVar.m0.get(i10)).run();
                i10++;
            }
        }
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
