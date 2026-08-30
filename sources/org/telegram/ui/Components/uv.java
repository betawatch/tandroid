package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class uv extends tv {
    public final /* synthetic */ vv H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uv(vv vvVar, Context context, int i10, int i11) {
        super(vvVar.s, context, i10, i11);
        this.H = vvVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.H.d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
