// default package

import android.content.Context;
import android.os.Bundle;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class mha extends hv1 {
    public final /* synthetic */ eja f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mha(eja ejaVar, Context context, wk5 wk5Var, Bundle bundle) {
        super(context, wk5Var, bundle);
        this.f = ejaVar;
    }

    @Override // hv1
    public final void b(boolean z) {
        s7 s7Var = this.f.q0;
        if (s7Var != null) {
            s7Var.setShowSearchProgress(z);
        }
    }
}
