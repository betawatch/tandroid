// default package

import android.content.Context;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class gmc extends bnb {
    public final /* synthetic */ hmc M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gmc(hmc hmcVar, Context context) {
        super(context);
        this.M = hmcVar;
    }

    @Override // bnb, org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        super.onFirstFrameRendered();
        this.M.b();
    }

    @Override // android.view.TextureView, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }
}
