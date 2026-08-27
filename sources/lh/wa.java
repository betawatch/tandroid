package lh;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class wa extends c1 {
    public final /* synthetic */ sb U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa(sb sbVar, Context context, boolean z10) {
        super(context, z10);
        this.U = sbVar;
    }

    @Override // org.telegram.messenger.camera.CameraView
    public final void receivedAmplitude(double d) {
        y6 y6Var = this.U.K0;
        if (y6Var != null) {
            y6Var.c0 = Utilities.clamp((float) (d / 1800.0d), 1.0f, 0.0f);
        }
    }

    @Override // lh.c1, org.telegram.messenger.camera.CameraView
    public final void toggleDual() {
        super.toggleDual();
        sb sbVar = this.U;
        sbVar.B0.setValue(isDual());
        sbVar.B0.setContentDescription(LocaleController.getString(isDual() ? R.string.AccDescrDualCameraOn : R.string.AccDescrDualCameraOff));
        sbVar.e0(sbVar.C());
    }

    @Override // lh.c1
    public final void u(boolean z10) {
        sb sbVar = this.U;
        sbVar.k1.b(sbVar.Y0.getText());
        sbVar.k1.a(false, z10, sbVar.g0);
    }
}
