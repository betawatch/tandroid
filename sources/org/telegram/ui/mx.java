package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class mx extends org.telegram.ui.Components.a41 {
    public static final /* synthetic */ int b = 0;

    static {
        org.telegram.ui.Components.a41.h(new mx());
    }

    @Override // org.telegram.ui.Components.a41
    public final void b(View view, org.telegram.ui.Components.b41 b41Var, boolean z10, org.telegram.ui.Components.p41 p41Var, org.telegram.ui.Components.u41 u41Var) {
        nx nxVar = (nx) view;
        nxVar.n = (org.telegram.messenger.z10) b41Var.G;
        nxVar.r = b41Var;
        nxVar.b(b41Var.z, false);
    }

    @Override // org.telegram.ui.Components.a41
    public final View d(Context context, org.telegram.ui.Components.uj0 uj0Var, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        return new nx(context, e6Var);
    }
}
