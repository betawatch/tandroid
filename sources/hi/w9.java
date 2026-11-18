package hi;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gd;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class w9 extends d1 {
    public final /* synthetic */ ta c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w9(ta taVar, Context context, boolean z10) {
        super(context, z10);
        this.c0 = taVar;
    }

    @Override // org.telegram.messenger.camera.CameraView
    public final void receivedAmplitude(double d) {
        e6 e6Var = this.c0.P0;
        if (e6Var != null) {
            e6Var.h0 = Utilities.i((float) (d / 1800.0d), 1.0f, 0.0f);
        }
    }

    @Override // hi.d1, org.telegram.messenger.camera.CameraView
    public final void toggleDual() {
        super.toggleDual();
        ta taVar = this.c0;
        taVar.G0.setValue(isDual());
        taVar.G0.setContentDescription(gd.M0(isDual() ? 2131754886 : 2131754887, null));
        taVar.d0(taVar.B());
    }

    @Override // hi.d1
    public final void u(boolean z10) {
        ta taVar = this.c0;
        taVar.p1.b(taVar.d1.getText());
        taVar.p1.a(false, z10, taVar.l0);
    }
}
