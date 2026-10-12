package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class s7 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ m8 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s7(m8 m8Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = m8Var;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        TextView textView;
        switch (this.a) {
            case 0:
                int B = org.telegram.messenger.yh.B(248.0f, i12 - i10, 4);
                for (int i14 = 0; i14 < 5; i14++) {
                    int dp = (B * i14) + AndroidUtilities.dp((i14 * 48) + 4);
                    int dp2 = AndroidUtilities.dp(9.0f);
                    m8 m8Var = this.b;
                    View view = m8Var.n0[i14];
                    view.layout(dp, dp2, view.getMeasuredWidth() + dp, m8Var.n0[i14].getMeasuredHeight() + dp2);
                }
                break;
            case 1:
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
            case 2:
                super.onLayout(z10, i10, i11, i12, i13);
                m8 m8Var2 = this.b;
                if (m8Var2.V != null && (textView = m8Var2.a0) != null) {
                    int left = (textView.getLeft() - AndroidUtilities.dp(4.0f)) - m8Var2.V.getMeasuredWidth();
                    org.telegram.ui.ActionBar.u0 u0Var = m8Var2.V;
                    u0Var.layout(left, u0Var.getTop(), m8Var2.V.getMeasuredWidth() + left, m8Var2.V.getBottom());
                    break;
                }
                break;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                m8 m8Var = this.b;
                if (m8Var.i0.getTag() != null) {
                    m8Var.B0(false, true);
                }
                return true;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
