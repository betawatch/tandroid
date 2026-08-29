package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ik extends ug.e {
    public final /* synthetic */ tn H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ik(tn tnVar, Context context, org.telegram.ui.ActionBar.c6 c6Var, aj ajVar, lg.a aVar) {
        super(context, aVar, ajVar, c6Var);
        this.H = tnVar;
    }

    @Override // ug.e, android.view.View
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        this.H.xc.j(3, i10 == 0, getMeasuredWidth() > 0);
    }
}
