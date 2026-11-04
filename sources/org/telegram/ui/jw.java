package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class jw extends org.telegram.ui.Components.bz {
    public final /* synthetic */ uw C0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jw(uw uwVar, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.C0 = uwVar;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        this.C0.o3 = false;
        return super.onInterceptTouchEvent(motionEvent);
    }
}
