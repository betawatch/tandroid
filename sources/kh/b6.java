package kh;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class b6 extends FrameLayout {
    public final /* synthetic */ ya a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b6(ya yaVar, Context context) {
        super(context);
        this.a = yaVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.a.i2) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
