package org.telegram.ui.Components;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
