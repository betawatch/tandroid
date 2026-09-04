package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class yv extends xv {
    public final /* synthetic */ zv K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yv(zv zvVar, Context context, int i10, int i11) {
        super(zvVar.s, context, i10, i11);
        this.K = zvVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.K.d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
