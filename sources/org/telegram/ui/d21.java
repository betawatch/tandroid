package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
