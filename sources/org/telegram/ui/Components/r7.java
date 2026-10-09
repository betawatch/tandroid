package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class r7 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ l8 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r7(l8 l8Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = l8Var;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        TextView textView;
        switch (this.a) {
            case 0:
                int A = org.telegram.messenger.bi.A(248.0f, i12 - i10, 4);
                for (int i14 = 0; i14 < 5; i14++) {
                    int dp = (A * i14) + AndroidUtilities.dp((i14 * 48) + 4);
                    int dp2 = AndroidUtilities.dp(9.0f);
                    l8 l8Var = this.b;
                    View view = l8Var.n0[i14];
                    view.layout(dp, dp2, view.getMeasuredWidth() + dp, l8Var.n0[i14].getMeasuredHeight() + dp2);
                }
                break;
            case 1:
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
            case 2:
                super.onLayout(z10, i10, i11, i12, i13);
                l8 l8Var2 = this.b;
                if (l8Var2.V != null && (textView = l8Var2.a0) != null) {
                    int left = (textView.getLeft() - AndroidUtilities.dp(4.0f)) - l8Var2.V.getMeasuredWidth();
                    org.telegram.ui.ActionBar.v0 v0Var = l8Var2.V;
                    v0Var.layout(left, v0Var.getTop(), l8Var2.V.getMeasuredWidth() + left, l8Var2.V.getBottom());
                    break;
                }
                break;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                l8 l8Var = this.b;
                if (l8Var.i0.getTag() != null) {
                    l8Var.B0(false, true);
                }
                return true;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
