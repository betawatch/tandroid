package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class pv extends di.q {
    public final /* synthetic */ ww O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pv(ww wwVar, Context context, ww wwVar2, int i7, int i10) {
        super(context, wwVar2, i7, i10);
        this.O0 = wwVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.f2) this.O0).actionBar;
        return !kVar.v() && super.dispatchTouchEvent(motionEvent);
    }
}
