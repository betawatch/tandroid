package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class p implements RendererCommon.RendererEvents {
    public final /* synthetic */ t a;

    public p(t tVar) {
        this.a = tVar;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        int i9 = 0;
        while (true) {
            t tVar = this.a;
            if (i9 >= tVar.i0.size()) {
                tVar.i0.clear();
                return;
            } else {
                AndroidUtilities.cancelRunOnUIThread((Runnable) tVar.i0.get(i9));
                ((Runnable) tVar.i0.get(i9)).run();
                i9++;
            }
        }
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i9, int i10, int i11) {
    }
}
