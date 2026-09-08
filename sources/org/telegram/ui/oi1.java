package org.telegram.ui;

import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class oi1 implements RendererCommon.RendererEvents {
    public final /* synthetic */ ui1 a;

    public oi1(ui1 ui1Var) {
        this.a = ui1Var;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        ui1 ui1Var = this.a;
        com.google.android.gms.internal.cast.p pVar = ui1Var.l1;
        if (pVar != null) {
            pVar.run();
            ui1Var.l1 = null;
        }
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
