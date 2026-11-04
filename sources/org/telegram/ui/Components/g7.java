package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class g7 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ z7 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g7(z7 z7Var, Context context, int i3) {
        super(context);
        this.a = i3;
        this.b = z7Var;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        TextView textView;
        switch (this.a) {
            case 0:
                int y9 = org.telegram.messenger.camera.q.y(248.0f, i11 - i3, 4);
                for (int i13 = 0; i13 < 5; i13++) {
                    int L = (y9 * i13) + org.telegram.messenger.g0.L((i13 * 48) + 4);
                    int L2 = org.telegram.messenger.g0.L(9.0f);
                    z7 z7Var = this.b;
                    View view = z7Var.e2[i13];
                    view.layout(L, L2, view.getMeasuredWidth() + L, z7Var.e2[i13].getMeasuredHeight() + L2);
                }
                break;
            case 1:
            default:
                super.onLayout(z10, i3, i10, i11, i12);
                break;
            case 2:
                super.onLayout(z10, i3, i10, i11, i12);
                z7 z7Var2 = this.b;
                if (z7Var2.M1 != null && (textView = z7Var2.R1) != null) {
                    int left = (textView.getLeft() - org.telegram.messenger.g0.L(4.0f)) - z7Var2.M1.getMeasuredWidth();
                    org.telegram.ui.ActionBar.q0 q0Var = z7Var2.M1;
                    q0Var.layout(left, q0Var.getTop(), z7Var2.M1.getMeasuredWidth() + left, z7Var2.M1.getBottom());
                    break;
                }
                break;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                z7 z7Var = this.b;
                if (z7Var.Z1.getTag() != null) {
                    z7Var.W0(false, true);
                }
                return true;
            case 2:
                return true;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
