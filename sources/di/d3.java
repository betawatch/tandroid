package di;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.Components.mm0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class d3 extends mm0 {
    public final /* synthetic */ v3 V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(v3 v3Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.V2 = v3Var;
    }

    @Override // org.telegram.ui.Components.mm0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.V2.K) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.V2.K) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
