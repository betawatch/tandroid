package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageButton;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class e4 extends ImageButton {
    public final /* synthetic */ i4 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(i4 i4Var, Context context) {
        super(context);
        this.a = i4Var;
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.a.N) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
