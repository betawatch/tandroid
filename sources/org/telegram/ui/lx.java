package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class lx extends ai.b0 {
    public final /* synthetic */ uy O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lx(uy uyVar, Context context, uy uyVar2, int i10, int i11) {
        super(context, uyVar2, i10, i11);
        this.O0 = uyVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.n2) this.O0).actionBar;
        return !kVar.s() && super.dispatchTouchEvent(motionEvent);
    }
}
