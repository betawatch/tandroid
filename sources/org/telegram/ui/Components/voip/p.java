package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
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
            if (i10 >= tVar.j0.size()) {
                tVar.j0.clear();
                return;
            } else {
                AndroidUtilities.cancelRunOnUIThread((Runnable) tVar.j0.get(i10));
                ((Runnable) tVar.j0.get(i10)).run();
                i10++;
            }
        }
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
