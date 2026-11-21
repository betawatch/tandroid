package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class m7 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ f8 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m7(f8 f8Var, Context context, int i7) {
        super(context);
        this.a = i7;
        this.b = f8Var;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        TextView textView;
        switch (this.a) {
            case 0:
                int z11 = org.telegram.messenger.n10.z(248.0f, i11 - i7, 4);
                for (int i13 = 0; i13 < 5; i13++) {
                    int L = (z11 * i13) + org.telegram.messenger.g0.L((i13 * 48) + 4);
                    int L2 = org.telegram.messenger.g0.L(9.0f);
                    f8 f8Var = this.b;
                    View view = f8Var.h2[i13];
                    view.layout(L, L2, view.getMeasuredWidth() + L, f8Var.h2[i13].getMeasuredHeight() + L2);
                }
                break;
            case 1:
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                break;
            case 2:
                super.onLayout(z10, i7, i10, i11, i12);
                f8 f8Var2 = this.b;
                if (f8Var2.P1 != null && (textView = f8Var2.U1) != null) {
                    int left = (textView.getLeft() - org.telegram.messenger.g0.L(4.0f)) - f8Var2.P1.getMeasuredWidth();
                    org.telegram.ui.ActionBar.q0 q0Var = f8Var2.P1;
                    q0Var.layout(left, q0Var.getTop(), f8Var2.P1.getMeasuredWidth() + left, f8Var2.P1.getBottom());
                    break;
                }
                break;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                f8 f8Var = this.b;
                if (f8Var.c2.getTag() != null) {
                    f8Var.X0(false, true);
                }
                return true;
            case 2:
                return true;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
