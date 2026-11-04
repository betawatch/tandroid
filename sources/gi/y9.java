package gi;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class y9 extends b1 {
    public final /* synthetic */ va c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y9(va vaVar, Context context, boolean z10) {
        super(context, z10);
        this.c0 = vaVar;
    }

    @Override // org.telegram.messenger.camera.CameraView
    public final void receivedAmplitude(double d) {
        h6 h6Var = this.c0.P0;
        if (h6Var != null) {
            h6Var.h0 = Utilities.i((float) (d / 1800.0d), 1.0f, 0.0f);
        }
    }

    @Override // gi.b1, org.telegram.messenger.camera.CameraView
    public final void toggleDual() {
        super.toggleDual();
        va vaVar = this.c0;
        vaVar.G0.setValue(isDual());
        vaVar.G0.setContentDescription(bd.M0(isDual() ? 2131754886 : 2131754887, null));
        vaVar.d0(vaVar.B());
    }

    @Override // gi.b1
    public final void u(boolean z10) {
        va vaVar = this.c0;
        vaVar.p1.b(vaVar.d1.getText());
        vaVar.p1.a(false, z10, vaVar.l0);
    }
}
