package di;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.pv;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class j extends org.telegram.ui.ActionBar.m {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ FrameLayout e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(pv pvVar, Context context, ab.q qVar) {
        super(context, null, qVar);
        this.e = pvVar;
    }

    @Override // org.telegram.ui.ActionBar.m, te.i
    public final void f(te.j jVar) {
        switch (this.d) {
            case 0:
                super.f(jVar);
                ((pv) this.e).invalidate();
                break;
            default:
                super.f(jVar);
                float totalVisibility = getTotalVisibility();
                a4 a4Var = ((org.telegram.ui.Components.r7) this.e).F0;
                if (a4Var != null) {
                    a4Var.setTranslationY(totalVisibility * org.telegram.messenger.g0.L(-11.0f));
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(org.telegram.ui.Components.r7 r7Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, ab.q qVar) {
        super(context, f6Var, qVar);
        this.e = r7Var;
    }
}
