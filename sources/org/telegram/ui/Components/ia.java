package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ia extends org.telegram.ui.ActionBar.l {
    public final /* synthetic */ st0 F1;
    public final /* synthetic */ ma G1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ia(ma maVar, Context context, st0 st0Var) {
        super(context, null);
        this.G1 = maVar;
        this.F1 = st0Var;
    }

    @Override // org.telegram.ui.ActionBar.l, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ma maVar = this.G1;
        if (maVar.F1 && maVar.G1) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setAlpha(float f10) {
        if (getAlpha() != f10) {
            super.setAlpha(f10);
            this.F1.invalidate();
        }
    }

    @Override // android.view.View
    public final void setTag(Object obj) {
        super.setTag(obj);
        this.G1.a1();
    }
}
