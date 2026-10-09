package ai;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.c71;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class x0 extends c71 {
    public final /* synthetic */ s3 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(s3 s3Var, w0 w0Var, Context context, int i10, t0 t0Var, d dVar) {
        super(w0Var, context, i10, 0, false, t0Var, dVar);
        this.N = s3Var;
    }

    @Override // org.telegram.ui.Components.c71, s4.i0
    public final void v(s4.d1 d1Var, int i10) {
        h1 h1Var;
        m1 m1Var;
        super.v(d1Var, i10);
        s3 s3Var = this.N;
        if (s3Var.y) {
            View view = d1Var.a;
            if ((view instanceof h1) && (m1Var = (h1Var = (h1) view).K) != null && m1Var.a == s3Var.x) {
                h1Var.c();
                s3Var.y = false;
            }
        }
    }

    @Override // org.telegram.ui.Components.c71, s4.i0
    public final void y(s4.d1 d1Var) {
        h1 h1Var;
        m1 m1Var;
        super.y(d1Var);
        s3 s3Var = this.N;
        if (s3Var.y) {
            View view = d1Var.a;
            if ((view instanceof h1) && (m1Var = (h1Var = (h1) view).K) != null && m1Var.a == s3Var.x) {
                h1Var.c();
                s3Var.y = false;
            }
        }
    }
}
