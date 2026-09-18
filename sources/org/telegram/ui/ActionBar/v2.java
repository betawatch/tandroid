package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class v2 extends TextView {
    public final /* synthetic */ g3 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(g3 g3Var, Context context) {
        super(context);
        this.a = g3Var;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        View view;
        View view2;
        super.onMeasure(i10, i11);
        g3 g3Var = this.a;
        z10 = g3Var.multipleLinesTitle;
        if (z10) {
            int measuredHeight = getMeasuredHeight();
            view = g3Var.customView;
            if (view != null) {
                view2 = g3Var.customView;
                ((ViewGroup.MarginLayoutParams) view2.getLayoutParams()).topMargin = measuredHeight;
            } else if (g3Var.containerView != null) {
                for (int i12 = 1; i12 < g3Var.containerView.getChildCount(); i12++) {
                    View childAt = g3Var.containerView.getChildAt(i12);
                    if (childAt instanceof z2) {
                        ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).topMargin = measuredHeight;
                        measuredHeight = AndroidUtilities.dp(48.0f) + measuredHeight;
                    }
                }
            }
        }
    }
}
