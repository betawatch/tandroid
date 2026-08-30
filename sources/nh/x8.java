package nh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class x8 extends u {
    public final /* synthetic */ i9 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x8(Context context, i9 i9Var) {
        super(context);
        this.d = i9Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        i9 i9Var = this.d;
        d4 currentPeerView = i9Var.k0.getCurrentPeerView();
        m5 m5Var = i9Var.w;
        if (m5Var != null && currentPeerView != null) {
            i3 i3Var = currentPeerView.Z0;
            m5Var.setOffset(i9Var.b0);
            if (i9Var.w.f == 1.0f) {
                i9Var.k0.setVisibility(4);
            } else {
                i9Var.k0.setVisibility(0);
            }
            i9Var.k0.B();
            float top = i3Var.getTop() + currentPeerView.getTop();
            float f10 = i9Var.w.f;
            getMeasuredHeight();
            getMeasuredHeight();
            if (i3Var.getMeasuredHeight() > 0) {
                i9Var.n1 = i3Var.getMeasuredHeight();
            }
            float lerp = AndroidUtilities.lerp(1.0f, i9Var.w.n / i9Var.n1, f10);
            i9Var.k0.setPivotY(top);
            i9Var.k0.setPivotX(getMeasuredWidth() / 2.0f);
            i9Var.k0.setScaleX(lerp);
            i9Var.k0.setScaleY(lerp);
            currentPeerView.S2 = true;
            if (i9Var.b0 == 0.0f) {
                currentPeerView.X0(0.0f, 0.0f, null);
            } else {
                currentPeerView.X0(f10, lerp, i9Var.w.getCrossfadeToImage());
            }
            currentPeerView.invalidate();
            currentPeerView.v1.b = (int) AndroidUtilities.lerp(10.0f, 6.0f / r6, i9Var.w.f);
            i3Var.invalidateOutline();
            i9Var.k0.setTranslationY((i9Var.w.b - top) * f10);
        }
        if (currentPeerView != null) {
            i9Var.a1.setTranslationY(((currentPeerView.Z0.getY() + currentPeerView.getY()) - i9Var.a1.getTop()) - AndroidUtilities.dp(4.0f));
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        i9 i9Var = this.d;
        if (!i9Var.b || i9Var.c) {
            View rootView = getRootView();
            Rect rect = AndroidUtilities.rectTmp2;
            getWindowVisibleDisplayFrame(rect);
            int i12 = 0;
            if (rect.bottom != 0 || rect.top != 0) {
                i12 = Math.max(0, ((rootView.getHeight() - (rect.top != 0 ? AndroidUtilities.statusBarHeight : 0)) - AndroidUtilities.getViewInset(rootView)) - (rect.bottom - rect.top));
            }
            i9Var.setKeyboardHeightFromParent(i12);
            size += i9Var.m0;
        }
        int size2 = View.MeasureSpec.getSize(i10);
        int i13 = (int) ((size2 * 16.0f) / 9.0f);
        if (size > i13) {
            i9Var.k0.getLayoutParams().width = -1;
            size = i13;
        } else {
            int i14 = (int) ((size / 16.0f) * 9.0f);
            i9Var.k0.getLayoutParams().width = i14;
            size2 = i14;
        }
        i9Var.v0.getLayoutParams().height = size + 1;
        i9Var.v0.getLayoutParams().width = size2;
        ((FrameLayout.LayoutParams) i9Var.v0.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
        super.onMeasure(i10, i11);
    }
}
