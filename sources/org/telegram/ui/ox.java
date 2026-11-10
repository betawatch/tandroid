package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ox extends org.telegram.ui.Components.w31 {
    public static final /* synthetic */ int b = 0;

    static {
        org.telegram.ui.Components.w31.h(new ox());
    }

    @Override // org.telegram.ui.Components.w31
    public final void b(View view, org.telegram.ui.Components.x31 x31Var, boolean z9, org.telegram.ui.Components.m41 m41Var, org.telegram.ui.Components.r41 r41Var) {
        px pxVar = (px) view;
        pxVar.n = (org.telegram.messenger.c20) x31Var.G;
        pxVar.r = x31Var;
        pxVar.b(x31Var.z, false);
    }

    @Override // org.telegram.ui.Components.w31
    public final View d(Context context, org.telegram.ui.Components.pj0 pj0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new px(context, h6Var);
    }
}
