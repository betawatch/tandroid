package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class n7 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ h8 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n7(h8 h8Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = h8Var;
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
                    h8 h8Var = this.b;
                    View view = h8Var.n0[i14];
                    view.layout(dp, dp2, view.getMeasuredWidth() + dp, h8Var.n0[i14].getMeasuredHeight() + dp2);
                }
                break;
            case 1:
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
            case 2:
                super.onLayout(z10, i10, i11, i12, i13);
                h8 h8Var2 = this.b;
                if (h8Var2.V != null && (textView = h8Var2.a0) != null) {
                    int left = (textView.getLeft() - AndroidUtilities.dp(4.0f)) - h8Var2.V.getMeasuredWidth();
                    org.telegram.ui.ActionBar.w0 w0Var = h8Var2.V;
                    w0Var.layout(left, w0Var.getTop(), h8Var2.V.getMeasuredWidth() + left, h8Var2.V.getBottom());
                    break;
                }
                break;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                h8 h8Var = this.b;
                if (h8Var.i0.getTag() != null) {
                    h8Var.A0(false, true);
                }
                return true;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
