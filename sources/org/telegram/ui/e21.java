package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class e21 implements View.OnClickListener {
    public final /* synthetic */ m21 a;

    public e21(m21 m21Var) {
        this.a = m21Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Components.ph0 ph0Var = this.a.o1;
        if (ph0Var.b() || ph0Var.getAnimatedDrawable() == null) {
            return;
        }
        ph0Var.getAnimatedDrawable().M(40);
        ph0Var.d();
    }
}
