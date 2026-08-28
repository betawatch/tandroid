package kh;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class za extends d1 {
    public final /* synthetic */ wb U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public za(wb wbVar, Context context, boolean z10) {
        super(context, z10);
        this.U = wbVar;
    }

    @Override // org.telegram.messenger.camera.CameraView
    public final void receivedAmplitude(double d) {
        z6 z6Var = this.U.K0;
        if (z6Var != null) {
            z6Var.c0 = Utilities.clamp((float) (d / 1800.0d), 1.0f, 0.0f);
        }
    }

    @Override // kh.d1, org.telegram.messenger.camera.CameraView
    public final void toggleDual() {
        super.toggleDual();
        wb wbVar = this.U;
        wbVar.B0.setValue(isDual());
        wbVar.B0.setContentDescription(LocaleController.getString(isDual() ? R.string.AccDescrDualCameraOn : R.string.AccDescrDualCameraOff));
        wbVar.e0(wbVar.C());
    }

    @Override // kh.d1
    public final void u(boolean z10) {
        wb wbVar = this.U;
        wbVar.k1.b(wbVar.Y0.getText());
        wbVar.k1.a(false, z10, wbVar.g0);
    }
}
