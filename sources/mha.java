// default package

import android.content.Context;
import android.os.Bundle;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
