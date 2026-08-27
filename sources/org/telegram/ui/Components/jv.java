package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class jv extends iv {
    public final /* synthetic */ kv G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jv(kv kvVar, Context context, int i10, int i11) {
        super(kvVar.s, context, i10, i11);
        this.G = kvVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.G.d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
