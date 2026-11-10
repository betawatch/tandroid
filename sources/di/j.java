package di;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.sv;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class j extends org.telegram.ui.ActionBar.n {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ FrameLayout e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(sv svVar, Context context, ab.q qVar) {
        super(context, null, qVar);
        this.e = svVar;
    }

    @Override // org.telegram.ui.ActionBar.n, te.i
    public final void f(te.j jVar) {
        switch (this.d) {
            case 0:
                super.f(jVar);
                ((sv) this.e).invalidate();
                break;
            default:
                super.f(jVar);
                float totalVisibility = getTotalVisibility();
                b4 b4Var = ((org.telegram.ui.Components.q7) this.e).F0;
                if (b4Var != null) {
                    b4Var.setTranslationY(totalVisibility * org.telegram.messenger.g0.L(-11.0f));
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(org.telegram.ui.Components.q7 q7Var, Context context, org.telegram.ui.ActionBar.h6 h6Var, ab.q qVar) {
        super(context, h6Var, qVar);
        this.e = q7Var;
    }
}
