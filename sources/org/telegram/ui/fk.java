package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class fk extends rg.e {
    public final /* synthetic */ qn H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fk(qn qnVar, Context context, org.telegram.ui.ActionBar.b6 b6Var, xi xiVar, ig.a aVar) {
        super(context, aVar, xiVar, b6Var);
        this.H = qnVar;
    }

    @Override // rg.e, android.view.View
    public final void setVisibility(int i9) {
        super.setVisibility(i9);
        this.H.xc.j(3, i9 == 0, getMeasuredWidth() > 0);
    }
}
