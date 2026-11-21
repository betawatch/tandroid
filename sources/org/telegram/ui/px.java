package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class px extends org.telegram.ui.Components.n41 {
    public static final /* synthetic */ int b = 0;

    static {
        org.telegram.ui.Components.n41.h(new px());
    }

    @Override // org.telegram.ui.Components.n41
    public final void b(View view, org.telegram.ui.Components.o41 o41Var, boolean z10, org.telegram.ui.Components.c51 c51Var, org.telegram.ui.Components.h51 h51Var) {
        qx qxVar = (qx) view;
        qxVar.n = (org.telegram.messenger.x10) o41Var.H;
        qxVar.r = o41Var;
        qxVar.b(o41Var.A, false);
    }

    @Override // org.telegram.ui.Components.n41
    public final View d(Context context, org.telegram.ui.Components.ek0 ek0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new qx(context, h6Var);
    }
}
