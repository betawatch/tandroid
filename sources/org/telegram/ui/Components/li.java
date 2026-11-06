package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class li extends q31 {
    public static final /* synthetic */ int b = 0;

    static {
        q31.h(new li());
    }

    @Override // org.telegram.ui.Components.q31
    public final void b(View view, r31 r31Var, boolean z9, f41 f41Var, k41 k41Var) {
        mi miVar = (mi) view;
        CharSequence charSequence = r31Var.l;
        CharSequence charSequence2 = r31Var.m;
        miVar.b.setText(charSequence);
        miVar.c.setText(charSequence2);
    }

    @Override // org.telegram.ui.Components.q31
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        return new mi(context, f6Var);
    }

    @Override // org.telegram.ui.Components.q31
    public final boolean f() {
        return false;
    }
}
