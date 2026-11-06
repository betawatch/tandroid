package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class d21 implements View.OnClickListener {
    public final /* synthetic */ l21 a;

    public d21(l21 l21Var) {
        this.a = l21Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Components.ch0 ch0Var = this.a.k1;
        if (ch0Var.b() || ch0Var.getAnimatedDrawable() == null) {
            return;
        }
        ch0Var.getAnimatedDrawable().M(40);
        ch0Var.d();
    }
}
