package org.telegram.ui;

import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
