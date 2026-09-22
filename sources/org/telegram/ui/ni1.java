package org.telegram.ui;

import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class ni1 implements RendererCommon.RendererEvents {
    public final /* synthetic */ ti1 a;

    public ni1(ti1 ti1Var) {
        this.a = ti1Var;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        ti1 ti1Var = this.a;
        com.google.android.gms.internal.cast.p pVar = ti1Var.l1;
        if (pVar != null) {
            pVar.run();
            ti1Var.l1 = null;
        }
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
