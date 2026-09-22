package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class va extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ pv0 t1;
    public final /* synthetic */ za u1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va(za zaVar, Context context, pv0 pv0Var) {
        super(context, null);
        this.u1 = zaVar;
        this.t1 = pv0Var;
    }

    @Override // org.telegram.ui.ActionBar.k, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        za zaVar = this.u1;
        if (zaVar.L && zaVar.M) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            this.t1.invalidate();
        }
    }

    @Override // android.view.View
    public final void setTag(Object obj) {
        super.setTag(obj);
        this.u1.M();
    }
}
