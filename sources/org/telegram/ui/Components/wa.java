package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class wa extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ aw0 u1;
    public final /* synthetic */ ab v1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa(ab abVar, Context context, aw0 aw0Var) {
        super(context, null);
        this.v1 = abVar;
        this.u1 = aw0Var;
    }

    @Override // org.telegram.ui.ActionBar.k, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ab abVar = this.v1;
        if (abVar.L && abVar.M) {
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
