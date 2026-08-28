package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ch1 implements RendererCommon.RendererEvents {
    public final /* synthetic */ mh1 a;

    public ch1(mh1 mh1Var) {
        this.a = mh1Var;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        mh1 mh1Var = this.a;
        af.f fVar = mh1Var.h1;
        if (fVar != null) {
            fVar.run();
            mh1Var.h1 = null;
        }
        AndroidUtilities.runOnUIThread(new ky0(this, 24));
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i9, int i10, int i11) {
    }
}
