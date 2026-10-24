package ei;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.Components.mm0;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class z2 extends mm0 {
    public final /* synthetic */ q3 Y2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(q3 q3Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.Y2 = q3Var;
    }

    @Override // org.telegram.ui.Components.mm0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.Y2.K) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.Y2.K) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
