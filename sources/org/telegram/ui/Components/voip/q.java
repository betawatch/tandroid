package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
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
            if (i10 >= uVar.i0.size()) {
                uVar.i0.clear();
                return;
            } else {
                AndroidUtilities.cancelRunOnUIThread((Runnable) uVar.i0.get(i10));
                ((Runnable) uVar.i0.get(i10)).run();
                i10++;
            }
        }
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
