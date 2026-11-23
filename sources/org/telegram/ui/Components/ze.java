package org.telegram.ui.Components;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ze implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ tt0 a;
    public final /* synthetic */ on0 b;

    public ze(tt0 tt0Var, on0 on0Var) {
        this.a = tt0Var;
        this.b = on0Var;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        tt0 tt0Var = this.a;
        tt0Var.post(new org.telegram.ui.Cells.fa(this, tt0Var, this.b, 4));
    }
}
