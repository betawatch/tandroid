package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class li extends x31 {
    public static final /* synthetic */ int b = 0;

    static {
        x31.h(new li());
    }

    @Override // org.telegram.ui.Components.x31
    public final void b(View view, y31 y31Var, boolean z9, m41 m41Var, r41 r41Var) {
        mi miVar = (mi) view;
        CharSequence charSequence = y31Var.l;
        CharSequence charSequence2 = y31Var.m;
        miVar.b.setText(charSequence);
        miVar.c.setText(charSequence2);
    }

    @Override // org.telegram.ui.Components.x31
    public final View d(Context context, qj0 qj0Var, int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        return new mi(context, g6Var);
    }

    @Override // org.telegram.ui.Components.x31
    public final boolean f() {
        return false;
    }
}
