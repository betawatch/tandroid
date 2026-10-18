package ei;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.Components.im0;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
