package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class eh1 implements RendererCommon.RendererEvents {
    public final /* synthetic */ oh1 a;

    public eh1(oh1 oh1Var) {
        this.a = oh1Var;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        oh1 oh1Var = this.a;
        com.google.android.gms.internal.cast.p pVar = oh1Var.l1;
        if (pVar != null) {
            pVar.run();
            oh1Var.l1 = null;
        }
        AndroidUtilities.runOnUIThread(new my0(this, 24));
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
