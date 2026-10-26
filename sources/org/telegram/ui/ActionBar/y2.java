package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class y2 extends TextView {
    public final /* synthetic */ k3 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(k3 k3Var, Context context) {
        super(context);
        this.a = k3Var;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        View view;
        View view2;
        super.onMeasure(i10, i11);
        k3 k3Var = this.a;
        z10 = k3Var.multipleLinesTitle;
        if (z10) {
            int measuredHeight = getMeasuredHeight();
            view = k3Var.customView;
            if (view != null) {
                view2 = k3Var.customView;
                ((ViewGroup.MarginLayoutParams) view2.getLayoutParams()).topMargin = measuredHeight;
            } else if (k3Var.containerView != null) {
                for (int i12 = 1; i12 < k3Var.containerView.getChildCount(); i12++) {
                    View childAt = k3Var.containerView.getChildAt(i12);
                    if (childAt instanceof c3) {
                        ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).topMargin = measuredHeight;
                        measuredHeight = AndroidUtilities.dp(48.0f) + measuredHeight;
                    }
                }
            }
        }
    }
}
