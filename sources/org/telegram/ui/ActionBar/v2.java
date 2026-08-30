package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
        boolean z4;
        View view;
        View view2;
        super.onMeasure(i10, i11);
        g3 g3Var = this.a;
        z4 = g3Var.multipleLinesTitle;
        if (z4) {
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
