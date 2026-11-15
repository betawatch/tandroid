package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class e31 extends org.telegram.ui.Components.a41 {
    public static final /* synthetic */ int b = 0;

    static {
        org.telegram.ui.Components.a41.h(new e31());
    }

    @Override // org.telegram.ui.Components.a41
    public final void b(View view, org.telegram.ui.Components.b41 b41Var, boolean z10, org.telegram.ui.Components.p41 p41Var, org.telegram.ui.Components.u41 u41Var) {
        ((f31) view).set(b41Var.z);
    }

    @Override // org.telegram.ui.Components.a41
    public final boolean c(org.telegram.ui.Components.b41 b41Var, org.telegram.ui.Components.b41 b41Var2) {
        return b41Var.z == b41Var2.z;
    }

    @Override // org.telegram.ui.Components.a41
    public final View d(Context context, org.telegram.ui.Components.uj0 uj0Var, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        return new f31(context, e6Var);
    }

    @Override // org.telegram.ui.Components.a41
    public final boolean e(org.telegram.ui.Components.b41 b41Var, org.telegram.ui.Components.b41 b41Var2) {
        return b41Var.d == b41Var2.d;
    }
}
