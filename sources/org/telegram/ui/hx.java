package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
