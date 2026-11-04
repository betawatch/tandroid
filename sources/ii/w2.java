package ii;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.e6;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class w2 extends v {
    public final /* synthetic */ a3 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(a3 a3Var, Context context, e6 e6Var) {
        super(context, e6Var);
        this.s = a3Var;
    }

    @Override // ii.v, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        if (!this.s.f0 && org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.P1()) {
            Point point = org.telegram.messenger.g0.q;
            i3 = View.MeasureSpec.makeMeasureSpec((int) (Math.min(point.x, point.y) * 0.8f), TLObject.FLAG_30);
        }
        super.onMeasure(i3, i10);
    }
}
