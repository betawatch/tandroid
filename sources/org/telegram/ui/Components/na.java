package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class na extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ au0 G1;
    public final /* synthetic */ sa H1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public na(sa saVar, Context context, au0 au0Var) {
        super(context, null);
        this.H1 = saVar;
        this.G1 = au0Var;
    }

    @Override // org.telegram.ui.ActionBar.k, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        sa saVar = this.H1;
        if (saVar.G1 && saVar.H1) {
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
        this.H1.b1();
    }
}
