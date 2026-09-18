package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class va extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ qv0 u1;
    public final /* synthetic */ za v1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va(za zaVar, Context context, qv0 qv0Var) {
        super(context, null);
        this.v1 = zaVar;
        this.u1 = qv0Var;
    }

    @Override // org.telegram.ui.ActionBar.k, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        za zaVar = this.v1;
        if (zaVar.L && zaVar.M) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            this.u1.invalidate();
        }
    }

    @Override // android.view.View
    public final void setTag(Object obj) {
        super.setTag(obj);
        this.v1.M();
    }
}
