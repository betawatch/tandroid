package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class f1 implements RendererCommon.RendererEvents {
    public final /* synthetic */ g1 a;

    public f1(g1 g1Var) {
        this.a = g1Var;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        g1 g1Var = this.a;
        g1Var.x = true;
        af.f fVar = g1Var.U;
        if (fVar != null) {
            fVar.run();
            g1Var.U = null;
        }
        AndroidUtilities.runOnUIThread(new mh.m2(this, 8));
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i9, int i10, int i11) {
        int i12 = (i11 / 90) % 2;
        g1 g1Var = this.a;
        if (i12 == 0) {
            g1Var.Q = Float.valueOf(i10 / i9);
        } else {
            g1Var.Q = Float.valueOf(i9 / i10);
        }
        AndroidUtilities.runOnUIThread(new h3.y(this, i9, i10, 11));
    }
}
