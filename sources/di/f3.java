package di;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.Components.ll0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class f3 extends ll0 {
    public final /* synthetic */ x3 X2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(x3 x3Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.X2 = x3Var;
    }

    @Override // org.telegram.ui.Components.ll0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.X2.K) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.X2.K) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
