package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageButton;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class q4 extends ImageButton {
    public final /* synthetic */ u4 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4(u4 u4Var, Context context) {
        super(context);
        this.a = u4Var;
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.a.N) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
