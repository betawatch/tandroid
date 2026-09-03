package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class tv extends sv {
    public final /* synthetic */ uv H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tv(uv uvVar, Context context, int i10, int i11) {
        super(uvVar.s, context, i10, i11);
        this.H = uvVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.H.d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
