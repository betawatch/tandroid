package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class h7 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ a8 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h7(a8 a8Var, Context context, int i7) {
        super(context);
        this.a = i7;
        this.b = a8Var;
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
                    a8 a8Var = this.b;
                    View view = a8Var.g2[i13];
                    view.layout(L, L2, view.getMeasuredWidth() + L, a8Var.g2[i13].getMeasuredHeight() + L2);
                }
                break;
            case 1:
            default:
                super.onLayout(z9, i7, i10, i11, i12);
                break;
            case 2:
                super.onLayout(z9, i7, i10, i11, i12);
                a8 a8Var2 = this.b;
                if (a8Var2.O1 != null && (textView = a8Var2.T1) != null) {
                    int left = (textView.getLeft() - org.telegram.messenger.g0.L(4.0f)) - a8Var2.O1.getMeasuredWidth();
                    org.telegram.ui.ActionBar.r0 r0Var = a8Var2.O1;
                    r0Var.layout(left, r0Var.getTop(), a8Var2.O1.getMeasuredWidth() + left, a8Var2.O1.getBottom());
                    break;
                }
                break;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                a8 a8Var = this.b;
                if (a8Var.b2.getTag() != null) {
                    a8Var.W0(false, true);
                }
                return true;
            case 2:
                return true;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
