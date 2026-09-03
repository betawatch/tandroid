package org.telegram.ui.Components;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class we implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ fv0 a;
    public final /* synthetic */ yo0 b;

    public we(fv0 fv0Var, yo0 yo0Var) {
        this.a = fv0Var;
        this.b = yo0Var;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        fv0 fv0Var = this.a;
        fv0Var.post(new mh.p6(this, fv0Var, this.b, 25));
    }
}
