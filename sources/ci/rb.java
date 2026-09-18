package ci;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes4.dex */
public final class rb extends d1 {
    public final /* synthetic */ oc b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rb(oc ocVar, Context context, boolean z10) {
        super(context, z10);
        this.b0 = ocVar;
    }

    @Override // org.telegram.messenger.camera.CameraView
    public final void receivedAmplitude(double d) {
        l7 l7Var = this.b0.O0;
        if (l7Var != null) {
            l7Var.g0 = Utilities.clamp((float) (d / 1800.0d), 1.0f, 0.0f);
        }
    }

    @Override // ci.d1, org.telegram.messenger.camera.CameraView
    public final void toggleDual() {
        super.toggleDual();
        oc ocVar = this.b0;
        ocVar.F0.setValue(isDual());
        ocVar.F0.setContentDescription(LocaleController.getString(isDual() ? R.string.AccDescrDualCameraOn : R.string.AccDescrDualCameraOff));
        ocVar.e0(ocVar.C());
    }

    @Override // ci.d1
    public final void u(boolean z10) {
        oc ocVar = this.b0;
        ocVar.o1.b(ocVar.c1.getText());
        ocVar.o1.a(false, z10, ocVar.k0);
    }
}
