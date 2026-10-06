package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
