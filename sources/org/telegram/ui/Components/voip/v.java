package org.telegram.ui.Components.voip;

import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
