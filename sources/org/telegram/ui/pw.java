package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class pw extends org.telegram.ui.Components.ez {
    public final /* synthetic */ zw B0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pw(zw zwVar, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var);
        this.B0 = zwVar;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        this.B0.o3 = false;
        return super.onInterceptTouchEvent(motionEvent);
    }
}
