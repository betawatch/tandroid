package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.cp;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.y31;
import org.telegram.ui.vw0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class t6 extends x31 {
    public static final /* synthetic */ int b = 0;

    static {
        x31.h(new t6());
    }

    @Override // org.telegram.ui.Components.x31
    public final void b(View view, y31 y31Var, boolean z9, m41 m41Var, r41 r41Var) {
        Object obj = y31Var.G;
        if (obj instanceof vw0) {
            vw0 vw0Var = (vw0) obj;
            ((v6) view).b(y31Var.l, vw0Var.d, vw0Var.e, z9);
        } else if (obj instanceof cp) {
            ((v6) view).a(y31Var.l, ((cp) obj).b, true, z9);
        }
    }

    @Override // org.telegram.ui.Components.x31
    public final View d(Context context, qj0 qj0Var, int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        return new v6(context);
    }
}
