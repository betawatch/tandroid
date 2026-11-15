package fi;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.qv;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class j extends org.telegram.ui.ActionBar.m {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ FrameLayout e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(qv qvVar, Context context, ab.q qVar) {
        super(context, null, qVar);
        this.e = qvVar;
    }

    @Override // org.telegram.ui.ActionBar.m, te.i
    public final void f(te.j jVar) {
        switch (this.d) {
            case 0:
                super.f(jVar);
                ((qv) this.e).invalidate();
                break;
            default:
                super.f(jVar);
                float totalVisibility = getTotalVisibility();
                bi.v1 v1Var = ((org.telegram.ui.Components.o7) this.e).G0;
                if (v1Var != null) {
                    v1Var.setTranslationY(totalVisibility * org.telegram.messenger.g0.L(-11.0f));
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(org.telegram.ui.Components.o7 o7Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, ab.q qVar) {
        super(context, e6Var, qVar);
        this.e = o7Var;
    }
}
