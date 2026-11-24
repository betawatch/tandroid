// default package

import android.content.Context;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class a9b extends ss3 {
    public final /* synthetic */ v9b c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a9b(v9b v9bVar, Context context, boolean z) {
        super(context, z);
        this.c0 = v9bVar;
    }

    @Override // org.telegram.messenger.camera.CameraView
    public final void receivedAmplitude(double d) {
        j49 j49Var = this.c0.P0;
        if (j49Var != null) {
            j49Var.h0 = Utilities.i((float) (d / 1800.0d), 1.0f, 0.0f);
        }
    }

    @Override // ss3
    public final void s(boolean z) {
        v9b v9bVar = this.c0;
        v9bVar.p1.b(v9bVar.d1.getText());
        v9bVar.p1.a(false, z, v9bVar.l0);
    }

    @Override // ss3, org.telegram.messenger.camera.CameraView
    public final void toggleDual() {
        super.toggleDual();
        v9b v9bVar = this.c0;
        v9bVar.G0.setValue(isDual());
        v9bVar.G0.setContentDescription(jb6.M0(isDual() ? 2131754886 : 2131754887, null));
        v9bVar.d0(v9bVar.A());
    }
}
