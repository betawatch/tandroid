package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class i7 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ b8 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i7(b8 b8Var, Context context, int i7) {
        super(context);
        this.a = i7;
        this.b = b8Var;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        TextView textView;
        switch (this.a) {
            case 0:
                int y10 = org.telegram.messenger.camera.q.y(248.0f, i11 - i7, 4);
                for (int i13 = 0; i13 < 5; i13++) {
                    int L = (y10 * i13) + org.telegram.messenger.g0.L((i13 * 48) + 4);
                    int L2 = org.telegram.messenger.g0.L(9.0f);
                    b8 b8Var = this.b;
                    View view = b8Var.d2[i13];
                    view.layout(L, L2, view.getMeasuredWidth() + L, b8Var.d2[i13].getMeasuredHeight() + L2);
                }
                break;
            case 1:
            default:
                super.onLayout(z9, i7, i10, i11, i12);
                break;
            case 2:
                super.onLayout(z9, i7, i10, i11, i12);
                b8 b8Var2 = this.b;
                if (b8Var2.L1 != null && (textView = b8Var2.Q1) != null) {
                    int left = (textView.getLeft() - org.telegram.messenger.g0.L(4.0f)) - b8Var2.L1.getMeasuredWidth();
                    org.telegram.ui.ActionBar.r0 r0Var = b8Var2.L1;
                    r0Var.layout(left, r0Var.getTop(), b8Var2.L1.getMeasuredWidth() + left, b8Var2.L1.getBottom());
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
                if (b8Var.Y1.getTag() != null) {
                    b8Var.W0(false, true);
                }
                return true;
            case 2:
                return true;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
