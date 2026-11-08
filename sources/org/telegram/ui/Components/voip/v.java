package org.telegram.ui.Components.voip;

import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class v implements RendererCommon.RendererEvents {
    public final /* synthetic */ y a;

    public v(y yVar) {
        this.a = yVar;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        int i7 = 0;
        while (true) {
            y yVar = this.a;
            if (i7 >= yVar.m0.size()) {
                yVar.m0.clear();
                return;
            } else {
                org.telegram.messenger.g0.r((Runnable) yVar.m0.get(i7));
                ((Runnable) yVar.m0.get(i7)).run();
                i7++;
            }
        }
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i7, int i10, int i11) {
    }
}
