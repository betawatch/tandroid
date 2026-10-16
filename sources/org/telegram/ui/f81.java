package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class f81 implements View.OnClickListener {
    public final /* synthetic */ o81 a;

    public f81(o81 o81Var) {
        this.a = o81Var;
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
