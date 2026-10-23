package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class l61 implements View.OnClickListener {
    public final /* synthetic */ u61 a;

    public l61(u61 u61Var) {
        this.a = u61Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Components.yj0 yj0Var = this.a.d;
        if (yj0Var.b() || yj0Var.getAnimatedDrawable() == null) {
            return;
        }
        yj0Var.getAnimatedDrawable().M(40);
        yj0Var.d();
    }
}
