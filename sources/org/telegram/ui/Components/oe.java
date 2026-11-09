package org.telegram.ui.Components;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class oe implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ kt0 a;
    public final /* synthetic */ bn0 b;

    public oe(kt0 kt0Var, bn0 bn0Var) {
        this.a = kt0Var;
        this.b = bn0Var;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        kt0 kt0Var = this.a;
        kt0Var.post(new l2.z0(this, kt0Var, this.b, 27));
    }
}
