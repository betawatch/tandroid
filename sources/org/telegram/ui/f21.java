package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class f21 implements View.OnClickListener {
    public final /* synthetic */ n21 a;

    public f21(n21 n21Var) {
        this.a = n21Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Components.rh0 rh0Var = this.a.o1;
        if (rh0Var.b() || rh0Var.getAnimatedDrawable() == null) {
            return;
        }
        rh0Var.getAnimatedDrawable().M(40);
        rh0Var.d();
    }
}
