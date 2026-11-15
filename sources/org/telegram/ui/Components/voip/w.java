package org.telegram.ui.Components.voip;

import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class w implements RendererCommon.RendererEvents {
    public final /* synthetic */ z a;

    public w(z zVar) {
        this.a = zVar;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        int i7 = 0;
        while (true) {
            z zVar = this.a;
            if (i7 >= zVar.n0.size()) {
                zVar.n0.clear();
                return;
            } else {
                org.telegram.messenger.g0.r((Runnable) zVar.n0.get(i7));
                ((Runnable) zVar.n0.get(i7)).run();
                i7++;
            }
        }
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i7, int i10, int i11) {
    }
}
