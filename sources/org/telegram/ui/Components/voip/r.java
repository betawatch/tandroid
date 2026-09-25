package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.TextView;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
