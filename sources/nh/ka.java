package nh;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class ka extends c1 {
    public final /* synthetic */ gb U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ka(gb gbVar, Context context, boolean z10) {
        super(context, z10);
        this.U = gbVar;
    }

    @Override // org.telegram.messenger.camera.CameraView
    public final void receivedAmplitude(double d) {
        o6 o6Var = this.U.K0;
        if (o6Var != null) {
            o6Var.c0 = Utilities.clamp((float) (d / 1800.0d), 1.0f, 0.0f);
        }
    }

    @Override // nh.c1, org.telegram.messenger.camera.CameraView
    public final void toggleDual() {
        super.toggleDual();
        gb gbVar = this.U;
        gbVar.B0.setValue(isDual());
        gbVar.B0.setContentDescription(LocaleController.getString(isDual() ? R.string.AccDescrDualCameraOn : R.string.AccDescrDualCameraOff));
        gbVar.e0(gbVar.C());
    }

    @Override // nh.c1
    public final void u(boolean z10) {
        gb gbVar = this.U;
        gbVar.k1.b(gbVar.Y0.getText());
        gbVar.k1.a(false, z10, gbVar.g0);
    }
}
