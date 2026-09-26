package ei;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.d6;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final class g3 extends x {
    public final /* synthetic */ k3 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(k3 k3Var, Context context, d6 d6Var) {
        super(context, d6Var);
        this.s = k3Var;
    }

    @Override // ei.x, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (!this.s.d0 && AndroidUtilities.isTablet() && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isSmallTablet()) {
            Point point = AndroidUtilities.displaySize;
            i10 = View.MeasureSpec.makeMeasureSpec((int) (Math.min(point.x, point.y) * 0.8f), TLObject.FLAG_30);
        }
        super.onMeasure(i10, i11);
    }
}
