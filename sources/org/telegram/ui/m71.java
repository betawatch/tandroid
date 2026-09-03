package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class m71 implements View.OnClickListener {
    public final /* synthetic */ v71 a;

    public m71(v71 v71Var) {
        this.a = v71Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Components.jj0 jj0Var = this.a.d;
        if (jj0Var.b() || jj0Var.getAnimatedDrawable() == null) {
            return;
        }
        jj0Var.getAnimatedDrawable().K(40);
        jj0Var.d();
    }
}
