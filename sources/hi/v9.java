package hi;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hd;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class v9 extends c1 {
    public final /* synthetic */ sa c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v9(sa saVar, Context context, boolean z10) {
        super(context, z10);
        this.c0 = saVar;
    }

    @Override // org.telegram.messenger.camera.CameraView
    public final void receivedAmplitude(double d) {
        f6 f6Var = this.c0.P0;
        if (f6Var != null) {
            f6Var.h0 = Utilities.i((float) (d / 1800.0d), 1.0f, 0.0f);
        }
    }

    @Override // hi.c1, org.telegram.messenger.camera.CameraView
    public final void toggleDual() {
        super.toggleDual();
        sa saVar = this.c0;
        saVar.G0.setValue(isDual());
        saVar.G0.setContentDescription(hd.M0(isDual() ? 2131754886 : 2131754887, null));
        saVar.d0(saVar.B());
    }

    @Override // hi.c1
    public final void u(boolean z10) {
        sa saVar = this.c0;
        saVar.p1.b(saVar.d1.getText());
        saVar.p1.a(false, z10, saVar.l0);
    }
}
