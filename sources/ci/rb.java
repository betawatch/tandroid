package ci;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
