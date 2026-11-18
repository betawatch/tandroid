package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class m7 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ g8 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m7(g8 g8Var, Context context, int i7) {
        super(context);
        this.a = i7;
        this.b = g8Var;
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
                    g8 g8Var = this.b;
                    View view = g8Var.h2[i13];
                    view.layout(L, L2, view.getMeasuredWidth() + L, g8Var.h2[i13].getMeasuredHeight() + L2);
                }
                break;
            case 1:
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                break;
            case 2:
                super.onLayout(z10, i7, i10, i11, i12);
                g8 g8Var2 = this.b;
                if (g8Var2.P1 != null && (textView = g8Var2.U1) != null) {
                    int left = (textView.getLeft() - org.telegram.messenger.g0.L(4.0f)) - g8Var2.P1.getMeasuredWidth();
                    org.telegram.ui.ActionBar.r0 r0Var = g8Var2.P1;
                    r0Var.layout(left, r0Var.getTop(), g8Var2.P1.getMeasuredWidth() + left, g8Var2.P1.getBottom());
                    break;
                }
                break;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                g8 g8Var = this.b;
                if (g8Var.c2.getTag() != null) {
                    g8Var.X0(false, true);
                }
                return true;
            case 2:
                return true;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
