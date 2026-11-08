package hi;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f6;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final class w2 extends t {
    public final /* synthetic */ a3 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(a3 a3Var, Context context, f6 f6Var) {
        super(context, f6Var);
        this.s = a3Var;
    }

    @Override // hi.t, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        if (!this.s.e0 && org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.P1()) {
            Point point = org.telegram.messenger.g0.q;
            i7 = View.MeasureSpec.makeMeasureSpec((int) (Math.min(point.x, point.y) * 0.8f), TLObject.FLAG_30);
        }
        super.onMeasure(i7, i10);
    }
}
