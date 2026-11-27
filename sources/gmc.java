// default package

import android.content.Context;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
