package ci;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.Components.wl0;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final class e3 extends wl0 {
    public final /* synthetic */ w3 X2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(w3 w3Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.X2 = w3Var;
    }

    @Override // org.telegram.ui.Components.wl0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.X2.K) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.wl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.X2.K) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
