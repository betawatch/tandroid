package org.telegram.ui.Components.voip;

import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class o implements RendererCommon.RendererEvents {
    public final /* synthetic */ r a;

    public o(r rVar) {
        this.a = rVar;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        int i3 = 0;
        while (true) {
            r rVar = this.a;
            if (i3 >= rVar.n0.size()) {
                rVar.n0.clear();
                return;
            } else {
                org.telegram.messenger.g0.r((Runnable) rVar.n0.get(i3));
                ((Runnable) rVar.n0.get(i3)).run();
                i3++;
            }
        }
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i3, int i10, int i11) {
    }
}
