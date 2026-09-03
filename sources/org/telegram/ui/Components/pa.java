package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class pa extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ qv0 q1;
    public final /* synthetic */ sa r1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pa(sa saVar, Context context, qv0 qv0Var) {
        super(context, null);
        this.r1 = saVar;
        this.q1 = qv0Var;
    }

    @Override // org.telegram.ui.ActionBar.k, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        sa saVar = this.r1;
        if (saVar.I && saVar.J) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setAlpha(float f10) {
        if (getAlpha() != f10) {
            super.setAlpha(f10);
            this.q1.invalidate();
        }
    }

    @Override // android.view.View
    public final void setTag(Object obj) {
        super.setTag(obj);
        this.r1.M();
    }
}
