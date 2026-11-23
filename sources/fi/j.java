package fi;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.tv;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class j extends org.telegram.ui.ActionBar.m {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ FrameLayout e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(tv tvVar, Context context, ab.q qVar) {
        super(context, null, qVar);
        this.e = tvVar;
    }

    @Override // org.telegram.ui.ActionBar.m, te.i
    public final void f(te.j jVar) {
        switch (this.d) {
            case 0:
                super.f(jVar);
                ((tv) this.e).invalidate();
                break;
            default:
                super.f(jVar);
                float totalVisibility = getTotalVisibility();
                bi.t2 t2Var = ((org.telegram.ui.Components.v7) this.e).G0;
                if (t2Var != null) {
                    t2Var.setTranslationY(totalVisibility * org.telegram.messenger.g0.L(-11.0f));
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(org.telegram.ui.Components.v7 v7Var, Context context, org.telegram.ui.ActionBar.h6 h6Var, ab.q qVar) {
        super(context, h6Var, qVar);
        this.e = v7Var;
    }
}
