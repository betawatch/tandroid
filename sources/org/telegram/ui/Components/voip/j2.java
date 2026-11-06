package org.telegram.ui.Components.voip;

import android.content.Context;
import org.webrtc.TextureViewRenderer;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class j2 extends TextureViewRenderer {
    public final /* synthetic */ k2 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(k2 k2Var, Context context) {
        super(context);
        this.a = k2Var;
    }

    @Override // org.webrtc.TextureViewRenderer, org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        super.onFirstFrameRendered();
        this.a.b();
    }

    @Override // android.view.TextureView, android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
    }
}
