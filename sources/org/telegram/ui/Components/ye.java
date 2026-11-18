package org.telegram.ui.Components;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class ye implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ rt0 a;
    public final /* synthetic */ nn0 b;

    public ye(rt0 rt0Var, nn0 nn0Var) {
        this.a = rt0Var;
        this.b = nn0Var;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        rt0 rt0Var = this.a;
        rt0Var.post(new k7(this, rt0Var, this.b, 2));
    }
}
