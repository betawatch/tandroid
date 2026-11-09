package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
