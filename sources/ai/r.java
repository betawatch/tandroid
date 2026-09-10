package ai;

import android.content.Context;
import org.telegram.ui.Components.jx0;
import zh.a5;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class r extends z {
    public final /* synthetic */ a0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(a0 a0Var, Context context) {
        super(a0Var, context);
        this.v = a0Var;
    }

    @Override // ai.z, s4.h0
    public final void l() {
        super.l();
        a0 a0Var = this.v;
        if (a0Var.r.getVisibility() == 0) {
            a0Var.w.l();
        }
        jx0 jx0Var = a0Var.y;
        if (jx0Var != null) {
            a5 a5Var = this.e;
            jx0Var.e(a5Var != null && a5Var.k(), true);
        }
    }
}
