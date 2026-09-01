package org.telegram.ui.Components;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class we implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ gv0 a;
    public final /* synthetic */ zo0 b;

    public we(gv0 gv0Var, zo0 zo0Var) {
        this.a = gv0Var;
        this.b = zo0Var;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        gv0 gv0Var = this.a;
        gv0Var.post(new mh.p6(this, gv0Var, this.b, 25));
    }
}
