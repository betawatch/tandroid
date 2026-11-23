package org.telegram.ui.Components.voip;

import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
            if (i7 >= yVar.n0.size()) {
                yVar.n0.clear();
                return;
            } else {
                org.telegram.messenger.g0.r((Runnable) yVar.n0.get(i7));
                ((Runnable) yVar.n0.get(i7)).run();
                i7++;
            }
        }
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i7, int i10, int i11) {
    }
}
