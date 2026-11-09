package li;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.y31;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final class u0 extends x31 {
    public static final /* synthetic */ int b = 0;

    static {
        x31.h(new u0());
    }

    @Override // org.telegram.ui.Components.x31
    public final void b(View view, y31 y31Var, boolean z9, m41 m41Var, r41 r41Var) {
        v0 v0Var = (v0) view;
        a aVar = (a) y31Var.G;
        q2 q2Var = (q2) y31Var.H;
        v0Var.a = aVar;
        v0Var.w = q2Var;
        v0Var.x = id.a0;
        v0Var.c(aVar);
    }

    @Override // org.telegram.ui.Components.x31
    public final View d(Context context, qj0 qj0Var, int i7, g6 g6Var) {
        return new v0(context, g6Var);
    }

    @Override // org.telegram.ui.Components.x31
    public final boolean f() {
        return false;
    }
}
