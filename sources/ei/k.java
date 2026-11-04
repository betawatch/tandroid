package ei;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.mv;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class k extends org.telegram.ui.ActionBar.m {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ FrameLayout e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(mv mvVar, Context context, b4.n nVar) {
        super(context, null, nVar);
        this.e = mvVar;
    }

    @Override // org.telegram.ui.ActionBar.m, qe.i
    public final void b(qe.j jVar) {
        switch (this.d) {
            case 0:
                super.b(jVar);
                ((mv) this.e).invalidate();
                break;
            default:
                super.b(jVar);
                float totalVisibility = getTotalVisibility();
                ai.d2 d2Var = ((org.telegram.ui.Components.p7) this.e).G0;
                if (d2Var != null) {
                    d2Var.setTranslationY(totalVisibility * org.telegram.messenger.g0.L(-11.0f));
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(org.telegram.ui.Components.p7 p7Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, b4.n nVar) {
        super(context, e6Var, nVar);
        this.e = p7Var;
    }
}
