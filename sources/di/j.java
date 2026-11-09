package di;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.rv;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class j extends org.telegram.ui.ActionBar.m {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ FrameLayout e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(rv rvVar, Context context, ab.q qVar) {
        super(context, null, qVar);
        this.e = rvVar;
    }

    @Override // org.telegram.ui.ActionBar.m, te.i
    public final void f(te.j jVar) {
        switch (this.d) {
            case 0:
                super.f(jVar);
                ((rv) this.e).invalidate();
                break;
            default:
                super.f(jVar);
                float totalVisibility = getTotalVisibility();
                b4 b4Var = ((org.telegram.ui.Components.r7) this.e).F0;
                if (b4Var != null) {
                    b4Var.setTranslationY(totalVisibility * org.telegram.messenger.g0.L(-11.0f));
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(org.telegram.ui.Components.r7 r7Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, ab.q qVar) {
        super(context, g6Var, qVar);
        this.e = r7Var;
    }
}
