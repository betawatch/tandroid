package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.ImageView;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class ak0 extends pb {
    public final bk0 c;

    public ak0(Activity activity, String str) {
        super(activity, null);
        this.b.setText(str);
        this.b.setTranslationY(-1.0f);
        ImageView imageView = this.a;
        bk0 bk0Var = new bk0();
        this.c = bk0Var;
        imageView.setImageDrawable(bk0Var);
    }

    @Override // org.telegram.ui.Components.cb
    public final void onEnterTransitionEnd() {
        super.onEnterTransitionEnd();
        bk0 bk0Var = this.c;
        bk0Var.getClass();
        bk0Var.g = System.currentTimeMillis();
        bk0Var.invalidateSelf();
    }

    @Override // org.telegram.ui.Components.cb
    public final void onExitTransitionEnd() {
        super.onExitTransitionEnd();
        bk0 bk0Var = this.c;
        bk0Var.g = -1L;
        bk0Var.invalidateSelf();
    }
}
