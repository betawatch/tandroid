package ci;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final class ob extends d1 {
    public final /* synthetic */ lc b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ob(lc lcVar, Context context, boolean z10) {
        super(context, z10);
        this.b0 = lcVar;
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
        lc lcVar = this.b0;
        lcVar.F0.setValue(isDual());
        lcVar.F0.setContentDescription(LocaleController.getString(isDual() ? R.string.AccDescrDualCameraOn : R.string.AccDescrDualCameraOff));
        lcVar.e0(lcVar.C());
    }

    @Override // ci.d1
    public final void u(boolean z10) {
        lc lcVar = this.b0;
        lcVar.o1.b(lcVar.c1.getText());
        lcVar.o1.a(false, z10, lcVar.k0);
    }
}
