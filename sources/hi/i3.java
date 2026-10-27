package hi;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.u6;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class i3 extends d0 {
    public final /* synthetic */ m3 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(m3 m3Var, Context context, u6 u6Var) {
        super(context, u6Var);
        this.s = m3Var;
    }

    @Override // hi.d0, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (!this.s.e0 && AndroidUtilities.isTablet() && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isSmallTablet()) {
            Point point = AndroidUtilities.displaySize;
            i10 = View.MeasureSpec.makeMeasureSpec((int) (Math.min(point.x, point.y) * 0.8f), TLObject.FLAG_30);
        }
        super.onMeasure(i10, i11);
    }
}
