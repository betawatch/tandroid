package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class mw extends org.telegram.ui.Components.ez {
    public final /* synthetic */ ww B0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mw(ww wwVar, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.B0 = wwVar;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        this.B0.n3 = false;
        return super.onInterceptTouchEvent(motionEvent);
    }
}
