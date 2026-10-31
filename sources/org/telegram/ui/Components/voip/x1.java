package org.telegram.ui.Components.voip;

import android.content.Context;
import org.webrtc.TextureViewRenderer;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class x1 extends TextureViewRenderer {
    public final /* synthetic */ y1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(y1 y1Var, Context context) {
        super(context);
        this.a = y1Var;
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
