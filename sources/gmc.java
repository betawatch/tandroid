// default package

import android.content.Context;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
