package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class hx extends oh.p {
    public final /* synthetic */ py L0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hx(py pyVar, Context context, py pyVar2, int i10, int i11) {
        super(context, pyVar2, i10, i11);
        this.L0 = pyVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.p2) this.L0).actionBar;
        return !kVar.s() && super.dispatchTouchEvent(motionEvent);
    }
}
