package org.telegram.ui.Components.voip;

import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class o implements RendererCommon.RendererEvents {
    public final /* synthetic */ r a;

    public o(r rVar) {
        this.a = rVar;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        int i10 = 0;
        while (true) {
            r rVar = this.a;
            if (i10 >= rVar.m0.size()) {
                rVar.m0.clear();
                return;
            } else {
                org.telegram.messenger.i0.r((Runnable) rVar.m0.get(i10));
                ((Runnable) rVar.m0.get(i10)).run();
                i10++;
            }
        }
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
