package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class f21 implements View.OnClickListener {
    public final /* synthetic */ n21 a;

    public f21(n21 n21Var) {
        this.a = n21Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Components.rh0 rh0Var = this.a.o1;
        if (rh0Var.b() || rh0Var.getAnimatedDrawable() == null) {
            return;
        }
        rh0Var.getAnimatedDrawable().M(40);
        rh0Var.d();
    }
}
