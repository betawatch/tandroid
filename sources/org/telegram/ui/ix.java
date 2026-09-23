package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class ix extends ai.b0 {
    public final /* synthetic */ ry O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ix(ry ryVar, Context context, ry ryVar2, int i10, int i11) {
        super(context, ryVar2, i10, i11);
        this.O0 = ryVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.n2) this.O0).actionBar;
        return !kVar.s() && super.dispatchTouchEvent(motionEvent);
    }
}
