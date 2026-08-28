package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class pa extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ xu0 p1;
    public final /* synthetic */ sa q1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pa(sa saVar, Context context, xu0 xu0Var) {
        super(context, null);
        this.q1 = saVar;
        this.p1 = xu0Var;
    }

    @Override // org.telegram.ui.ActionBar.k, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        sa saVar = this.q1;
        if (saVar.H && saVar.I) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setAlpha(float f10) {
        if (getAlpha() != f10) {
            super.setAlpha(f10);
            this.p1.invalidate();
        }
    }

    @Override // android.view.View
    public final void setTag(Object obj) {
        super.setTag(obj);
        this.q1.L();
    }
}
