package fi;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f6;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class g3 extends x {
    public final /* synthetic */ k3 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(k3 k3Var, Context context, f6 f6Var) {
        super(context, f6Var);
        this.s = k3Var;
    }

    @Override // fi.x, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (!this.s.d0 && AndroidUtilities.isTablet() && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isSmallTablet()) {
            Point point = AndroidUtilities.displaySize;
            i10 = View.MeasureSpec.makeMeasureSpec((int) (Math.min(point.x, point.y) * 0.8f), TLObject.FLAG_30);
        }
        super.onMeasure(i10, i11);
    }
}
