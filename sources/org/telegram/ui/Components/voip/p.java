package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
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
