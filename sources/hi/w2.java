package hi;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.h6;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class w2 extends t {
    public final /* synthetic */ a3 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(a3 a3Var, Context context, h6 h6Var) {
        super(context, h6Var);
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
