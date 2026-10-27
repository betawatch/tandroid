package fi;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.Components.nm0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class x2 extends nm0 {
    public final /* synthetic */ o3 f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(o3 o3Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var);
        this.f3 = o3Var;
    }

    @Override // org.telegram.ui.Components.nm0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f3.K) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.nm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f3.K) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
