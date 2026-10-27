package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class de extends org.telegram.ui.Components.pm0 {
    public final /* synthetic */ ge c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public de(ge geVar, Context context, org.telegram.ui.ActionBar.u6 u6Var, ke keVar) {
        super(context, u6Var, keVar);
        this.c0 = geVar;
    }

    @Override // org.telegram.ui.Components.v91, android.view.View
    public final boolean canScrollHorizontally(int i10) {
        return this.c0.w.Q0 && super.canScrollHorizontally(i10);
    }
}
