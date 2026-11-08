package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class li extends w31 {
    public static final /* synthetic */ int b = 0;

    static {
        w31.h(new li());
    }

    @Override // org.telegram.ui.Components.w31
    public final void b(View view, x31 x31Var, boolean z9, l41 l41Var, q41 q41Var) {
        mi miVar = (mi) view;
        CharSequence charSequence = x31Var.l;
        CharSequence charSequence2 = x31Var.m;
        miVar.b.setText(charSequence);
        miVar.c.setText(charSequence2);
    }

    @Override // org.telegram.ui.Components.w31
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        return new mi(context, f6Var);
    }

    @Override // org.telegram.ui.Components.w31
    public final boolean f() {
        return false;
    }
}
