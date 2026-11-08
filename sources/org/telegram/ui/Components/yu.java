package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class yu extends xu {
    public final /* synthetic */ zu O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yu(zu zuVar, Context context, int i7) {
        super(zuVar.s, context, i7);
        this.O = zuVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.O.d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
