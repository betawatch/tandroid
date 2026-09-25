package org.telegram.ui.Components.voip;

import android.content.Context;
import org.webrtc.TextureViewRenderer;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class s2 extends TextureViewRenderer {
    public final /* synthetic */ t2 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(t2 t2Var, Context context) {
        super(context);
        this.a = t2Var;
    }

    @Override // org.webrtc.TextureViewRenderer, org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        super.onFirstFrameRendered();
        this.a.b();
    }

    @Override // android.view.TextureView, android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
    }
}
