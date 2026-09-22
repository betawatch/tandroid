package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageButton;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class r4 extends ImageButton {
    public final /* synthetic */ v4 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4(v4 v4Var, Context context) {
        super(context);
        this.a = v4Var;
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.a.N) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
