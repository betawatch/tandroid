package hi;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hd;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class v9 extends d1 {
    public final /* synthetic */ sa c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v9(sa saVar, Context context, boolean z10) {
        super(context, z10);
        this.c0 = saVar;
    }

    @Override // org.telegram.messenger.camera.CameraView
    public final void receivedAmplitude(double d) {
        d6 d6Var = this.c0.P0;
        if (d6Var != null) {
            d6Var.h0 = Utilities.i((float) (d / 1800.0d), 1.0f, 0.0f);
        }
    }

    @Override // hi.d1, org.telegram.messenger.camera.CameraView
    public final void toggleDual() {
        super.toggleDual();
        sa saVar = this.c0;
        saVar.G0.setValue(isDual());
        saVar.G0.setContentDescription(hd.N0(isDual() ? 2131754886 : 2131754887, null));
        saVar.d0(saVar.B());
    }

    @Override // hi.d1
    public final void u(boolean z10) {
        sa saVar = this.c0;
        saVar.p1.b(saVar.d1.getText());
        saVar.p1.a(false, z10, saVar.l0);
    }
}
