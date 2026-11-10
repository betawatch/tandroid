package fi;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.id;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class y9 extends b1 {
    public final /* synthetic */ va b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y9(va vaVar, Context context, boolean z9) {
        super(context, z9);
        this.b0 = vaVar;
    }

    @Override // org.telegram.messenger.camera.CameraView
    public final void receivedAmplitude(double d) {
        g6 g6Var = this.b0.O0;
        if (g6Var != null) {
            g6Var.g0 = Utilities.i((float) (d / 1800.0d), 1.0f, 0.0f);
        }
    }

    @Override // fi.b1, org.telegram.messenger.camera.CameraView
    public final void toggleDual() {
        super.toggleDual();
        va vaVar = this.b0;
        vaVar.F0.setValue(isDual());
        vaVar.F0.setContentDescription(id.M0(isDual() ? 2131754886 : 2131754887, null));
        vaVar.d0(vaVar.B());
    }

    @Override // fi.b1
    public final void u(boolean z9) {
        va vaVar = this.b0;
        vaVar.o1.b(vaVar.c1.getText());
        vaVar.o1.a(false, z9, vaVar.k0);
    }
}
