package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
