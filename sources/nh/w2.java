package nh;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.Components.jl0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class w2 extends jl0 {
    public final /* synthetic */ n3 T2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(n3 n3Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.T2 = n3Var;
    }

    @Override // org.telegram.ui.Components.jl0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.T2.G) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.jl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.T2.G) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
