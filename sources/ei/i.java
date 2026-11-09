package ei;

import android.content.Context;
import di.r6;
import org.telegram.ui.Components.cv0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class i extends m {
    public final /* synthetic */ n w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(n nVar, Context context) {
        super(nVar, context);
        this.w = nVar;
    }

    @Override // ei.m, v4.g0
    public final void f() {
        super.f();
        n nVar = this.w;
        if (nVar.r.getVisibility() == 0) {
            nVar.x.f();
        }
        cv0 cv0Var = nVar.D;
        if (cv0Var != null) {
            r6 r6Var = this.e;
            cv0Var.e(r6Var != null && r6Var.k(), true);
        }
    }
}
