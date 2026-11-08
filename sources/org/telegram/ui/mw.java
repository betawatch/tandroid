package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class mw extends org.telegram.ui.Components.fz {
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
