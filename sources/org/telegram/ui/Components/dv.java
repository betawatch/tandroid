package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class dv extends cv {
    public final /* synthetic */ ev P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dv(ev evVar, Context context, int i7) {
        super(evVar.s, context, i7);
        this.P = evVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.P.d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
