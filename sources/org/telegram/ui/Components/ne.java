package org.telegram.ui.Components;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ne implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ jt0 a;
    public final /* synthetic */ an0 b;

    public ne(jt0 jt0Var, an0 an0Var) {
        this.a = jt0Var;
        this.b = an0Var;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        jt0 jt0Var = this.a;
        jt0Var.post(new l2.z0(this, jt0Var, this.b, 27));
    }
}
