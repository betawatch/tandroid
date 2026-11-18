package ki;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.i6;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class p2 extends u {
    public final /* synthetic */ t2 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(t2 t2Var, Context context, i6 i6Var) {
        super(context, i6Var);
        this.s = t2Var;
    }

    @Override // ki.u, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        if (!this.s.f0 && org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.P1()) {
            Point point = org.telegram.messenger.g0.q;
            i7 = View.MeasureSpec.makeMeasureSpec((int) (Math.min(point.x, point.y) * 0.8f), TLObject.FLAG_30);
        }
        super.onMeasure(i7, i10);
    }
}
