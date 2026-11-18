package fi;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.tv;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
                bi.p2 p2Var = ((org.telegram.ui.Components.v7) this.e).G0;
                if (p2Var != null) {
                    p2Var.setTranslationY(totalVisibility * org.telegram.messenger.g0.L(-11.0f));
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(org.telegram.ui.Components.v7 v7Var, Context context, org.telegram.ui.ActionBar.i6 i6Var, ab.q qVar) {
        super(context, i6Var, qVar);
        this.e = v7Var;
    }
}
