package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
