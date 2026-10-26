package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class de extends org.telegram.ui.Components.om0 {
    public final /* synthetic */ ge c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public de(ge geVar, Context context, org.telegram.ui.ActionBar.u6 u6Var, ke keVar) {
        super(context, u6Var, keVar);
        this.c0 = geVar;
    }

    @Override // org.telegram.ui.Components.u91, android.view.View
    public final boolean canScrollHorizontally(int i10) {
        return this.c0.w.Q0 && super.canScrollHorizontally(i10);
    }
}
