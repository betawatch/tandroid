package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class wu extends vu {
    public final /* synthetic */ xu P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wu(xu xuVar, Context context, int i3) {
        super(xuVar.s, context, i3);
        this.P = xuVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.P.d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
