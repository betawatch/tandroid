package li;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes4.dex */
public final class u0 extends w31 {
    public static final /* synthetic */ int b = 0;

    static {
        w31.h(new u0());
    }

    @Override // org.telegram.ui.Components.w31
    public final void b(View view, x31 x31Var, boolean z9, l41 l41Var, q41 q41Var) {
        v0 v0Var = (v0) view;
        a aVar = (a) x31Var.G;
        q2 q2Var = (q2) x31Var.H;
        v0Var.a = aVar;
        v0Var.w = q2Var;
        v0Var.x = hd.a0;
        v0Var.c(aVar);
    }

    @Override // org.telegram.ui.Components.w31
    public final View d(Context context, pj0 pj0Var, int i7, f6 f6Var) {
        return new v0(context, f6Var);
    }

    @Override // org.telegram.ui.Components.w31
    public final boolean f() {
        return false;
    }
}
