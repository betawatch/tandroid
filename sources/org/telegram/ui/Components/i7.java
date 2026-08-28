package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class i7 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ c8 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i7(c8 c8Var, Context context, int i9) {
        super(context);
        this.a = i9;
        this.b = c8Var;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        TextView textView;
        switch (this.a) {
            case 0:
                int y10 = org.telegram.messenger.ll.y(248.0f, i11 - i9, 4);
                for (int i13 = 0; i13 < 5; i13++) {
                    int dp = (y10 * i13) + AndroidUtilities.dp((i13 * 48) + 4);
                    int dp2 = AndroidUtilities.dp(9.0f);
                    c8 c8Var = this.b;
                    View view = c8Var.j0[i13];
                    view.layout(dp, dp2, view.getMeasuredWidth() + dp, c8Var.j0[i13].getMeasuredHeight() + dp2);
                }
                break;
            case 1:
            default:
                super.onLayout(z10, i9, i10, i11, i12);
                break;
            case 2:
                super.onLayout(z10, i9, i10, i11, i12);
                c8 c8Var2 = this.b;
                if (c8Var2.R != null && (textView = c8Var2.W) != null) {
                    int left = (textView.getLeft() - AndroidUtilities.dp(4.0f)) - c8Var2.R.getMeasuredWidth();
                    org.telegram.ui.ActionBar.w0 w0Var = c8Var2.R;
                    w0Var.layout(left, w0Var.getTop(), c8Var2.R.getMeasuredWidth() + left, c8Var2.R.getBottom());
                    break;
                }
                break;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                c8 c8Var = this.b;
                if (c8Var.e0.getTag() != null) {
                    c8Var.z0(false, true);
                }
                return true;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
