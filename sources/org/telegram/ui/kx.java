package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class kx extends ai.b0 {
    public final /* synthetic */ ty O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kx(ty tyVar, Context context, ty tyVar2, int i10, int i11) {
        super(context, tyVar2, i10, i11);
        this.O0 = tyVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.n2) this.O0).actionBar;
        return !kVar.t() && super.dispatchTouchEvent(motionEvent);
    }
}
