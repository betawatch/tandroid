package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class q7 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ k8 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q7(k8 k8Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = k8Var;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        TextView textView;
        switch (this.a) {
            case 0:
                int y3 = org.telegram.messenger.wl.y(248.0f, i12 - i10, 4);
                for (int i14 = 0; i14 < 5; i14++) {
                    int dp = (y3 * i14) + AndroidUtilities.dp((i14 * 48) + 4);
                    int dp2 = AndroidUtilities.dp(9.0f);
                    k8 k8Var = this.b;
                    View view = k8Var.n0[i14];
                    view.layout(dp, dp2, view.getMeasuredWidth() + dp, k8Var.n0[i14].getMeasuredHeight() + dp2);
                }
                break;
            case 1:
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
            case 2:
                super.onLayout(z10, i10, i11, i12, i13);
                k8 k8Var2 = this.b;
                if (k8Var2.V != null && (textView = k8Var2.a0) != null) {
                    int left = (textView.getLeft() - AndroidUtilities.dp(4.0f)) - k8Var2.V.getMeasuredWidth();
                    org.telegram.ui.ActionBar.v0 v0Var = k8Var2.V;
                    v0Var.layout(left, v0Var.getTop(), k8Var2.V.getMeasuredWidth() + left, k8Var2.V.getBottom());
                    break;
                }
                break;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                k8 k8Var = this.b;
                if (k8Var.i0.getTag() != null) {
                    k8Var.A0(false, true);
                }
                return true;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
