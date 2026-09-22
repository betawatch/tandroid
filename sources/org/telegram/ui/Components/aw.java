package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
