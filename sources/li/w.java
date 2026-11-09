package li;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.y31;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final class w extends x31 {
    public static final /* synthetic */ int b = 0;

    static {
        x31.h(new w());
    }

    @Override // org.telegram.ui.Components.x31
    public final void b(View view, y31 y31Var, boolean z9, m41 m41Var, r41 r41Var) {
        ((x) view).h((a) y31Var.G, (n3) y31Var.H);
    }

    @Override // org.telegram.ui.Components.x31
    public final View d(Context context, qj0 qj0Var, int i7, g6 g6Var) {
        x xVar = new x(i7, context, g6Var);
        xVar.setBackground(new y1(l6.w0(l6.d6, g6Var)));
        return xVar;
    }

    @Override // org.telegram.ui.Components.x31
    public final boolean f() {
        return false;
    }
}
