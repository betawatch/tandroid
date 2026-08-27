package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class bh1 implements RendererCommon.RendererEvents {
    public final /* synthetic */ lh1 a;

    public bh1(lh1 lh1Var) {
        this.a = lh1Var;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        lh1 lh1Var = this.a;
        bf.e eVar = lh1Var.h1;
        if (eVar != null) {
            eVar.run();
            lh1Var.h1 = null;
        }
        AndroidUtilities.runOnUIThread(new ky0(this, 24));
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
