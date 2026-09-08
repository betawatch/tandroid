package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class c8 extends fo0 {
    public final /* synthetic */ k8 l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c8(k8 k8Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var, false);
        this.l0 = k8Var;
    }

    @Override // org.telegram.ui.Components.fo0
    public final boolean d(MotionEvent motionEvent) {
        if (this.l0.H0 != 0) {
            return false;
        }
        return super.d(motionEvent);
    }
}
