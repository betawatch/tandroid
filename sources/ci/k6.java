package ci;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final class k6 extends FrameLayout {
    public final /* synthetic */ mb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6(mb mbVar, Context context) {
        super(context);
        this.a = mbVar;
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
