package mh;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.b6;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class y2 extends w {
    public final /* synthetic */ c3 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(c3 c3Var, Context context, b6 b6Var) {
        super(context, b6Var);
        this.s = c3Var;
    }

    @Override // mh.w, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        if (!this.s.Z && AndroidUtilities.isTablet() && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isSmallTablet()) {
            Point point = AndroidUtilities.displaySize;
            i9 = View.MeasureSpec.makeMeasureSpec((int) (Math.min(point.x, point.y) * 0.8f), TLObject.FLAG_30);
        }
        super.onMeasure(i9, i10);
    }
}
