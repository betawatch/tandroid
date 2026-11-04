package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ia extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ qt0 G1;
    public final /* synthetic */ ma H1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ia(ma maVar, Context context, qt0 qt0Var) {
        super(context, null);
        this.H1 = maVar;
        this.G1 = qt0Var;
    }

    @Override // org.telegram.ui.ActionBar.k, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ma maVar = this.H1;
        if (maVar.D1 && maVar.E1) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setAlpha(float f10) {
        if (getAlpha() != f10) {
            super.setAlpha(f10);
            this.G1.invalidate();
        }
    }

    @Override // android.view.View
    public final void setTag(Object obj) {
        super.setTag(obj);
        this.H1.a1();
    }
}
