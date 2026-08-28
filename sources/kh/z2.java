package kh;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.Components.wk0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class z2 extends wk0 {
    public final /* synthetic */ q3 T2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(q3 q3Var, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, b6Var);
        this.T2 = q3Var;
    }

    @Override // org.telegram.ui.Components.wk0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.T2.G) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.T2.G) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
