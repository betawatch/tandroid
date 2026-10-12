package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class px extends bi.v {
    public final /* synthetic */ yy O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public px(yy yyVar, Context context, yy yyVar2, int i10, int i11) {
        super(context, yyVar2, i10, i11);
        this.O0 = yyVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.m2) this.O0).actionBar;
        return !kVar.t() && super.dispatchTouchEvent(motionEvent);
    }
}
