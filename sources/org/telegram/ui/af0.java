package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class af0 implements View.OnAttachStateChangeListener {
    public boolean b;
    public final /* synthetic */ bf0 d;
    public long a = System.currentTimeMillis();
    public final ze0 c = new ze0(this, 0);

    public af0(bf0 bf0Var) {
        this.d = bf0Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.b = true;
        view.post(this.c);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.b = false;
        view.removeCallbacks(this.c);
    }
}
