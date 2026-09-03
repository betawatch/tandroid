package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
            if (i10 >= uVar.j0.size()) {
                uVar.j0.clear();
                return;
            } else {
                AndroidUtilities.cancelRunOnUIThread((Runnable) uVar.j0.get(i10));
                ((Runnable) uVar.j0.get(i10)).run();
                i10++;
            }
        }
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
