package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ma extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ cu0 G1;
    public final /* synthetic */ ra H1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ma(ra raVar, Context context, cu0 cu0Var) {
        super(context, null);
        this.H1 = raVar;
        this.G1 = cu0Var;
    }

    @Override // org.telegram.ui.ActionBar.k, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ra raVar = this.H1;
        if (raVar.G1 && raVar.H1) {
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
