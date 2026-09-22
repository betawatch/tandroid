package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.TextView;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class r extends TextView {
    public final /* synthetic */ u a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(u uVar, Context context) {
        super(context);
        this.a = uVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (Math.abs(this.a.N.getAlpha() - 1.0f) > 0.001f) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }
}
