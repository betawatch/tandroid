package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
                int y3 = org.telegram.messenger.vl.y(248.0f, i12 - i10, 4);
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
                    org.telegram.ui.ActionBar.v0 v0Var = h8Var2.V;
                    v0Var.layout(left, v0Var.getTop(), h8Var2.V.getMeasuredWidth() + left, h8Var2.V.getBottom());
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
