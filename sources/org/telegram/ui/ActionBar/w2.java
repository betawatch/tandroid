package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class w2 extends TextView {
    public final /* synthetic */ h3 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(h3 h3Var, Context context) {
        super(context);
        this.a = h3Var;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z4;
        View view;
        View view2;
        super.onMeasure(i10, i11);
        h3 h3Var = this.a;
        z4 = h3Var.multipleLinesTitle;
        if (z4) {
            int measuredHeight = getMeasuredHeight();
            view = h3Var.customView;
            if (view != null) {
                view2 = h3Var.customView;
                ((ViewGroup.MarginLayoutParams) view2.getLayoutParams()).topMargin = measuredHeight;
            } else if (h3Var.containerView != null) {
                for (int i12 = 1; i12 < h3Var.containerView.getChildCount(); i12++) {
                    View childAt = h3Var.containerView.getChildAt(i12);
                    if (childAt instanceof a3) {
                        ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).topMargin = measuredHeight;
                        measuredHeight = AndroidUtilities.dp(48.0f) + measuredHeight;
                    }
                }
            }
        }
    }
}
