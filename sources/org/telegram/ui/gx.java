package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class gx extends nh.q {
    public final /* synthetic */ oy L0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gx(oy oyVar, Context context, oy oyVar2, int i10, int i11) {
        super(context, oyVar2, i10, i11);
        this.L0 = oyVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.p2) this.L0).actionBar;
        return !kVar.s() && super.dispatchTouchEvent(motionEvent);
    }
}
