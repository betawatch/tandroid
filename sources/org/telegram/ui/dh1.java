package org.telegram.ui;

import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class dh1 implements RendererCommon.RendererEvents {
    public final /* synthetic */ jh1 a;

    public dh1(jh1 jh1Var) {
        this.a = jh1Var;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        jh1 jh1Var = this.a;
        com.google.android.gms.internal.cast.p pVar = jh1Var.l1;
        if (pVar != null) {
            pVar.run();
            jh1Var.l1 = null;
        }
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
