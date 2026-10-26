package fi;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class va extends c1 {
    public final /* synthetic */ sb b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va(sb sbVar, Context context, boolean z10) {
        super(context, z10);
        this.b0 = sbVar;
    }

    @Override // org.telegram.messenger.camera.CameraView
    public final void receivedAmplitude(double d) {
        w6 w6Var = this.b0.O0;
        if (w6Var != null) {
            w6Var.g0 = Utilities.clamp((float) (d / 1800.0d), 1.0f, 0.0f);
        }
    }

    @Override // fi.c1, org.telegram.messenger.camera.CameraView
    public final void toggleDual() {
        super.toggleDual();
        sb sbVar = this.b0;
        sbVar.F0.setValue(isDual());
        sbVar.F0.setContentDescription(LocaleController.getString(isDual() ? R.string.AccDescrDualCameraOn : R.string.AccDescrDualCameraOff));
        sbVar.d0(sbVar.B());
    }

    @Override // fi.c1
    public final void u(boolean z10) {
        sb sbVar = this.b0;
        sbVar.o1.b(sbVar.c1.getText());
        sbVar.o1.a(false, z10, sbVar.k0);
    }
}
