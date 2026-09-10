package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class wa extends org.telegram.ui.ActionBar.l {
    public final /* synthetic */ aw0 t1;
    public final /* synthetic */ ab u1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa(ab abVar, Context context, aw0 aw0Var) {
        super(context, null);
        this.u1 = abVar;
        this.t1 = aw0Var;
    }

    @Override // org.telegram.ui.ActionBar.l, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ab abVar = this.u1;
        if (abVar.L && abVar.M) {
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
