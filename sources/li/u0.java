package li;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class u0 extends w31 {
    public static final /* synthetic */ int b = 0;

    static {
        w31.h(new u0());
    }

    @Override // org.telegram.ui.Components.w31
    public final void b(View view, x31 x31Var, boolean z9, m41 m41Var, r41 r41Var) {
        v0 v0Var = (v0) view;
        a aVar = (a) x31Var.G;
        q2 q2Var = (q2) x31Var.H;
        v0Var.a = aVar;
        v0Var.w = q2Var;
        v0Var.x = id.a0;
        v0Var.c(aVar);
    }

    @Override // org.telegram.ui.Components.w31
    public final View d(Context context, pj0 pj0Var, int i7, h6 h6Var) {
        return new v0(context, h6Var);
    }

    @Override // org.telegram.ui.Components.w31
    public final boolean f() {
        return false;
    }
}
