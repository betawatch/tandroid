package bi;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class bd extends i1 {
    public final /* synthetic */ ce b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bd(ce ceVar, Context context, boolean z10) {
        super(context, z10);
        this.b0 = ceVar;
    }

    @Override // org.telegram.messenger.camera.CameraView
    public final void receivedAmplitude(double d) {
        m8 m8Var = this.b0.O0;
        if (m8Var != null) {
            m8Var.g0 = Utilities.clamp((float) (d / 1800.0d), 1.0f, 0.0f);
        }
    }

    @Override // bi.i1, org.telegram.messenger.camera.CameraView
    public final void toggleDual() {
        super.toggleDual();
        ce ceVar = this.b0;
        ceVar.F0.setValue(isDual());
        ceVar.F0.setContentDescription(LocaleController.getString(isDual() ? R.string.AccDescrDualCameraOn : R.string.AccDescrDualCameraOff));
        ceVar.e0(ceVar.C());
    }

    @Override // bi.i1
    public final void u(boolean z10) {
        ce ceVar = this.b0;
        ceVar.o1.b(ceVar.c1.getText());
        ceVar.o1.a(false, z10, ceVar.k0);
    }
}
