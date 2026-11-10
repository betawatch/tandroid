package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class g21 implements View.OnClickListener {
    public final /* synthetic */ o21 a;

    public g21(o21 o21Var) {
        this.a = o21Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Components.ch0 ch0Var = this.a.n1;
        if (ch0Var.b() || ch0Var.getAnimatedDrawable() == null) {
            return;
        }
        ch0Var.getAnimatedDrawable().M(40);
        ch0Var.d();
    }
}
