package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ti extends a41 {
    public static final /* synthetic */ int b = 0;

    static {
        a41.h(new ti());
    }

    @Override // org.telegram.ui.Components.a41
    public final void b(View view, b41 b41Var, boolean z10, p41 p41Var, u41 u41Var) {
        ui uiVar = (ui) view;
        CharSequence charSequence = b41Var.l;
        CharSequence charSequence2 = b41Var.m;
        uiVar.b.setText(charSequence);
        uiVar.c.setText(charSequence2);
    }

    @Override // org.telegram.ui.Components.a41
    public final View d(Context context, uj0 uj0Var, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        return new ui(context, e6Var);
    }

    @Override // org.telegram.ui.Components.a41
    public final boolean f() {
        return false;
    }
}
