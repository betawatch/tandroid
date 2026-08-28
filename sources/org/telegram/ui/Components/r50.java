package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class r50 extends e80 {
    public final /* synthetic */ v50 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r50(v50 v50Var, Context context, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.f3 f3Var, boolean z10) {
        super(context, o2Var, f3Var, false, z10);
        this.H = v50Var;
    }

    @Override // org.telegram.ui.Components.e80
    public final void e(int i9, SpannableStringBuilder spannableStringBuilder) {
        org.telegram.ui.ActionBar.b6 b6Var;
        a60 a60Var = this.H.c;
        org.telegram.ui.ActionBar.d3 d3Var = a60Var.container;
        b6Var = ((org.telegram.ui.ActionBar.f3) a60Var).resourcesProvider;
        gc Q = new oc(d3Var, b6Var).Q(i9, 36, spannableStringBuilder);
        Q.r = false;
        Q.k(true);
    }
}
