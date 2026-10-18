package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class p implements RendererCommon.RendererEvents {
    public final /* synthetic */ t a;

    public p(t tVar) {
        this.a = tVar;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        int i10 = 0;
        while (true) {
            t tVar = this.a;
            if (i10 >= tVar.m0.size()) {
                tVar.m0.clear();
                return;
            } else {
                AndroidUtilities.cancelRunOnUIThread((Runnable) tVar.m0.get(i10));
                ((Runnable) tVar.m0.get(i10)).run();
                i10++;
            }
        }
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
