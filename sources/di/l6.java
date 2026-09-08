package di;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class l6 extends FrameLayout {
    public final /* synthetic */ rb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6(rb rbVar, Context context) {
        super(context);
        this.a = rbVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.a.m2) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
