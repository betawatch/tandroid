package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class lx extends bi.v {
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
