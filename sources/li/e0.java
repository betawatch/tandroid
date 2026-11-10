package li;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class e0 extends w31 {
    public static final /* synthetic */ int b = 0;

    static {
        w31.h(new e0());
    }

    @Override // org.telegram.ui.Components.w31
    public final void b(View view, x31 x31Var, boolean z9, m41 m41Var, r41 r41Var) {
        f0 f0Var = (f0) view;
        a aVar = (a) x31Var.G;
        d0 d0Var = (d0) x31Var.H;
        f0Var.a = aVar;
        f0Var.E = d0Var;
        f0Var.c(aVar);
        f0Var.h();
    }

    @Override // org.telegram.ui.Components.w31
    public final View d(Context context, pj0 pj0Var, int i7, h6 h6Var) {
        f0 f0Var = new f0(i7, context, h6Var);
        f0Var.setBackground(new y1(m6.w0(m6.d6, h6Var)));
        return f0Var;
    }

    @Override // org.telegram.ui.Components.w31
    public final boolean f() {
        return false;
    }
}
