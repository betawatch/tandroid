package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class mv extends ei.r {
    public final /* synthetic */ uw P0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mv(uw uwVar, Context context, uw uwVar2, int i3, int i10) {
        super(context, uwVar2, i3, i10);
        this.P0 = uwVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.d2) this.P0).actionBar;
        return !kVar.v() && super.dispatchTouchEvent(motionEvent);
    }
}
