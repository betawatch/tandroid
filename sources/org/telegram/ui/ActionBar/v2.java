package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class v2 extends TextView {
    public final /* synthetic */ h3 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(h3 h3Var, Context context) {
        super(context);
        this.a = h3Var;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        View view;
        View view2;
        super.onMeasure(i10, i11);
        h3 h3Var = this.a;
        z10 = h3Var.multipleLinesTitle;
        if (z10) {
            int measuredHeight = getMeasuredHeight();
            view = h3Var.customView;
            if (view != null) {
                view2 = h3Var.customView;
                ((ViewGroup.MarginLayoutParams) view2.getLayoutParams()).topMargin = measuredHeight;
            } else if (h3Var.containerView != null) {
                for (int i12 = 1; i12 < h3Var.containerView.getChildCount(); i12++) {
                    View childAt = h3Var.containerView.getChildAt(i12);
                    if (childAt instanceof z2) {
                        ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).topMargin = measuredHeight;
                        measuredHeight = AndroidUtilities.dp(48.0f) + measuredHeight;
                    }
                }
            }
        }
    }
}
