package org.telegram.ui.Components;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class gf implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ qv0 a;
    public final /* synthetic */ hp0 b;

    public gf(qv0 qv0Var, hp0 hp0Var) {
        this.a = qv0Var;
        this.b = hp0Var;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        qv0 qv0Var = this.a;
        qv0Var.post(new org.telegram.messenger.video.o(this, qv0Var, this.b, 11));
    }
}
