package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class nx extends org.telegram.ui.Components.x31 {
    public static final /* synthetic */ int b = 0;

    static {
        org.telegram.ui.Components.x31.h(new nx());
    }

    @Override // org.telegram.ui.Components.x31
    public final void b(View view, org.telegram.ui.Components.y31 y31Var, boolean z9, org.telegram.ui.Components.m41 m41Var, org.telegram.ui.Components.r41 r41Var) {
        ox oxVar = (ox) view;
        oxVar.n = (org.telegram.messenger.c20) y31Var.G;
        oxVar.r = y31Var;
        oxVar.b(y31Var.z, false);
    }

    @Override // org.telegram.ui.Components.x31
    public final View d(Context context, org.telegram.ui.Components.qj0 qj0Var, int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        return new ox(context, g6Var);
    }
}
