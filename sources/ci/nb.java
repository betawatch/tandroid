package ci;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes4.dex */
public final class nb extends d1 {
    public final /* synthetic */ kc b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nb(kc kcVar, Context context, boolean z10) {
        super(context, z10);
        this.b0 = kcVar;
    }

    @Override // org.telegram.messenger.camera.CameraView
    public final void receivedAmplitude(double d) {
        j7 j7Var = this.b0.O0;
        if (j7Var != null) {
            j7Var.g0 = Utilities.clamp((float) (d / 1800.0d), 1.0f, 0.0f);
        }
    }

    @Override // ci.d1, org.telegram.messenger.camera.CameraView
    public final void toggleDual() {
        super.toggleDual();
        kc kcVar = this.b0;
        kcVar.F0.setValue(isDual());
        kcVar.F0.setContentDescription(LocaleController.getString(isDual() ? R.string.AccDescrDualCameraOn : R.string.AccDescrDualCameraOff));
        kcVar.e0(kcVar.C());
    }

    @Override // ci.d1
    public final void u(boolean z10) {
        kc kcVar = this.b0;
        kcVar.o1.b(kcVar.c1.getText());
        kcVar.o1.a(false, z10, kcVar.k0);
    }
}
