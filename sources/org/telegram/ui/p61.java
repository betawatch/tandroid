package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class p61 implements View.OnClickListener {
    public final /* synthetic */ y61 a;

    public p61(y61 y61Var) {
        this.a = y61Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Components.bk0 bk0Var = this.a.d;
        if (bk0Var.b() || bk0Var.getAnimatedDrawable() == null) {
            return;
        }
        bk0Var.getAnimatedDrawable().M(40);
        bk0Var.d();
    }
}
