package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class q61 implements View.OnClickListener {
    public final /* synthetic */ z61 a;

    public q61(z61 z61Var) {
        this.a = z61Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Components.ak0 ak0Var = this.a.d;
        if (ak0Var.b() || ak0Var.getAnimatedDrawable() == null) {
            return;
        }
        ak0Var.getAnimatedDrawable().M(40);
        ak0Var.d();
    }
}
