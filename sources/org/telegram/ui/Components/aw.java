package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class aw extends zv {
    public final /* synthetic */ bw K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aw(bw bwVar, Context context, int i10, int i11) {
        super(bwVar.s, context, i10, i11);
        this.K = bwVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.K.d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
