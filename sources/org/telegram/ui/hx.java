package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class hx extends ai.b0 {
    public final /* synthetic */ qy O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hx(qy qyVar, Context context, qy qyVar2, int i10, int i11) {
        super(context, qyVar2, i10, i11);
        this.O0 = qyVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.m2) this.O0).actionBar;
        return !kVar.s() && super.dispatchTouchEvent(motionEvent);
    }
}
