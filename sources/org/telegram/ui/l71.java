package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class l71 implements View.OnClickListener {
    public final /* synthetic */ u71 a;

    public l71(u71 u71Var) {
        this.a = u71Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Components.kj0 kj0Var = this.a.d;
        if (kj0Var.b() || kj0Var.getAnimatedDrawable() == null) {
            return;
        }
        kj0Var.getAnimatedDrawable().K(40);
        kj0Var.d();
    }
}
