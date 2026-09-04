package di;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class sb extends d1 {
    public final /* synthetic */ pc b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sb(pc pcVar, Context context, boolean z10) {
        super(context, z10);
        this.b0 = pcVar;
    }

    @Override // org.telegram.messenger.camera.CameraView
    public final void receivedAmplitude(double d) {
        l7 l7Var = this.b0.O0;
        if (l7Var != null) {
            l7Var.g0 = Utilities.clamp((float) (d / 1800.0d), 1.0f, 0.0f);
        }
    }

    @Override // di.d1, org.telegram.messenger.camera.CameraView
    public final void toggleDual() {
        super.toggleDual();
        pc pcVar = this.b0;
        pcVar.F0.setValue(isDual());
        pcVar.F0.setContentDescription(LocaleController.getString(isDual() ? R.string.AccDescrDualCameraOn : R.string.AccDescrDualCameraOff));
        pcVar.e0(pcVar.C());
    }

    @Override // di.d1
    public final void u(boolean z10) {
        pc pcVar = this.b0;
        pcVar.o1.b(pcVar.c1.getText());
        pcVar.o1.a(false, z10, pcVar.k0);
    }
}
