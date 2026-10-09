package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class ab extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ sw0 u1;
    public final /* synthetic */ eb v1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab(eb ebVar, Context context, sw0 sw0Var) {
        super(context, null);
        this.v1 = ebVar;
        this.u1 = sw0Var;
    }

    @Override // org.telegram.ui.ActionBar.k, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        eb ebVar = this.v1;
        if (ebVar.L && ebVar.M) {
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
        this.v1.N();
    }
}
