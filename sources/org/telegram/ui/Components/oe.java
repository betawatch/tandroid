package org.telegram.ui.Components;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class oe implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ it0 a;
    public final /* synthetic */ an0 b;

    public oe(it0 it0Var, an0 an0Var) {
        this.a = it0Var;
        this.b = an0Var;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        it0 it0Var = this.a;
        it0Var.post(new l2.z0(this, it0Var, this.b, 27));
    }
}
