package fi;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.sv;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class j extends org.telegram.ui.ActionBar.m {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ FrameLayout e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(sv svVar, Context context, ab.q qVar) {
        super(context, null, qVar);
        this.e = svVar;
    }

    @Override // org.telegram.ui.ActionBar.m, te.i
    public final void g(te.j jVar) {
        switch (this.d) {
            case 0:
                super.g(jVar);
                ((sv) this.e).invalidate();
                break;
            default:
                super.g(jVar);
                float totalVisibility = getTotalVisibility();
                bi.v2 v2Var = ((org.telegram.ui.Components.u7) this.e).G0;
                if (v2Var != null) {
                    v2Var.setTranslationY(totalVisibility * org.telegram.messenger.g0.L(-11.0f));
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(org.telegram.ui.Components.u7 u7Var, Context context, org.telegram.ui.ActionBar.i6 i6Var, ab.q qVar) {
        super(context, i6Var, qVar);
        this.e = u7Var;
    }
}
