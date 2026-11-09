package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.y31;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final class o5 extends x31 {
    public static final /* synthetic */ int b = 0;

    static {
        x31.h(new o5());
    }

    @Override // org.telegram.ui.Components.x31
    public final void b(View view, y31 y31Var, boolean z9, m41 m41Var, r41 r41Var) {
        ((p5) view).a(y31Var.k, y31Var.l, y31Var.m);
    }

    @Override // org.telegram.ui.Components.x31
    public final View d(Context context, qj0 qj0Var, int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        return new p5(context, g6Var);
    }

    @Override // org.telegram.ui.Components.x31
    public final boolean f() {
        return false;
    }

    @Override // org.telegram.ui.Components.x31
    public final boolean g() {
        return true;
    }
}
