package ki;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.e6;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class t2 extends v {
    public final /* synthetic */ x2 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(x2 x2Var, Context context, e6 e6Var) {
        super(context, e6Var);
        this.s = x2Var;
    }

    @Override // ki.v, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        if (!this.s.f0 && org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.P1()) {
            Point point = org.telegram.messenger.g0.q;
            i7 = View.MeasureSpec.makeMeasureSpec((int) (Math.min(point.x, point.y) * 0.8f), TLObject.FLAG_30);
        }
        super.onMeasure(i7, i10);
    }
}
