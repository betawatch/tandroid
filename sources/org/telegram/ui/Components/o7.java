package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class o7 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ i8 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o7(i8 i8Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = i8Var;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        TextView textView;
        switch (this.a) {
            case 0:
                int z11 = org.telegram.messenger.rk.z(248.0f, i12 - i10, 4);
                for (int i14 = 0; i14 < 5; i14++) {
                    int dp = (z11 * i14) + AndroidUtilities.dp((i14 * 48) + 4);
                    int dp2 = AndroidUtilities.dp(9.0f);
                    i8 i8Var = this.b;
                    View view = i8Var.n0[i14];
                    view.layout(dp, dp2, view.getMeasuredWidth() + dp, i8Var.n0[i14].getMeasuredHeight() + dp2);
                }
                break;
            case 1:
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
            case 2:
                super.onLayout(z10, i10, i11, i12, i13);
                i8 i8Var2 = this.b;
                if (i8Var2.V != null && (textView = i8Var2.a0) != null) {
                    int left = (textView.getLeft() - AndroidUtilities.dp(4.0f)) - i8Var2.V.getMeasuredWidth();
                    org.telegram.ui.ActionBar.v0 v0Var = i8Var2.V;
                    v0Var.layout(left, v0Var.getTop(), i8Var2.V.getMeasuredWidth() + left, i8Var2.V.getBottom());
                    break;
                }
                break;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                i8 i8Var = this.b;
                if (i8Var.i0.getTag() != null) {
                    i8Var.A0(false, true);
                }
                return true;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
