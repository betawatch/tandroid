package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class nx extends zh.l {
    public final /* synthetic */ wy O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nx(wy wyVar, Context context, wy wyVar2, int i10, int i11) {
        super(context, wyVar2, i10, i11);
        this.O0 = wyVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.l lVar;
        lVar = ((org.telegram.ui.ActionBar.p2) this.O0).actionBar;
        return !lVar.s() && super.dispatchTouchEvent(motionEvent);
    }
}
