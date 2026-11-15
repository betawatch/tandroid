package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class f7 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ y7 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f7(y7 y7Var, Context context, int i7) {
        super(context);
        this.a = i7;
        this.b = y7Var;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        TextView textView;
        switch (this.a) {
            case 0:
                int y10 = org.telegram.messenger.i20.y(248.0f, i11 - i7, 4);
                for (int i13 = 0; i13 < 5; i13++) {
                    int L = (y10 * i13) + org.telegram.messenger.g0.L((i13 * 48) + 4);
                    int L2 = org.telegram.messenger.g0.L(9.0f);
                    y7 y7Var = this.b;
                    View view = y7Var.h2[i13];
                    view.layout(L, L2, view.getMeasuredWidth() + L, y7Var.h2[i13].getMeasuredHeight() + L2);
                }
                break;
            case 1:
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                break;
            case 2:
                super.onLayout(z10, i7, i10, i11, i12);
                y7 y7Var2 = this.b;
                if (y7Var2.P1 != null && (textView = y7Var2.U1) != null) {
                    int left = (textView.getLeft() - org.telegram.messenger.g0.L(4.0f)) - y7Var2.P1.getMeasuredWidth();
                    org.telegram.ui.ActionBar.q0 q0Var = y7Var2.P1;
                    q0Var.layout(left, q0Var.getTop(), y7Var2.P1.getMeasuredWidth() + left, y7Var2.P1.getBottom());
                    break;
                }
                break;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                y7 y7Var = this.b;
                if (y7Var.c2.getTag() != null) {
                    y7Var.W0(false, true);
                }
                return true;
            case 2:
                return true;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
