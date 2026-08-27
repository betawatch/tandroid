package lh;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.Components.zk0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class y2 extends zk0 {
    public final /* synthetic */ p3 T2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(p3 p3Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.T2 = p3Var;
    }

    @Override // org.telegram.ui.Components.zk0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.T2.G) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.zk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.T2.G) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
