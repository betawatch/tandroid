package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class o71 implements View.OnClickListener {
    public final /* synthetic */ x71 a;

    public o71(x71 x71Var) {
        this.a = x71Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Components.nj0 nj0Var = this.a.d;
        if (nj0Var.b() || nj0Var.getAnimatedDrawable() == null) {
            return;
        }
        nj0Var.getAnimatedDrawable().M(40);
        nj0Var.d();
    }
}
