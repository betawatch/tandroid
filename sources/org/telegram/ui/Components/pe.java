package org.telegram.ui.Components;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class pe implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ jt0 a;
    public final /* synthetic */ en0 b;

    public pe(jt0 jt0Var, en0 en0Var) {
        this.a = jt0Var;
        this.b = en0Var;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        jt0 jt0Var = this.a;
        jt0Var.post(new ki.n(this, jt0Var, this.b, 29));
    }
}
