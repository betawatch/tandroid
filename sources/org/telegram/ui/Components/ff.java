package org.telegram.ui.Components;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ff implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ mw0 a;
    public final /* synthetic */ aq0 b;

    public ff(mw0 mw0Var, aq0 aq0Var) {
        this.a = mw0Var;
        this.b = aq0Var;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        mw0 mw0Var = this.a;
        mw0Var.post(new jg.f1(this, mw0Var, this.b, 29));
    }
}
