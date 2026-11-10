package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class i31 extends org.telegram.ui.Components.w31 {
    public static final /* synthetic */ int b = 0;

    static {
        org.telegram.ui.Components.w31.h(new i31());
    }

    @Override // org.telegram.ui.Components.w31
    public final void b(View view, org.telegram.ui.Components.x31 x31Var, boolean z9, org.telegram.ui.Components.m41 m41Var, org.telegram.ui.Components.r41 r41Var) {
        ((j31) view).set(x31Var.z);
    }

    @Override // org.telegram.ui.Components.w31
    public final boolean c(org.telegram.ui.Components.x31 x31Var, org.telegram.ui.Components.x31 x31Var2) {
        return x31Var.z == x31Var2.z;
    }

    @Override // org.telegram.ui.Components.w31
    public final View d(Context context, org.telegram.ui.Components.pj0 pj0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new j31(context, h6Var);
    }

    @Override // org.telegram.ui.Components.w31
    public final boolean e(org.telegram.ui.Components.x31 x31Var, org.telegram.ui.Components.x31 x31Var2) {
        return x31Var.d == x31Var2.d;
    }
}
