package ei;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class ya extends c1 {
    public final /* synthetic */ vb b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ya(vb vbVar, Context context, boolean z10) {
        super(context, z10);
        this.b0 = vbVar;
    }

    @Override // org.telegram.messenger.camera.CameraView
    public final void receivedAmplitude(double d) {
        z6 z6Var = this.b0.O0;
        if (z6Var != null) {
            z6Var.g0 = Utilities.clamp((float) (d / 1800.0d), 1.0f, 0.0f);
        }
    }

    @Override // ei.c1, org.telegram.messenger.camera.CameraView
    public final void toggleDual() {
        super.toggleDual();
        vb vbVar = this.b0;
        vbVar.F0.setValue(isDual());
        vbVar.F0.setContentDescription(LocaleController.getString(isDual() ? R.string.AccDescrDualCameraOn : R.string.AccDescrDualCameraOff));
        vbVar.d0(vbVar.B());
    }

    @Override // ei.c1
    public final void u(boolean z10) {
        vb vbVar = this.b0;
        vbVar.o1.b(vbVar.c1.getText());
        vbVar.o1.a(false, z10, vbVar.k0);
    }
}
