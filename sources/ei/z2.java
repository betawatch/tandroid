package ei;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.Components.im0;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class z2 extends im0 {
    public final /* synthetic */ q3 V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(q3 q3Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.V2 = q3Var;
    }

    @Override // org.telegram.ui.Components.im0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.V2.K) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.im0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.V2.K) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
