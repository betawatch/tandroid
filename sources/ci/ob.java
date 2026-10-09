package ci;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class ob extends c1 {
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

    @Override // ci.c1, org.telegram.messenger.camera.CameraView
    public final void toggleDual() {
        super.toggleDual();
        lc lcVar = this.b0;
        lcVar.F0.setValue(isDual());
        lcVar.F0.setContentDescription(LocaleController.getString(isDual() ? R.string.AccDescrDualCameraOn : R.string.AccDescrDualCameraOff));
        lcVar.d0(lcVar.B());
    }

    @Override // ci.c1
    public final void u(boolean z10) {
        lc lcVar = this.b0;
        lcVar.o1.b(lcVar.c1.getText());
        lcVar.o1.a(false, z10, lcVar.k0);
    }
}
