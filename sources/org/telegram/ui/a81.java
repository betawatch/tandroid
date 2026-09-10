package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class a81 implements View.OnClickListener {
    public final /* synthetic */ j81 a;

    public a81(j81 j81Var) {
        this.a = j81Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Components.kj0 kj0Var = this.a.d;
        if (kj0Var.b() || kj0Var.getAnimatedDrawable() == null) {
            return;
        }
        kj0Var.getAnimatedDrawable().M(40);
        kj0Var.d();
    }
}
