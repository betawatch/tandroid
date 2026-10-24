package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
