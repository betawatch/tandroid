package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class i7 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ b8 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i7(b8 b8Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = b8Var;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        TextView textView;
        switch (this.a) {
            case 0:
                int x8 = org.telegram.messenger.rl.x(248.0f, i12 - i10, 4);
                for (int i14 = 0; i14 < 5; i14++) {
                    int dp = (x8 * i14) + AndroidUtilities.dp((i14 * 48) + 4);
                    int dp2 = AndroidUtilities.dp(9.0f);
                    b8 b8Var = this.b;
                    View view = b8Var.j0[i14];
                    view.layout(dp, dp2, view.getMeasuredWidth() + dp, b8Var.j0[i14].getMeasuredHeight() + dp2);
                }
                break;
            case 1:
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
            case 2:
                super.onLayout(z10, i10, i11, i12, i13);
                b8 b8Var2 = this.b;
                if (b8Var2.R != null && (textView = b8Var2.W) != null) {
                    int left = (textView.getLeft() - AndroidUtilities.dp(4.0f)) - b8Var2.R.getMeasuredWidth();
                    org.telegram.ui.ActionBar.v0 v0Var = b8Var2.R;
                    v0Var.layout(left, v0Var.getTop(), b8Var2.R.getMeasuredWidth() + left, b8Var2.R.getBottom());
                    break;
                }
                break;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                b8 b8Var = this.b;
                if (b8Var.e0.getTag() != null) {
                    b8Var.A0(false, true);
                }
                return true;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
