package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class u2 extends TextView {
    public final /* synthetic */ f3 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(f3 f3Var, Context context) {
        super(context);
        this.a = f3Var;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        View view;
        View view2;
        super.onMeasure(i10, i11);
        f3 f3Var = this.a;
        z10 = f3Var.multipleLinesTitle;
        if (z10) {
            int measuredHeight = getMeasuredHeight();
            view = f3Var.customView;
            if (view != null) {
                view2 = f3Var.customView;
                ((ViewGroup.MarginLayoutParams) view2.getLayoutParams()).topMargin = measuredHeight;
            } else if (f3Var.containerView != null) {
                for (int i12 = 1; i12 < f3Var.containerView.getChildCount(); i12++) {
                    View childAt = f3Var.containerView.getChildAt(i12);
                    if (childAt instanceof y2) {
                        ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).topMargin = measuredHeight;
                        measuredHeight = AndroidUtilities.dp(48.0f) + measuredHeight;
                    }
                }
            }
        }
    }
}
