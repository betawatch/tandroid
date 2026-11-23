package hi;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gd;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class qa extends l1 {
    public final /* synthetic */ nb c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qa(nb nbVar, Context context, boolean z10) {
        super(context, z10);
        this.c0 = nbVar;
    }

    @Override // org.telegram.messenger.camera.CameraView
    public final void receivedAmplitude(double d) {
        n6 n6Var = this.c0.P0;
        if (n6Var != null) {
            n6Var.h0 = Utilities.i((float) (d / 1800.0d), 1.0f, 0.0f);
        }
    }

    @Override // hi.l1, org.telegram.messenger.camera.CameraView
    public final void toggleDual() {
        super.toggleDual();
        nb nbVar = this.c0;
        nbVar.G0.setValue(isDual());
        nbVar.G0.setContentDescription(gd.N0(isDual() ? 2131754886 : 2131754887, null));
        nbVar.d0(nbVar.B());
    }

    @Override // hi.l1
    public final void u(boolean z10) {
        nb nbVar = this.c0;
        nbVar.p1.b(nbVar.d1.getText());
        nbVar.p1.a(false, z10, nbVar.l0);
    }
}
