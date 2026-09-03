package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class j7 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ c8 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j7(c8 c8Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = c8Var;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        TextView textView;
        switch (this.a) {
            case 0:
                int x10 = org.telegram.ui.b.x(248.0f, i12 - i10, 4);
                for (int i14 = 0; i14 < 5; i14++) {
                    int dp = (x10 * i14) + AndroidUtilities.dp((i14 * 48) + 4);
                    int dp2 = AndroidUtilities.dp(9.0f);
                    c8 c8Var = this.b;
                    View view = c8Var.k0[i14];
                    view.layout(dp, dp2, view.getMeasuredWidth() + dp, c8Var.k0[i14].getMeasuredHeight() + dp2);
                }
                break;
            case 1:
            default:
                super.onLayout(z4, i10, i11, i12, i13);
                break;
            case 2:
                super.onLayout(z4, i10, i11, i12, i13);
                c8 c8Var2 = this.b;
                if (c8Var2.S != null && (textView = c8Var2.X) != null) {
                    int left = (textView.getLeft() - AndroidUtilities.dp(4.0f)) - c8Var2.S.getMeasuredWidth();
                    org.telegram.ui.ActionBar.w0 w0Var = c8Var2.S;
                    w0Var.layout(left, w0Var.getTop(), c8Var2.S.getMeasuredWidth() + left, c8Var2.S.getBottom());
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
                if (c8Var.f0.getTag() != null) {
                    c8Var.A0(false, true);
                }
                return true;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
