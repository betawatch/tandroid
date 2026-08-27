package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class t2 extends TextView {
    public final /* synthetic */ e3 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(e3 e3Var, Context context) {
        super(context);
        this.a = e3Var;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        View view;
        View view2;
        super.onMeasure(i10, i11);
        e3 e3Var = this.a;
        z10 = e3Var.multipleLinesTitle;
        if (z10) {
            int measuredHeight = getMeasuredHeight();
            view = e3Var.customView;
            if (view != null) {
                view2 = e3Var.customView;
                ((ViewGroup.MarginLayoutParams) view2.getLayoutParams()).topMargin = measuredHeight;
            } else if (e3Var.containerView != null) {
                for (int i12 = 1; i12 < e3Var.containerView.getChildCount(); i12++) {
                    View childAt = e3Var.containerView.getChildAt(i12);
                    if (childAt instanceof x2) {
                        ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).topMargin = measuredHeight;
                        measuredHeight = AndroidUtilities.dp(48.0f) + measuredHeight;
                    }
                }
            }
        }
    }
}
